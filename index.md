# OCL Rules

<code>

Package patternGenerator : patternGenerator = 'http://www.example.org/patternGenerator'
{
	package informationSharing : informationSharing = 'http://www.example.org/patternGenerator/informationSharing'
	{
		class Peer extends patternGenerator::ManagingSystem{
			invariant monitorSpeaksWithAnalyze: getAllMyIntraComponentInteractions
										->select(context.oclIsKindOf(Monitor))
										->select(target.oclIsKindOf(Analyze))->size()>0;
			invariant analyzeSpeaksWithPlan: getAllMyIntraComponentInteractions
										->select(context.oclIsKindOf(Analyze))
										->select(target.oclIsKindOf(Plan))->size()>0;
			invariant planSpeaksWithExecute: getAllMyIntraComponentInteractions
										->select(context.oclIsKindOf(Plan))
										->select(target.oclIsKindOf(Execute))->size()>0;
										
			invariant speackMonitor: getMyContextInterComponentInteractions
										->select(not context.oclIsKindOf(Monitor))
										->size() = 0;
										
			
		}
		class InformationSharingPattern extends patternGenerator::DecentralizedControlPattern{
			invariant atLeastOnePeer: self.elements->select(oclIsKindOf(Peer))->size()>0;
			attribute peerNumber : Integer[1] { derived readonly transient volatile }
			{
				initial: self.elements->select(oclIsKindOf(Peer))->size();
				}
			invariant maxIntraInteractionAllowed: self.elements
									->select(oclIsKindOf(IntraComponentInteraction))
									->size() <= 3*peerNumber;
									
			invariant peersMonitorSpeakOnlyEachOther: self.elements
									->select(oclIsKindOf(InterComponentInteraction))
									->select(oclAsType(Interaction).targetAndContextNotNull)
									->select( not (oclAsType(Interaction).context.oclIsKindOf(Monitor)
				 					and oclAsType(Interaction).target.oclIsKindOf(Monitor)))
									->size() = 0;
		}
	}
	package masterSlave : masterSlave = 'http://www.example.org/patternGenerator/masterSlave'
	{
		class MasterSlavePattern extends patternGenerator::DecentralizedControlPattern
		{
			attribute slaveNumber : Integer[1] { derived readonly transient volatile }
			{
				initial: self.elements->select(managingSystem | managingSystem.oclIsKindOf(Slave))->size();
				}
				invariant
				exactlyOneMaster('ohohoh'): self.elements->select(managingSystem | managingSystem.oclIsKindOf(Master))->size() = 1;
				invariant atLeastOneSlave: self.elements->select(managingSystem | managingSystem.oclIsKindOf(Slave))->size() >= 1;
				invariant
				maxInterComponentInteractionAllowed: 
			self.elements->select(interaction | interaction.oclIsKindOf(patternGenerator::InterComponentInteraction))
			->size() <= 2*slaveNumber;
				invariant
				maxIntraComponentInteractionAllowed: 
			self.elements->select(interaction | interaction.oclIsKindOf(patternGenerator::IntraComponentInteraction))
			->size() <= 1;
			}
			class Master extends patternGenerator::ManagingSystem
			{
				invariant hasNOMonitor: self.monitor = null;
				invariant hasAnalyze: self.analyze <> null;
				invariant hasPlan: self.plan <> null;
				invariant hasNOExecute: self.execute = null;
				invariant hasKnowledge: self.knowledge <> null;
				invariant hasNOManagedSystem: self.managedSystem = null;
				invariant
				AnalyzeSpeaksWithPlan: getAllMyIntraComponentInteractions
										->select(context.oclIsKindOf(Analyze))
										->select(target.oclIsKindOf(Plan))->size()>0;
				invariant getMyTargetInter: getMyTargetInterComponentInteractions->size()>0;
				invariant getMyContextInter: getMyContextInterComponentInteractions->size()>0;
				invariant getAllMyIntra: getAllIntraComponentInteractions->size()>0;
			}
			class Slave extends patternGenerator::ManagingSystem
			{
				invariant hasMonitor: self.monitor <> null;
				invariant hasNOAnalyze: self.analyze = null;
				invariant hasNOPlan: self.plan = null;
				invariant hasExecute: self.execute <> null;
				invariant hasNOKnowledge: self.knowledge = null;
				invariant hasManagedSystem: self.managedSystem <> null;
				invariant
				SlaveMonitorSpeaksWithMasterAnalyze: getMyContextInterComponentInteractions
							->select(context.oclIsKindOf(Monitor))
							->select(target.oclIsKindOf(Analyze))
							->size()>0;
				invariant
				MasterPlanSpeaksWithSlaveExecute: getMyTargetInterComponentInteractions
							->select(context.oclIsKindOf(Plan))
							->select(target.oclIsKindOf(Execute))->size()>0;
			}
		}
		abstract class Element;
		abstract class ManagingSystem extends Element
		{
			attribute hasInterComponentInteractions : Boolean[1] { derived readonly transient volatile }
			{
				initial: if (self.oclContainer().oclAsType(DecentralizedControlPattern).elements
						->select(oclIsKindOf(InterComponentInteraction))
						->select(oclAsType(Interaction).targetAndContextNotNull )->size()>0
					) then true
					else false
					endif;
				}
				attribute hasIntraComponentInteractions : Boolean[1] { derived readonly transient volatile }
				{
					initial: if (self.oclContainer().oclAsType(DecentralizedControlPattern).elements
						->select(oclIsKindOf(IntraComponentInteraction))
						->select( oclAsType(IntraComponentInteraction).context <> null)
						->select( oclAsType(IntraComponentInteraction).target <> null)->size()>0
					) then true
					else false
					endif;
					}
					property getAllInterComponentInteractions : InterComponentInteraction[*|1] { ordered derived readonly transient
					volatile }
					{
						initial: if(hasInterComponentInteractions)
					then
						self.oclContainer().oclAsType(DecentralizedControlPattern).elements
						->select(oclIsKindOf(InterComponentInteraction))
						->select(oclAsType(Interaction).targetAndContextNotNull)
						->oclAsType(OrderedSet(InterComponentInteraction))
					else OrderedSet(InterComponentInteraction){}
					endif;
					}
					attribute hasMyTargetInterComponentInteractions : Boolean[1] { derived readonly transient volatile }
					{
						initial: 
						if(self.getAllInterComponentInteractions
							->select( m | m.target.oclContainer().oclAsType(ManagingSystem) = self)
							->size()>0) then true
						else false
						endif;
						}
						property getMyTargetInterComponentInteractions : InterComponentInteraction[*] { ordered derived readonly
						transient volatile }
						{
							initial: if(hasMyTargetInterComponentInteractions)
								then self.getAllInterComponentInteractions
									->select( m | m.target.oclContainer().oclAsType(ManagingSystem) = self)
								else OrderedSet(InterComponentInteraction){}
								endif;
						}
						attribute hasMyContextInterComponentInteractions : Boolean[1] { derived readonly transient volatile }
						{
							initial: 
						if(self.getAllInterComponentInteractions
							->select( m | m.context.oclContainer().oclAsType(ManagingSystem) = self)
							->size()>0) then true
						else false
						endif;
							}
							property getMyContextInterComponentInteractions : InterComponentInteraction[*] { ordered derived readonly
							transient volatile }
							{
								initial: if(hasMyContextInterComponentInteractions)
								then self.getAllInterComponentInteractions
									->select( m | m.context.oclContainer().oclAsType(ManagingSystem) = self)
								else OrderedSet(InterComponentInteraction){}
								endif;
							}
							property getAllIntraComponentInteractions : IntraComponentInteraction[*] { ordered derived readonly transient
							volatile }
							{
								initial: if(hasIntraComponentInteractions)
					then
						self.oclContainer().oclAsType(DecentralizedControlPattern).elements
						->select( m | m.oclIsKindOf(IntraComponentInteraction))
						->select(oclAsType(IntraComponentInteraction).target <> null) 
						->select(oclAsType(IntraComponentInteraction).context<> null)
						->oclAsType(OrderedSet(IntraComponentInteraction))
					else OrderedSet(IntraComponentInteraction){}
					endif;
							}
							attribute hasMyIntraComponentInteractions : Boolean[1] { derived readonly transient volatile }
							{
								initial: if(getAllIntraComponentInteractions
						-> select(target.oclContainer().oclAsType(ManagingSystem) = self)->size()>0)
						then true
						else false
						endif;
								}
								property getAllMyIntraComponentInteractions : IntraComponentInteraction[*] { ordered derived readonly
								transient volatile }
								{
									initial: if(hasMyIntraComponentInteractions)
							then getAllIntraComponentInteractions->select(target.oclContainer().oclAsType(ManagingSystem) = self)
							->oclAsType(OrderedSet(IntraComponentInteraction))
						else OrderedSet(IntraComponentInteraction){}
						endif;
								}
								property analyze : Analyze[?] { composes };
								property plan : Plan[?] { composes };
								property execute : Execute[?] { composes };
								attribute name : String[?];
								property managedSystem : ManagedSystem[?] { composes };
								property knowledge : Knowledge[?] { composes };
								property monitor : Monitor[?] { composes };
								invariant
								hasAtLeastAMapeKComponent: self.monitor <> null or self.analyze <> null or self.plan <> null
		or self.execute <> null or self.knowledge <> null;
								invariant
								boh: self.oclContainer().oclAsType(DecentralizedControlPattern).elements
			->select( m | m.oclIsKindOf(InterComponentInteraction))
			->select( m | m.oclAsType(InterComponentInteraction).context <> null)
			->select( m | m.oclAsType(InterComponentInteraction).target <> null) <> null;
							}
							class ManagedSystem
							{
								attribute name : String[?];
								attribute attributes : String[*|1] { ordered };
							}
							abstract class MapeComponent;
							class Monitor extends MapeComponent;
							class Analyze extends MapeComponent;
							class Plan extends MapeComponent;
							class Execute extends MapeComponent;
							class Knowledge extends MapeComponent;
							abstract class Interaction extends Element
							{
								property context : MapeComponent[1];
								property target : MapeComponent[1];
								attribute targetAndContextNotNull : Boolean[1] { derived readonly transient volatile }
								{
									initial: self.context <> null and self.target <> null;
									}
								}
								abstract class DecentralizedControlPattern
								{
									property elements : Element[*|1] { ordered composes };
								}
								class IntraComponentInteraction extends Interaction
								{
									invariant
									isIntraComponent: 
		if(targetAndContextNotNull)
			then self.target.oclContainer().oclAsType(ManagingSystem) = self.context.oclContainer().oclAsType(ManagingSystem)
			else true
			endif;
								}
								class InterComponentInteraction extends Interaction
								{
									invariant
									isInterComponent: 
		if(targetAndContextNotNull)
			then self.target.oclContainer().oclAsType(ManagingSystem) <> self.context.oclContainer().oclAsType(ManagingSystem)
			else true
			endif;
								}
								class ReadWriteInteraction extends Interaction
								{
									invariant targetIsKnowledge: self.target.oclIsKindOf(Knowledge);
								}
}

</code>
