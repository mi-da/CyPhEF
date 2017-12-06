/**
 */
package patternGenerator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import patternGenerator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternGeneratorFactoryImpl extends EFactoryImpl implements PatternGeneratorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternGeneratorFactory init() {
		try {
			PatternGeneratorFactory thePatternGeneratorFactory = (PatternGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(PatternGeneratorPackage.eNS_URI);
			if (thePatternGeneratorFactory != null) {
				return thePatternGeneratorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternGeneratorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternGeneratorPackage.MANAGED_SYSTEM: return createManagedSystem();
			case PatternGeneratorPackage.MONITOR: return createMonitor();
			case PatternGeneratorPackage.ANALYZE: return createAnalyze();
			case PatternGeneratorPackage.PLAN: return createPlan();
			case PatternGeneratorPackage.EXECUTE: return createExecute();
			case PatternGeneratorPackage.KNOWLEDGE: return createKnowledge();
			case PatternGeneratorPackage.INTER_COMPONENT_INTERACTION: return createInterComponentInteraction();
			case PatternGeneratorPackage.READ_WRITE_INTERACTION: return createReadWriteInteraction();
			case PatternGeneratorPackage.DELEGATION: return createDelegation();
			case PatternGeneratorPackage.COORDINATION: return createCoordination();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagedSystem createManagedSystem() {
		ManagedSystemImpl managedSystem = new ManagedSystemImpl();
		return managedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyze createAnalyze() {
		AnalyzeImpl analyze = new AnalyzeImpl();
		return analyze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge createKnowledge() {
		KnowledgeImpl knowledge = new KnowledgeImpl();
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterComponentInteraction createInterComponentInteraction() {
		InterComponentInteractionImpl interComponentInteraction = new InterComponentInteractionImpl();
		return interComponentInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWriteInteraction createReadWriteInteraction() {
		ReadWriteInteractionImpl readWriteInteraction = new ReadWriteInteractionImpl();
		return readWriteInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordination createCoordination() {
		CoordinationImpl coordination = new CoordinationImpl();
		return coordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorPackage getPatternGeneratorPackage() {
		return (PatternGeneratorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternGeneratorPackage getPackage() {
		return PatternGeneratorPackage.eINSTANCE;
	}

} //PatternGeneratorFactoryImpl
