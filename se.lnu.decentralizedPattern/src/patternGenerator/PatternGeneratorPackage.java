/**
 */
package patternGenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see patternGenerator.PatternGeneratorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PatternGeneratorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "patternGenerator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/patternGenerator";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "patternGenerator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternGeneratorPackage eINSTANCE = patternGenerator.impl.PatternGeneratorPackageImpl.init();

	/**
	 * The meta object id for the '{@link patternGenerator.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.ElementImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.SubsystemImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 14;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.ManagingSystemImpl <em>Managing System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.ManagingSystemImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getManagingSystem()
	 * @generated
	 */
	int MANAGING_SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = SUBSYSTEM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__ANALYZE = SUBSYSTEM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__PLAN = SUBSYSTEM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__EXECUTE = SUBSYSTEM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__NAME = SUBSYSTEM_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__KNOWLEDGE = SUBSYSTEM_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM__MONITOR = SUBSYSTEM_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Managing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Managing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGING_SYSTEM_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.ManagedSystemImpl <em>Managed System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.ManagedSystemImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getManagedSystem()
	 * @generated
	 */
	int MANAGED_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_SYSTEM__NAME = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_SYSTEM__ATTRIBUTES = SUBSYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Managed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_SYSTEM_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Managed System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGED_SYSTEM_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.MapeComponentImpl <em>Mape Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.MapeComponentImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getMapeComponent()
	 * @generated
	 */
	int MAPE_COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Mape Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mape Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.MonitorImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 4;

	/**
	 * The feature id for the '<em><b>Check</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__CHECK = MAPE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has One Managed Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__HAS_ONE_MANAGED_CHECK = MAPE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = MAPE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = MAPE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.AnalyzeImpl <em>Analyze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.AnalyzeImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getAnalyze()
	 * @generated
	 */
	int ANALYZE = 5;

	/**
	 * The number of structural features of the '<em>Analyze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE_FEATURE_COUNT = MAPE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Analyze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZE_OPERATION_COUNT = MAPE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.PlanImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 6;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = MAPE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = MAPE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.ExecuteImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 7;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__ACT = MAPE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has One Managed Act</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__HAS_ONE_MANAGED_ACT = MAPE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = MAPE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_OPERATION_COUNT = MAPE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.KnowledgeImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 8;

	/**
	 * The number of structural features of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_FEATURE_COUNT = MAPE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_OPERATION_COUNT = MAPE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.InteractionImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CONTEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TARGET_AND_CONTEXT_NOT_NULL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.DecentralizedControlPatternImpl <em>Decentralized Control Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.DecentralizedControlPatternImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getDecentralizedControlPattern()
	 * @generated
	 */
	int DECENTRALIZED_CONTROL_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRALIZED_CONTROL_PATTERN__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Decentralized Control Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRALIZED_CONTROL_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Decentralized Control Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRALIZED_CONTROL_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.IntraComponentInteractionImpl <em>Intra Component Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.IntraComponentInteractionImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getIntraComponentInteraction()
	 * @generated
	 */
	int INTRA_COMPONENT_INTERACTION = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_COMPONENT_INTERACTION__CONTEXT = INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_COMPONENT_INTERACTION__TARGET = INTERACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_COMPONENT_INTERACTION__TARGET_AND_CONTEXT_NOT_NULL = INTERACTION__TARGET_AND_CONTEXT_NOT_NULL;

	/**
	 * The number of structural features of the '<em>Intra Component Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_COMPONENT_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intra Component Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_COMPONENT_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.InterComponentInteractionImpl <em>Inter Component Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.InterComponentInteractionImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getInterComponentInteraction()
	 * @generated
	 */
	int INTER_COMPONENT_INTERACTION = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COMPONENT_INTERACTION__CONTEXT = INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COMPONENT_INTERACTION__TARGET = INTERACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COMPONENT_INTERACTION__TARGET_AND_CONTEXT_NOT_NULL = INTERACTION__TARGET_AND_CONTEXT_NOT_NULL;

	/**
	 * The number of structural features of the '<em>Inter Component Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COMPONENT_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inter Component Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_COMPONENT_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.ReadWriteInteractionImpl <em>Read Write Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.ReadWriteInteractionImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getReadWriteInteraction()
	 * @generated
	 */
	int READ_WRITE_INTERACTION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_INTERACTION__CONTEXT = INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_INTERACTION__TARGET = INTERACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_INTERACTION__TARGET_AND_CONTEXT_NOT_NULL = INTERACTION__TARGET_AND_CONTEXT_NOT_NULL;

	/**
	 * The number of structural features of the '<em>Read Write Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_INTERACTION_FEATURE_COUNT = INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Write Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_WRITE_INTERACTION_OPERATION_COUNT = INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.DelegationImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 15;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__CONTEXT = INTRA_COMPONENT_INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TARGET = INTRA_COMPONENT_INTERACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__TARGET_AND_CONTEXT_NOT_NULL = INTRA_COMPONENT_INTERACTION__TARGET_AND_CONTEXT_NOT_NULL;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = INTRA_COMPONENT_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_OPERATION_COUNT = INTRA_COMPONENT_INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.impl.CoordinationImpl <em>Coordination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.impl.CoordinationImpl
	 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getCoordination()
	 * @generated
	 */
	int COORDINATION = 16;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION__CONTEXT = INTRA_COMPONENT_INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION__TARGET = INTRA_COMPONENT_INTERACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION__TARGET_AND_CONTEXT_NOT_NULL = INTRA_COMPONENT_INTERACTION__TARGET_AND_CONTEXT_NOT_NULL;

	/**
	 * The feature id for the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION__INVERSE = INTRA_COMPONENT_INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_FEATURE_COUNT = INTRA_COMPONENT_INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coordination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_OPERATION_COUNT = INTRA_COMPONENT_INTERACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link patternGenerator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see patternGenerator.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link patternGenerator.ManagingSystem <em>Managing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managing System</em>'.
	 * @see patternGenerator.ManagingSystem
	 * @generated
	 */
	EClass getManagingSystem();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#isHasInterComponentInteractions <em>Has Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#isHasInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_HasInterComponentInteractions();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#isHasIntraComponentInteractions <em>Has Intra Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Intra Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#isHasIntraComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_HasIntraComponentInteractions();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.ManagingSystem#getGetAllInterComponentInteractions <em>Get All Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#getGetAllInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_GetAllInterComponentInteractions();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#isHasMyTargetInterComponentInteractions <em>Has My Target Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has My Target Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#isHasMyTargetInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_HasMyTargetInterComponentInteractions();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.ManagingSystem#getGetMyTargetInterComponentInteractions <em>Get My Target Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get My Target Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#getGetMyTargetInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_GetMyTargetInterComponentInteractions();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#isHasMyContextInterComponentInteractions <em>Has My Context Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has My Context Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#isHasMyContextInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_HasMyContextInterComponentInteractions();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.ManagingSystem#getGetMyContextInterComponentInteractions <em>Get My Context Inter Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get My Context Inter Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#getGetMyContextInterComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_GetMyContextInterComponentInteractions();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.ManagingSystem#getGetAllIntraComponentInteractions <em>Get All Intra Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All Intra Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#getGetAllIntraComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_GetAllIntraComponentInteractions();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#isHasMyIntraComponentInteractions <em>Has My Intra Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has My Intra Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#isHasMyIntraComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_HasMyIntraComponentInteractions();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.ManagingSystem#getGetAllMyIntraComponentInteractions <em>Get All My Intra Component Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Get All My Intra Component Interactions</em>'.
	 * @see patternGenerator.ManagingSystem#getGetAllMyIntraComponentInteractions()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_GetAllMyIntraComponentInteractions();

	/**
	 * Returns the meta object for the containment reference '{@link patternGenerator.ManagingSystem#getAnalyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analyze</em>'.
	 * @see patternGenerator.ManagingSystem#getAnalyze()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_Analyze();

	/**
	 * Returns the meta object for the containment reference '{@link patternGenerator.ManagingSystem#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see patternGenerator.ManagingSystem#getPlan()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link patternGenerator.ManagingSystem#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execute</em>'.
	 * @see patternGenerator.ManagingSystem#getExecute()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_Execute();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patternGenerator.ManagingSystem#getName()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EAttribute getManagingSystem_Name();

	/**
	 * Returns the meta object for the containment reference '{@link patternGenerator.ManagingSystem#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge</em>'.
	 * @see patternGenerator.ManagingSystem#getKnowledge()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_Knowledge();

	/**
	 * Returns the meta object for the containment reference '{@link patternGenerator.ManagingSystem#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitor</em>'.
	 * @see patternGenerator.ManagingSystem#getMonitor()
	 * @see #getManagingSystem()
	 * @generated
	 */
	EReference getManagingSystem_Monitor();

	/**
	 * Returns the meta object for class '{@link patternGenerator.ManagedSystem <em>Managed System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Managed System</em>'.
	 * @see patternGenerator.ManagedSystem
	 * @generated
	 */
	EClass getManagedSystem();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.ManagedSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see patternGenerator.ManagedSystem#getName()
	 * @see #getManagedSystem()
	 * @generated
	 */
	EAttribute getManagedSystem_Name();

	/**
	 * Returns the meta object for the attribute list '{@link patternGenerator.ManagedSystem#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see patternGenerator.ManagedSystem#getAttributes()
	 * @see #getManagedSystem()
	 * @generated
	 */
	EAttribute getManagedSystem_Attributes();

	/**
	 * Returns the meta object for class '{@link patternGenerator.MapeComponent <em>Mape Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mape Component</em>'.
	 * @see patternGenerator.MapeComponent
	 * @generated
	 */
	EClass getMapeComponent();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see patternGenerator.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.Monitor#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Check</em>'.
	 * @see patternGenerator.Monitor#getCheck()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Check();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.Monitor#isHasOneManagedCheck <em>Has One Managed Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has One Managed Check</em>'.
	 * @see patternGenerator.Monitor#isHasOneManagedCheck()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_HasOneManagedCheck();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Analyze <em>Analyze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyze</em>'.
	 * @see patternGenerator.Analyze
	 * @generated
	 */
	EClass getAnalyze();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see patternGenerator.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see patternGenerator.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for the reference list '{@link patternGenerator.Execute#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Act</em>'.
	 * @see patternGenerator.Execute#getAct()
	 * @see #getExecute()
	 * @generated
	 */
	EReference getExecute_Act();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.Execute#isHasOneManagedAct <em>Has One Managed Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has One Managed Act</em>'.
	 * @see patternGenerator.Execute#isHasOneManagedAct()
	 * @see #getExecute()
	 * @generated
	 */
	EAttribute getExecute_HasOneManagedAct();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see patternGenerator.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see patternGenerator.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the reference '{@link patternGenerator.Interaction#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see patternGenerator.Interaction#getContext()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Context();

	/**
	 * Returns the meta object for the reference '{@link patternGenerator.Interaction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see patternGenerator.Interaction#getTarget()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Target();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.Interaction#isTargetAndContextNotNull <em>Target And Context Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target And Context Not Null</em>'.
	 * @see patternGenerator.Interaction#isTargetAndContextNotNull()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_TargetAndContextNotNull();

	/**
	 * Returns the meta object for class '{@link patternGenerator.DecentralizedControlPattern <em>Decentralized Control Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decentralized Control Pattern</em>'.
	 * @see patternGenerator.DecentralizedControlPattern
	 * @generated
	 */
	EClass getDecentralizedControlPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link patternGenerator.DecentralizedControlPattern#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see patternGenerator.DecentralizedControlPattern#getElements()
	 * @see #getDecentralizedControlPattern()
	 * @generated
	 */
	EReference getDecentralizedControlPattern_Elements();

	/**
	 * Returns the meta object for class '{@link patternGenerator.IntraComponentInteraction <em>Intra Component Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra Component Interaction</em>'.
	 * @see patternGenerator.IntraComponentInteraction
	 * @generated
	 */
	EClass getIntraComponentInteraction();

	/**
	 * Returns the meta object for class '{@link patternGenerator.InterComponentInteraction <em>Inter Component Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Component Interaction</em>'.
	 * @see patternGenerator.InterComponentInteraction
	 * @generated
	 */
	EClass getInterComponentInteraction();

	/**
	 * Returns the meta object for class '{@link patternGenerator.ReadWriteInteraction <em>Read Write Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Write Interaction</em>'.
	 * @see patternGenerator.ReadWriteInteraction
	 * @generated
	 */
	EClass getReadWriteInteraction();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see patternGenerator.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see patternGenerator.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for class '{@link patternGenerator.Coordination <em>Coordination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination</em>'.
	 * @see patternGenerator.Coordination
	 * @generated
	 */
	EClass getCoordination();

	/**
	 * Returns the meta object for the reference '{@link patternGenerator.Coordination#getInverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse</em>'.
	 * @see patternGenerator.Coordination#getInverse()
	 * @see #getCoordination()
	 * @generated
	 */
	EReference getCoordination_Inverse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternGeneratorFactory getPatternGeneratorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link patternGenerator.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.ElementImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.ManagingSystemImpl <em>Managing System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.ManagingSystemImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getManagingSystem()
		 * @generated
		 */
		EClass MANAGING_SYSTEM = eINSTANCE.getManagingSystem();

		/**
		 * The meta object literal for the '<em><b>Has Inter Component Interactions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_HasInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Has Intra Component Interactions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_HasIntraComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Get All Inter Component Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_GetAllInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_HasMyTargetInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_GetMyTargetInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_HasMyContextInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_GetMyContextInterComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Get All Intra Component Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_GetAllIntraComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Has My Intra Component Interactions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_HasMyIntraComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = eINSTANCE.getManagingSystem_GetAllMyIntraComponentInteractions();

		/**
		 * The meta object literal for the '<em><b>Analyze</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__ANALYZE = eINSTANCE.getManagingSystem_Analyze();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__PLAN = eINSTANCE.getManagingSystem_Plan();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__EXECUTE = eINSTANCE.getManagingSystem_Execute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGING_SYSTEM__NAME = eINSTANCE.getManagingSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__KNOWLEDGE = eINSTANCE.getManagingSystem_Knowledge();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGING_SYSTEM__MONITOR = eINSTANCE.getManagingSystem_Monitor();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.ManagedSystemImpl <em>Managed System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.ManagedSystemImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getManagedSystem()
		 * @generated
		 */
		EClass MANAGED_SYSTEM = eINSTANCE.getManagedSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_SYSTEM__NAME = eINSTANCE.getManagedSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGED_SYSTEM__ATTRIBUTES = eINSTANCE.getManagedSystem_Attributes();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.MapeComponentImpl <em>Mape Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.MapeComponentImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getMapeComponent()
		 * @generated
		 */
		EClass MAPE_COMPONENT = eINSTANCE.getMapeComponent();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.MonitorImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__CHECK = eINSTANCE.getMonitor_Check();

		/**
		 * The meta object literal for the '<em><b>Has One Managed Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__HAS_ONE_MANAGED_CHECK = eINSTANCE.getMonitor_HasOneManagedCheck();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.AnalyzeImpl <em>Analyze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.AnalyzeImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getAnalyze()
		 * @generated
		 */
		EClass ANALYZE = eINSTANCE.getAnalyze();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.PlanImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.ExecuteImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE__ACT = eINSTANCE.getExecute_Act();

		/**
		 * The meta object literal for the '<em><b>Has One Managed Act</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE__HAS_ONE_MANAGED_ACT = eINSTANCE.getExecute_HasOneManagedAct();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.KnowledgeImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getKnowledge()
		 * @generated
		 */
		EClass KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.InteractionImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__CONTEXT = eINSTANCE.getInteraction_Context();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__TARGET = eINSTANCE.getInteraction_Target();

		/**
		 * The meta object literal for the '<em><b>Target And Context Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__TARGET_AND_CONTEXT_NOT_NULL = eINSTANCE.getInteraction_TargetAndContextNotNull();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.DecentralizedControlPatternImpl <em>Decentralized Control Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.DecentralizedControlPatternImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getDecentralizedControlPattern()
		 * @generated
		 */
		EClass DECENTRALIZED_CONTROL_PATTERN = eINSTANCE.getDecentralizedControlPattern();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECENTRALIZED_CONTROL_PATTERN__ELEMENTS = eINSTANCE.getDecentralizedControlPattern_Elements();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.IntraComponentInteractionImpl <em>Intra Component Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.IntraComponentInteractionImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getIntraComponentInteraction()
		 * @generated
		 */
		EClass INTRA_COMPONENT_INTERACTION = eINSTANCE.getIntraComponentInteraction();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.InterComponentInteractionImpl <em>Inter Component Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.InterComponentInteractionImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getInterComponentInteraction()
		 * @generated
		 */
		EClass INTER_COMPONENT_INTERACTION = eINSTANCE.getInterComponentInteraction();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.ReadWriteInteractionImpl <em>Read Write Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.ReadWriteInteractionImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getReadWriteInteraction()
		 * @generated
		 */
		EClass READ_WRITE_INTERACTION = eINSTANCE.getReadWriteInteraction();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.SubsystemImpl <em>Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.SubsystemImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getSubsystem()
		 * @generated
		 */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.DelegationImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '{@link patternGenerator.impl.CoordinationImpl <em>Coordination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.impl.CoordinationImpl
		 * @see patternGenerator.impl.PatternGeneratorPackageImpl#getCoordination()
		 * @generated
		 */
		EClass COORDINATION = eINSTANCE.getCoordination();

		/**
		 * The meta object literal for the '<em><b>Inverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION__INVERSE = eINSTANCE.getCoordination_Inverse();

	}

} //PatternGeneratorPackage
