/**
 */
package patternGenerator.decentralizedPattern;

import patternGenerator.ManagingSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getMaster()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasNOMonitor hasAnalyze hasPlan hasNOExecute analyzeSpeaksWithPlan'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasNOMonitor='self.monitor = null' hasAnalyze='self.analyze <> null' hasPlan='self.plan <> null' hasNOExecute='self.execute = null' analyzeSpeaksWithPlan='getMyContextInterComponentInteractions\n\t\t\t\t->select(context.oclIsKindOf(Analyze))\n\t\t\t\t->select(target.oclIsKindOf(Plan))->size()=1'"
 * @generated
 */
public interface Master extends ManagingSystem {
} // Master
