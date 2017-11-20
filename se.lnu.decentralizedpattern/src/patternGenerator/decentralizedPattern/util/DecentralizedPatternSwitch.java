/**
 */
package patternGenerator.decentralizedPattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import patternGenerator.DecentralizedControlPattern;
import patternGenerator.Element;
import patternGenerator.ManagingSystem;
import patternGenerator.Subsystem;

import patternGenerator.decentralizedPattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage
 * @generated
 */
public class DecentralizedPatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecentralizedPatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecentralizedPatternSwitch() {
		if (modelPackage == null) {
			modelPackage = DecentralizedPatternPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DecentralizedPatternPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseManagingSystem(node);
				if (result == null) result = caseSubsystem(node);
				if (result == null) result = caseElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.MASTER: {
				Master master = (Master)theEObject;
				T result = caseMaster(master);
				if (result == null) result = caseManagingSystem(master);
				if (result == null) result = caseSubsystem(master);
				if (result == null) result = caseElement(master);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.SLAVE: {
				Slave slave = (Slave)theEObject;
				T result = caseSlave(slave);
				if (result == null) result = caseManagingSystem(slave);
				if (result == null) result = caseSubsystem(slave);
				if (result == null) result = caseElement(slave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.UNDERLYING_SUBSYSTEM: {
				UnderlyingSubsystem underlyingSubsystem = (UnderlyingSubsystem)theEObject;
				T result = caseUnderlyingSubsystem(underlyingSubsystem);
				if (result == null) result = caseManagingSystem(underlyingSubsystem);
				if (result == null) result = caseSubsystem(underlyingSubsystem);
				if (result == null) result = caseElement(underlyingSubsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.REGIONAL_PLANNER: {
				RegionalPlanner regionalPlanner = (RegionalPlanner)theEObject;
				T result = caseRegionalPlanner(regionalPlanner);
				if (result == null) result = caseManagingSystem(regionalPlanner);
				if (result == null) result = caseSubsystem(regionalPlanner);
				if (result == null) result = caseElement(regionalPlanner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.ABSTRACT_PEER: {
				AbstractPeer abstractPeer = (AbstractPeer)theEObject;
				T result = caseAbstractPeer(abstractPeer);
				if (result == null) result = caseManagingSystem(abstractPeer);
				if (result == null) result = caseSubsystem(abstractPeer);
				if (result == null) result = caseElement(abstractPeer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.PEER: {
				Peer peer = (Peer)theEObject;
				T result = casePeer(peer);
				if (result == null) result = caseAbstractPeer(peer);
				if (result == null) result = caseManagingSystem(peer);
				if (result == null) result = caseSubsystem(peer);
				if (result == null) result = caseElement(peer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.HPEER: {
				HPeer hPeer = (HPeer)theEObject;
				T result = caseHPeer(hPeer);
				if (result == null) result = caseAbstractPeer(hPeer);
				if (result == null) result = caseManagingSystem(hPeer);
				if (result == null) result = caseSubsystem(hPeer);
				if (result == null) result = caseElement(hPeer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecentralizedPatternPackage.CONCRETE_PATTERN: {
				ConcretePattern concretePattern = (ConcretePattern)theEObject;
				T result = caseConcretePattern(concretePattern);
				if (result == null) result = caseDecentralizedControlPattern(concretePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaster(Master object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlave(Slave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Underlying Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderlyingSubsystem(UnderlyingSubsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Planner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalPlanner(RegionalPlanner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Peer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Peer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPeer(AbstractPeer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeer(Peer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HPeer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HPeer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHPeer(HPeer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcretePattern(ConcretePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsystem(Subsystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managing System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managing System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagingSystem(ManagingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decentralized Control Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decentralized Control Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecentralizedControlPattern(DecentralizedControlPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DecentralizedPatternSwitch
