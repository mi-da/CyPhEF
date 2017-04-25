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
import se.mida.mecsyco.PeersimModelArtifact;
import se.mida.util.Util;

import java.util.HashMap;
import java.util.Map;

import mecsyco.core.type.Tuple1;
import peersim.cdsim.CDProtocol;
import peersim.config.Configuration;
import peersim.config.FastConfig;

public class Execute implements EDProtocol { 
	
	private String name;
	// A pratocol is enabled for a particular Node
	private boolean isOn;
	
	
	public Execute(String name) {
		this.name = name;
		setOn(true);
	}

	@Override
	public void processEvent(Node node, int pid, Object event) {
		
		HashMap<String, Boolean> map = Util.getchangingValues();

		// switching command
		
		// isolate failure
		map.put("breaker1.closed", false); 
		map.put("breaker2.closed", false); 
		map.put("breaker3.closed", true); 
		map.put("breaker4.closed", true);
		
		System.out.println("Execute receives failure message at "+EDSimulator.getCurrentSimulationTime());
		
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
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
