/**
 */
package patternGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.Execute#getAct <em>Act</em>}</li>
 *   <li>{@link patternGenerator.Execute#isHasOneManagedAct <em>Has One Managed Act</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getExecute()
 * @model
 * @generated
 */
public interface Execute extends MapeComponent {
	/**
	 * Returns the value of the '<em><b>Act</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getExecute_Act()
	 * @model
	 * @generated
	 */
	EList<Subsystem> getAct();

	/**
	 * Returns the value of the '<em><b>Has One Managed Act</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has One Managed Act</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has One Managed Act</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getExecute_HasOneManagedAct()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\t\t\t\t\t\t\t\tself.act?->size() = 1 and self.act->select(oclIsKindOf(ManagedSystem))->size() = 1'"
	 * @generated
	 */
	boolean isHasOneManagedAct();

} // Execute
