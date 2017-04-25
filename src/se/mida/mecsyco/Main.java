package se.mida.mecsyco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.jna.NativeLibrary;

import mecsyco.core.agent.EventMAgent;
import mecsyco.core.coupling.CentralizedEventCouplingArtifact;
import mecsyco.core.exception.CausalityException;
import mecsyco.world.fmi.model.FMIModelArtifact;
import se.mida.util.Util;

public class Main {

	public final static double maxSimulationTime = 6; // 40 seconds

	public final static String peersimConfigPath1 = "conf/configPeerSim.txt";

	public final static int communicationStep = 100; // every 100 ms
	public final static double timeStep = 0.001; // 1 ms
	public final static double startTime = 0;

	public static void main(String[] args) {

		String[] args1 = new String[1];
		args1[0] = peersimConfigPath1;

		// Agent1 - PeerSim Agent
		EventMAgent peersimAgent = new EventMAgent("peersimAgent", maxSimulationTime); // simulation time in milliseconds
		PeersimModelArtifact peersimArtifact = new PeersimModelArtifact(maxSimulationTime);
		peersimArtifact.setInitialParameters(args1);
		peersimAgent.setModelArtifact(peersimArtifact);

		// Agent2 - Modelica Agent
		EventMAgent modelicaAgent = new EventMAgent("modelicaAgent", maxSimulationTime);

		// communication variables
		List<String> aCommVariables = Util.getMonitoredComponents();

		// initialization of variables
		Map<String, Boolean> aInitVars = new HashMap<>();
		aInitVars.put("breaker1.closed", true);
		aInitVars.put("breaker2.closed", true);
		aInitVars.put("breaker3.closed", false);
		aInitVars.put("breaker4.closed", false);

	    FMIModelArtifact modelicaArtifact = new FMIModelArtifact("modelicaAgent", "NinebusMod.fmu", maxSimulationTime, timeStep, communicationStep, aCommVariables, startTime, aInitVars);

	    modelicaArtifact.setInitialParameters(null);
	    
		modelicaAgent.setModelArtifact(modelicaArtifact);

		// Coupling Artifact Generation
		Util.generateCouplingArtifacts(modelicaAgent, peersimAgent);

		// start
		peersimAgent.startModelSoftware();
		modelicaAgent.startModelSoftware();

		// Send initialization data to the others m-agents. (should be useful only when model share their states)		
		try {
			peersimAgent.coInitialize();
			modelicaAgent.coInitialize();
		} catch (CausalityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Start the co-simulation
		peersimAgent.start();
		modelicaAgent.start();

	}

}
