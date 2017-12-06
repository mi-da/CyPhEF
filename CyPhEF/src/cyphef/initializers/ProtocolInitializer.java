package cyphef.initializers;

import cyphef.protocol.Execute;
import cyphef.protocol.Monitor;
import peersim.config.Configuration;
import peersim.core.Control;
import peersim.core.Network;
import peersim.core.Node;

/*
 *   Mark Jelasity
 *
 *   All nodes are identical in peersim (the same "Node" class and the same protocol stack), and this has a number of good reasons,
 *   and it is deeply embedded into the design logic. But this doesn't mean that you can't achieve what you want. I would, for example,
 *   use an initializer to switch protocols on or off on certain nodes (the protocols have to have this capability, that is, they have 
 *   to be able to handle on/off state).
 * 
 */

public class ProtocolInitializer implements Control {
	
	private String name;
	
	// proticol id of monitor layer
	private static int monitor_id;
	
	// proticol id of execute layer
	private static int execute_id;
	
	// proticol id of coordination layer
	private static int coordination_id;
	
	public ProtocolInitializer(String name) {
		this.name = name;
		monitor_id = Configuration.getPid(name + "." + "monitor");
		execute_id = Configuration.getPid(name + "." + "execute");
	}

	@Override
	public boolean execute() {
		
		for(int i=0;i<Network.size();i++) {
			
			if(i==0) {
				// Switch of monitor and execute protocol for the central node
				Node centralizedNode = Network.get(i);
				
				Monitor monitorProtocol = (Monitor)centralizedNode.getProtocol(monitor_id);
				monitorProtocol.setOn(false);
				
				Execute executeProtocol = (Execute)centralizedNode.getProtocol(execute_id);
				monitorProtocol.setOn(false);
				
				
				System.out.println("PROTOCOLS");
				for(int j=0;j<centralizedNode.protocolSize();j++)
					System.out.println(centralizedNode.getProtocol(j).toString()+" "+j);
				System.out.println();
			}
		}
		
		return false;
	}

}
