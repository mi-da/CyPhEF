package cyphef.translation;

import java.util.ArrayList;

import cyphef.entities.PhysicalNode;



public abstract class PhysicalNetwork {
	
	public abstract void initialize(String[] args);

	public abstract ArrayList<PhysicalNode> getPhysicalNodes();
	
	public abstract void print();
		
}
