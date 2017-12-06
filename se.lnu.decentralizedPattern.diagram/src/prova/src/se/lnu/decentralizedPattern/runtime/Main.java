package prova.src.se.lnu.decentralizedPattern.runtime;




import java.util.ArrayList;

import prova.src.lnu.cosimulation.CS_PhysicalNetwork;
import prova.src.lnu.entities.PhysicalNetwork;
import prova.src.lnu.entities.PhysicalNode;

public class Main {

	public static void main(String[] args) {
		
//		printPN();
		printPhysicalNetwork("fmu_model/ObjectStab_Examples_Ninebus.fmu");
		//createPattern();
	}
	
	public static void printPN() {		
		// physical network
		PhysicalNetwork physicalNetwork = new CS_PhysicalNetwork();
		String[] params = { "ObjectStab_Examples_Ninebus.fmu"};
		physicalNetwork.initialize(params);
		physicalNetwork.print();	
	}
	
	

	
	public static void printPhysicalNetwork(String filename) {
		
		CS_PhysicalNetwork physicalNetwork = new CS_PhysicalNetwork();

		String[] params = { filename };

		physicalNetwork.initialize(params);
		ArrayList<PhysicalNode> physicalNodes = physicalNetwork.getPhysicalNodes();

		for (PhysicalNode physicalNode : physicalNodes) {
			System.out.println(physicalNode.getName());
			ArrayList<String> attributes = physicalNode.getAttributes();
			for (String attribute : attributes) {
				System.out.println("   " + attribute);
			}
		}
	}
	

}
