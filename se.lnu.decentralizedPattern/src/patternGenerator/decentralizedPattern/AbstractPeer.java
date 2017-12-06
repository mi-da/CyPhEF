/**
 */
package patternGenerator.decentralizedPattern;

import patternGenerator.ManagingSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Peer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getAbstractPeer()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasMonitor hasAnalyze hasPlan hasExecute monitorSpeaksWithAnalyze analyzeSpeaksWithPlan planSpeaksWithExecute maxInterInteractionAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasMonitor='self.monitor <> null' hasAnalyze='self.analyze <> null' hasPlan='self.plan <> null' hasExecute='self.execute <> null' monitorSpeaksWithAnalyze='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))->size() = 1' analyzeSpeaksWithPlan='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Plan))->size() = 1' planSpeaksWithExecute='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size() = 1' maxInterInteractionAllowed='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t->size() <= 3'"
 * @generated
 */
public interface AbstractPeer extends ManagingSystem {
} // AbstractPeer
