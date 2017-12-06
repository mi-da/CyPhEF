package cyphef.cosimulation;

import cyphef.translation.CyberNetwork;
import cyphef.translation.GenerateClass;
import patternGenerator.ManagedSystem;
import patternGenerator.ManagingSystem;
import patternGenerator.Subsystem;


public class CS_CyberNetwork extends CyberNetwork {

	@Override
	public void deploySubsystem(Subsystem cNode) {
		if(cNode instanceof ManagedSystem){
			
		}
		else if(cNode instanceof ManagingSystem){
			
			if(((ManagingSystem) cNode).getMonitor()!= null){
				if(((ManagingSystem) cNode).getMonitor().getCheck()!= null && 
						!((ManagingSystem) cNode).getMonitor().getCheck().isEmpty()){
					ManagedSystem man = (ManagedSystem) ((ManagingSystem) cNode).getMonitor().getCheck().get(0);
					
					GenerateClass.generate(man.getName(),"Monitor");
				}
			}
			if(((ManagingSystem) cNode).getAnalyze()!= null){
				GenerateClass.generate(((ManagingSystem) cNode).getName(),"Analyze");
			}
			if(((ManagingSystem) cNode).getPlan()!= null){
				GenerateClass.generate(((ManagingSystem) cNode).getName(),"Plan");
			}
			if(((ManagingSystem) cNode).getExecute()!= null){
				if(((ManagingSystem) cNode).getExecute().getAct()!= null && 
						!((ManagingSystem) cNode).getExecute().getAct().isEmpty()){
					ManagedSystem man = (ManagedSystem) ((ManagingSystem) cNode).getExecute().getAct().get(0);
					GenerateClass.generate(man.getName(),"Execute");
				}
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	

}
