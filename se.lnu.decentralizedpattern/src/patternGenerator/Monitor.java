/**
 */
package patternGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.Monitor#getCheck <em>Check</em>}</li>
 *   <li>{@link patternGenerator.Monitor#isHasOneManagedCheck <em>Has One Managed Check</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends MapeComponent {
	/**
	 * Returns the value of the '<em><b>Check</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getMonitor_Check()
	 * @model
	 * @generated
	 */
	EList<Subsystem> getCheck();

	/**
	 * Returns the value of the '<em><b>Has One Managed Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has One Managed Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has One Managed Check</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getMonitor_HasOneManagedCheck()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\t\t\t\t\t\t\tself.check?->size() = 1 and self.check->select(oclIsKindOf(ManagedSystem))->size() = 1'"
	 * @generated
	 */
	boolean isHasOneManagedCheck();

} // Monitor
