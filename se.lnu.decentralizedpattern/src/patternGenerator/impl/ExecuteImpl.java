/**
 */
package patternGenerator.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import patternGenerator.Execute;
import patternGenerator.PatternGeneratorPackage;
import patternGenerator.Subsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.impl.ExecuteImpl#getAct <em>Act</em>}</li>
 *   <li>{@link patternGenerator.impl.ExecuteImpl#isHasOneManagedAct <em>Has One Managed Act</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteImpl extends MapeComponentImpl implements Execute {
	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> act;

	/**
	 * The cached setting delegate for the '{@link #isHasOneManagedAct() <em>Has One Managed Act</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasOneManagedAct()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_ONE_MANAGED_ACT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.EXECUTE__HAS_ONE_MANAGED_ACT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternGeneratorPackage.Literals.EXECUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getAct() {
		if (act == null) {
			act = new EObjectResolvingEList<Subsystem>(Subsystem.class, this, PatternGeneratorPackage.EXECUTE__ACT);
		}
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasOneManagedAct() {
		return (Boolean)HAS_ONE_MANAGED_ACT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternGeneratorPackage.EXECUTE__ACT:
				return getAct();
			case PatternGeneratorPackage.EXECUTE__HAS_ONE_MANAGED_ACT:
				return isHasOneManagedAct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternGeneratorPackage.EXECUTE__ACT:
				getAct().clear();
				getAct().addAll((Collection<? extends Subsystem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternGeneratorPackage.EXECUTE__ACT:
				getAct().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternGeneratorPackage.EXECUTE__ACT:
				return act != null && !act.isEmpty();
			case PatternGeneratorPackage.EXECUTE__HAS_ONE_MANAGED_ACT:
				return HAS_ONE_MANAGED_ACT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ExecuteImpl
