/**
 */
package patternGenerator.decentralizedPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import patternGenerator.decentralizedPattern.DecentralizedPatternPackage;
import patternGenerator.decentralizedPattern.UnderlyingSubsystem;

import patternGenerator.impl.ManagingSystemImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underlying Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl#isHasAssociatedTargetPlanner <em>Has Associated Target Planner</em>}</li>
 *   <li>{@link patternGenerator.decentralizedPattern.impl.UnderlyingSubsystemImpl#isHasAssociatedContextPlanner <em>Has Associated Context Planner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderlyingSubsystemImpl extends ManagingSystemImpl implements UnderlyingSubsystem {
	/**
	 * The cached setting delegate for the '{@link #isHasAssociatedTargetPlanner() <em>Has Associated Target Planner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAssociatedTargetPlanner()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_ASSOCIATED_TARGET_PLANNER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasAssociatedContextPlanner() <em>Has Associated Context Planner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAssociatedContextPlanner()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_ASSOCIATED_CONTEXT_PLANNER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnderlyingSubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecentralizedPatternPackage.Literals.UNDERLYING_SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasAssociatedTargetPlanner() {
		return (Boolean)HAS_ASSOCIATED_TARGET_PLANNER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasAssociatedContextPlanner() {
		return (Boolean)HAS_ASSOCIATED_CONTEXT_PLANNER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER:
				return isHasAssociatedTargetPlanner();
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER:
				return isHasAssociatedContextPlanner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_TARGET_PLANNER:
				return HAS_ASSOCIATED_TARGET_PLANNER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM__HAS_ASSOCIATED_CONTEXT_PLANNER:
				return HAS_ASSOCIATED_CONTEXT_PLANNER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //UnderlyingSubsystemImpl
