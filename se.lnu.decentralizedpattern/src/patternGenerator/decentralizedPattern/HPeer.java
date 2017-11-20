/**
 */
package patternGenerator.decentralizedPattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HPeer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.decentralizedPattern.HPeer#isHasDirectManaged <em>Has Direct Managed</em>}</li>
 * </ul>
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getHPeer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasManaged'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasManaged='\n\t\t\t\t\t\t\tif(hasDirectManaged) \n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse self.monitor?.check->size() > 0 and self.monitor?.check = self.execute?.act\n\t\t\t\t\t\t\tendif'"
 * @generated
 */
public interface HPeer extends AbstractPeer {
	/**
	 * Returns the value of the '<em><b>Has Direct Managed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Direct Managed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Direct Managed</em>' attribute.
	 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getHPeer_HasDirectManaged()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\t\t\t\tmonitor?.hasOneManagedCheck and execute?.hasOneManagedAct \n\t\t\t\t\t\t\tand monitor.check = execute.act'"
	 * @generated
	 */
	boolean isHasDirectManaged();

} // HPeer
