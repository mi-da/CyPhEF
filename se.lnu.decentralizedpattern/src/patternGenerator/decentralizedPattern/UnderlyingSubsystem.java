/**
 */
package patternGenerator.decentralizedPattern;

import patternGenerator.ManagingSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underlying Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedTargetPlanner <em>Has Associated Target Planner</em>}</li>
 *   <li>{@link patternGenerator.decentralizedPattern.UnderlyingSubsystem#isHasAssociatedContextPlanner <em>Has Associated Context Planner</em>}</li>
 * </ul>
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getUnderlyingSubsystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasMonitor hasAnalyze hasNoPlan hasExecute checkONEManaged actONEManaged checkAndAct monitorSpeaksWithAnalyze analyzeSpeaksWithPlan planSpeaksWithExecute maxInterInteractionAllowed hasOneOnlyAssociatedPlanner'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasMonitor='self.monitor <> null' hasAnalyze='self.analyze <> null' hasNoPlan='self.plan = null' hasExecute='self.execute <> null' checkONEManaged='self.monitor.hasOneManagedCheck' actONEManaged='self.execute.hasOneManagedAct' checkAndAct='\n\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif' monitorSpeaksWithAnalyze='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1' analyzeSpeaksWithPlan='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1' planSpeaksWithExecute='getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1' maxInterInteractionAllowed='getMyContextInterComponentInteractions->size() <= 2 \n\t\t\t\t\t\t\t\tand getMyTargetInterComponentInteractions->size()<=2' hasOneOnlyAssociatedPlanner='\n\t\t\t\t\tif(hasAssociatedContextPlanner and hasAssociatedTargetPlanner)\n\t\t\t\t\t\tthen self.getMyContextInterComponentInteractions->any(target.oclIsKindOf(Plan)).target.oclContainer().oclAsType(RegionalPlanner) = \n\t\t\t\t\t\t\tself.getMyTargetInterComponentInteractions->any(context.oclIsKindOf(Plan)).context.oclContainer().oclAsType(RegionalPlanner)\n\t\t\t\t\telse true\n\t\t\t\t\tendif'"
 * @generated
 */
public interface UnderlyingSubsystem extends ManagingSystem {
	/**
	 * Returns the value of the '<em><b>Has Associated Target Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Target Planner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Target Planner</em>' attribute.
	 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getUnderlyingSubsystem_HasAssociatedTargetPlanner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.getMyContextInterComponentInteractions\n\t\t\t\t\t ->select(targetAndContextNotNull)\n\t\t\t\t\t ->select(target.oclIsKindOf(Plan))\n\t\t\t\t\t ->select(target.oclContainer() <> null and target.oclContainer.oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t ->size()>0'"
	 * @generated
	 */
	boolean isHasAssociatedTargetPlanner();

	/**
	 * Returns the value of the '<em><b>Has Associated Context Planner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Context Planner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Context Planner</em>' attribute.
	 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getUnderlyingSubsystem_HasAssociatedContextPlanner()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.getMyTargetInterComponentInteractions\n\t\t\t\t\t ->select(targetAndContextNotNull)\n\t\t\t\t\t ->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t ->select(context.oclContainer() <> null and context.oclContainer.oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t ->size()>0'"
	 * @generated
	 */
	boolean isHasAssociatedContextPlanner();

} // UnderlyingSubsystem
