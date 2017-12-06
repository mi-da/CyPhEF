package cyphef.mecsyco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.annotation.Nullable;

import cyphef.protocol.Monitor;
import cyphef.util.Util;
import mecsyco.core.model.ModelArtifact;
import mecsyco.core.type.SimulData;
import mecsyco.core.type.SimulEvent;
import mecsyco.core.type.Tuple1;
import mecsyco.core.type.Tuple2;
import peersim.Simulator;
import peersim.core.Network;
import peersim.core.Node;
import peersim.edsim.EDSimulator;

public class PeersimModelArtifact extends ModelArtifact {

	private Random random;
	private String[] args;
	private double maxSimulationTime;

	public static Node monitoringNode;

	public PeersimModelArtifact(double maxSimulationTime) {
		super("peerSim");
		this.maxSimulationTime = maxSimulationTime;
	}

	@Override
	public void processInternalEvent(double time) {

		while (time == EDSimulator.getNextEventTime())
			EDSimulator.executeNext();
	}

	@Override
	public double getNextInternalEventTime() {
		//		System.out.print("MECSYCO requests next internal event time - next event time ");

		double nextEventTime = EDSimulator.getNextEventTime();

		//		System.out.println("nextEventTime= " + nextEventTime + " seconds\n");
		return nextEventTime;

	}

	@Override
	public double getLastEventTime() {
		//		System.out.println("MECSYCO requests last event time \n");
		return EDSimulator.getLastEventTime();
	}

	@Override
	public void processExternalInputEvent(SimulEvent event, String port) {
		//		System.out.println("MECSYCO requests to process external input event, port: " + port + " event:" + event.toString()+" \n");

		SimulData data = event.getData();

		// Initialization of data coming from Modelica
		if (event.getTime() == -1) {

			//			System.out.println("data initialization "+port+" "+data.toString());
			// gets the node mapped to the monitored component
			HashMap<String, Node> map = Util.getcomponentsToNetworkNodesMap();
			Node node = map.get(port);

			EDSimulator.addAtTime(0, data, node, 2);
			// store initial Observed value
			Util.getObservedValues().put(port + "_monitored", data);

		}

		// Communication received from Modelica (monitored data)
		else {
			//			System.out.println(EDSimulator.getCurrentSimulationTime()+" input "+port+" from modelica");

			// gets the node mapped to the monitored component
			HashMap<String, Node> map = Util.getcomponentsToNetworkNodesMap();
			Node node = map.get(port);

			EDSimulator.addAtTime((long) (event.getTime() * 1000.0), data, node, 2);

			// store Observed value
			Util.getObservedValues().put(port + "_monitored", data);
		}
	}

	@Override
	public SimulEvent getExternalOutputEvent(String port) {

		// Transmit values to Observing Agent 
		if (Util.getObservingComponents().contains(port)) {

			SimulData observedValue = Util.getObservedValues().get(port);

			if (observedValue != null) {

				final Double x = EDSimulator.getCurrentSimulationTime();
				final Tuple1<?> y = (Tuple1<?>) observedValue; // cast to observe only 1 value			

				//				System.out.println(EDSimulator.getCurrentSimulationTime() + " " + observedValue + " " + port+" "+Main.observingAgent.isSimulationEnd());

				// remove Observed value
				Util.getObservedValues().remove(port);

				// if Boolean observed value transforms to Integer
				if (y.getItem1().getClass().equals(Boolean.class)) {

					int myInt = (boolean) y.getItem1() ? 1 : 0;

					return new SimulEvent(new Tuple2<>(x, myInt), EDSimulator.getCurrentSimulationTime());
				} else
					return new SimulEvent(new Tuple2<>(x, y.getItem1()), EDSimulator.getCurrentSimulationTime());

			} else {
				//				System.out.println("null value "+port+" "+EDSimulator.getCurrentSimulationTime());
				//				return new SimulEvent(new Tuple2<>(-1.0,0.55), EDSimulator.getCurrentSimulationTime());
				return null;
			}
		}

		// Enactment of actions to Modelica Agent (e.g., open/close switch)
		else {

			HashMap<String, Boolean> map = Util.getchangingValues();
			Boolean value = map.get(port);

			if (value != null) {
				System.out.println("Close Bus Enactment");

				Tuple1<Boolean> data = new Tuple1<Boolean>(value);

				map.remove(port);

				System.out.println("SWITCH  " + port + " " + data.getItem1() + "    simul event: " + data + " at " + EDSimulator.getCurrentSimulationTime());

				return new SimulEvent(data, EDSimulator.getCurrentSimulationTime()+0.2);
			}
		}

		return null;
	}

	@Override
	public void initialize() {
		//	    System.out.println("MECSYCO requests PeerSim initialization \n");
		Simulator.start(args);
		Util.initializeComponentsToNetworkNodes();
	}

	@Override
	public void finishSimulation() {
		//		System.out.println("MECSYCO requests to stop PeerSim and analysis after simulation \n");

		//		for (int i = 0; i < Network.size(); i++) {
		//
		//			System.out.println();
		//
		//			Node monitoringNode = Network.get(i);
		//			System.out.println("Nodo " + i);
		//			Monitor monitorProtocolNode = (Monitor) monitoringNode.getProtocol(2);
		//			ArrayList<Tuple2<Long, String>> monitoredData = monitorProtocolNode.getMonitoredData();
		//
		//			for (Tuple2<Long, String> tuple : monitoredData) {
		//				System.out.println(tuple.getItem1() + "," + tuple.getItem2());
		//			}
		//
		//			System.out.println();
		//		}

		EDSimulator.analysisAfterSimulation();
		//		System.out.println("Simulazione finita in PeerSim "+Main.observingAgent.isSimulationEnd());
		modelLogger.info("ends simulation at time {}", EDSimulator.getCurrentSimulationTime());
	}

	@Override
	public void setInitialParameters(String[] args) {
		this.args = args;
		random = new Random();
	}

}