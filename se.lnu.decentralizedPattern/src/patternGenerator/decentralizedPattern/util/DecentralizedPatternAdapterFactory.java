/**
 */
package patternGenerator.decentralizedPattern.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import patternGenerator.DecentralizedControlPattern;
import patternGenerator.Element;
import patternGenerator.ManagingSystem;
import patternGenerator.Subsystem;

import patternGenerator.decentralizedPattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage
 * @generated
 */
public class DecentralizedPatternAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecentralizedPatternPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DecentralizedPatternPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecentralizedPatternSwitch<Adapter> modelSwitch =
		new DecentralizedPatternSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseMaster(Master object) {
				return createMasterAdapter();
			}
			@Override
			public Adapter caseSlave(Slave object) {
				return createSlaveAdapter();
			}
			@Override
			public Adapter caseUnderlyingSubsystem(UnderlyingSubsystem object) {
				return createUnderlyingSubsystemAdapter();
			}
			@Override
			public Adapter caseRegionalPlanner(RegionalPlanner object) {
				return createRegionalPlannerAdapter();
			}
			@Override
			public Adapter caseAbstractPeer(AbstractPeer object) {
				return createAbstractPeerAdapter();
			}
			@Override
			public Adapter casePeer(Peer object) {
				return createPeerAdapter();
			}
			@Override
			public Adapter caseHPeer(HPeer object) {
				return createHPeerAdapter();
			}
			@Override
			public Adapter caseConcretePattern(ConcretePattern object) {
				return createConcretePatternAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter caseManagingSystem(ManagingSystem object) {
				return createManagingSystemAdapter();
			}
			@Override
			public Adapter caseDecentralizedControlPattern(DecentralizedControlPattern object) {
				return createDecentralizedControlPatternAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.Master <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.Master
	 * @generated
	 */
	public Adapter createMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.Slave <em>Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.Slave
	 * @generated
	 */
	public Adapter createSlaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem <em>Underlying Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.UnderlyingSubsystem
	 * @generated
	 */
	public Adapter createUnderlyingSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.RegionalPlanner <em>Regional Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.RegionalPlanner
	 * @generated
	 */
	public Adapter createRegionalPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.AbstractPeer <em>Abstract Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.AbstractPeer
	 * @generated
	 */
	public Adapter createAbstractPeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.Peer <em>Peer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.Peer
	 * @generated
	 */
	public Adapter createPeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.HPeer <em>HPeer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.HPeer
	 * @generated
	 */
	public Adapter createHPeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.decentralizedPattern.ConcretePattern <em>Concrete Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.decentralizedPattern.ConcretePattern
	 * @generated
	 */
	public Adapter createConcretePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.ManagingSystem <em>Managing System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.ManagingSystem
	 * @generated
	 */
	public Adapter createManagingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link patternGenerator.DecentralizedControlPattern <em>Decentralized Control Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see patternGenerator.DecentralizedControlPattern
	 * @generated
	 */
	public Adapter createDecentralizedControlPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DecentralizedPatternAdapterFactory
