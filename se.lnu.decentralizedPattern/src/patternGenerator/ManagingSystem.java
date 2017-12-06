/**
 */
package patternGenerator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managing System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.ManagingSystem#isHasInterComponentInteractions <em>Has Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#isHasIntraComponentInteractions <em>Has Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getGetAllInterComponentInteractions <em>Get All Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#isHasMyTargetInterComponentInteractions <em>Has My Target Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getGetMyTargetInterComponentInteractions <em>Get My Target Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#isHasMyContextInterComponentInteractions <em>Has My Context Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getGetMyContextInterComponentInteractions <em>Get My Context Inter Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getGetAllIntraComponentInteractions <em>Get All Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#isHasMyIntraComponentInteractions <em>Has My Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getGetAllMyIntraComponentInteractions <em>Get All My Intra Component Interactions</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getAnalyze <em>Analyze</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getPlan <em>Plan</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getExecute <em>Execute</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getName <em>Name</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link patternGenerator.ManagingSystem#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasAtLeastOneMapeKComponent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasAtLeastOneMapeKComponent='self.monitor <> null or self.analyze <> null \n\t\t\t\t\tor self.plan <> null or self.execute <> null or self.knowledge <> null'"
 * @generated
 */
public interface ManagingSystem extends Subsystem {
	/**
	 * Returns the value of the '<em><b>Has Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Inter Component Interactions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inter Component Interactions</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_HasInterComponentInteractions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif (self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t->select(oclIsKindOf(InterComponentInteraction))\n\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull )->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isHasInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Has Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Intra Component Interactions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Intra Component Interactions</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_HasIntraComponentInteractions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif (self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isHasIntraComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Get All Inter Component Interactions</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.InterComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get All Inter Component Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Inter Component Interactions</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_GetAllInterComponentInteractions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(hasInterComponentInteractions)\n\t\t\t\t\tthen\n\t\t\t\t\t\tself.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t->select(oclIsKindOf(InterComponentInteraction))\n\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t->oclAsType(OrderedSet(InterComponentInteraction))\n\t\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<InterComponentInteraction> getGetAllInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Has My Target Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has My Target Inter Component Interactions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has My Target Inter Component Interactions</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_HasMyTargetInterComponentInteractions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(self.getAllInterComponentInteractions\n\t\t\t\t\t->select(targetAndContextNotNull and target.oclContainer() <> null and target.oclContainer().oclIsKindOf(ManagingSystem))\n\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\t\telse false\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isHasMyTargetInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Get My Target Inter Component Interactions</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.InterComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get My Target Inter Component Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get My Target Inter Component Interactions</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_GetMyTargetInterComponentInteractions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(hasMyTargetInterComponentInteractions)\n\t\t\t\t\tthen self.getAllInterComponentInteractions\n\t\t\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<InterComponentInteraction> getGetMyTargetInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Has My Context Inter Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has My Context Inter Component Interactions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has My Context Inter Component Interactions</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_HasMyContextInterComponentInteractions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(self.getAllInterComponentInteractions\n\t\t\t\t\t\t->select(targetAndContextNotNull and context.oclContainer() <> null and context.oclContainer().oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->select(context.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->size()>0) \n\t\t\t\t\tthen true\n\t\t\t\telse false\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isHasMyContextInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Get My Context Inter Component Interactions</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.InterComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get My Context Inter Component Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get My Context Inter Component Interactions</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_GetMyContextInterComponentInteractions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(hasMyContextInterComponentInteractions)\n\t\t\t\t\tthen self.getAllInterComponentInteractions\n\t\t\t\t\t\t->select(context.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\telse OrderedSet(InterComponentInteraction){}\n\t\t\t\tendif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<InterComponentInteraction> getGetMyContextInterComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Get All Intra Component Interactions</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.IntraComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get All Intra Component Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All Intra Component Interactions</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_GetAllIntraComponentInteractions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(hasIntraComponentInteractions)\n\t\t\t\t\tthen self.oclContainer().oclAsType(DecentralizedControlPattern).elements\n\t\t\t\t\t\t->select( m | m.oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull) \n\t\t\t\t\t\t->oclAsType(OrderedSet(IntraComponentInteraction))\n\t\t\t\telse OrderedSet(IntraComponentInteraction){}\n\t\t\t\tendif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<IntraComponentInteraction> getGetAllIntraComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Has My Intra Component Interactions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has My Intra Component Interactions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has My Intra Component Interactions</em>' attribute.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_HasMyIntraComponentInteractions()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(getAllIntraComponentInteractions\n\t\t\t\t\t\t-> select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->size()>0)\n\t\t\t\t\tthen true\n\t\t\t\telse false\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isHasMyIntraComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Get All My Intra Component Interactions</b></em>' reference list.
	 * The list contents are of type {@link patternGenerator.IntraComponentInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get All My Intra Component Interactions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get All My Intra Component Interactions</em>' reference list.
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_GetAllMyIntraComponentInteractions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\n\t\t\t\tif(hasMyIntraComponentInteractions)\n\t\t\t\t\tthen getAllIntraComponentInteractions\n\t\t\t\t\t\t->select(target.oclContainer().oclAsType(ManagingSystem) = self)\n\t\t\t\t\t\t->oclAsType(OrderedSet(IntraComponentInteraction))\n\t\t\t\t\telse OrderedSet(IntraComponentInteraction){}\n\t\t\t\tendif'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<IntraComponentInteraction> getGetAllMyIntraComponentInteractions();

	/**
	 * Returns the value of the '<em><b>Analyze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analyze</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyze</em>' containment reference.
	 * @see #setAnalyze(Analyze)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Analyze()
	 * @model containment="true"
	 * @generated
	 */
	Analyze getAnalyze();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getAnalyze <em>Analyze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyze</em>' containment reference.
	 * @see #getAnalyze()
	 * @generated
	 */
	void setAnalyze(Analyze value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(Plan)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Plan()
	 * @model containment="true"
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference.
	 * @see #setExecute(Execute)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Execute()
	 * @model containment="true"
	 * @generated
	 */
	Execute getExecute();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getExecute <em>Execute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' containment reference.
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(Execute value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' containment reference.
	 * @see #setKnowledge(Knowledge)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Knowledge()
	 * @model containment="true"
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getKnowledge <em>Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' containment reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

	/**
	 * Returns the value of the '<em><b>Monitor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor</em>' containment reference.
	 * @see #setMonitor(Monitor)
	 * @see patternGenerator.PatternGeneratorPackage#getManagingSystem_Monitor()
	 * @model containment="true"
	 * @generated
	 */
	Monitor getMonitor();

	/**
	 * Sets the value of the '{@link patternGenerator.ManagingSystem#getMonitor <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor</em>' containment reference.
	 * @see #getMonitor()
	 * @generated
	 */
	void setMonitor(Monitor value);

} // ManagingSystem
