/**
 */
package patternGenerator.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import patternGenerator.Analyze;
import patternGenerator.Coordination;
import patternGenerator.DecentralizedControlPattern;
import patternGenerator.Delegation;
import patternGenerator.Element;
import patternGenerator.Execute;
import patternGenerator.InterComponentInteraction;
import patternGenerator.Interaction;
import patternGenerator.IntraComponentInteraction;
import patternGenerator.Knowledge;
import patternGenerator.ManagedSystem;
import patternGenerator.ManagingSystem;
import patternGenerator.MapeComponent;
import patternGenerator.Monitor;
import patternGenerator.PatternGeneratorFactory;
import patternGenerator.PatternGeneratorPackage;
import patternGenerator.Plan;
import patternGenerator.ReadWriteInteraction;
import patternGenerator.Subsystem;

import patternGenerator.decentralizedPattern.DecentralizedPatternPackage;

import patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl;

import patternGenerator.util.PatternGeneratorValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternGeneratorPackageImpl extends EPackageImpl implements PatternGeneratorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managedSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decentralizedControlPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraComponentInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interComponentInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readWriteInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationEClass = null;

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
	 * @see patternGenerator.PatternGeneratorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternGeneratorPackageImpl() {
		super(eNS_URI, PatternGeneratorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternGeneratorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternGeneratorPackage init() {
		if (isInited) return (PatternGeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(PatternGeneratorPackage.eNS_URI);

		// Obtain or create and register package
		PatternGeneratorPackageImpl thePatternGeneratorPackage = (PatternGeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternGeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternGeneratorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DecentralizedPatternPackageImpl theDecentralizedPatternPackage = (DecentralizedPatternPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DecentralizedPatternPackage.eNS_URI) instanceof DecentralizedPatternPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DecentralizedPatternPackage.eNS_URI) : DecentralizedPatternPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternGeneratorPackage.createPackageContents();
		theDecentralizedPatternPackage.createPackageContents();

		// Initialize created meta-data
		thePatternGeneratorPackage.initializePackageContents();
		theDecentralizedPatternPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatternGeneratorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PatternGeneratorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatternGeneratorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternGeneratorPackage.eNS_URI, thePatternGeneratorPackage);
		return thePatternGeneratorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagingSystem() {
		return managingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_HasInterComponentInteractions() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_HasIntraComponentInteractions() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_GetAllInterComponentInteractions() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_HasMyTargetInterComponentInteractions() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_GetMyTargetInterComponentInteractions() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_HasMyContextInterComponentInteractions() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_GetMyContextInterComponentInteractions() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_GetAllIntraComponentInteractions() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_HasMyIntraComponentInteractions() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_GetAllMyIntraComponentInteractions() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_Analyze() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_Plan() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_Execute() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagingSystem_Name() {
		return (EAttribute)managingSystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_Knowledge() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagingSystem_Monitor() {
		return (EReference)managingSystemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagedSystem() {
		return managedSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystem_Name() {
		return (EAttribute)managedSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagedSystem_Attributes() {
		return (EAttribute)managedSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapeComponent() {
		return mapeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Check() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitor_HasOneManagedCheck() {
		return (EAttribute)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyze() {
		return analyzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecute() {
		return executeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecute_Act() {
		return (EReference)executeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecute_HasOneManagedAct() {
		return (EAttribute)executeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledge() {
		return knowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Context() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Target() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteraction_TargetAndContextNotNull() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecentralizedControlPattern() {
		return decentralizedControlPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecentralizedControlPattern_Elements() {
		return (EReference)decentralizedControlPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraComponentInteraction() {
		return intraComponentInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterComponentInteraction() {
		return interComponentInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadWriteInteraction() {
		return readWriteInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordination() {
		return coordinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordination_Inverse() {
		return (EReference)coordinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorFactory getPatternGeneratorFactory() {
		return (PatternGeneratorFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);

		managingSystemEClass = createEClass(MANAGING_SYSTEM);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__ANALYZE);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__PLAN);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__EXECUTE);
		createEAttribute(managingSystemEClass, MANAGING_SYSTEM__NAME);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__KNOWLEDGE);
		createEReference(managingSystemEClass, MANAGING_SYSTEM__MONITOR);

		managedSystemEClass = createEClass(MANAGED_SYSTEM);
		createEAttribute(managedSystemEClass, MANAGED_SYSTEM__NAME);
		createEAttribute(managedSystemEClass, MANAGED_SYSTEM__ATTRIBUTES);

		mapeComponentEClass = createEClass(MAPE_COMPONENT);

		monitorEClass = createEClass(MONITOR);
		createEReference(monitorEClass, MONITOR__CHECK);
		createEAttribute(monitorEClass, MONITOR__HAS_ONE_MANAGED_CHECK);

		analyzeEClass = createEClass(ANALYZE);

		planEClass = createEClass(PLAN);

		executeEClass = createEClass(EXECUTE);
		createEReference(executeEClass, EXECUTE__ACT);
		createEAttribute(executeEClass, EXECUTE__HAS_ONE_MANAGED_ACT);

		knowledgeEClass = createEClass(KNOWLEDGE);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__CONTEXT);
		createEReference(interactionEClass, INTERACTION__TARGET);
		createEAttribute(interactionEClass, INTERACTION__TARGET_AND_CONTEXT_NOT_NULL);

		decentralizedControlPatternEClass = createEClass(DECENTRALIZED_CONTROL_PATTERN);
		createEReference(decentralizedControlPatternEClass, DECENTRALIZED_CONTROL_PATTERN__ELEMENTS);

		intraComponentInteractionEClass = createEClass(INTRA_COMPONENT_INTERACTION);

		interComponentInteractionEClass = createEClass(INTER_COMPONENT_INTERACTION);

		readWriteInteractionEClass = createEClass(READ_WRITE_INTERACTION);

		subsystemEClass = createEClass(SUBSYSTEM);

		delegationEClass = createEClass(DELEGATION);

		coordinationEClass = createEClass(COORDINATION);
		createEReference(coordinationEClass, COORDINATION__INVERSE);
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
		DecentralizedPatternPackage theDecentralizedPatternPackage = (DecentralizedPatternPackage)EPackage.Registry.INSTANCE.getEPackage(DecentralizedPatternPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDecentralizedPatternPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managingSystemEClass.getESuperTypes().add(this.getSubsystem());
		managedSystemEClass.getESuperTypes().add(this.getSubsystem());
		monitorEClass.getESuperTypes().add(this.getMapeComponent());
		analyzeEClass.getESuperTypes().add(this.getMapeComponent());
		planEClass.getESuperTypes().add(this.getMapeComponent());
		executeEClass.getESuperTypes().add(this.getMapeComponent());
		knowledgeEClass.getESuperTypes().add(this.getMapeComponent());
		interactionEClass.getESuperTypes().add(this.getElement());
		intraComponentInteractionEClass.getESuperTypes().add(this.getInteraction());
		interComponentInteractionEClass.getESuperTypes().add(this.getInteraction());
		readWriteInteractionEClass.getESuperTypes().add(this.getInteraction());
		subsystemEClass.getESuperTypes().add(this.getElement());
		delegationEClass.getESuperTypes().add(this.getIntraComponentInteraction());
		coordinationEClass.getESuperTypes().add(this.getIntraComponentInteraction());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(managingSystemEClass, ManagingSystem.class, "ManagingSystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagingSystem_HasInterComponentInteractions(), ecorePackage.getEBoolean(), "hasInterComponentInteractions", null, 1, 1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagingSystem_HasIntraComponentInteractions(), ecorePackage.getEBoolean(), "hasIntraComponentInteractions", null, 1, 1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_GetAllInterComponentInteractions(), this.getInterComponentInteraction(), null, "getAllInterComponentInteractions", null, 0, -1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagingSystem_HasMyTargetInterComponentInteractions(), ecorePackage.getEBoolean(), "hasMyTargetInterComponentInteractions", null, 1, 1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_GetMyTargetInterComponentInteractions(), this.getInterComponentInteraction(), null, "getMyTargetInterComponentInteractions", null, 0, -1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagingSystem_HasMyContextInterComponentInteractions(), ecorePackage.getEBoolean(), "hasMyContextInterComponentInteractions", null, 1, 1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_GetMyContextInterComponentInteractions(), this.getInterComponentInteraction(), null, "getMyContextInterComponentInteractions", null, 0, -1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_GetAllIntraComponentInteractions(), this.getIntraComponentInteraction(), null, "getAllIntraComponentInteractions", null, 0, -1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagingSystem_HasMyIntraComponentInteractions(), ecorePackage.getEBoolean(), "hasMyIntraComponentInteractions", null, 1, 1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_GetAllMyIntraComponentInteractions(), this.getIntraComponentInteraction(), null, "getAllMyIntraComponentInteractions", null, 0, -1, ManagingSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_Analyze(), this.getAnalyze(), null, "analyze", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_Plan(), this.getPlan(), null, "plan", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_Execute(), this.getExecute(), null, "execute", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagingSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_Knowledge(), this.getKnowledge(), null, "knowledge", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagingSystem_Monitor(), this.getMonitor(), null, "monitor", null, 0, 1, ManagingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managedSystemEClass, ManagedSystem.class, "ManagedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagedSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManagedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManagedSystem_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, ManagedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapeComponentEClass, MapeComponent.class, "MapeComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitor_Check(), this.getSubsystem(), null, "check", null, 0, -1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonitor_HasOneManagedCheck(), ecorePackage.getEBoolean(), "hasOneManagedCheck", null, 1, 1, Monitor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(analyzeEClass, Analyze.class, "Analyze", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executeEClass, Execute.class, "Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecute_Act(), this.getSubsystem(), null, "act", null, 0, -1, Execute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecute_HasOneManagedAct(), ecorePackage.getEBoolean(), "hasOneManagedAct", null, 1, 1, Execute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Context(), this.getMapeComponent(), null, "context", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Target(), this.getMapeComponent(), null, "target", null, 1, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteraction_TargetAndContextNotNull(), ecorePackage.getEBoolean(), "targetAndContextNotNull", null, 1, 1, Interaction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(decentralizedControlPatternEClass, DecentralizedControlPattern.class, "DecentralizedControlPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecentralizedControlPattern_Elements(), this.getElement(), null, "elements", null, 0, -1, DecentralizedControlPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intraComponentInteractionEClass, IntraComponentInteraction.class, "IntraComponentInteraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interComponentInteractionEClass, InterComponentInteraction.class, "InterComponentInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readWriteInteractionEClass, ReadWriteInteraction.class, "ReadWriteInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsystemEClass, Subsystem.class, "Subsystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationEClass, Coordination.class, "Coordination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordination_Inverse(), this.getCoordination(), null, "inverse", null, 1, 1, Coordination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
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
		  (managingSystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasAtLeastOneMapeKComponent"
		   });	
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetAndContextDifferent"
		   });	
		addAnnotation
		  (intraComponentInteractionEClass, 
		   source, 
		   new String[] {
			 "constraints", "isIntraComponent"
		   });	
		addAnnotation
		  (interComponentInteractionEClass, 
		   source, 
		   new String[] {
			 "constraints", "isInterComponent"
		   });	
		addAnnotation
		  (readWriteInteractionEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetIsKnowledge"
		   });	
		addAnnotation
		  (coordinationEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasExactlyOneInverse isInverse"
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
		  (managingSystemEClass, 
		   source, 
		   new String[] {
			 "hasAtLeastOneMapeKComponent", "self.monitor <> null or self.analyze <> null \n\t\t\t\t\tor self.plan <> null or self.execute <> null or self.knowledge <> null"
		   });	
		addAnnotation
		  (getManagingSystem_HasInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif (self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t->select(oclIsKindOf(InterComponentInteraction))\n\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull )->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_HasIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif (self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_GetAllInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(hasInterComponentInteractions)\n\t\t\t\t\tthen\n\t\t\t\t\t\tself.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t->select(oclIsKindOf(InterComponentInteraction))\n\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t->oclAsType(OrderedSet(InterComponentInteraction))\n\t\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_HasMyTargetInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(self.getAllInterComponentInteractions\n\t\t\t\t\t->select(targetAndContextNotNull and target.oclContainer() <> null and target.oclContainer().oclIsKindOf(ManagingSystem))\n\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_GetMyTargetInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(hasMyTargetInterComponentInteractions)\n\t\t\t\t\tthen self.getAllInterComponentInteractions\n\t\t\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_HasMyContextInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(self.getAllInterComponentInteractions\n\t\t\t\t\t\t->select(targetAndContextNotNull and context.oclContainer() <> null and context.oclContainer().oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->select(context.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\telse false\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_GetMyContextInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(hasMyContextInterComponentInteractions)\n\t\t\t\t\tthen self.getAllInterComponentInteractions\n\t\t\t\t\t\t->select(context.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_GetAllIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(hasIntraComponentInteractions)\n\t\t\t\t\tthen self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t->select( m | m.oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull) \n\t\t\t\t\t\t->oclAsType(OrderedSet(IntraComponentInteraction))\n\t\t\t\telse OrderedSet(IntraComponentInteraction){}\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_HasMyIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(getAllIntraComponentInteractions\n\t\t\t\t\t\t-> select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->size()>0)\n\t\t\t\t\tthen true\n\t\t\t\telse false\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getManagingSystem_GetAllMyIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\tif(hasMyIntraComponentInteractions)\n\t\t\t\t\tthen getAllIntraComponentInteractions\n\t\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->oclAsType(OrderedSet(IntraComponentInteraction))\n\t\t\t\t\telse OrderedSet(IntraComponentInteraction){}\n\t\t\t\tendif"
		   });	
		addAnnotation
		  (getMonitor_HasOneManagedCheck(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\t\t\t\t\t\t\t\t\tself.check?->size() = 1 and self.check->select(oclIsKindOf(ManagedSystem))->size() = 1"
		   });	
		addAnnotation
		  (getExecute_HasOneManagedAct(), 
		   source, 
		   new String[] {
			 "derivation", "\n\t\t\t\t\t\t\t\t\t\t\t\t\tself.act?->size() = 1 and self.act->select(oclIsKindOf(ManagedSystem))->size() = 1"
		   });	
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "targetAndContextDifferent", "context <> target"
		   });	
		addAnnotation
		  (getInteraction_TargetAndContextNotNull(), 
		   source, 
		   new String[] {
			 "derivation", "context <> null and target <> null"
		   });	
		addAnnotation
		  (intraComponentInteractionEClass, 
		   source, 
		   new String[] {
			 "isIntraComponent", "context?->oclType() = target?->oclType()"
		   });	
		addAnnotation
		  (interComponentInteractionEClass, 
		   source, 
		   new String[] {
			 "isInterComponent", "context?->oclType() <> target?->oclType()"
		   });	
		addAnnotation
		  (readWriteInteractionEClass, 
		   source, 
		   new String[] {
			 "targetIsKnowledge", "target <> null and target.oclIsKindOf(Knowledge)"
		   });	
		addAnnotation
		  (coordinationEClass, 
		   source, 
		   new String[] {
			 "hasExactlyOneInverse", "self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select( oclIsKindOf(Coordination))\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select(oclAsType(Coordination).target = self.context \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand oclAsType(Coordination).context = self.target) \n\t\t\t\t\t\t\t\t\t\t\t\t\t->size()=1",
			 "isInverse", "inverse.target = self.context and inverse.context = self.target"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";	
		addAnnotation
		  (getManagingSystem_GetMyTargetInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getManagingSystem_GetMyContextInterComponentInteractions(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getManagingSystem_GetAllIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });	
		addAnnotation
		  (getManagingSystem_GetAllMyIntraComponentInteractions(), 
		   source, 
		   new String[] {
			 "nullFree", "false"
		   });
	}

} //PatternGeneratorPackageImpl
