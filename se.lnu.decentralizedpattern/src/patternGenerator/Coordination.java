/**
 */
package patternGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.Coordination#getInverse <em>Inverse</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getCoordination()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasExactlyOneInverse isInverse'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasExactlyOneInverse='self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select( oclIsKindOf(Coordination))\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t->select(oclAsType(Coordination).target = self.context \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand oclAsType(Coordination).context = self.target) \n\t\t\t\t\t\t\t\t\t\t\t\t\t->size()=1' isInverse='inverse.target = self.context and inverse.context = self.target'"
 * @generated
 */
public interface Coordination extends IntraComponentInteraction {
	/**
	 * Returns the value of the '<em><b>Inverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverse</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverse</em>' reference.
	 * @see #setInverse(Coordination)
	 * @see patternGenerator.PatternGeneratorPackage#getCoordination_Inverse()
	 * @model required="true"
	 * @generated
	 */
	Coordination getInverse();

	/**
	 * Sets the value of the '{@link patternGenerator.Coordination#getInverse <em>Inverse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverse</em>' reference.
	 * @see #getInverse()
	 * @generated
	 */
	void setInverse(Coordination value);

} // Coordination
