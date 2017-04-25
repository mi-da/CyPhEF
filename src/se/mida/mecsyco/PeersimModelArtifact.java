package se.mida.mecsyco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import mecsyco.core.model.ModelArtifact;
import mecsyco.core.type.SimulEvent;
import mecsyco.core.type.Tuple1;
import mecsyco.core.type.Tuple2;
import peersim.Simulator;
import peersim.core.Network;
import peersim.core.Node;
import peersim.edsim.EDSimulator;
import se.mida.protocol.Monitor;
import se.mida.util.Util;

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
		System.out.println("MECSYCO requests to execute next event: expected time " + time + " \n");
		boolean exit = EDSimulator.executeNext();
	}

	@Override
	public double getNextInternalEventTime() {
//		System.out.print("MECSYCO requests next internal event time - next event time ");
		
		double nextEventTime = (double)EDSimulator.getNextEventTime()/1000;
		
//		System.out.println("nextEventTime= " + nextEventTime + " seconds\n");
		return nextEventTime;
	}

	@Override
	public double getLastEventTime() {
//		System.out.println("MECSYCO requests last event time \n");
		return EDSimulator.getLastEventTime()/1000;
	}

	@Override
	public void processExternalInputEvent(SimulEvent event, String port) {
//		System.out.println("MECSYCO requests to process external input event, port: " + port + " event:" + event.toString()+" \n");
		
		Tuple1<Double> data = (Tuple1<Double>)event.getData();	
		
		// initialization
		if(event.getTime()== -1) {
			
			System.out.println("data initialization "+port+" "+data.toString());
			// gets the node mapped to the monitored component
			HashMap<String,Node> map = Util.getcomponentsToNetworkNodesMap();
			Node node = map.get(port);
			
			EDSimulator.addAtTime(0, data, node, 2);
			
		}
		
		// communication
		else {
			// gets the node mapped to the monitored component
			HashMap<String,Node> map = Util.getcomponentsToNetworkNodesMap();
			Node node = map.get(port);
			
			EDSimulator.addAtTime((long)(event.getTime()*1000), data, node, 2);
		}		
	}

	@Override
	public SimulEvent getExternalOutputEvent(String port) {
	
		HashMap<String, Boolean> map = Util.getchangingValues();
		Boolean value = map.get(port);

		if(value!=null) {
			Tuple1<Boolean> data = new Tuple1<Boolean>(value);
			
			map.remove(port);
			
			System.out.println("SWITCH  "+port+" "+data.getItem1()+"    simul event: "+data+" at "+EDSimulator.getCurrentSimulationTime()/1000.0);
			
			return new SimulEvent(data, EDSimulator.getCurrentSimulationTime()/1000.0);
		}
		else return null;
	}

	@Override
	public void initialize() {
//		System.out.println("MECSYCO requests PeerSim initialization \n");
		Simulator.start(args);
		Util.initializeComponentsToNetworkNodes();
	}

	@Override
	public void finishSimulation() {
//		System.out.println("MECSYCO requests to stop PeerSim and analysis after simulation \n");

		for (int i=0; i<Network.size() ; i++) {
			
			System.out.println();
			
			Node monitoringNode = Network.get(i);
			System.out.println("Nodo "+i);
			Monitor monitorProtocolNode = (Monitor)monitoringNode.getProtocol(2);
			ArrayList<Tuple2<Long, String>> monitoredData = monitorProtocolNode.getMonitoredData();
			
			for (Tuple2<Long, String> tuple : monitoredData) {
				System.out.println(tuple.getItem1()+","+tuple.getItem2());
			}
			
			System.out.println();
		}
	
		EDSimulator.analysisAfterSimulation();
	}

	@Override
	public void setInitialParameters(String[] args) {
		this.args = args;
		random = new Random();
	}

}
