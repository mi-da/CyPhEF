/**
 */
package patternGenerator.decentralizedPattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getPeer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkAndAct slaveMonitorSpeaksWithMasterAnalyze masterPlanSpeaksWithSlaveExecute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkAndAct='\n\t\t\t\t\t\tif(self.monitor.hasOneManagedCheck and self.execute.hasOneManagedAct)\n\t\t\t\t\t\tthen self.monitor.check->any(oclIsKindOf(ManagedSystem)) = self.execute.act->any(oclIsKindOf(ManagedSystem))\n\t\t\t\t\t\telse false\n\t\t\t\t\t\tendif' slaveMonitorSpeaksWithMasterAnalyze='getMyContextInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Analyze))\n\t\t\t\t\t\t\t\t\t\t->size()=1' masterPlanSpeaksWithSlaveExecute='getMyTargetInterComponentInteractions\n\t\t\t\t\t\t\t\t\t\t->select(context.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t\t\t\t->select(target.oclIsKindOf(Execute))->size()=1'"
 * @generated
 */
public interface Peer extends AbstractPeer {
} // Peer
