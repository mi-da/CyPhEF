package cyphef.runtime;

import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;

import patternGenerator.Analyze;
import patternGenerator.Element;
import patternGenerator.Execute;
import patternGenerator.InterComponentInteraction;
import patternGenerator.Interaction;
import patternGenerator.IntraComponentInteraction;
import patternGenerator.Knowledge;
import patternGenerator.ManagedSystem;
import patternGenerator.ManagingSystem;
import patternGenerator.Monitor;
import patternGenerator.PatternGeneratorFactory;
import patternGenerator.Plan;
import patternGenerator.decentralizedPattern.ConcretePattern;
import patternGenerator.decentralizedPattern.DecentralizedPatternFactory;
import patternGenerator.decentralizedPattern.Master;
import patternGenerator.decentralizedPattern.PatternType;
import patternGenerator.decentralizedPattern.Slave;

public class UsingEMFModel {
	
	public static final int slaveNum = 4;

	 public static boolean validateObject(EObject eObject)
	  {
	    Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
	    if (diagnostic.getSeverity() == Diagnostic.ERROR || 
	      diagnostic.getSeverity() == Diagnostic.WARNING)
	    {
	      //System.err.println(diagnostic.getMessage());
	      for (Iterator i=diagnostic.getChildren().iterator(); i.hasNext();)
	      {
	        Diagnostic childDiagnostic = (Diagnostic)i.next();
	        switch (childDiagnostic.getSeverity())
	        {
	          case Diagnostic.ERROR:
	          case Diagnostic.WARNING:
	            System.err.println("\t" + childDiagnostic.getMessage());
	        }
	      }
	      return false;
	    }
	    return true;
	  }


	 public void parse(){
		 ConcretePattern patternMS = generate();
		 
		 for(Element e: patternMS.getElements() ){
				if(e instanceof Interaction){
					System.out.println("interaction");
				}
				else if(e instanceof ManagingSystem){
					System.out.println("managingSystem");
					
					if(((ManagingSystem) e).getMonitor()!= null){
						System.out.println("Monitor");
						if(((ManagingSystem) e).getMonitor().getCheck()!= null && 
								!((ManagingSystem) e).getMonitor().getCheck().isEmpty()){
							ManagedSystem man = (ManagedSystem) ((ManagingSystem) e).getMonitor().getCheck().get(0);
							System.out.println(man.getName());
						}
					}
					if(((ManagingSystem) e).getAnalyze()!= null){
						System.out.println("Analyze");
					}
					if(((ManagingSystem) e).getPlan()!= null){
						System.out.println("Plan");
					}
					if(((ManagingSystem) e).getExecute()!= null){
						System.out.println("Execute");
						if(((ManagingSystem) e).getExecute().getAct()!= null && 
								!((ManagingSystem) e).getExecute().getAct().isEmpty()){
							ManagedSystem man = (ManagedSystem) ((ManagingSystem) e).getExecute().getAct().get(0);
							System.out.println(man.getName());
						}
					}
				}
			}	
	 }
	 
	public static ConcretePattern generate() {

		// TODO Auto-generated method stub
		
		PatternGeneratorFactory pFactory = PatternGeneratorFactory.eINSTANCE;
		DecentralizedPatternFactory mSFactory = DecentralizedPatternFactory.eINSTANCE;
	
		ConcretePattern patternMS = mSFactory.createConcretePattern();
		
		patternMS.setType(PatternType.MASTER_SLAVE);

		Master master = mSFactory.createMaster();
		master.setName("master");
		
		Analyze analyze = pFactory.createAnalyze();
		Plan plan = pFactory.createPlan();

		master.setAnalyze(analyze);
		master.setPlan(plan);	

		patternMS.getElements().add(master);
	

		for(int i = 0; i < slaveNum; i++){

			Slave slave = mSFactory.createSlave();

			Monitor monitor = pFactory.createMonitor();
			Execute execute = pFactory.createExecute();
			
			ManagedSystem managed = pFactory.createManagedSystem();
			switch(i){
			case 0:
				managed.setName("bus3");
				managed.getAttributes().add("V");
				break;
			case 1:
				managed.setName("bus4");
				managed.getAttributes().add("V");
				break;
			case 2:
				managed.setName("bus5");
				managed.getAttributes().add("V");
				break;
			case 3:
				managed.setName("breaker1");
				managed.getAttributes().add("closed");
				break;
				
			}
			
			monitor.getCheck().add(managed);
			execute.getAct().add(managed);

			slave.setMonitor(monitor);
			slave.setExecute(execute);
			
			InterComponentInteraction i1 = pFactory.createInterComponentInteraction();

			i1.setContext(monitor);
			i1.setTarget(analyze);

			InterComponentInteraction i2 = pFactory.createInterComponentInteraction();

			i2.setContext(plan);
			i2.setTarget(execute);

			patternMS.getElements().add(slave);
			patternMS.getElements().add(i1);
			patternMS.getElements().add(i2);
		}
		
		return patternMS;
		

	}



}
