package cyphef.util;

import java.util.ArrayList;
import java.util.HashMap;

import org.codehaus.janino.Java.ForEachStatement;

import mecsyco.core.agent.EventMAgent;
import mecsyco.core.agent.ObservingMAgent;
import mecsyco.core.coupling.CentralizedEventCouplingArtifact;
import mecsyco.core.type.SimulData;
import mecsyco.observing.jfreechart.xy.LiveXYGraphic;
import mecsyco.observing.jfreechart.xy.PostMortemXYGraphic;
import mecsyco.observing.jfreechart.xy.Renderer;
import mecsyco.observing.swing.dispatcher.SwingDispatcherArtifact;
import peersim.core.Network;
import peersim.core.Node;

public class Util {

	// Monitor from modelica
	private static ArrayList<String> monitoredComponents = new ArrayList<String>() {
		{
			add("Bus3.V");
			add("Bus4.V");		
			add("Bus5.V");
			add("breaker1.closed");
		}
	};

	// Execute into modelica
	private static ArrayList<String> changingComponents = new ArrayList<String>() {
		{
			add("breaker1.closed");
		}
	};
	
	// Execute into observing agent
	private static ArrayList<String> observingComponents = new ArrayList<String>();

	private static HashMap<String, Node> componentsToNetworkNodes = new HashMap<>();
	
	private static HashMap<String, SimulData> observedValues = new HashMap<String, SimulData>();
	
	private static HashMap<String, Boolean> changingValues = new HashMap<String, Boolean>();


	private Util() {
	}

	public static ArrayList<String> getMonitoredComponents() {
		return monitoredComponents;
	}
	
	public static ArrayList<String> getObservingComponents() {
		return observingComponents;
	}


	public static HashMap<String, Node> getcomponentsToNetworkNodesMap() {
		return componentsToNetworkNodes;
	}
	
	public static HashMap<String, Boolean> getchangingValues() {
		return changingValues;
	}	

	public static void generateCouplingArtifacts(EventMAgent modelicaAgent, EventMAgent peersimAgent) {

		// Monitoring Coupling
		for (String monitoredComponent : monitoredComponents) {

			CentralizedEventCouplingArtifact couplingFrom1to2 = new CentralizedEventCouplingArtifact(monitoredComponent);
			modelicaAgent.addOutputCouplingArtifact(couplingFrom1to2, monitoredComponent); // monitoro da modelica		
			peersimAgent.addInputCouplingArtifact(couplingFrom1to2, monitoredComponent); // notifico peersim

		}

		// Executing Coupling
		for (String changingComponent : changingComponents) {
			
			CentralizedEventCouplingArtifact se = new CentralizedEventCouplingArtifact(changingComponent);
			peersimAgent.addOutputCouplingArtifact(se, changingComponent); // monitoro da peersim
			modelicaAgent.addInputCouplingArtifact(se, changingComponent); // notifico modelica
		}

	}

	// Observing Coupling
	public static void generateObservingArtifacts(EventMAgent peersimAgent, ObservingMAgent observingAgent) {
		
		// for every monitored component of modelica I generate an observing component
		for (String monitoredComponent : monitoredComponents) {
			observingComponents.add(monitoredComponent+"_monitored");
		}
		
		SwingDispatcherArtifact Dispatcher = new SwingDispatcherArtifact();
		observingAgent.setDispatcherArtifact(Dispatcher);		
		
		for (String observingComponent : observingComponents) {
			
			CentralizedEventCouplingArtifact view = new CentralizedEventCouplingArtifact(observingComponent);
			peersimAgent.addOutputCouplingArtifact(view, observingComponent); // monitoro da peersim		
			observingAgent.addInputCouplingArtifact(view, observingComponent); // notifico observing artifact	
					
//			Dispatcher.addObservingArtifact(new PostMortemXYGraphic(monitoredComponent, "Time",monitoredComponent, Renderer.Line,monitoredComponent,monitoredComponent));
			
			Dispatcher.addObservingArtifact(new LiveXYGraphic(observingComponent, "Time",observingComponent, Renderer.Line,observingComponent,observingComponent));

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

	public static HashMap<String, SimulData> getObservedValues() {
		return observedValues;
	}


}