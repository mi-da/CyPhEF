package cyphef.protocol;

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
import java.util.HashMap;

import cyphef.util.Util;
import mecsyco.core.type.SimulData;
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

		if(node.getID()==1 && CommonState.getIntTime()==11799) {
			
			
			System.out.println("Close Bus Command");
			
			HashMap<String, Boolean> map = Util.getchangingValues();

			// switching command
			
			// isolate failure
			map.put("breaker1.closed", true); 	
			
//		    SimulData data = (SimulData)event;
//		    
//			String value = (String)data.getItem1();
//			monitoredData.add(new Tuple2<Long, String>(CommonState.getTime(), value));
//			
//			// Bus failed
//			if(node.getID()==1 && value<1.025 && !alertSent) { 
//				
//				System.out.println("sending message at "+EDSimulator.getCurrentSimulationTime()+" value "+value);
//				
//				Node centralNode = Network.get(0);				
//				((Transport)node.getProtocol(FastConfig.getTransport(pid))).send(node, centralNode, value, execute_id);
//				alertSent=true;
//			}
			
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
