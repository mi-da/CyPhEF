/**
 */
package patternGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.Interaction#getContext <em>Context</em>}</li>
 *   <li>{@link patternGenerator.Interaction#getTarget <em>Target</em>}</li>
 *   <li>{@link patternGenerator.Interaction#isTargetAndContextNotNull <em>Target And Context Not Null</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getInteraction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetAndContextDifferent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot targetAndContextDifferent='context <> target'"
 * @generated
 */
public interface Interaction extends Element {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(MapeComponent)
	 * @see patternGenerator.PatternGeneratorPackage#getInteraction_Context()
	 * @model required="true"
	 * @generated
	 */
	MapeComponent getContext();

	/**
	 * Sets the value of the '{@link patternGenerator.Interaction#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(MapeComponent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MapeComponent)
	 * @see patternGenerator.PatternGeneratorPackage#getInteraction_Target()
	 * @model required="true"
	 * @generated
	 */
	MapeComponent getTarget();

	/**
	 * Sets the value of the '{@link patternGenerator.Interaction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MapeComponent value);

	/**
	 * Returns the value of the '<em><b>Target And Context Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target And Context Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target And Context Not Null</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getInteraction_TargetAndContextNotNull()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='context <> null and target <> null'"
	 * @generated
	 */
	boolean isTargetAndContextNotNull();

} // Interaction
