/**
 */
package patternGenerator.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import patternGenerator.*;

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
 * @see patternGenerator.PatternGeneratorPackage
 * @generated
 */
public class PatternGeneratorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PatternGeneratorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternGeneratorSwitch() {
		if (modelPackage == null) {
			modelPackage = PatternGeneratorPackage.eINSTANCE;
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
			case PatternGeneratorPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.MANAGING_SYSTEM: {
				ManagingSystem managingSystem = (ManagingSystem)theEObject;
				T result = caseManagingSystem(managingSystem);
				if (result == null) result = caseSubsystem(managingSystem);
				if (result == null) result = caseElement(managingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.MANAGED_SYSTEM: {
				ManagedSystem managedSystem = (ManagedSystem)theEObject;
				T result = caseManagedSystem(managedSystem);
				if (result == null) result = caseSubsystem(managedSystem);
				if (result == null) result = caseElement(managedSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.MAPE_COMPONENT: {
				MapeComponent mapeComponent = (MapeComponent)theEObject;
				T result = caseMapeComponent(mapeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.MONITOR: {
				Monitor monitor = (Monitor)theEObject;
				T result = caseMonitor(monitor);
				if (result == null) result = caseMapeComponent(monitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.ANALYZE: {
				Analyze analyze = (Analyze)theEObject;
				T result = caseAnalyze(analyze);
				if (result == null) result = caseMapeComponent(analyze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.PLAN: {
				Plan plan = (Plan)theEObject;
				T result = casePlan(plan);
				if (result == null) result = caseMapeComponent(plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.EXECUTE: {
				Execute execute = (Execute)theEObject;
				T result = caseExecute(execute);
				if (result == null) result = caseMapeComponent(execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.KNOWLEDGE: {
				Knowledge knowledge = (Knowledge)theEObject;
				T result = caseKnowledge(knowledge);
				if (result == null) result = caseMapeComponent(knowledge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.DECENTRALIZED_CONTROL_PATTERN: {
				DecentralizedControlPattern decentralizedControlPattern = (DecentralizedControlPattern)theEObject;
				T result = caseDecentralizedControlPattern(decentralizedControlPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.INTRA_COMPONENT_INTERACTION: {
				IntraComponentInteraction intraComponentInteraction = (IntraComponentInteraction)theEObject;
				T result = caseIntraComponentInteraction(intraComponentInteraction);
				if (result == null) result = caseInteraction(intraComponentInteraction);
				if (result == null) result = caseElement(intraComponentInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.INTER_COMPONENT_INTERACTION: {
				InterComponentInteraction interComponentInteraction = (InterComponentInteraction)theEObject;
				T result = caseInterComponentInteraction(interComponentInteraction);
				if (result == null) result = caseInteraction(interComponentInteraction);
				if (result == null) result = caseElement(interComponentInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.READ_WRITE_INTERACTION: {
				ReadWriteInteraction readWriteInteraction = (ReadWriteInteraction)theEObject;
				T result = caseReadWriteInteraction(readWriteInteraction);
				if (result == null) result = caseInteraction(readWriteInteraction);
				if (result == null) result = caseElement(readWriteInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.SUBSYSTEM: {
				Subsystem subsystem = (Subsystem)theEObject;
				T result = caseSubsystem(subsystem);
				if (result == null) result = caseElement(subsystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.DELEGATION: {
				Delegation delegation = (Delegation)theEObject;
				T result = caseDelegation(delegation);
				if (result == null) result = caseIntraComponentInteraction(delegation);
				if (result == null) result = caseInteraction(delegation);
				if (result == null) result = caseElement(delegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PatternGeneratorPackage.COORDINATION: {
				Coordination coordination = (Coordination)theEObject;
				T result = caseCoordination(coordination);
				if (result == null) result = caseIntraComponentInteraction(coordination);
				if (result == null) result = caseInteraction(coordination);
				if (result == null) result = caseElement(coordination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Managed System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedSystem(ManagedSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mape Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mape Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapeComponent(MapeComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitor(Monitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyze(Analyze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlan(Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecute(Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledge(Knowledge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Intra Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intra Component Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraComponentInteraction(IntraComponentInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Component Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterComponentInteraction(InterComponentInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Write Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Write Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadWriteInteraction(ReadWriteInteraction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegation(Delegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordination(Coordination object) {
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

} //PatternGeneratorSwitch
