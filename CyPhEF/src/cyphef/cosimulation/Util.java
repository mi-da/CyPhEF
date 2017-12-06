package cyphef.cosimulation;

import java.util.ArrayList;
import java.util.HashMap;
import mecsyco.core.agent.EventMAgent;
import mecsyco.core.coupling.CentralizedEventCouplingArtifact;
import peersim.core.Network;
import peersim.core.Node;

public class Util {

	private static ArrayList<String> monitoredComponents = new ArrayList<String>() {
		{
			add("Bus4.V");
			add("Bus5.V");		
		}
	};

	private static ArrayList<String> changingComponents = new ArrayList<String>() {
		{
			add("breaker1.closed");
			add("breaker2.closed");
			add("breaker3.closed");
			add("breaker4.closed");

		}
	};

	private static HashMap<String, Node> componentsToNetworkNodes = new HashMap<>();
	
	private static HashMap<String, Boolean> changingValues = new HashMap<>();


	private Util() {
	}

	public static ArrayList<String> getMonitoredComponents() {
		return monitoredComponents;
	}

	public static HashMap<String, Node> getcomponentsToNetworkNodesMap() {
		return componentsToNetworkNodes;
	}
	
	public static HashMap<String, Boolean> getchangingValues() {
		return changingValues;
	}	

	public static void generateCouplingArtifacts(EventMAgent modelicaAgent, EventMAgent peersimAgent) {

		// Monitoring Coupling
		for (String moitoredComponent : monitoredComponents) {

			CentralizedEventCouplingArtifact couplingFrom1to2 = new CentralizedEventCouplingArtifact();
			modelicaAgent.addOutputCouplingArtifact(couplingFrom1to2, moitoredComponent); // monitoro da modelica		
			peersimAgent.addInputCouplingArtifact(couplingFrom1to2, moitoredComponent); // notifico peersim

		}

		// Executing Coupling
		for (String changingComponent : changingComponents) {
			
			CentralizedEventCouplingArtifact se = new CentralizedEventCouplingArtifact();
			peersimAgent.addOutputCouplingArtifact(se, changingComponent);
			modelicaAgent.addInputCouplingArtifact(se, changingComponent); // scrivo su changingComponent	
		}

	}

	// maps monitored components to network nodes starting from node with id=1
	public static void initializeComponentsToNetworkNodes() {
		int nodeId = 1;
		for (String monitoredComponent : monitoredComponents) {
			componentsToNetworkNodes.put(monitoredComponent, Network.get(nodeId));
			nodeId++;
		}
	}

}
