/**
 */
package patternGenerator.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import patternGenerator.Monitor;
import patternGenerator.PatternGeneratorPackage;
import patternGenerator.Subsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.impl.MonitorImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link patternGenerator.impl.MonitorImpl#isHasOneManagedCheck <em>Has One Managed Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MapeComponentImpl implements Monitor {
	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> check;

	/**
	 * The cached setting delegate for the '{@link #isHasOneManagedCheck() <em>Has One Managed Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasOneManagedCheck()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_ONE_MANAGED_CHECK__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MONITOR__HAS_ONE_MANAGED_CHECK).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternGeneratorPackage.Literals.MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getCheck() {
		if (check == null) {
			check = new EObjectResolvingEList<Subsystem>(Subsystem.class, this, PatternGeneratorPackage.MONITOR__CHECK);
		}
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasOneManagedCheck() {
		return (Boolean)HAS_ONE_MANAGED_CHECK__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternGeneratorPackage.MONITOR__CHECK:
				return getCheck();
			case PatternGeneratorPackage.MONITOR__HAS_ONE_MANAGED_CHECK:
				return isHasOneManagedCheck();
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
			case PatternGeneratorPackage.MONITOR__CHECK:
				getCheck().clear();
				getCheck().addAll((Collection<? extends Subsystem>)newValue);
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
			case PatternGeneratorPackage.MONITOR__CHECK:
				getCheck().clear();
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
			case PatternGeneratorPackage.MONITOR__CHECK:
				return check != null && !check.isEmpty();
			case PatternGeneratorPackage.MONITOR__HAS_ONE_MANAGED_CHECK:
				return HAS_ONE_MANAGED_CHECK__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //MonitorImpl
