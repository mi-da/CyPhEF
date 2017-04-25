package se.mida.protocol;

import peersim.core.CommonState;
import peersim.core.Network;
import peersim.core.Node;
import peersim.edsim.EDProtocol;
import peersim.edsim.EDSimulator;
import peersim.transport.E2ENetwork;
import peersim.transport.E2ETransport;
import peersim.transport.Transport;
import peersim.transport.UniformRandomTransport;

import java.util.ArrayList;

import mecsyco.core.type.Tuple1;
import mecsyco.core.type.Tuple2;
import peersim.cdsim.CDProtocol;
import peersim.config.Configuration;
import peersim.config.FastConfig;

public class Monitor implements EDProtocol { 
	
	private String name;
	// A pratocol is enabled for a particular Node
	private boolean isOn;
	
	// proticol id of execution layer
	private static int execute_id;
	
	private static boolean alertSent;
	
	// data monitored from component
	private ArrayList<Tuple2<Long,String>> monitoredData;
	
	public Monitor(String name) {
		this.name = name;
		setOn(true);
		execute_id = Configuration.getPid(name + "." + "execute");
		monitoredData = new ArrayList<>();
		alertSent=false;
	}

	@Override
	public void processEvent(Node node, int pid, Object event) {
		
//		System.out.println("nodo "+node.getID()+" processa evento "+event.toString() +" al tempo "+CommonState.getTime()+" invio dati al coordinator");

		if(node.getID()!=5) {
			
			Tuple1<Double> data = (Tuple1<Double>)event;
			Double value = data.getItem1();
			monitoredData.add(new Tuple2<Long, String>(CommonState.getTime(), String.valueOf(value)));
			
			// Bus failed
			if(node.getID()==1 && value<1.025 && !alertSent) { 
				
				System.out.println("sending message at "+EDSimulator.getCurrentSimulationTime()+" value "+value);
				
				Node centralNode = Network.get(0);				
				((Transport)node.getProtocol(FastConfig.getTransport(pid))).send(node, centralNode, value, execute_id);
				alertSent=true;
			}
			
		}
		
		else {
			
			Tuple1<Boolean> data = (Tuple1<Boolean>)event;
			Boolean value = data.getItem1();
			monitoredData.add(new Tuple2<Long, String>(CommonState.getTime(), String.valueOf(value)));
			
		}
			
		
	}
	
	public ArrayList<Tuple2<Long,String>> getMonitoredData() {
		return monitoredData;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	@Override
	public Object clone() {
		try {
			// peers are cloned so we need to do a deep clone of the class
			monitoredData = new ArrayList<>();
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	


}
