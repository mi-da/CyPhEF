/**
 */
package patternGenerator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import patternGenerator.Analyze;
import patternGenerator.Execute;
import patternGenerator.InterComponentInteraction;
import patternGenerator.IntraComponentInteraction;
import patternGenerator.Knowledge;
import patternGenerator.ManagingSystem;
import patternGenerator.Monitor;
import patternGenerator.PatternGeneratorPackage;
import patternGenerator.Plan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#isHasInterComponentInteractions <em>Has Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#isHasIntraComponentInteractions <em>Has Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getGetAllInterComponentInteractions <em>Get All Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#isHasMyTargetInterComponentInteractions <em>Has My Target Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getGetMyTargetInterComponentInteractions <em>Get My Target Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#isHasMyContextInterComponentInteractions <em>Has My Context Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getGetMyContextInterComponentInteractions <em>Get My Context Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getGetAllIntraComponentInteractions <em>Get All Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#isHasMyIntraComponentInteractions <em>Has My Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getGetAllMyIntraComponentInteractions <em>Get All My Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getAnalyze <em>Analyze</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getPlan <em>Plan</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link patternGenerator.impl.ManagingSystemImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ManagingSystemImpl extends SubsystemImpl implements ManagingSystem {
	/**
	 * The cached setting delegate for the '{@link #isHasInterComponentInteractions() <em>Has Inter Component Interactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasIntraComponentInteractions() <em>Has Intra Component Interactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasIntraComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetAllInterComponentInteractions() <em>Get All Inter Component Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAllInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasMyTargetInterComponentInteractions() <em>Has My Target Inter Component Interactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMyTargetInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetMyTargetInterComponentInteractions() <em>Get My Target Inter Component Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMyTargetInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasMyContextInterComponentInteractions() <em>Has My Context Inter Component Interactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMyContextInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetMyContextInterComponentInteractions() <em>Get My Context Inter Component Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMyContextInterComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetAllIntraComponentInteractions() <em>Get All Intra Component Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAllIntraComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasMyIntraComponentInteractions() <em>Has My Intra Component Interactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMyIntraComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGetAllMyIntraComponentInteractions() <em>Get All My Intra Component Interactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAllMyIntraComponentInteractions()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternGeneratorPackage.Literals.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getAnalyze() <em>Analyze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyze()
	 * @generated
	 * @ordered
	 */
	protected Analyze analyze;

	/**
	 * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlan()
	 * @generated
	 * @ordered
	 */
	protected Plan plan;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected Execute execute;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge knowledge;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected Monitor monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternGeneratorPackage.Literals.MANAGING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasInterComponentInteractions() {
		return (Boolean)HAS_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasIntraComponentInteractions() {
		return (Boolean)HAS_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterComponentInteraction> getGetAllInterComponentInteractions() {
		return (EList<InterComponentInteraction>)GET_ALL_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMyTargetInterComponentInteractions() {
		return (Boolean)HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterComponentInteraction> getGetMyTargetInterComponentInteractions() {
		return (EList<InterComponentInteraction>)GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMyContextInterComponentInteractions() {
		return (Boolean)HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterComponentInteraction> getGetMyContextInterComponentInteractions() {
		return (EList<InterComponentInteraction>)GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntraComponentInteraction> getGetAllIntraComponentInteractions() {
		return (EList<IntraComponentInteraction>)GET_ALL_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMyIntraComponentInteractions() {
		return (Boolean)HAS_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IntraComponentInteraction> getGetAllMyIntraComponentInteractions() {
		return (EList<IntraComponentInteraction>)GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analyze getAnalyze() {
		return analyze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyze(Analyze newAnalyze, NotificationChain msgs) {
		Analyze oldAnalyze = analyze;
		analyze = newAnalyze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE, oldAnalyze, newAnalyze);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyze(Analyze newAnalyze) {
		if (newAnalyze != analyze) {
			NotificationChain msgs = null;
			if (analyze != null)
				msgs = ((InternalEObject)analyze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE, null, msgs);
			if (newAnalyze != null)
				msgs = ((InternalEObject)newAnalyze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE, null, msgs);
			msgs = basicSetAnalyze(newAnalyze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE, newAnalyze, newAnalyze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan getPlan() {
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlan(Plan newPlan, NotificationChain msgs) {
		Plan oldPlan = plan;
		plan = newPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__PLAN, oldPlan, newPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlan(Plan newPlan) {
		if (newPlan != plan) {
			NotificationChain msgs = null;
			if (plan != null)
				msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__PLAN, null, msgs);
			if (newPlan != null)
				msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__PLAN, null, msgs);
			msgs = basicSetPlan(newPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__PLAN, newPlan, newPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute getExecute() {
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecute(Execute newExecute, NotificationChain msgs) {
		Execute oldExecute = execute;
		execute = newExecute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE, oldExecute, newExecute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(Execute newExecute) {
		if (newExecute != execute) {
			NotificationChain msgs = null;
			if (execute != null)
				msgs = ((InternalEObject)execute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE, null, msgs);
			if (newExecute != null)
				msgs = ((InternalEObject)newExecute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE, null, msgs);
			msgs = basicSetExecute(newExecute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE, newExecute, newExecute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getKnowledge() {
		return knowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledge(Knowledge newKnowledge, NotificationChain msgs) {
		Knowledge oldKnowledge = knowledge;
		knowledge = newKnowledge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE, oldKnowledge, newKnowledge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledge(Knowledge newKnowledge) {
		if (newKnowledge != knowledge) {
			NotificationChain msgs = null;
			if (knowledge != null)
				msgs = ((InternalEObject)knowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE, null, msgs);
			if (newKnowledge != null)
				msgs = ((InternalEObject)newKnowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE, null, msgs);
			msgs = basicSetKnowledge(newKnowledge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE, newKnowledge, newKnowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitor(Monitor newMonitor, NotificationChain msgs) {
		Monitor oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR, oldMonitor, newMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitor(Monitor newMonitor) {
		if (newMonitor != monitor) {
			NotificationChain msgs = null;
			if (monitor != null)
				msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR, null, msgs);
			if (newMonitor != null)
				msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR, null, msgs);
			msgs = basicSetMonitor(newMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR, newMonitor, newMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
				return basicSetAnalyze(null, msgs);
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
				return basicSetPlan(null, msgs);
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
				return basicSetExecute(null, msgs);
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
				return basicSetKnowledge(null, msgs);
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				return basicSetMonitor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS:
				return isHasInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS:
				return isHasIntraComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS:
				return getGetAllInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS:
				return isHasMyTargetInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS:
				return getGetMyTargetInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS:
				return isHasMyContextInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS:
				return getGetMyContextInterComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS:
				return getGetAllIntraComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS:
				return isHasMyIntraComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS:
				return getGetAllMyIntraComponentInteractions();
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
				return getAnalyze();
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
				return getPlan();
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
				return getExecute();
			case PatternGeneratorPackage.MANAGING_SYSTEM__NAME:
				return getName();
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
				return getKnowledge();
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				return getMonitor();
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
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
				setAnalyze((Analyze)newValue);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
				setPlan((Plan)newValue);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
				setExecute((Execute)newValue);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
				setKnowledge((Knowledge)newValue);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				setMonitor((Monitor)newValue);
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
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
				setAnalyze((Analyze)null);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
				setPlan((Plan)null);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
				setExecute((Execute)null);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
				setKnowledge((Knowledge)null);
				return;
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				setMonitor((Monitor)null);
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
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTER_COMPONENT_INTERACTIONS:
				return HAS_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_INTRA_COMPONENT_INTERACTIONS:
				return HAS_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTER_COMPONENT_INTERACTIONS:
				return GET_ALL_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS:
				return HAS_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS:
				return GET_MY_TARGET_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS:
				return HAS_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS:
				return GET_MY_CONTEXT_INTER_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_INTRA_COMPONENT_INTERACTIONS:
				return GET_ALL_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__HAS_MY_INTRA_COMPONENT_INTERACTIONS:
				return HAS_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS:
				return GET_ALL_MY_INTRA_COMPONENT_INTERACTIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternGeneratorPackage.MANAGING_SYSTEM__ANALYZE:
				return analyze != null;
			case PatternGeneratorPackage.MANAGING_SYSTEM__PLAN:
				return plan != null;
			case PatternGeneratorPackage.MANAGING_SYSTEM__EXECUTE:
				return execute != null;
			case PatternGeneratorPackage.MANAGING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternGeneratorPackage.MANAGING_SYSTEM__KNOWLEDGE:
				return knowledge != null;
			case PatternGeneratorPackage.MANAGING_SYSTEM__MONITOR:
				return monitor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ManagingSystemImpl
