/**
 */
package patternGenerator.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import patternGenerator.Interaction;
import patternGenerator.MapeComponent;
import patternGenerator.PatternGeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.impl.InteractionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link patternGenerator.impl.InteractionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link patternGenerator.impl.InteractionImpl#isTargetAndContextNotNull <em>Target And Context Not Null</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionImpl extends ElementImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected MapeComponent context;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected MapeComponent target;

	/**
	 * The cached setting delegate for the '{@link #isTargetAndContextNotNull() <em>Target And Context Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetAndContextNotNull()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_AND_CONTEXT_NOT_NULL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.INTERACTION__TARGET_AND_CONTEXT_NOT_NULL).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternGeneratorPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapeComponent getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (MapeComponent)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternGeneratorPackage.INTERACTION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapeComponent basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(MapeComponent newContext) {
		MapeComponent oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.INTERACTION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapeComponent getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (MapeComponent)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternGeneratorPackage.INTERACTION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapeComponent basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(MapeComponent newTarget) {
		MapeComponent oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.INTERACTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetAndContextNotNull() {
		return (Boolean)TARGET_AND_CONTEXT_NOT_NULL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternGeneratorPackage.INTERACTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case PatternGeneratorPackage.INTERACTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PatternGeneratorPackage.INTERACTION__TARGET_AND_CONTEXT_NOT_NULL:
				return isTargetAndContextNotNull();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternGeneratorPackage.INTERACTION__CONTEXT:
				setContext((MapeComponent)newValue);
				return;
			case PatternGeneratorPackage.INTERACTION__TARGET:
				setTarget((MapeComponent)newValue);
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
			case PatternGeneratorPackage.INTERACTION__CONTEXT:
				setContext((MapeComponent)null);
				return;
			case PatternGeneratorPackage.INTERACTION__TARGET:
				setTarget((MapeComponent)null);
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
			case PatternGeneratorPackage.INTERACTION__CONTEXT:
				return context != null;
			case PatternGeneratorPackage.INTERACTION__TARGET:
				return target != null;
			case PatternGeneratorPackage.INTERACTION__TARGET_AND_CONTEXT_NOT_NULL:
				return TARGET_AND_CONTEXT_NOT_NULL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //InteractionImpl
