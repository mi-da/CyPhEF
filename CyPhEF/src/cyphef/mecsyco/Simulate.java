package cyphef.mecsyco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import com.sun.jna.NativeLibrary;

import cyphef.util.Util;
import mecsyco.core.agent.EventMAgent;
import mecsyco.core.model.*;
import mecsyco.observing.jfreechart.event.LiveEventGraphic;
import mecsyco.observing.jfreechart.xy.LiveXYGraphic;
import mecsyco.observing.jfreechart.xy.PostMortemXYGraphic;
import mecsyco.observing.jfreechart.xy.Renderer;
import mecsyco.observing.swing.dispatcher.SwingDispatcherArtifact;
import mecsyco.world.fmi.model.FMIModelArtifact;
import mecsyco.core.agent.ObservingMAgent;
import mecsyco.core.coupling.CentralizedEventCouplingArtifact;
import mecsyco.core.exception.CausalityException;

public class Simulate {

	public final static double maxSimulationTime = 16.0; // 20 seconds

	public final static String peersimConfigPath1 = "conf/configPeerSim.txt";

	public final static int communicationStep = 100; // every 100 ms
	public final static double timeStep = 0.001; // 1 ms
	public final static double startTime = 0;
	
	
	public static ObservingMAgent observingAgent;

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
		Map<String, Integer> aInitVars = new HashMap<>();
//				aInitVars.put("myBreaker1.c", 1);
//				aInitVars.put("myBreaker2.c", 1);
//				aInitVars.put("myBreaker3.c", 0);
//				aInitVars.put("myBreaker4.c", 0);

		FMIModelArtifact modelicaArtifact = new FMIModelArtifact("modelicaAgent", "_physicalModel/ObjectStab_Examples_Ninebus.fmu", maxSimulationTime, timeStep, communicationStep, aCommVariables, startTime, aInitVars);
		
		modelicaArtifact.setInitialParameters(null);
     	modelicaAgent.setModelArtifact(modelicaArtifact);
     	
     	// Agent3 - Observing Agent
     	observingAgent = new ObservingMAgent("observingAgent", maxSimulationTime);
     	
		// Coupling Artifact Generation
		Util.generateCouplingArtifacts(modelicaAgent, peersimAgent);

		// Observing Artifct Generation
		Util.generateObservingArtifacts(peersimAgent,observingAgent);

		
		// start
		modelicaAgent.startModelSoftware();
		peersimAgent.startModelSoftware();
		observingAgent.startModelSoftware();

		// Send initialization data to the others m-agents. (should be useful only when model share their states)		
		try {
			peersimAgent.coInitialize();
			modelicaAgent.coInitialize();
		} catch (CausalityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Start the co-simulation
		modelicaAgent.start();
		peersimAgent.start();
		observingAgent.start();
	}

}