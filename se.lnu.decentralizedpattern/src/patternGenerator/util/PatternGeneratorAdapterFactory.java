/**
 */
package patternGenerator.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import patternGenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.PatternGeneratorPackage
 * @generated
 */
public class PatternGeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PatternGeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternGeneratorSwitch<Adapter> modelSwitch =
		new PatternGeneratorSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseManagingSystem(ManagingSystem object) {
				return createManagingSystemAdapter();
			}
			@Override
			public Adapter caseManagedSystem(ManagedSystem object) {
				return createManagedSystemAdapter();
			}
			@Override
			public Adapter caseMapeComponent(MapeComponent object) {
				return createMapeComponentAdapter();
			}
			@Override
			public Adapter caseMonitor(Monitor object) {
				return createMonitorAdapter();
			}
			@Override
			public Adapter caseAnalyze(Analyze object) {
				return createAnalyzeAdapter();
			}
			@Override
			public Adapter casePlan(Plan object) {
				return createPlanAdapter();
			}
			@Override
			public Adapter caseExecute(Execute object) {
				return createExecuteAdapter();
			}
			@Override
			public Adapter caseKnowledge(Knowledge object) {
				return createKnowledgeAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseDecentralizedControlPattern(DecentralizedControlPattern object) {
				return createDecentralizedControlPatternAdapter();
			}
			@Override
			public Adapter caseIntraComponentInteraction(IntraComponentInteraction object) {
				return createIntraComponentInteractionAdapter();
			}
			@Override
			public Adapter caseInterComponentInteraction(InterComponentInteraction object) {
				return createInterComponentInteractionAdapter();
			}
			@Override
			public Adapter caseReadWriteInteraction(ReadWriteInteraction object) {
				return createReadWriteInteractionAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter caseDelegation(Delegation object) {
				return createDelegationAdapter();
			}
			@Override
			public Adapter caseCoordination(Coordination object) {
				return createCoordinationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.ManagingSystem <em>Managing System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.ManagingSystem
	 * @generated
	 */
	public Adapter createManagingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.ManagedSystem <em>Managed System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.ManagedSystem
	 * @generated
	 */
	public Adapter createManagedSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.MapeComponent <em>Mape Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.MapeComponent
	 * @generated
	 */
	public Adapter createMapeComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Monitor
	 * @generated
	 */
	public Adapter createMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Analyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Analyze
	 * @generated
	 */
	public Adapter createAnalyzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Plan
	 * @generated
	 */
	public Adapter createPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Execute
	 * @generated
	 */
	public Adapter createExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Knowledge
	 * @generated
	 */
	public Adapter createKnowledgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.DecentralizedControlPattern <em>Decentralized Control Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.DecentralizedControlPattern
	 * @generated
	 */
	public Adapter createDecentralizedControlPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.IntraComponentInteraction <em>Intra Component Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.IntraComponentInteraction
	 * @generated
	 */
	public Adapter createIntraComponentInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.InterComponentInteraction <em>Inter Component Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.InterComponentInteraction
	 * @generated
	 */
	public Adapter createInterComponentInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.ReadWriteInteraction <em>Read Write Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.ReadWriteInteraction
	 * @generated
	 */
	public Adapter createReadWriteInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Delegation
	 * @generated
	 */
	public Adapter createDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Coordination <em>Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Coordination
	 * @generated
	 */
	public Adapter createCoordinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PatternGeneratorAdapterFactory
