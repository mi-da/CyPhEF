/**
 */
package patternGenerator.decentralizedPattern.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import patternGenerator.decentralizedPattern.*;

import patternGenerator.util.PatternGeneratorValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage
 * @generated
 */
public class DecentralizedPatternValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DecentralizedPatternValidator INSTANCE = new DecentralizedPatternValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "patternGenerator.decentralizedPattern";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternGeneratorValidator patternGeneratorValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternValidator() {
		super();
		patternGeneratorValidator = PatternGeneratorValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DecentralizedPatternPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DecentralizedPatternPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case DecentralizedPatternPackage.MASTER:
				return validateMaster((Master)value, diagnostics, context);
			case DecentralizedPatternPackage.SLAVE:
				return validateSlave((Slave)value, diagnostics, context);
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM:
				return validateUnderlyingSubsystem((UnderlyingSubsystem)value, diagnostics, context);
			case DecentralizedPatternPackage.REGIONAL_PLANNER:
				return validateRegionalPlanner((RegionalPlanner)value, diagnostics, context);
			case DecentralizedPatternPackage.ABSTRACT_PEER:
				return validateAbstractPeer((AbstractPeer)value, diagnostics, context);
			case DecentralizedPatternPackage.PEER:
				return validatePeer((Peer)value, diagnostics, context);
			case DecentralizedPatternPackage.HPEER:
				return validateHPeer((HPeer)value, diagnostics, context);
			case DecentralizedPatternPackage.CONCRETE_PATTERN:
				return validateConcretePattern((ConcretePattern)value, diagnostics, context);
			case DecentralizedPatternPackage.PATTERN_TYPE:
				return validatePatternType((PatternType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(master, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(master, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaster_hasNOMonitor(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaster_hasAnalyze(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaster_hasPlan(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaster_hasNOExecute(master, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaster_analyzeSpeaksWithPlan(master, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasNOMonitor constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER__HAS_NO_MONITOR__EEXPRESSION = "self.monitor = null";

	/**
	 * Validates the hasNOMonitor constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster_hasNOMonitor(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.MASTER,
				 master,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNOMonitor",
				 MASTER__HAS_NO_MONITOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasAnalyze constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER__HAS_ANALYZE__EEXPRESSION = "self.analyze <> null";

	/**
	 * Validates the hasAnalyze constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster_hasAnalyze(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.MASTER,
				 master,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasAnalyze",
				 MASTER__HAS_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasPlan constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER__HAS_PLAN__EEXPRESSION = "self.plan <> null";

	/**
	 * Validates the hasPlan constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster_hasPlan(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.MASTER,
				 master,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasPlan",
				 MASTER__HAS_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNOExecute constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER__HAS_NO_EXECUTE__EEXPRESSION = "self.execute = null";

	/**
	 * Validates the hasNOExecute constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster_hasNOExecute(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.MASTER,
				 master,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNOExecute",
				 MASTER__HAS_NO_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the analyzeSpeaksWithPlan constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MASTER__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t->select(context.oclIsKindOf(Analyze))\n" +
		"\t\t\t\t->select(target.oclIsKindOf(Plan))->size()=1";

	/**
	 * Validates the analyzeSpeaksWithPlan constraint of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaster_analyzeSpeaksWithPlan(Master master, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.MASTER,
				 master,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "analyzeSpeaksWithPlan",
				 MASTER__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slave, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(slave, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_hasMonitor(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_hasNOAnalyze(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_hasNOPlan(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_hasExecute(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_checkONEManaged(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_actONEManaged(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_checkAndAct(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_slaveMonitorSpeaksWithMasterAnalyze(slave, diagnostics, context);
		if (result || diagnostics != null) result &= validateSlave_masterPlanSpeaksWithSlaveExecute(slave, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasMonitor constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__HAS_MONITOR__EEXPRESSION = "self.monitor <> null";

	/**
	 * Validates the hasMonitor constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_hasMonitor(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasMonitor",
				 SLAVE__HAS_MONITOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNOAnalyze constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__HAS_NO_ANALYZE__EEXPRESSION = "self.analyze = null";

	/**
	 * Validates the hasNOAnalyze constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_hasNOAnalyze(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNOAnalyze",
				 SLAVE__HAS_NO_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNOPlan constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__HAS_NO_PLAN__EEXPRESSION = "self.plan = null";

	/**
	 * Validates the hasNOPlan constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_hasNOPlan(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNOPlan",
				 SLAVE__HAS_NO_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasExecute constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__HAS_EXECUTE__EEXPRESSION = "self.execute <> null";

	/**
	 * Validates the hasExecute constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_hasExecute(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasExecute",
				 SLAVE__HAS_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkONEManaged constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__CHECK_ONE_MANAGED__EEXPRESSION = "self.monitor?.hasOneManagedCheck";

	/**
	 * Validates the checkONEManaged constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_checkONEManaged(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkONEManaged",
				 SLAVE__CHECK_ONE_MANAGED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the actONEManaged constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__ACT_ONE_MANAGED__EEXPRESSION = "self.execute?.hasOneManagedAct";

	/**
	 * Validates the actONEManaged constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_actONEManaged(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "actONEManaged",
				 SLAVE__ACT_ONE_MANAGED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkAndAct constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__CHECK_AND_ACT__EEXPRESSION = "self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct \n" +
		"\t\t\t\tand self.monitor.check = self.execute.act";

	/**
	 * Validates the checkAndAct constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_checkAndAct(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkAndAct",
				 SLAVE__CHECK_AND_ACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the slaveMonitorSpeaksWithMasterAnalyze constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__SLAVE_MONITOR_SPEAKS_WITH_MASTER_ANALYZE__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n" +
		"\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n" +
		"\t\t\t\t\t\t\t\t->size()=1";

	/**
	 * Validates the slaveMonitorSpeaksWithMasterAnalyze constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_slaveMonitorSpeaksWithMasterAnalyze(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "slaveMonitorSpeaksWithMasterAnalyze",
				 SLAVE__SLAVE_MONITOR_SPEAKS_WITH_MASTER_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the masterPlanSpeaksWithSlaveExecute constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLAVE__MASTER_PLAN_SPEAKS_WITH_SLAVE_EXECUTE__EEXPRESSION = "getMyTargetInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n" +
		"\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1";

	/**
	 * Validates the masterPlanSpeaksWithSlaveExecute constraint of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlave_masterPlanSpeaksWithSlaveExecute(Slave slave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.SLAVE,
				 slave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "masterPlanSpeaksWithSlaveExecute",
				 SLAVE__MASTER_PLAN_SPEAKS_WITH_SLAVE_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(underlyingSubsystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_hasMonitor(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_hasAnalyze(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_hasNoPlan(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_hasExecute(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_checkONEManaged(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_actONEManaged(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_checkAndAct(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_monitorSpeaksWithAnalyze(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_analyzeSpeaksWithPlan(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_planSpeaksWithExecute(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_maxInterInteractionAllowed(underlyingSubsystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnderlyingSubsystem_hasOneOnlyAssociatedPlanner(underlyingSubsystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasMonitor constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__HAS_MONITOR__EEXPRESSION = "self.monitor <> null";

	/**
	 * Validates the hasMonitor constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_hasMonitor(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasMonitor",
				 UNDERLYING_SUBSYSTEM__HAS_MONITOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasAnalyze constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__HAS_ANALYZE__EEXPRESSION = "self.analyze <> null";

	/**
	 * Validates the hasAnalyze constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_hasAnalyze(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasAnalyze",
				 UNDERLYING_SUBSYSTEM__HAS_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNoPlan constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__HAS_NO_PLAN__EEXPRESSION = "self.plan = null";

	/**
	 * Validates the hasNoPlan constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_hasNoPlan(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNoPlan",
				 UNDERLYING_SUBSYSTEM__HAS_NO_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasExecute constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__HAS_EXECUTE__EEXPRESSION = "self.execute <> null";

	/**
	 * Validates the hasExecute constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_hasExecute(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasExecute",
				 UNDERLYING_SUBSYSTEM__HAS_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkONEManaged constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__CHECK_ONE_MANAGED__EEXPRESSION = "self.monitor.hasOneManagedCheck";

	/**
	 * Validates the checkONEManaged constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_checkONEManaged(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkONEManaged",
				 UNDERLYING_SUBSYSTEM__CHECK_ONE_MANAGED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the actONEManaged constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__ACT_ONE_MANAGED__EEXPRESSION = "self.execute.hasOneManagedAct";

	/**
	 * Validates the actONEManaged constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_actONEManaged(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "actONEManaged",
				 UNDERLYING_SUBSYSTEM__ACT_ONE_MANAGED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkAndAct constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__CHECK_AND_ACT__EEXPRESSION = "\n" +
		"\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n" +
		"\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n" +
		"\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\tendif";

	/**
	 * Validates the checkAndAct constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_checkAndAct(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkAndAct",
				 UNDERLYING_SUBSYSTEM__CHECK_AND_ACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the monitorSpeaksWithAnalyze constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__MONITOR_SPEAKS_WITH_ANALYZE__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n" +
		"\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1";

	/**
	 * Validates the monitorSpeaksWithAnalyze constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_monitorSpeaksWithAnalyze(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "monitorSpeaksWithAnalyze",
				 UNDERLYING_SUBSYSTEM__MONITOR_SPEAKS_WITH_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the analyzeSpeaksWithPlan constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n" +
		"\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1";

	/**
	 * Validates the analyzeSpeaksWithPlan constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_analyzeSpeaksWithPlan(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "analyzeSpeaksWithPlan",
				 UNDERLYING_SUBSYSTEM__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the planSpeaksWithExecute constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__PLAN_SPEAKS_WITH_EXECUTE__EEXPRESSION = "getMyTargetInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n" +
		"\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1";

	/**
	 * Validates the planSpeaksWithExecute constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_planSpeaksWithExecute(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "planSpeaksWithExecute",
				 UNDERLYING_SUBSYSTEM__PLAN_SPEAKS_WITH_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxInterInteractionAllowed constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__MAX_INTER_INTERACTION_ALLOWED__EEXPRESSION = "getMyContextInterComponentInteractions->size() <= 2 \n" +
		"\t\t\t\t\t\t\t\tand getMyTargetInterComponentInteractions->size()<=2";

	/**
	 * Validates the maxInterInteractionAllowed constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_maxInterInteractionAllowed(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxInterInteractionAllowed",
				 UNDERLYING_SUBSYSTEM__MAX_INTER_INTERACTION_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasOneOnlyAssociatedPlanner constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNDERLYING_SUBSYSTEM__HAS_ONE_ONLY_ASSOCIATED_PLANNER__EEXPRESSION = "\n" +
		"\t\t\t\t\tif(hasAssociatedContextPlanner and hasAssociatedTargetPlanner)\n" +
		"\t\t\t\t\t\tthen self.getMyContextInterComponentInteractions->any(target.oclIsKindOf(Plan)).target.oclContainer().oclAsType(RegionalPlanner) = \n" +
		"\t\t\t\t\t\t\tself.getMyTargetInterComponentInteractions->any(context.oclIsKindOf(Plan)).context.oclContainer().oclAsType(RegionalPlanner)\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the hasOneOnlyAssociatedPlanner constraint of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnderlyingSubsystem_hasOneOnlyAssociatedPlanner(UnderlyingSubsystem underlyingSubsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM,
				 underlyingSubsystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasOneOnlyAssociatedPlanner",
				 UNDERLYING_SUBSYSTEM__HAS_ONE_ONLY_ASSOCIATED_PLANNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalPlanner(RegionalPlanner regionalPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionalPlanner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalPlanner_hasNoMonitor(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalPlanner_hasNoAnalyze(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalPlanner_hasPlan(regionalPlanner, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegionalPlanner_hasNoExecute(regionalPlanner, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasNoMonitor constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGIONAL_PLANNER__HAS_NO_MONITOR__EEXPRESSION = "self.monitor = null";

	/**
	 * Validates the hasNoMonitor constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalPlanner_hasNoMonitor(RegionalPlanner regionalPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.REGIONAL_PLANNER,
				 regionalPlanner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNoMonitor",
				 REGIONAL_PLANNER__HAS_NO_MONITOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNoAnalyze constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGIONAL_PLANNER__HAS_NO_ANALYZE__EEXPRESSION = "self.analyze = null";

	/**
	 * Validates the hasNoAnalyze constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalPlanner_hasNoAnalyze(RegionalPlanner regionalPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.REGIONAL_PLANNER,
				 regionalPlanner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNoAnalyze",
				 REGIONAL_PLANNER__HAS_NO_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasPlan constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGIONAL_PLANNER__HAS_PLAN__EEXPRESSION = "self.plan <> null";

	/**
	 * Validates the hasPlan constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalPlanner_hasPlan(RegionalPlanner regionalPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.REGIONAL_PLANNER,
				 regionalPlanner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasPlan",
				 REGIONAL_PLANNER__HAS_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasNoExecute constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGIONAL_PLANNER__HAS_NO_EXECUTE__EEXPRESSION = "self.execute = null";

	/**
	 * Validates the hasNoExecute constraint of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionalPlanner_hasNoExecute(RegionalPlanner regionalPlanner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.REGIONAL_PLANNER,
				 regionalPlanner,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasNoExecute",
				 REGIONAL_PLANNER__HAS_NO_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractPeer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasMonitor(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasAnalyze(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasPlan(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasExecute(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_monitorSpeaksWithAnalyze(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_analyzeSpeaksWithPlan(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_planSpeaksWithExecute(abstractPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_maxInterInteractionAllowed(abstractPeer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasMonitor constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__HAS_MONITOR__EEXPRESSION = "self.monitor <> null";

	/**
	 * Validates the hasMonitor constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_hasMonitor(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasMonitor",
				 ABSTRACT_PEER__HAS_MONITOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasAnalyze constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__HAS_ANALYZE__EEXPRESSION = "self.analyze <> null";

	/**
	 * Validates the hasAnalyze constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_hasAnalyze(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasAnalyze",
				 ABSTRACT_PEER__HAS_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasPlan constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__HAS_PLAN__EEXPRESSION = "self.plan <> null";

	/**
	 * Validates the hasPlan constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_hasPlan(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasPlan",
				 ABSTRACT_PEER__HAS_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the hasExecute constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__HAS_EXECUTE__EEXPRESSION = "self.execute <> null";

	/**
	 * Validates the hasExecute constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_hasExecute(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasExecute",
				 ABSTRACT_PEER__HAS_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the monitorSpeaksWithAnalyze constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__MONITOR_SPEAKS_WITH_ANALYZE__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1";

	/**
	 * Validates the monitorSpeaksWithAnalyze constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_monitorSpeaksWithAnalyze(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "monitorSpeaksWithAnalyze",
				 ABSTRACT_PEER__MONITOR_SPEAKS_WITH_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the analyzeSpeaksWithPlan constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1";

	/**
	 * Validates the analyzeSpeaksWithPlan constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_analyzeSpeaksWithPlan(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "analyzeSpeaksWithPlan",
				 ABSTRACT_PEER__ANALYZE_SPEAKS_WITH_PLAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the planSpeaksWithExecute constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__PLAN_SPEAKS_WITH_EXECUTE__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1";

	/**
	 * Validates the planSpeaksWithExecute constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_planSpeaksWithExecute(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "planSpeaksWithExecute",
				 ABSTRACT_PEER__PLAN_SPEAKS_WITH_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxInterInteractionAllowed constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PEER__MAX_INTER_INTERACTION_ALLOWED__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t->size() <= 3";

	/**
	 * Validates the maxInterInteractionAllowed constraint of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPeer_maxInterInteractionAllowed(AbstractPeer abstractPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.ABSTRACT_PEER,
				 abstractPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxInterInteractionAllowed",
				 ABSTRACT_PEER__MAX_INTER_INTERACTION_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeer(Peer peer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(peer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(peer, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasMonitor(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasAnalyze(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasPlan(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasExecute(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_monitorSpeaksWithAnalyze(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_analyzeSpeaksWithPlan(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_planSpeaksWithExecute(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_maxInterInteractionAllowed(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeer_checkAndAct(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeer_slaveMonitorSpeaksWithMasterAnalyze(peer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePeer_masterPlanSpeaksWithSlaveExecute(peer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkAndAct constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PEER__CHECK_AND_ACT__EEXPRESSION = "\n" +
		"\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n" +
		"\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n" +
		"\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\tendif";

	/**
	 * Validates the checkAndAct constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeer_checkAndAct(Peer peer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.PEER,
				 peer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkAndAct",
				 PEER__CHECK_AND_ACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the slaveMonitorSpeaksWithMasterAnalyze constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PEER__SLAVE_MONITOR_SPEAKS_WITH_MASTER_ANALYZE__EEXPRESSION = "getMyContextInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n" +
		"\t\t\t\t\t\t\t\t\t\t->size()=1";

	/**
	 * Validates the slaveMonitorSpeaksWithMasterAnalyze constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeer_slaveMonitorSpeaksWithMasterAnalyze(Peer peer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.PEER,
				 peer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "slaveMonitorSpeaksWithMasterAnalyze",
				 PEER__SLAVE_MONITOR_SPEAKS_WITH_MASTER_ANALYZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the masterPlanSpeaksWithSlaveExecute constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PEER__MASTER_PLAN_SPEAKS_WITH_SLAVE_EXECUTE__EEXPRESSION = "getMyTargetInterComponentInteractions\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n" +
		"\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1";

	/**
	 * Validates the masterPlanSpeaksWithSlaveExecute constraint of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeer_masterPlanSpeaksWithSlaveExecute(Peer peer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.PEER,
				 peer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "masterPlanSpeaksWithSlaveExecute",
				 PEER__MASTER_PLAN_SPEAKS_WITH_SLAVE_EXECUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHPeer(HPeer hPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hPeer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= patternGeneratorValidator.validateManagingSystem_hasAtLeastOneMapeKComponent(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasMonitor(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasAnalyze(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasPlan(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_hasExecute(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_monitorSpeaksWithAnalyze(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_analyzeSpeaksWithPlan(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_planSpeaksWithExecute(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPeer_maxInterInteractionAllowed(hPeer, diagnostics, context);
		if (result || diagnostics != null) result &= validateHPeer_hasManaged(hPeer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasManaged constraint of '<em>HPeer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HPEER__HAS_MANAGED__EEXPRESSION = "\n" +
		"\t\t\t\t\t\t\tif(hasDirectManaged) \n" +
		"\t\t\t\t\t\t\t\tthen true\n" +
		"\t\t\t\t\t\t\t\telse self.monitor?.check->size() > 0 and self.monitor?.check = self.execute?.act\n" +
		"\t\t\t\t\t\t\tendif";

	/**
	 * Validates the hasManaged constraint of '<em>HPeer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHPeer_hasManaged(HPeer hPeer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.HPEER,
				 hPeer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasManaged",
				 HPEER__HAS_MANAGED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(concretePattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_noPatternSelected(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_atLeastOnePeer(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_peersMonitorSpeakOnlyEachOther(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_presenceOfNotAllowedElements(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_atLeastOneUnderlyingSubsystem(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_atLeastOneRegionalPlanner(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_intraComponentInteractionIsPCoord(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_intraComponentInteractionIsMCoord(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_NoIntraComponentInteraction(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_intraComponentInteractionIsCoord(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_presenceOfNotAllowedElementsInRegionalPlanningPattern(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_exactlyOneMaster(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_atLeastOneSlave(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_maxMasterSlavePatternInteractionAllowed(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_atLeastOneNode(concretePattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcretePattern_presenceOfNotAllowedElementsInMasterSlavePattern(concretePattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noPatternSelected constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__NO_PATTERN_SELECTED__EEXPRESSION = "if(type = PatternType::NoPattern) then false else true endif";

	/**
	 * Validates the noPatternSelected constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_noPatternSelected(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noPatternSelected",
				 CONCRETE_PATTERN__NO_PATTERN_SELECTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOnePeer constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__AT_LEAST_ONE_PEER__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(Peer))->size()>0\n" +
		"\t\t\t\telse true\n" +
		"\t\t\t\tendif";

	/**
	 * Validates the atLeastOnePeer constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_atLeastOnePeer(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOnePeer",
				 CONCRETE_PATTERN__AT_LEAST_ONE_PEER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the peersMonitorSpeakOnlyEachOther constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__PEERS_MONITOR_SPEAK_ONLY_EACH_OTHER__EEXPRESSION = "\n" +
		"\t\t\t\t\t\t\tif(type = PatternType::InfoSharing) then\n" +
		"\t\t\t\t\t\t\t\t\tself.elements->select(oclIsKindOf(IntraComponentInteraction))\n" +
		"\t\t\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n" +
		"\t\t\t\t\t\t\t\t\t->select( not (oclAsType(Interaction).context.oclIsKindOf(Monitor)\n" +
		"\t\t\t\t \t\t\t\t\tand oclAsType(Interaction).target.oclIsKindOf(Monitor)))\n" +
		"\t\t\t\t\t\t\t\t\t->size() = 0\n" +
		"\t\t\t\telse true\n" +
		"\t\t\t\tendif";

	/**
	 * Validates the peersMonitorSpeakOnlyEachOther constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_peersMonitorSpeakOnlyEachOther(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "peersMonitorSpeakOnlyEachOther",
				 CONCRETE_PATTERN__PEERS_MONITOR_SPEAK_ONLY_EACH_OTHER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the presenceOfNotAllowedElements constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl) then\n" +
		"\t\t\t\t\tself.elements->select(oclIsKindOf(ManagingSystem))->reject(oclIsKindOf(Peer))->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the presenceOfNotAllowedElements constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_presenceOfNotAllowedElements(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "presenceOfNotAllowedElements",
				 CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOneUnderlyingSubsystem constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__AT_LEAST_ONE_UNDERLYING_SUBSYSTEM__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::RegPlanning)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the atLeastOneUnderlyingSubsystem constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_atLeastOneUnderlyingSubsystem(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneUnderlyingSubsystem",
				 CONCRETE_PATTERN__AT_LEAST_ONE_UNDERLYING_SUBSYSTEM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOneRegionalPlanner constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__AT_LEAST_ONE_REGIONAL_PLANNER__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::RegPlanning)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the atLeastOneRegionalPlanner constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_atLeastOneRegionalPlanner(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneRegionalPlanner",
				 CONCRETE_PATTERN__AT_LEAST_ONE_REGIONAL_PLANNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the intraComponentInteractionIsPCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_PCOORD__EEXPRESSION = "\n" +
		"\t\t\t\t\t\tif(type = PatternType::RegPlanning)\n" +
		"\t\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n" +
		"\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n" +
		"\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Plan)\n" +
		"\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Plan))\n" +
		"\t\t\t\t\t\t\t->size() = 0\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the intraComponentInteractionIsPCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_intraComponentInteractionIsPCoord(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "intraComponentInteractionIsPCoord",
				 CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_PCOORD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the intraComponentInteractionIsMCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_MCOORD__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::InfoSharing)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n" +
		"\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n" +
		"\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Monitor)\n" +
		"\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Monitor))\n" +
		"\t\t\t\t\t\t\t->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the intraComponentInteractionIsMCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_intraComponentInteractionIsMCoord(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "intraComponentInteractionIsMCoord",
				 CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_MCOORD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoIntraComponentInteraction constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__NO_INTRA_COMPONENT_INTERACTION__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::HierControl)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n" +
		"\t\t\t\t\t\t\t->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the NoIntraComponentInteraction constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_NoIntraComponentInteraction(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoIntraComponentInteraction",
				 CONCRETE_PATTERN__NO_INTRA_COMPONENT_INTERACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the intraComponentInteractionIsCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_COORD__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::CoordControl)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n" +
		"\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n" +
		"\t\t\t\t\t\t\t->select(oclIsKindOf(Delegation))\n" +
		"\t\t\t\t\t\t\t->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the intraComponentInteractionIsCoord constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_intraComponentInteractionIsCoord(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "intraComponentInteractionIsCoord",
				 CONCRETE_PATTERN__INTRA_COMPONENT_INTERACTION_IS_COORD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the presenceOfNotAllowedElementsInRegionalPlanningPattern constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS_IN_REGIONAL_PLANNING_PATTERN__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::RegPlanning)\n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n" +
		"\t\t\t\t\t\t->reject(oclIsKindOf(RegionalPlanner))\n" +
		"\t\t\t\t\t\t->reject(oclIsKindOf(UnderlyingSubsystem))->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the presenceOfNotAllowedElementsInRegionalPlanningPattern constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_presenceOfNotAllowedElementsInRegionalPlanningPattern(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "presenceOfNotAllowedElementsInRegionalPlanningPattern",
				 CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS_IN_REGIONAL_PLANNING_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the exactlyOneMaster constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__EXACTLY_ONE_MASTER__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::MasterSlave) \n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(Master))->size() = 1\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the exactlyOneMaster constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_exactlyOneMaster(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactlyOneMaster",
				 CONCRETE_PATTERN__EXACTLY_ONE_MASTER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOneSlave constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__AT_LEAST_ONE_SLAVE__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::MasterSlave) \n" +
		"\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Slave))->size() >= 1\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif";

	/**
	 * Validates the atLeastOneSlave constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_atLeastOneSlave(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneSlave",
				 CONCRETE_PATTERN__AT_LEAST_ONE_SLAVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxMasterSlavePatternInteractionAllowed constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__MAX_MASTER_SLAVE_PATTERN_INTERACTION_ALLOWED__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::MasterSlave) \n" +
		"\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Interaction))\n" +
		"\t\t\t\t\t\t\t->size() <= 2*(self.elements->select(oclIsKindOf(Slave))->size()) + 1\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif";

	/**
	 * Validates the maxMasterSlavePatternInteractionAllowed constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_maxMasterSlavePatternInteractionAllowed(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxMasterSlavePatternInteractionAllowed",
				 CONCRETE_PATTERN__MAX_MASTER_SLAVE_PATTERN_INTERACTION_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the atLeastOneNode constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__AT_LEAST_ONE_NODE__EEXPRESSION = "\n" +
		"\t\t\t\tif(type = PatternType::CustomPattern) \n" +
		"\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))->size()>0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the atLeastOneNode constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_atLeastOneNode(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "atLeastOneNode",
				 CONCRETE_PATTERN__AT_LEAST_ONE_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the presenceOfNotAllowedElementsInMasterSlavePattern constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS_IN_MASTER_SLAVE_PATTERN__EEXPRESSION = "\n" +
		"\t\t\t\t\t\tif(type = PatternType::MasterSlave)\n" +
		"\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n" +
		"\t\t\t\t\t\t->reject(oclIsKindOf(Master))\n" +
		"\t\t\t\t\t\t->reject(oclIsKindOf(Slave))->size() = 0\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif";

	/**
	 * Validates the presenceOfNotAllowedElementsInMasterSlavePattern constraint of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcretePattern_presenceOfNotAllowedElementsInMasterSlavePattern(ConcretePattern concretePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DecentralizedPatternPackage.Literals.CONCRETE_PATTERN,
				 concretePattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "presenceOfNotAllowedElementsInMasterSlavePattern",
				 CONCRETE_PATTERN__PRESENCE_OF_NOT_ALLOWED_ELEMENTS_IN_MASTER_SLAVE_PATTERN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType(PatternType patternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DecentralizedPatternValidator
