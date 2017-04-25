package se.mida.initializers;

import java.util.Random;

import peersim.config.Configuration;
import peersim.core.Control;
import peersim.core.Network;
import peersim.core.Node;
import peersim.transport.E2ENetwork;
import peersim.transport.E2ETransport;

/*
 *   Mark Jelasity
 *
 *   All nodes are identical in peersim (the same "Node" class and the same protocol stack), and this has a number of good reasons,
 *   and it is deeply embedded into the design logic. But this doesn't mean that you can't achieve what you want. I would, for example,
 *   use an initializer to switch protocols on or off on certain nodes (the protocols have to have this capability, that is, they have 
 *   to be able to handle on/off state).
 * 
 */

public class NetworkInitializer implements Control {
	
	private String name;
	private static int transport_pid;
	
	public NetworkInitializer(String name) {
		transport_pid = Configuration.getPid(name + "." + "transport");
		this.name = name;
	}

	@Override
	public boolean execute() {
		
		Random r = new Random();	

		E2ENetwork.reset(Network.size(), true);

		System.out.println("NETWORK LATENCY");

		
		
//		for(int i=0;i<Network.size();i++) {
//			
//			Node node = Network.get(i);
//			E2ETransport trnNet = (E2ETransport) node.getProtocol(transport_pid);
//			trnNet.setRouter((int)node.getID());
//			
//			if(i!=0) {
//				// latency between 100 and 200 ms
//				int randomLatency = (int)(100 + 100 * r.nextDouble());
//				E2ENetwork.setLatency(i, 0, randomLatency);
//			}
//			
//		}
		
		
		return false;

	}

}
