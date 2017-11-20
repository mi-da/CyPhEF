/**
 */
package patternGenerator.decentralizedPattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import patternGenerator.PatternGeneratorPackage;

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
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DecentralizedPatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decentralizedPattern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/patternGenerator/decentralizedPattern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "decentralizedPattern";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecentralizedPatternPackage eINSTANCE = patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.NodeImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.MasterImpl <em>Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.MasterImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getMaster()
	 * @generated
	 */
	int MASTER = 1;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The number of structural features of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.SlaveImpl <em>Slave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.SlaveImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getSlave()
	 * @generated
	 */
	int SLAVE = 2;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The number of structural features of the '<em>Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Slave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl <em>Underlying Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getUnderlyingSubsystem()
	 * @generated
	 */
	int UNDERLYING_SUBSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The feature id for the '<em><b>Has Associated Target Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Associated Context Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Underlying Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Underlying Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLYING_SUBSYSTEM_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.RegionalPlannerImpl <em>Regional Planner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.RegionalPlannerImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getRegionalPlanner()
	 * @generated
	 */
	int REGIONAL_PLANNER = 4;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The number of structural features of the '<em>Regional Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regional Planner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_PLANNER_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.AbstractPeerImpl <em>Abstract Peer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.AbstractPeerImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getAbstractPeer()
	 * @generated
	 */
	int ABSTRACT_PEER = 5;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__HAS_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__HAS_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__GET_ALL_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__GET_ALL_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__HAS_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__ANALYZE = PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__PLAN = PatternGeneratorPackage.MANAGING_SYSTEM__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__EXECUTE = PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__NAME = PatternGeneratorPackage.MANAGING_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__KNOWLEDGE = PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER__MONITOR = PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR;

	/**
	 * The number of structural features of the '<em>Abstract Peer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER_FEATURE_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Peer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PEER_OPERATION_COUNT = PatternGeneratorPackage.MANAGING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.PeerImpl <em>Peer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.PeerImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getPeer()
	 * @generated
	 */
	int PEER = 6;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__HAS_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__HAS_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__GET_ALL_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__GET_ALL_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__HAS_MY_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__ANALYZE = ABSTRACT_PEER__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__PLAN = ABSTRACT_PEER__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__EXECUTE = ABSTRACT_PEER__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__NAME = ABSTRACT_PEER__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__KNOWLEDGE = ABSTRACT_PEER__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER__MONITOR = ABSTRACT_PEER__MONITOR;

	/**
	 * The number of structural features of the '<em>Peer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_FEATURE_COUNT = ABSTRACT_PEER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Peer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEER_OPERATION_COUNT = ABSTRACT_PEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.HPeerImpl <em>HPeer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.HPeerImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getHPeer()
	 * @generated
	 */
	int HPEER = 7;

	/**
	 * The feature id for the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__GET_ALL_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__GET_ALL_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_MY_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__HAS_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS = ABSTRACT_PEER__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS;

	/**
	 * The feature id for the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__ANALYZE = ABSTRACT_PEER__ANALYZE;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__PLAN = ABSTRACT_PEER__PLAN;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__EXECUTE = ABSTRACT_PEER__EXECUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__NAME = ABSTRACT_PEER__NAME;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__KNOWLEDGE = ABSTRACT_PEER__KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__MONITOR = ABSTRACT_PEER__MONITOR;

	/**
	 * The feature id for the '<em><b>Has Direct Managed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER__HAS_DIRECT_MANAGED = ABSTRACT_PEER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HPeer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER_FEATURE_COUNT = ABSTRACT_PEER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HPeer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HPEER_OPERATION_COUNT = ABSTRACT_PEER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.impl.ConcretePatternImpl <em>Concrete Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.impl.ConcretePatternImpl
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getConcretePattern()
	 * @generated
	 */
	int CONCRETE_PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_PATTERN__ELEMENTS = PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_PATTERN__TYPE = PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_PATTERN_FEATURE_COUNT = PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concrete Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_PATTERN_OPERATION_COUNT = PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link patternGenerator.decentralizedPattern.PatternType <em>Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see patternGenerator.decentralizedPattern.PatternType
	 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getPatternType()
	 * @generated
	 */
	int PATTERN_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see patternGenerator.decentralizedPattern.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master</em>'.
	 * @see patternGenerator.decentralizedPattern.Master
	 * @generated
	 */
	EClass getMaster();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.Slave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slave</em>'.
	 * @see patternGenerator.decentralizedPattern.Slave
	 * @generated
	 */
	EClass getSlave();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem <em>Underlying Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underlying Subsystem</em>'.
	 * @see patternGenerator.decentralizedPattern.UnderlyingSubsystem
	 * @generated
	 */
	EClass getUnderlyingSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedTargetPlanner <em>Has Associated Target Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Associated Target Planner</em>'.
	 * @see patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedTargetPlanner()
	 * @see #getUnderlyingSubsystem()
	 * @generated
	 */
	EAttribute getUnderlyingSubsystem_HasAssociatedTargetPlanner();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedContextPlanner <em>Has Associated Context Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Associated Context Planner</em>'.
	 * @see patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedContextPlanner()
	 * @see #getUnderlyingSubsystem()
	 * @generated
	 */
	EAttribute getUnderlyingSubsystem_HasAssociatedContextPlanner();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.RegionalPlanner <em>Regional Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Planner</em>'.
	 * @see patternGenerator.decentralizedPattern.RegionalPlanner
	 * @generated
	 */
	EClass getRegionalPlanner();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.AbstractPeer <em>Abstract Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Peer</em>'.
	 * @see patternGenerator.decentralizedPattern.AbstractPeer
	 * @generated
	 */
	EClass getAbstractPeer();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.Peer <em>Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peer</em>'.
	 * @see patternGenerator.decentralizedPattern.Peer
	 * @generated
	 */
	EClass getPeer();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.HPeer <em>HPeer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HPeer</em>'.
	 * @see patternGenerator.decentralizedPattern.HPeer
	 * @generated
	 */
	EClass getHPeer();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.decentralizedPattern.HPeer#isHasDirectManaged <em>Has Direct Managed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Direct Managed</em>'.
	 * @see patternGenerator.decentralizedPattern.HPeer#isHasDirectManaged()
	 * @see #getHPeer()
	 * @generated
	 */
	EAttribute getHPeer_HasDirectManaged();

	/**
	 * Returns the meta object for class '{@link patternGenerator.decentralizedPattern.ConcretePattern <em>Concrete Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Pattern</em>'.
	 * @see patternGenerator.decentralizedPattern.ConcretePattern
	 * @generated
	 */
	EClass getConcretePattern();

	/**
	 * Returns the meta object for the attribute '{@link patternGenerator.decentralizedPattern.ConcretePattern#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see patternGenerator.decentralizedPattern.ConcretePattern#getType()
	 * @see #getConcretePattern()
	 * @generated
	 */
	EAttribute getConcretePattern_Type();

	/**
	 * Returns the meta object for enum '{@link patternGenerator.decentralizedPattern.PatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern Type</em>'.
	 * @see patternGenerator.decentralizedPattern.PatternType
	 * @generated
	 */
	EEnum getPatternType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecentralizedPatternFactory getDecentralizedPatternFactory();

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
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.NodeImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.MasterImpl <em>Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.MasterImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getMaster()
		 * @generated
		 */
		EClass MASTER = eINSTANCE.getMaster();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.SlaveImpl <em>Slave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.SlaveImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getSlave()
		 * @generated
		 */
		EClass SLAVE = eINSTANCE.getSlave();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl <em>Underlying Subsystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getUnderlyingSubsystem()
		 * @generated
		 */
		EClass UNDERLYING_SUBSYSTEM = eINSTANCE.getUnderlyingSubsystem();

		/**
		 * The meta object literal for the '<em><b>Has Associated Target Planner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER = eINSTANCE.getUnderlyingSubsystem_HasAssociatedTargetPlanner();

		/**
		 * The meta object literal for the '<em><b>Has Associated Context Planner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER = eINSTANCE.getUnderlyingSubsystem_HasAssociatedContextPlanner();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.RegionalPlannerImpl <em>Regional Planner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.RegionalPlannerImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getRegionalPlanner()
		 * @generated
		 */
		EClass REGIONAL_PLANNER = eINSTANCE.getRegionalPlanner();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.AbstractPeerImpl <em>Abstract Peer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.AbstractPeerImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getAbstractPeer()
		 * @generated
		 */
		EClass ABSTRACT_PEER = eINSTANCE.getAbstractPeer();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.PeerImpl <em>Peer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.PeerImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getPeer()
		 * @generated
		 */
		EClass PEER = eINSTANCE.getPeer();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.HPeerImpl <em>HPeer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.HPeerImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getHPeer()
		 * @generated
		 */
		EClass HPEER = eINSTANCE.getHPeer();

		/**
		 * The meta object literal for the '<em><b>Has Direct Managed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HPEER__HAS_DIRECT_MANAGED = eINSTANCE.getHPeer_HasDirectManaged();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.impl.ConcretePatternImpl <em>Concrete Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.impl.ConcretePatternImpl
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getConcretePattern()
		 * @generated
		 */
		EClass CONCRETE_PATTERN = eINSTANCE.getConcretePattern();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_PATTERN__TYPE = eINSTANCE.getConcretePattern_Type();

		/**
		 * The meta object literal for the '{@link patternGenerator.decentralizedPattern.PatternType <em>Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see patternGenerator.decentralizedPattern.PatternType
		 * @see patternGenerator.decentralizedPattern.impl.DecentralizedPatternPackageImpl#getPatternType()
		 * @generated
		 */
		EEnum PATTERN_TYPE = eINSTANCE.getPatternType();

	}

} //DecentralizedPatternPackage
