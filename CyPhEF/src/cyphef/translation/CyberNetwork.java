package cyphef.translation;


import java.util.ArrayList;

import patternGenerator.Element;
import patternGenerator.Subsystem;
import patternGenerator.decentralizedPattern.ConcretePattern;

public abstract class CyberNetwork {
	
	public abstract void deploySubsystem(Subsystem cNode);

	public void generateCode(ConcretePattern pattern) {

		// navigate cp components and use APIs
		for (Element component : pattern.getElements()) {
			if(component instanceof Subsystem){
				this.deploySubsystem((Subsystem)component);
			}
		}
	}

}
