/**
 */
package patternGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decentralized Control Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.DecentralizedControlPattern#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getDecentralizedControlPattern()
 * @model abstract="true"
 * @generated
 */
public interface DecentralizedControlPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link patternGenerator.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getDecentralizedControlPattern_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // DecentralizedControlPattern
