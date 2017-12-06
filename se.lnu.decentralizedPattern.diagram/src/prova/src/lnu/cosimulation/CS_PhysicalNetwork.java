package prova.src.lnu.cosimulation;




import java.util.ArrayList;

import org.javafmi.modeldescription.ModelDescription;
import org.javafmi.modeldescription.ScalarVariable;
import org.javafmi.proxy.FmuFile;

import prova.src.lnu.entities.PhysicalNetwork;
import prova.src.lnu.entities.PhysicalNode;






public class CS_PhysicalNetwork extends PhysicalNetwork {
	
	private FmuFile fmuFile;
	private ModelDescription modelDetails;

	@Override
	public ArrayList<PhysicalNode> getPhysicalNodes() {
		
		ArrayList<PhysicalNode> physicalNodes = new ArrayList<PhysicalNode>();
		
		ScalarVariable[] variables = modelDetails.getModelVariables();
		
		for (ScalarVariable scalarVariable : variables) {
			String fullVariable = scalarVariable.getName();
			
			String[] fn = fullVariable.split("\\.");
			String variableName = fn[0];
			
			// get or create the physical node
			PhysicalNode currentPhysicalNode = null;
			
			for (PhysicalNode physicalNode : physicalNodes) {
				if(physicalNode.getName().equals(variableName)) {
					currentPhysicalNode = physicalNode;
					break;
				}
			}			
			if(currentPhysicalNode==null) {
				currentPhysicalNode = new PhysicalNode();
				currentPhysicalNode.setName(variableName);
				physicalNodes.add(currentPhysicalNode);
			}
			
			// add attribute to the node
			currentPhysicalNode.addAttribute(fullVariable);			
		}
		
		return physicalNodes;
	}

	@Override
	public void initialize(String[] args) {
		System.out.println(args[0]);
		fmuFile = new FmuFile(args[0]);
        modelDetails = fmuFile.getModelDescription();		
	}
	
	
	public void initialize(FmuFile file) {		
		fmuFile = file;
        modelDetails = fmuFile.getModelDescription();		
	}

	@Override
	public void print() {
		
		System.out.println("IN PRINT");
		
		ArrayList<PhysicalNode> physicalNodes = this.getPhysicalNodes();

		for (PhysicalNode physicalNode : physicalNodes) {
			System.out.println(physicalNode.getName());
			ArrayList<String> attributes = physicalNode.getAttributes();
			for (String attribute : attributes) {
				System.out.println("   " + attribute);
			}
		}		
	}

}
