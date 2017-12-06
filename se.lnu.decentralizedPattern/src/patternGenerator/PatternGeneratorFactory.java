/**
 */
package patternGenerator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.PatternGeneratorPackage
 * @generated
 */
public interface PatternGeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternGeneratorFactory eINSTANCE = patternGenerator.impl.PatternGeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Managed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Managed System</em>'.
	 * @generated
	 */
	ManagedSystem createManagedSystem();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	Monitor createMonitor();

	/**
	 * Returns a new object of class '<em>Analyze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyze</em>'.
	 * @generated
	 */
	Analyze createAnalyze();

	/**
	 * Returns a new object of class '<em>Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan</em>'.
	 * @generated
	 */
	Plan createPlan();

	/**
	 * Returns a new object of class '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute</em>'.
	 * @generated
	 */
	Execute createExecute();

	/**
	 * Returns a new object of class '<em>Knowledge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge</em>'.
	 * @generated
	 */
	Knowledge createKnowledge();

	/**
	 * Returns a new object of class '<em>Inter Component Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Component Interaction</em>'.
	 * @generated
	 */
	InterComponentInteraction createInterComponentInteraction();

	/**
	 * Returns a new object of class '<em>Read Write Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Write Interaction</em>'.
	 * @generated
	 */
	ReadWriteInteraction createReadWriteInteraction();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>Coordination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination</em>'.
	 * @generated
	 */
	Coordination createCoordination();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternGeneratorPackage getPatternGeneratorPackage();

} //PatternGeneratorFactory
