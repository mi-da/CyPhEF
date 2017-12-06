/**
 */
package patternGenerator.decentralizedPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import patternGenerator.decentralizedPattern.DecentralizedPatternPackage;
import patternGenerator.decentralizedPattern.HPeer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HPeer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.decentralizedPattern.impl.HPeerImpl#isHasDirectManaged <em>Has Direct Managed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HPeerImpl extends AbstractPeerImpl implements HPeer {
	/**
	 * The cached setting delegate for the '{@link #isHasDirectManaged() <em>Has Direct Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasDirectManaged()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_DIRECT_MANAGED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DecentralizedPatternPackage.Literals.HPEER__HAS_DIRECT_MANAGED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HPeerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecentralizedPatternPackage.Literals.HPEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasDirectManaged() {
		return (Boolean)HAS_DIRECT_MANAGED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecentralizedPatternPackage.HPEER__HAS_DIRECT_MANAGED:
				return isHasDirectManaged();
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
			case DecentralizedPatternPackage.HPEER__HAS_DIRECT_MANAGED:
				return HAS_DIRECT_MANAGED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //HPeerImpl
