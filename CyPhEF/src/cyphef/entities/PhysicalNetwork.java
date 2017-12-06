package cyphef.entities;

import java.util.ArrayList;


public abstract class PhysicalNetwork {
	
	public abstract void initialize(String[] args);

	public abstract ArrayList<PhysicalNode> getPhysicalNodes();
	
	public abstract void print();
		
}
