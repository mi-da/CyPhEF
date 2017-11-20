/**
 */
package patternGenerator.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import patternGenerator.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.PatternGeneratorPackage
 * @generated
 */
public class PatternGeneratorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PatternGeneratorValidator INSTANCE = new PatternGeneratorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "patternGenerator";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PatternGeneratorPackage.eINSTANCE;
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
			case PatternGeneratorPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case PatternGeneratorPackage.MANAGING_SYSTEM:
				return validateManagingSystem((ManagingSystem)value, diagnostics, context);
			case PatternGeneratorPackage.MANAGED_SYSTEM:
				return validateManagedSystem((ManagedSystem)value, diagnostics, context);
			case PatternGeneratorPackage.MAPE_COMPONENT:
				return validateMapeComponent((MapeComponent)value, diagnostics, context);
			case PatternGeneratorPackage.MONITOR:
				return validateMonitor((Monitor)value, diagnostics, context);
			case PatternGeneratorPackage.ANALYZE:
				return validateAnalyze((Analyze)value, diagnostics, context);
			case PatternGeneratorPackage.PLAN:
				return validatePlan((Plan)value, diagnostics, context);
			case PatternGeneratorPackage.EXECUTE:
				return validateExecute((Execute)value, diagnostics, context);
			case PatternGeneratorPackage.KNOWLEDGE:
				return validateKnowledge((Knowledge)value, diagnostics, context);
			case PatternGeneratorPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN:
				return validateDecentralizedControlPattern((DecentralizedControlPattern)value, diagnostics, context);
			case PatternGeneratorPackage.INTRA_COMPONENT_INTERACTION:
				return validateIntraComponentInteraction((IntraComponentInteraction)value, diagnostics, context);
			case PatternGeneratorPackage.INTER_COMPONENT_INTERACTION:
				return validateInterComponentInteraction((InterComponentInteraction)value, diagnostics, context);
			case PatternGeneratorPackage.READ_WRITE_INTERACTION:
				return validateReadWriteInteraction((ReadWriteInteraction)value, diagnostics, context);
			case PatternGeneratorPackage.SUBSYSTEM:
				return validateSubsystem((Subsystem)value, diagnostics, context);
			case PatternGeneratorPackage.DELEGATION:
				return validateDelegation((Delegation)value, diagnostics, context);
			case PatternGeneratorPackage.COORDINATION:
				return validateCoordination((Coordination)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagingSystem(ManagingSystem managingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(managingSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(managingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateManagingSystem_hasAtLeastOneMapeKComponent(managingSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasAtLeastOneMapeKComponent constraint of '<em>Managing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANAGING_SYSTEM__HAS_AT_LEAST_ONE_MAPE_KCOMPONENT__EEXPRESSION = "self.monitor <> null or self.analyze <> null \n" +
		"\t\t\t\t\tor self.plan <> null or self.execute <> null or self.knowledge <> null";

	/**
	 * Validates the hasAtLeastOneMapeKComponent constraint of '<em>Managing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagingSystem_hasAtLeastOneMapeKComponent(ManagingSystem managingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.MANAGING_SYSTEM,
				 managingSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasAtLeastOneMapeKComponent",
				 MANAGING_SYSTEM__HAS_AT_LEAST_ONE_MAPE_KCOMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManagedSystem(ManagedSystem managedSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(managedSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapeComponent(MapeComponent mapeComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapeComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitor(Monitor monitor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monitor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalyze(Analyze analyze, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analyze, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlan(Plan plan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecute(Execute execute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(execute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnowledge(Knowledge knowledge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knowledge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(interaction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the targetAndContextDifferent constraint of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION__TARGET_AND_CONTEXT_DIFFERENT__EEXPRESSION = "context <> target";

	/**
	 * Validates the targetAndContextDifferent constraint of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction_targetAndContextDifferent(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.INTERACTION,
				 interaction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetAndContextDifferent",
				 INTERACTION__TARGET_AND_CONTEXT_DIFFERENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecentralizedControlPattern(DecentralizedControlPattern decentralizedControlPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decentralizedControlPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntraComponentInteraction(IntraComponentInteraction intraComponentInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intraComponentInteraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(intraComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntraComponentInteraction_isIntraComponent(intraComponentInteraction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isIntraComponent constraint of '<em>Intra Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTRA_COMPONENT_INTERACTION__IS_INTRA_COMPONENT__EEXPRESSION = "context?->oclType() = target?->oclType()";

	/**
	 * Validates the isIntraComponent constraint of '<em>Intra Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntraComponentInteraction_isIntraComponent(IntraComponentInteraction intraComponentInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.INTRA_COMPONENT_INTERACTION,
				 intraComponentInteraction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isIntraComponent",
				 INTRA_COMPONENT_INTERACTION__IS_INTRA_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterComponentInteraction(InterComponentInteraction interComponentInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interComponentInteraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(interComponentInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterComponentInteraction_isInterComponent(interComponentInteraction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isInterComponent constraint of '<em>Inter Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTER_COMPONENT_INTERACTION__IS_INTER_COMPONENT__EEXPRESSION = "context?->oclType() <> target?->oclType()";

	/**
	 * Validates the isInterComponent constraint of '<em>Inter Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterComponentInteraction_isInterComponent(InterComponentInteraction interComponentInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.INTER_COMPONENT_INTERACTION,
				 interComponentInteraction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isInterComponent",
				 INTER_COMPONENT_INTERACTION__IS_INTER_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadWriteInteraction(ReadWriteInteraction readWriteInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readWriteInteraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(readWriteInteraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadWriteInteraction_targetIsKnowledge(readWriteInteraction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the targetIsKnowledge constraint of '<em>Read Write Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_WRITE_INTERACTION__TARGET_IS_KNOWLEDGE__EEXPRESSION = "target <> null and target.oclIsKindOf(Knowledge)";

	/**
	 * Validates the targetIsKnowledge constraint of '<em>Read Write Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadWriteInteraction_targetIsKnowledge(ReadWriteInteraction readWriteInteraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.READ_WRITE_INTERACTION,
				 readWriteInteraction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetIsKnowledge",
				 READ_WRITE_INTERACTION__TARGET_IS_KNOWLEDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsystem(Subsystem subsystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelegation(Delegation delegation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delegation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(delegation, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntraComponentInteraction_isIntraComponent(delegation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordination(Coordination coordination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordination, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_targetAndContextDifferent(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntraComponentInteraction_isIntraComponent(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordination_hasExactlyOneInverse(coordination, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordination_isInverse(coordination, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasExactlyOneInverse constraint of '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION__HAS_EXACTLY_ONE_INVERSE__EEXPRESSION = "self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select( oclIsKindOf(Coordination))\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select(oclAsType(Coordination).target = self.context \n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand oclAsType(Coordination).context = self.target) \n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t->size()=1";

	/**
	 * Validates the hasExactlyOneInverse constraint of '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordination_hasExactlyOneInverse(Coordination coordination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.COORDINATION,
				 coordination,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasExactlyOneInverse",
				 COORDINATION__HAS_EXACTLY_ONE_INVERSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isInverse constraint of '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATION__IS_INVERSE__EEXPRESSION = "inverse.target = self.context and inverse.context = self.target";

	/**
	 * Validates the isInverse constraint of '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordination_isInverse(Coordination coordination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PatternGeneratorPackage.Literals.COORDINATION,
				 coordination,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isInverse",
				 COORDINATION__IS_INVERSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //PatternGeneratorValidator
