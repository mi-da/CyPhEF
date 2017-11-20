/**
 */
package patternGenerator.decentralizedPattern;

import patternGenerator.ManagingSystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getSlave()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasMonitor hasNOAnalyze hasNOPlan hasExecute checkONEManaged actONEManaged checkAndAct slaveMonitorSpeaksWithMasterAnalyze masterPlanSpeaksWithSlaveExecute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot hasMonitor='self.monitor <> null' hasNOAnalyze='self.analyze = null' hasNOPlan='self.plan = null' hasExecute='self.execute <> null' checkONEManaged='self.monitor?.hasOneManagedCheck' actONEManaged='self.execute?.hasOneManagedAct' checkAndAct='self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct \n\t\t\t\tand self.monitor.check = self.execute.act' slaveMonitorSpeaksWithMasterAnalyze='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t->size()=1' masterPlanSpeaksWithSlaveExecute='getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1'"
 * @generated
 */
public interface Slave extends ManagingSystem {
} // Slave
