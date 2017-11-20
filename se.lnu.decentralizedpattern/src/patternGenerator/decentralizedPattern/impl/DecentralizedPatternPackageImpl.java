/**
 */
package patternGenerator.decentralizedPattern.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import patternGenerator.PatternGeneratorPackage;

import patternGenerator.decentralizedPattern.AbstractPeer;
import patternGenerator.decentralizedPattern.ConcretePattern;
import patternGenerator.decentralizedPattern.DecentralizedPatternFactory;
import patternGenerator.decentralizedPattern.DecentralizedPatternPackage;
import patternGenerator.decentralizedPattern.HPeer;
import patternGenerator.decentralizedPattern.Master;
import patternGenerator.decentralizedPattern.Node;
import patternGenerator.decentralizedPattern.PatternType;
import patternGenerator.decentralizedPattern.Peer;
import patternGenerator.decentralizedPattern.RegionalPlanner;
import patternGenerator.decentralizedPattern.Slave;
import patternGenerator.decentralizedPattern.UnderlyingSubsystem;

import patternGenerator.decentralizedPattern.util.DecentralizedPatternValidator;

import patternGenerator.impl.PatternGeneratorPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecentralizedPatternPackageImpl extends EPackageImpl implements DecentralizedPatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass underlyingSubsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalPlannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPeerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hPeerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concretePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patternTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DecentralizedPatternPackageImpl() {
		super(eNS_URI, DecentralizedPatternFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DecentralizedPatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DecentralizedPatternPackage init() {
		if (isInited) return (DecentralizedPatternPackage)EPackage.Registry.INSTANCE.getEPackage(DecentralizedPatternPackage.eNS_URI);

		// Obtain or create and register package
		DecentralizedPatternPackageImpl theDecentralizedPatternPackage = (DecentralizedPatternPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DecentralizedPatternPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DecentralizedPatternPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PatternGeneratorPackageImpl thePatternGeneratorPackage = (PatternGeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternGeneratorPackage.eNS_URI) instanceof PatternGeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternGeneratorPackage.eNS_URI) : PatternGeneratorPackage.eINSTANCE);

		// Create package meta-data objects
		theDecentralizedPatternPackage.createPackageContents();
		thePatternGeneratorPackage.createPackageContents();

		// Initialize created meta-data
		theDecentralizedPatternPackage.initializePackageContents();
		thePatternGeneratorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDecentralizedPatternPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DecentralizedPatternValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDecentralizedPatternPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DecentralizedPatternPackage.eNS_URI, theDecentralizedPatternPackage);
		return theDecentralizedPatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaster() {
		return masterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlave() {
		return slaveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderlyingSubsystem() {
		return underlyingSubsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderlyingSubsystem_HasAssociatedTargetPlanner() {
		return (EAttribute)underlyingSubsystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderlyingSubsystem_HasAssociatedContextPlanner() {
		return (EAttribute)underlyingSubsystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionalPlanner() {
		return regionalPlannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPeer() {
		return abstractPeerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeer() {
		return peerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHPeer() {
		return hPeerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHPeer_HasDirectManaged() {
		return (EAttribute)hPeerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcretePattern() {
		return concretePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcretePattern_Type() {
		return (EAttribute)concretePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatternType() {
		return patternTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternFactory getDecentralizedPatternFactory() {
		return (DecentralizedPatternFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nodeEClass = createEClass(NODE);

		masterEClass = createEClass(MASTER);

		slaveEClass = createEClass(SLAVE);

		underlyingSubsystemEClass = createEClass(UNDERLYING_SUBSYSTEM);
		createEAttribute(underlyingSubsystemEClass, UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER);
		createEAttribute(underlyingSubsystemEClass, UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER);

		regionalPlannerEClass = createEClass(REGIONAL_PLANNER);

		abstractPeerEClass = createEClass(ABSTRACT_PEER);

		peerEClass = createEClass(PEER);

		hPeerEClass = createEClass(HPEER);
		createEAttribute(hPeerEClass, HPEER__HAS_DIRECT_MANAGED);

		concretePatternEClass = createEClass(CONCRETE_PATTERN);
		createEAttribute(concretePatternEClass, CONCRETE_PATTERN__TYPE);

		// Create enums
		patternTypeEEnum = createEEnum(PATTERN_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternGeneratorPackage thePatternGeneratorPackage = (PatternGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(PatternGeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		masterEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		slaveEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		underlyingSubsystemEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		regionalPlannerEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		abstractPeerEClass.getESuperTypes().add(thePatternGeneratorPackage.getManagingSystem());
		peerEClass.getESuperTypes().add(this.getAbstractPeer());
		hPeerEClass.getESuperTypes().add(this.getAbstractPeer());
		concretePatternEClass.getESuperTypes().add(thePatternGeneratorPackage.getDecentralizedControlPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterEClass, Master.class, "Master", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(slaveEClass, Slave.class, "Slave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(underlyingSubsystemEClass, UnderlyingSubsystem.class, "UnderlyingSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnderlyingSubsystem_HasAssociatedTargetPlanner(), ecorePackage.getEBoolean(), "hasAssociatedTargetPlanner", null, 1, 1, UnderlyingSubsystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnderlyingSubsystem_HasAssociatedContextPlanner(), ecorePackage.getEBoolean(), "hasAssociatedContextPlanner", null, 1, 1, UnderlyingSubsystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(regionalPlannerEClass, RegionalPlanner.class, "RegionalPlanner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPeerEClass, AbstractPeer.class, "AbstractPeer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(peerEClass, Peer.class, "Peer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hPeerEClass, HPeer.class, "HPeer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHPeer_HasDirectManaged(), ecorePackage.getEBoolean(), "hasDirectManaged", null, 1, 1, HPeer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(concretePatternEClass, ConcretePattern.class, "ConcretePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcretePattern_Type(), this.getPatternType(), "type", null, 1, 1, ConcretePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(patternTypeEEnum, PatternType.class, "PatternType");
		addEEnumLiteral(patternTypeEEnum, PatternType.NO_PATTERN);
		addEEnumLiteral(patternTypeEEnum, PatternType.INFO_SHARING);
		addEEnumLiteral(patternTypeEEnum, PatternType.CUSTOM_PATTERN);
		addEEnumLiteral(patternTypeEEnum, PatternType.COORD_CONTROL);
		addEEnumLiteral(patternTypeEEnum, PatternType.HIER_CONTROL);
		addEEnumLiteral(patternTypeEEnum, PatternType.REG_PLANNING);
		addEEnumLiteral(patternTypeEEnum, PatternType.MASTER_SLAVE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (masterEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasNOMonitor hasAnalyze hasPlan hasNOExecute analyzeSpeaksWithPlan"
		   });	
		addAnnotation
		  (slaveEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasMonitor hasNOAnalyze hasNOPlan hasExecute checkONEManaged actONEManaged checkAndAct slaveMonitorSpeaksWithMasterAnalyze masterPlanSpeaksWithSlaveExecute"
		   });	
		addAnnotation
		  (underlyingSubsystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasMonitor hasAnalyze hasNoPlan hasExecute checkONEManaged actONEManaged checkAndAct monitorSpeaksWithAnalyze analyzeSpeaksWithPlan planSpeaksWithExecute maxInterInteractionAllowed hasOneOnlyAssociatedPlanner"
		   });	
		addAnnotation
		  (regionalPlannerEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasNoMonitor hasNoAnalyze hasPlan hasNoExecute"
		   });	
		addAnnotation
		  (abstractPeerEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasMonitor hasAnalyze hasPlan hasExecute monitorSpeaksWithAnalyze analyzeSpeaksWithPlan planSpeaksWithExecute maxInterInteractionAllowed"
		   });	
		addAnnotation
		  (peerEClass, 
		   source, 
		   new String[] {
			 "constraints", "checkAndAct slaveMonitorSpeaksWithMasterAnalyze masterPlanSpeaksWithSlaveExecute"
		   });	
		addAnnotation
		  (hPeerEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasManaged"
		   });	
		addAnnotation
		  (concretePatternEClass, 
		   source, 
		   new String[] {
			 "constraints", "noPatternSelected atLeastOnePeer peersMonitorSpeakOnlyEachOther presenceOfNotAllowedElements atLeastOneUnderlyingSubsystem atLeastOneRegionalPlanner intraComponentInteractionIsPCoord intraComponentInteractionIsMCoord NoIntraComponentInteraction intraComponentInteractionIsCoord presenceOfNotAllowedElementsInRegionalPlanningPattern exactlyOneMaster atLeastOneSlave maxMasterSlavePatternInteractionAllowed atLeastOneNode presenceOfNotAllowedElementsInMasterSlavePattern"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (masterEClass, 
		   source, 
		   new String[] {
			 "hasNOMonitor", "self.monitor = null",
			 "hasAnalyze", "self.analyze <> null",
			 "hasPlan", "self.plan <> null",
			 "hasNOExecute", "self.execute = null",
			 "analyzeSpeaksWithPlan", "getMyContextInterComponentInteractions\n\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t->select(target.oclIsKindOf(Plan))->size()=1"
		   });	
		addAnnotation
		  (slaveEClass, 
		   source, 
		   new String[] {
			 "hasMonitor", "self.monitor <> null",
			 "hasNOAnalyze", "self.analyze = null",
			 "hasNOPlan", "self.plan = null",
			 "hasExecute", "self.execute <> null",
			 "checkONEManaged", "self.monitor?.hasOneManagedCheck",
			 "actONEManaged", "self.execute?.hasOneManagedAct",
			 "checkAndAct", "self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct \n\t\t\t\tand self.monitor.check = self.execute.act",
			 "slaveMonitorSpeaksWithMasterAnalyze", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t->size()=1",
			 "masterPlanSpeaksWithSlaveExecute", "getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1"
		   });	
		addAnnotation
		  (underlyingSubsystemEClass, 
		   source, 
		   new String[] {
			 "hasMonitor", "self.monitor <> null",
			 "hasAnalyze", "self.analyze <> null",
			 "hasNoPlan", "self.plan = null",
			 "hasExecute", "self.execute <> null",
			 "checkONEManaged", "self.monitor.hasOneManagedCheck",
			 "actONEManaged", "self.execute.hasOneManagedAct",
			 "checkAndAct", "\n\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif",
			 "monitorSpeaksWithAnalyze", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1",
			 "analyzeSpeaksWithPlan", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1",
			 "planSpeaksWithExecute", "getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1",
			 "maxInterInteractionAllowed", "getMyContextInterComponentInteractions->size() <= 2 \n\t\t\t\t\t\t\t\tand getMyTargetInterComponentInteractions->size()<=2",
			 "hasOneOnlyAssociatedPlanner", "\n\t\t\t\t\tif(hasAssociatedContextPlanner and hasAssociatedTargetPlanner)\n\t\t\t\t\t\tthen self.getMyContextInterComponentInteractions->any(target.oclIsKindOf(Plan)).target.oclContainer().oclAsType(RegionalPlanner) = \n\t\t\t\t\t\t\tself.getMyTargetInterComponentInteractions->any(context.oclIsKindOf(Plan)).context.oclContainer().oclAsType(RegionalPlanner)\n\t\t\t\t\telse true\n\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getUnderlyingSubsystem_HasAssociatedTargetPlanner(), 
		   source, 
		   new String[] {
			 "derivation", "self.getMyContextInterComponentInteractions\n\t\t\t\t\t ->select(targetAndContextNotNull)\n\t\t\t\t\t ->select(target.oclIsKindOf(Plan))\n\t\t\t\t\t ->select(target.oclContainer() <> null and target.oclContainer.oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t ->size()>0"
		   });	
		addAnnotation
		  (getUnderlyingSubsystem_HasAssociatedContextPlanner(), 
		   source, 
		   new String[] {
			 "derivation", "self.getMyTargetInterComponentInteractions\n\t\t\t\t\t ->select(targetAndContextNotNull)\n\t\t\t\t\t ->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t ->select(context.oclContainer() <> null and context.oclContainer.oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t ->size()>0"
		   });	
		addAnnotation
		  (regionalPlannerEClass, 
		   source, 
		   new String[] {
			 "hasNoMonitor", "self.monitor = null",
			 "hasNoAnalyze", "self.analyze = null",
			 "hasPlan", "self.plan <> null",
			 "hasNoExecute", "self.execute = null"
		   });	
		addAnnotation
		  (abstractPeerEClass, 
		   source, 
		   new String[] {
			 "hasMonitor", "self.monitor <> null",
			 "hasAnalyze", "self.analyze <> null",
			 "hasPlan", "self.plan <> null",
			 "hasExecute", "self.execute <> null",
			 "monitorSpeaksWithAnalyze", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1",
			 "analyzeSpeaksWithPlan", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1",
			 "planSpeaksWithExecute", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1",
			 "maxInterInteractionAllowed", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t->size() <= 3"
		   });	
		addAnnotation
		  (peerEClass, 
		   source, 
		   new String[] {
			 "checkAndAct", "\n\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif",
			 "slaveMonitorSpeaksWithMasterAnalyze", "getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t\t\t->size()=1",
			 "masterPlanSpeaksWithSlaveExecute", "getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1"
		   });	
		addAnnotation
		  (hPeerEClass, 
		   source, 
		   new String[] {
			 "hasManaged", "\n\t\t\t\t\t\t\tif(hasDirectManaged) \n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse self.monitor?.check->size() > 0 and self.monitor?.check = self.execute?.act\n\t\t\t\t\t\t\tendif"
		   });	
		addAnnotation
		  (getHPeer_HasDirectManaged(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\t\t\t\tmonitor?.hasOneManagedCheck and execute?.hasOneManagedAct \n\t\t\t\t\t\t\tand monitor.check = execute.act"
		   });	
		addAnnotation
		  (concretePatternEClass, 
		   source, 
		   new String[] {
			 "noPatternSelected", "if(type = PatternType::NoPattern) then false else true endif",
			 "atLeastOnePeer", "\n\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(Peer))->size()>0\n\t\t\t\telse true\n\t\t\t\tendif",
			 "peersMonitorSpeakOnlyEachOther", "\n\t\t\t\t\t\t\tif(type = PatternType::InfoSharing) then\n\t\t\t\t\t\t\t\t\tself.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t\t\t->select( not (oclAsType(Interaction).context.oclIsKindOf(Monitor)\n\t\t\t\t \t\t\t\t\tand oclAsType(Interaction).target.oclIsKindOf(Monitor)))\n\t\t\t\t\t\t\t\t\t->size() = 0\n\t\t\t\telse true\n\t\t\t\tendif",
			 "presenceOfNotAllowedElements", "\n\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl) then\n\t\t\t\t\tself.elements->select(oclIsKindOf(ManagingSystem))->reject(oclIsKindOf(Peer))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "atLeastOneUnderlyingSubsystem", "\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "atLeastOneRegionalPlanner", "\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "intraComponentInteractionIsPCoord", "\n\t\t\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Plan)\n\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "intraComponentInteractionIsMCoord", "\n\t\t\t\tif(type = PatternType::InfoSharing)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Monitor)\n\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "NoIntraComponentInteraction", "\n\t\t\t\tif(type = PatternType::HierControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "intraComponentInteractionIsCoord", "\n\t\t\t\tif(type = PatternType::CoordControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select(oclIsKindOf(Delegation))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "presenceOfNotAllowedElementsInRegionalPlanningPattern", "\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->reject(oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t\t->reject(oclIsKindOf(UnderlyingSubsystem))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "exactlyOneMaster", "\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\tthen self.elements->select(oclIsKindOf(Master))->size() = 1\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "atLeastOneSlave", "\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Slave))->size() >= 1\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif",
			 "maxMasterSlavePatternInteractionAllowed", "\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Interaction))\n\t\t\t\t\t\t\t->size() <= 2*(self.elements->select(oclIsKindOf(Slave))->size()) + 1\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif",
			 "atLeastOneNode", "\n\t\t\t\tif(type = PatternType::CustomPattern) \n\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif",
			 "presenceOfNotAllowedElementsInMasterSlavePattern", "\n\t\t\t\t\t\tif(type = PatternType::MasterSlave)\n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->reject(oclIsKindOf(Master))\n\t\t\t\t\t\t->reject(oclIsKindOf(Slave))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif"
		   });
	}

} //DecentralizedPatternPackageImpl
