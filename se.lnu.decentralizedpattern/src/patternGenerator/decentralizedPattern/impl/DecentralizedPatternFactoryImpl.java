/**
 */
package patternGenerator.decentralizedPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import patternGenerator.decentralizedPattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecentralizedPatternFactoryImpl extends EFactoryImpl implements DecentralizedPatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecentralizedPatternFactory init() {
		try {
			DecentralizedPatternFactory theDecentralizedPatternFactory = (DecentralizedPatternFactory)EPackage.Registry.INSTANCE.getEFactory(DecentralizedPatternPackage.eNS_URI);
			if (theDecentralizedPatternFactory != null) {
				return theDecentralizedPatternFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DecentralizedPatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DecentralizedPatternPackage.NODE: return createNode();
			case DecentralizedPatternPackage.MASTER: return createMaster();
			case DecentralizedPatternPackage.SLAVE: return createSlave();
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM: return createUnderlyingSubsystem();
			case DecentralizedPatternPackage.REGIONAL_PLANNER: return createRegionalPlanner();
			case DecentralizedPatternPackage.PEER: return createPeer();
			case DecentralizedPatternPackage.HPEER: return createHPeer();
			case DecentralizedPatternPackage.CONCRETE_PATTERN: return createConcretePattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DecentralizedPatternPackage.PATTERN_TYPE:
				return createPatternTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DecentralizedPatternPackage.PATTERN_TYPE:
				return convertPatternTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Master createMaster() {
		MasterImpl master = new MasterImpl();
		return master;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slave createSlave() {
		SlaveImpl slave = new SlaveImpl();
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderlyingSubsystem createUnderlyingSubsystem() {
		UnderlyingSubsystemImpl underlyingSubsystem = new UnderlyingSubsystemImpl();
		return underlyingSubsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionalPlanner createRegionalPlanner() {
		RegionalPlannerImpl regionalPlanner = new RegionalPlannerImpl();
		return regionalPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peer createPeer() {
		PeerImpl peer = new PeerImpl();
		return peer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HPeer createHPeer() {
		HPeerImpl hPeer = new HPeerImpl();
		return hPeer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcretePattern createConcretePattern() {
		ConcretePatternImpl concretePattern = new ConcretePatternImpl();
		return concretePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternType createPatternTypeFromString(EDataType eDataType, String initialValue) {
		PatternType result = PatternType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternPackage getDecentralizedPatternPackage() {
		return (DecentralizedPatternPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DecentralizedPatternPackage getPackage() {
		return DecentralizedPatternPackage.eINSTANCE;
	}

} //DecentralizedPatternFactoryImpl
