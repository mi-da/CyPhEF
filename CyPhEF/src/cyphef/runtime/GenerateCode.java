package cyphef.runtime;

import java.util.ArrayList;

import cyphef.cosimulation.CS_CyberNetwork;
import cyphef.cosimulation.CS_PhysicalNetwork;
import cyphef.entities.PhysicalNode;
import cyphef.translation.CyberNetwork;
import cyphef.translation.PhysicalNetwork;
import patternGenerator.decentralizedPattern.ConcretePattern;



public class GenerateCode {

	public static void main(String[] args) {
		
//		printPN();
		//printPhysicalNetwork("fmu_model/ObjectStab_Examples_Ninebus.fmu");
		createPattern();
	}
	
	public static void printPN() {		
		// physical network
		PhysicalNetwork physicalNetwork = new CS_PhysicalNetwork();
		String[] params = { "ObjectStab_Examples_Ninebus.fmu"};
		physicalNetwork.initialize(params);
		physicalNetwork.print();	
	}
	
	public static void createPattern() {		
		// pattern creation and validation
		ConcretePattern pattern = UsingEMFModel.generate();
		// co-sim platform chosen
		CyberNetwork coSimulator = new CS_CyberNetwork();	    
		// code generation
		coSimulator.generateCode(pattern);
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
