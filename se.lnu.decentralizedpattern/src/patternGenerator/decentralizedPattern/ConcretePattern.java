/**
 */
package patternGenerator.decentralizedPattern;

import patternGenerator.DecentralizedControlPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link patternGenerator.decentralizedPattern.ConcretePattern#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getConcretePattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noPatternSelected atLeastOnePeer peersMonitorSpeakOnlyEachOther presenceOfNotAllowedElements atLeastOneUnderlyingSubsystem atLeastOneRegionalPlanner intraComponentInteractionIsPCoord intraComponentInteractionIsMCoord NoIntraComponentInteraction intraComponentInteractionIsCoord presenceOfNotAllowedElementsInRegionalPlanningPattern exactlyOneMaster atLeastOneSlave maxMasterSlavePatternInteractionAllowed atLeastOneNode presenceOfNotAllowedElementsInMasterSlavePattern'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noPatternSelected='if(type = PatternType::NoPattern) then false else true endif' atLeastOnePeer='\n\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(Peer))->size()>0\n\t\t\t\telse true\n\t\t\t\tendif' peersMonitorSpeakOnlyEachOther='\n\t\t\t\t\t\t\tif(type = PatternType::InfoSharing) then\n\t\t\t\t\t\t\t\t\tself.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t\t\t->select( not (oclAsType(Interaction).context.oclIsKindOf(Monitor)\n\t\t\t\t \t\t\t\t\tand oclAsType(Interaction).target.oclIsKindOf(Monitor)))\n\t\t\t\t\t\t\t\t\t->size() = 0\n\t\t\t\telse true\n\t\t\t\tendif' presenceOfNotAllowedElements='\n\t\t\t\tif(type = PatternType::InfoSharing or type = PatternType::CoordControl) then\n\t\t\t\t\tself.elements->select(oclIsKindOf(ManagingSystem))->reject(oclIsKindOf(Peer))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' atLeastOneUnderlyingSubsystem='\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' atLeastOneRegionalPlanner='\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(UnderlyingSubsystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' intraComponentInteractionIsPCoord='\n\t\t\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Plan)\n\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Plan))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\t\telse true\n\t\t\t\t\tendif' intraComponentInteractionIsMCoord='\n\t\t\t\tif(type = PatternType::InfoSharing)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select( not oclIsKindOf(Coordination) or not oclAsType(Interaction).context.oclIsKindOf(Monitor)\n\t\t \t\t\t\t\tor not oclAsType(Interaction).target.oclIsKindOf(Monitor))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' NoIntraComponentInteraction='\n\t\t\t\tif(type = PatternType::HierControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' intraComponentInteractionIsCoord='\n\t\t\t\tif(type = PatternType::CoordControl)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(IntraComponentInteraction))\n\t\t\t\t\t\t\t->select(oclAsType(Interaction).targetAndContextNotNull)\n\t\t\t\t\t\t\t->select(oclIsKindOf(Delegation))\n\t\t\t\t\t\t\t->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' presenceOfNotAllowedElementsInRegionalPlanningPattern='\n\t\t\t\tif(type = PatternType::RegPlanning)\n\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->reject(oclIsKindOf(RegionalPlanner))\n\t\t\t\t\t\t->reject(oclIsKindOf(UnderlyingSubsystem))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' exactlyOneMaster='\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\tthen self.elements->select(oclIsKindOf(Master))->size() = 1\n\t\t\t\t\telse true\n\t\t\t\t\tendif' atLeastOneSlave='\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Slave))->size() >= 1\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif' maxMasterSlavePatternInteractionAllowed='\n\t\t\t\tif(type = PatternType::MasterSlave) \n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(Interaction))\n\t\t\t\t\t\t\t->size() <= 2*(self.elements->select(oclIsKindOf(Slave))->size()) + 1\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif' atLeastOneNode='\n\t\t\t\tif(type = PatternType::CustomPattern) \n\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))->size()>0\n\t\t\t\t\telse true\n\t\t\t\t\tendif' presenceOfNotAllowedElementsInMasterSlavePattern='\n\t\t\t\t\t\tif(type = PatternType::MasterSlave)\n\t\t\t\t\t\tthen self.elements->select(oclIsKindOf(ManagingSystem))\n\t\t\t\t\t\t->reject(oclIsKindOf(Master))\n\t\t\t\t\t\t->reject(oclIsKindOf(Slave))->size() = 0\n\t\t\t\t\telse true\n\t\t\t\t\tendif'"
 * @generated
 */
public interface ConcretePattern extends DecentralizedControlPattern {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link patternGenerator.decentralizedPattern.PatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see patternGenerator.decentralizedPattern.PatternType
	 * @see #setType(PatternType)
	 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getConcretePattern_Type()
	 * @model required="true"
	 * @generated
	 */
	PatternType getType();

	/**
	 * Sets the value of the '{@link patternGenerator.decentralizedPattern.ConcretePattern#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see patternGenerator.decentralizedPattern.PatternType
	 * @see #getType()
	 * @generated
	 */
	void setType(PatternType value);

} // ConcretePattern
