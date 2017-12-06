/**
 */
package patternGenerator.decentralizedPattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage
 * @generated
 */
public interface DecentralizedPatternFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecentralizedPatternFactory eINSTANCE = patternGenerator.decentralizedPattern.impl.DecentralizedPatternFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master</em>'.
	 * @generated
	 */
	Master createMaster();

	/**
	 * Returns a new object of class '<em>Slave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slave</em>'.
	 * @generated
	 */
	Slave createSlave();

	/**
	 * Returns a new object of class '<em>Underlying Subsystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Underlying Subsystem</em>'.
	 * @generated
	 */
	UnderlyingSubsystem createUnderlyingSubsystem();

	/**
	 * Returns a new object of class '<em>Regional Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regional Planner</em>'.
	 * @generated
	 */
	RegionalPlanner createRegionalPlanner();

	/**
	 * Returns a new object of class '<em>Peer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Peer</em>'.
	 * @generated
	 */
	Peer createPeer();

	/**
	 * Returns a new object of class '<em>HPeer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HPeer</em>'.
	 * @generated
	 */
	HPeer createHPeer();

	/**
	 * Returns a new object of class '<em>Concrete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Pattern</em>'.
	 * @generated
	 */
	ConcretePattern createConcretePattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DecentralizedPatternPackage getDecentralizedPatternPackage();

} //DecentralizedPatternFactory
