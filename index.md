
# What is CyPhEF?
CyPhEF is a Model-Driven Engineering framework supporting the development and validation of self-adaptive cyber-physical systems. CyPhEF is implemented as an Eclipse plugin, and is based on the Eclipse Modeling Framework and the Graphical Modeling Project.

# Why CyPhEF?
Self-adaptation is nowadays recognized as an effective
approach to manage the complexity and dynamics inherent
to cyber-physical systems, which are composed of deeply intertwined
physical and software components interacting with each
other. A self-adaptive system typically consists of a managed
subsystem and a managing subsystem that implements the
adaptation logic by means of the well established MAPE-K model,
with Monitor, Analyze, Plan and Execute components, plus a
Knowledge that maintains relevant information for the other
components. Since in large distributed settings a single loop is
hardly adequate to manage the whole system, self-adaptation
is achieved by multiple loops that coordinate with one another.
Developing such systems is challenging, as several dimensions
concerning both the cyber-physical system and the decentralized
control loops should be considered. To this end, we promote
MAPE-K components as first-class modeling abstractions and
provide a framework supporting the design, development, and
validation of decentralized self-adaptive cyber-physical systems.

# Introduction

[![CyPhEF Introduction](https://image.ibb.co/eoOkXm/12.png)](https://www.youtube.com/watch?v=dx0MUcV9nJI "CyPhEF Introduction")

# Tutorial

[![CyPhEF Tutorial](https://image.ibb.co/ee0FXm/12.png)](https://www.youtube.com/watch?v=1RDx5Ehx2iA "CyPhEF Introduction")


# OCL Rules

<pre style='color:#000000;background:#ffffff;'><span style='color:#7f0055; font-weight:bold; '>package</span> patternGenerator : patternGenerator = <span style='color:#2a00ff; '>'http://www.example.org/patternGenerator'</span>
<span style='color:#000000; '>{</span>
<span style='color:#000000; '>	<span style='color:#7f0055; font-weight:bold; '>package</span> informationSharing : </span>
<span style='color:#000000; '>		informationSharing = '</span><span style='color:#3f3fbf; '>http://www.example.org/patternGenerator/informationSharing</span><span style='color:#000000; '>'</span>
<span style='color:#000000; '>	{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>class</span> Peer <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::ManagingSystem</span>
<span style='color:#000000; '>		{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasMonitor: <span style='color:#7f0055; font-weight:bold; '>self</span>.monitor &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasAnalyze: <span style='color:#7f0055; font-weight:bold; '>self</span>.analyze &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasPlan: <span style='color:#7f0055; font-weight:bold; '>self</span>.plan &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasExecute: <span style='color:#7f0055; font-weight:bold; '>self</span>.execute &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasManagedSystem: <span style='color:#7f0055; font-weight:bold; '>self</span>.managed &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> monitorSpeaksWithAnalyze: getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>				->select(context.oclIsKindOf(Monitor))</span>
<span style='color:#000000; '>				->select(target.oclIsKindOf(Analyze))->size() = 1;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> analyzeSpeaksWithPlan: getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>				->select(context.oclIsKindOf(Analyze))</span>
<span style='color:#000000; '>				->select(target.oclIsKindOf(Plan))->size() = 1;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> planSpeaksWithExecute: getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>				->select(context.oclIsKindOf(Plan))</span>
<span style='color:#000000; '>				->select(target.oclIsKindOf(Execute))->size() = 1;</span>
<span style='color:#000000; '>			</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> maxInterInteractionAllowed: getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>				->size() &lt;= 3;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> InformationSharingPattern <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::DecentralizedControlPattern
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> atLeastOnePeer: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements->select(oclIsKindOf(Peer))->size()>0;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> peersMonitorSpeakOnlyEachOther: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements</span>
<span style='color:#000000; '>				->select(oclIsKindOf(IntraComponentInteraction))</span>
<span style='color:#000000; '>				->select(oclAsType(Interaction).targetAndContextNotNull)</span>
<span style='color:#000000; '>				->select(<span style='color:#7f0055; font-weight:bold; '>not</span> ( oclAsType(Interaction).context.oclIsKindOf(Monitor)</span>
<span style='color:#000000; '>				 		<span style='color:#7f0055; font-weight:bold; '>and</span> oclAsType(Interaction).target.oclIsKindOf(Monitor)))</span>
<span style='color:#000000; '>				->size() = 0;</span>
<span style='color:#000000; '>		}</span>
	}
	<span style='color:#7f0055; font-weight:bold; '>package</span> regionalPlanning : 
		regionalPlanning = <span style='color:#2a00ff; '>'http://www.example.org/patternGenerator/regionalPlanning'</span>
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>class</span> UnderlyingSubsystem <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::ManagingSystem</span>
<span style='color:#000000; '>		{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasAssociatedTargetPlanner : <span style='color:#7f0055; font-weight:bold; '>Boolean</span>[1] </span>
<span style='color:#000000; '>				{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
			<span style='color:#000000; '>{</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>initial</span>: <span style='color:#7f0055; font-weight:bold; '>self</span>.getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>					 ->select(oclAsType(Interaction).targetAndContextNotNull)</span>)</span>
<span style='color:#000000; '>					 ->select(target.oclIsKindOf(Plan))</span>
<span style='color:#000000; '>					 ->select(target.oclContainer() &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span> </span>
<span style='color:#000000; '>						<span style='color:#7f0055; font-weight:bold; '>and</span> target.oclContainer.oclIsKindOf(RegionalPlanner))</span>
<span style='color:#000000; '>					 ->size()>0;</span>
<span style='color:#000000; '>			}</span>
			<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasAssociatedContextPlanner : <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>Boolean</span></span>[1] 
				<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
			<span style='color:#000000; '>{</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>initial</span>: <span style='color:#7f0055; font-weight:bold; '>self</span>.getMyTargetInterComponentInteractions</span>
<span style='color:#000000; '>				 	->select(.targetAndContextNotNull)</span>
<span style='color:#000000; '>				 	->select(context.oclIsKindOf(Plan))</span>
<span style='color:#000000; '>				 	->select(context.oclContainer() &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span> </span>
<span style='color:#000000; '>						<span style='color:#7f0055; font-weight:bold; '>and</span> context.oclContainer.oclIsKindOf(RegionalPlanner))</span>
<span style='color:#000000; '>				 	->size()>0;</span>
<span style='color:#000000; '>			}</span>
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasMonitor: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.monitor &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasAnalyze: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.analyze &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNoPlan: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.plan = <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasExecute: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.execute &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasManagedSystem: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.managed &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
			
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> monitorSpeaksWithAnalyze: getMyContextInterComponentInteractions
					->select(context.oclIsKindOf(Monitor))
					->select(target.oclIsKindOf(Analyze))->size() = 1;
			
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> analyzeSpeaksWithPlan: getMyContextInterComponentInteractions
					->select(context.oclIsKindOf(Analyze))
					->select(target.oclIsKindOf(Plan))->size() = 1;

			<span style='color:#7f0055; font-weight:bold; '>invariant</span> planSpeaksWithExecute: getMyTargetInterComponentInteractions
					->select(context.oclIsKindOf(Plan))
					->select(target.oclIsKindOf(Execute))->size() = 1;

			<span style='color:#7f0055; font-weight:bold; '>invariant</span> maxInterInteractionAllowed: 
				getMyContextInterComponentInteractions->size() &lt;= 2 
					<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>and</span></span> getMyTargetInterComponentInteractions->size()&lt;=2;

			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasOneOnlyAssociatedPlanner: 
				<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>if</span></span>(hasAssociatedContextPlanner <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>and</span></span> hasAssociatedTargetPlanner)
					<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>then</span></span> getMyContextInterComponentInteractions
						->any(target.oclIsKindOf(Plan)).target.oclContainer()
							.oclAsType(RegionalPlanner) = 
						getMyTargetInterComponentInteractions
						->any(context.oclIsKindOf(Plan)).context.oclContainer()
							.oclAsType(RegionalPlanner)
					<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>else</span></span> <span style='color:#7f0055; font-weight:bold; '>true</span>
				<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> RegionalPlanner <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::ManagingSystem
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNoMonitor: <span style='color:#7f0055; font-weight:bold; '>self</span>.monitor = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNoAnalyze: <span style='color:#7f0055; font-weight:bold; '>self</span>.analyze = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasPlan: <span style='color:#7f0055; font-weight:bold; '>self</span>.plan &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNoExecute: <span style='color:#7f0055; font-weight:bold; '>self</span>.execute = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNoManagedSystem: <span style='color:#7f0055; font-weight:bold; '>self</span>.managed = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> RegionalPlanningPattern <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::DecentralizedControlPattern
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> atLeastOneUnderlyingSubsystem: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements</span>
<span style='color:#000000; '>				->select(oclIsKindOf(UnderlyingSubsystem))->size()>0;</span>
<span style='color:#000000; '>			</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> atLeastOneRegionalPlanner: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements</span>
<span style='color:#000000; '>				->select(oclIsKindOf(UnderlyingSubsystem))->size()>0;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> intraComponentInteractionIsPCoord: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements</span>
<span style='color:#000000; '>				->select(oclIsKindOf(IntraComponentInteraction))</span>
<span style='color:#000000; '>				->select(oclAsType(Interaction).targetAndContextNotNull)</span>
<span style='color:#000000; '>				->select( <span style='color:#7f0055; font-weight:bold; '>not</span> oclIsKindOf(Coordination) </span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '>not</span> oclAsType(Interaction).context.oclIsKindOf(Plan)</span>
<span style='color:#000000; '>		 			<span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '>not</span> oclAsType(Interaction).target.oclIsKindOf(Plan))</span>
<span style='color:#000000; '>				->size() = 0;</span>
<span style='color:#000000; '>		}</span>
	}
	<span style='color:#7f0055; font-weight:bold; '>package</span> masterSlave : masterSlave = <span style='color:#2a00ff; '>'http://www.example.org/patternGenerator/masterSlave'</span>
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>class</span> MasterSlavePattern <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::DecentralizedControlPattern</span>
<span style='color:#000000; '>		{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>attribute</span> slaveNumber : <span style='color:#7f0055; font-weight:bold; '>Integer</span>[1] { <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
			<span style='color:#000000; '>{</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>initial</span>: <span style='color:#7f0055; font-weight:bold; '>self</span>.elements->select(oclIsKindOf(Slave))->size();</span>
<span style='color:#000000; '>			}</span>
			<span style='color:#7f0055; font-weight:bold; '>invariant</span> exactlyOneMaster: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.elements
				->select(oclIsKindOf(Master))
				->size() = 1;

			<span style='color:#7f0055; font-weight:bold; '>invariant</span> atLeastOneSlave: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.elements
				->select(oclIsKindOf(Slave))
				->size() >= 1;

			<span style='color:#7f0055; font-weight:bold; '>invariant</span> maxInteractionAllowed: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.elements
				->select(oclIsKindOf(Interaction))
				->size() &lt;= 2*slaveNumber + 1;
		}
		<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Master <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::ManagingSystem
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNOMonitor: <span style='color:#7f0055; font-weight:bold; '>self</span>.monitor = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasAnalyze: <span style='color:#7f0055; font-weight:bold; '>self</span>.analyze &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasPlan: <span style='color:#7f0055; font-weight:bold; '>self</span>.plan &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNOExecute: <span style='color:#7f0055; font-weight:bold; '>self</span>.execute = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNOManagedSystem: <span style='color:#7f0055; font-weight:bold; '>self</span>.managed = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> analyzeSpeaksWithPlan: getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>					->select(context.oclIsKindOf(Analyze))</span>
<span style='color:#000000; '>					->select(target.oclIsKindOf(Plan))->size()=1;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Slave <span style='color:#7f0055; font-weight:bold; '>class</span> patternGenerator::ManagingSystem
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasMonitor: <span style='color:#7f0055; font-weight:bold; '>self</span>.monitor &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNOAnalyze: <span style='color:#7f0055; font-weight:bold; '>self</span>.analyze = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasNOPlan: <span style='color:#7f0055; font-weight:bold; '>self</span>.plan = <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasExecute: <span style='color:#7f0055; font-weight:bold; '>self</span>.execute &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasManagedSystem: <span style='color:#7f0055; font-weight:bold; '>self</span>.managed &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> slaveMonitorSpeaksWithMasterAnalyze: </span>
<span style='color:#000000; '>				getMyContextInterComponentInteractions</span>
<span style='color:#000000; '>					->select(context.oclIsKindOf(Monitor))</span>
<span style='color:#000000; '>					->select(target.oclIsKindOf(Analyze))</span>
<span style='color:#000000; '>					->size()=1;</span>
<span style='color:#000000; '>			</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>invariant</span> masterPlanSpeaksWithSlaveExecute: </span>
<span style='color:#000000; '>				getMyTargetInterComponentInteractions</span>
<span style='color:#000000; '>					->select(context.oclIsKindOf(Plan))</span>
<span style='color:#000000; '>					->select(target.oclIsKindOf(Execute))->size()=1;</span>
<span style='color:#000000; '>		}</span>
	}
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Element;
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> ManagingSystem <span style='color:#7f0055; font-weight:bold; '>class</span> Subsystem
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasInterComponentInteractions : <span style='color:#7f0055; font-weight:bold; '>Boolean</span>[1] </span>
<span style='color:#000000; '>			{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>if</span> (<span style='color:#7f0055; font-weight:bold; '>self</span>.oclContainer().oclAsType(DecentralizedControlPattern).elements</span>
<span style='color:#000000; '>						->select(oclIsKindOf(InterComponentInteraction))</span>
<span style='color:#000000; '>						->select(oclAsType(Interaction).targetAndContextNotNull)</span>
<span style='color:#000000; '>						->size()>0) </span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>false</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasIntraComponentInteractions : <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>Boolean</span></span>[1] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>if</span> (<span style='color:#7f0055; font-weight:bold; '>self</span>.oclContainer().oclAsType(DecentralizedControlPattern).elements</span>
<span style='color:#000000; '>						->select(oclIsKindOf(IntraComponentInteraction))</span>
<span style='color:#000000; '>						->select(oclAsType(Interaction).targetAndContextNotNull)</span>
<span style='color:#000000; '>						->size()>0) </span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>false</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>property</span> getAllInterComponentInteractions : InterComponentInteraction[*|1] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(hasInterComponentInteractions)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.oclContainer().oclAsType(DecentralizedControlPattern).elements</span>
<span style='color:#000000; '>					->select(oclIsKindOf(InterComponentInteraction))</span>
<span style='color:#000000; '>					->select(oclAsType(Interaction).targetAndContextNotNull)</span>
<span style='color:#000000; '>						->oclAsType(<span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(InterComponentInteraction))</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(InterComponentInteraction){}</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasMyTargetInterComponentInteractions : <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>Boolean</span></span>[1]
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(<span style='color:#7f0055; font-weight:bold; '>self</span>.getAllInterComponentInteractions</span>
<span style='color:#000000; '>					->select(targetAndContextNotNull </span>
<span style='color:#000000; '>						<span style='color:#7f0055; font-weight:bold; '>and</span> target.oclContainer() &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span> </span>
<span style='color:#000000; '>						<span style='color:#7f0055; font-weight:bold; '>and</span> target.oclContainer().oclIsKindOf(ManagingSystem))</span>
<span style='color:#000000; '>					->select(target.oclContainer().oclAsType(ManagingSystem) = <span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>					->size()>0) </span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>false</span></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>property</span> getMyTargetInterComponentInteractions : InterComponentInteraction[*] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>:</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(hasMyTargetInterComponentInteractions)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.getAllInterComponentInteractions</span>
<span style='color:#000000; '>					->select(target.oclContainer().oclAsType(ManagingSystem) = <span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(InterComponentInteraction){}</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasMyContextInterComponentInteractions : <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>Boolean</span></span>[1] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>if</span>(<span style='color:#7f0055; font-weight:bold; '>self</span>.getAllInterComponentInteractions</span>
<span style='color:#000000; '>						->select(targetAndContextNotNull </span>
<span style='color:#000000; '>							<span style='color:#7f0055; font-weight:bold; '>and</span> context.oclContainer() &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span> </span>
<span style='color:#000000; '>							<span style='color:#7f0055; font-weight:bold; '>and</span> context.oclContainer()</span>
<span style='color:#000000; '>								.oclIsKindOf(ManagingSystem))</span>
<span style='color:#000000; '>						->select(context.oclContainer()</span>
<span style='color:#000000; '>							.oclAsType(ManagingSystem) = <span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>						->size()>0) </span>
<span style='color:#000000; '>					<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>false</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>property</span> getMyContextInterComponentInteractions : InterComponentInteraction[*] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(hasMyContextInterComponentInteractions)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.getAllInterComponentInteractions</span>
<span style='color:#000000; '>					->select(context.oclContainer().oclAsType(ManagingSystem)=<span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(InterComponentInteraction){}</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '>property</span> getAllIntraComponentInteractions : IntraComponentInteraction[*] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(hasIntraComponentInteractions)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.oclContainer().oclAsType(DecentralizedControlPattern).elements</span>
<span style='color:#000000; '>					->select(oclIsKindOf(IntraComponentInteraction))</span>
<span style='color:#000000; '>					->select(oclAsType(Interaction).targetAndContextNotNull) </span>
<span style='color:#000000; '>					->oclAsType(<span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(IntraComponentInteraction))</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(IntraComponentInteraction){}</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '>attribute</span> hasMyIntraComponentInteractions : <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>Boolean</span></span>[1] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(getAllIntraComponentInteractions</span>
<span style='color:#000000; '>					-> select(target.oclContainer().oclAsType(ManagingSystem)=<span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>					->size()>0)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>false</span></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>property</span> getAllMyIntraComponentInteractions : IntraComponentInteraction[*] 
			<span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(hasMyIntraComponentInteractions)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> getAllIntraComponentInteractions</span>
<span style='color:#000000; '>					->select(target.oclContainer().oclAsType(ManagingSystem) = <span style='color:#7f0055; font-weight:bold; '>self</span>)</span>
<span style='color:#000000; '>					->oclAsType(<span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(IntraComponentInteraction))</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>OrderedSet</span>(IntraComponentInteraction){}</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
		}
		<span style='color:#7f0055; font-weight:bold; '>property</span> analyze : Analyze[?] <span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>property</span> plan : Plan[?] <span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>property</span> execute : Execute[?] <span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>attribute</span> name : <span style='color:#7f0055; font-weight:bold; '>String</span>[?];
		<span style='color:#7f0055; font-weight:bold; '>property</span> knowledge : Knowledge[?] <span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>property</span> monitor : Monitor[?] <span style='color:#000000; '>{ <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>property</span> managed : ManagedSystem[?];

		<span style='color:#7f0055; font-weight:bold; '>invariant</span> hasAtLeastOneMapeKComponent: <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.monitor &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span> <span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.analyze &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span> 
				<span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.plan &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span> <span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.execute &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span> <span style='color:#7f0055; font-weight:bold; '>or</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.knowledge &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>null</span></span>;
	}
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> ManagedSystem <span style='color:#7f0055; font-weight:bold; '>class</span> Subsystem
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>attribute</span> name : String[?];</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>attribute</span> <span style='color:#7f0055; font-weight:bold; '>attribute</span>s : String[*|1] { <span style='color:#7f0055; font-weight:bold; '>ordered</span> }</span>;
		<span style='color:#7f0055; font-weight:bold; '>property</span> managing : ManagingSystem[1];
	}
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Monitor <span style='color:#7f0055; font-weight:bold; '>class</span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Analyze <span style='color:#7f0055; font-weight:bold; '>class</span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Plan <span style='color:#7f0055; font-weight:bold; '>class</span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Execute <span style='color:#7f0055; font-weight:bold; '>class</span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Knowledge <span style='color:#7f0055; font-weight:bold; '>class</span> MapeComponent;
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Interaction <span style='color:#7f0055; font-weight:bold; '>class</span> Element
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		property context : MapeComponent[1];</span>
<span style='color:#000000; '>		property target : MapeComponent[1];</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>attribute</span> targetAndContextNotNull : <span style='color:#7f0055; font-weight:bold; '>Boolean</span>[1] { <span style='color:#7f0055; font-weight:bold; '>derived</span> <span style='color:#7f0055; font-weight:bold; '>readonly</span> <span style='color:#7f0055; font-weight:bold; '>transient</span> <span style='color:#7f0055; font-weight:bold; '>volatile</span> }</span>
		<span style='color:#000000; '>{</span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>initial</span>: <span style='color:#7f0055; font-weight:bold; '>self</span>.context &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span> <span style='color:#7f0055; font-weight:bold; '>and</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.target &lt;> <span style='color:#7f0055; font-weight:bold; '>null</span>;</span>
<span style='color:#000000; '>		}</span>
		<span style='color:#7f0055; font-weight:bold; '>invariant</span> targetAndContextDifferent:	
			<span style='color:#000000;'><span style='color:#7f0055; font-weight:bold; '>if</span>(targetAndContextNotNull)</span>
				<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>then</span></span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.context &lt;> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>self</span></span>.target
				<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>else</span></span> <span style='color:#7f0055; font-weight:bold; '>true</span>
			<span style='color:#7f0055; font-weight:bold; '>endif</span>;
	}
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> DecentralizedControlPattern
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		property elements : Element[*|1] { <span style='color:#7f0055; font-weight:bold; '>ordered</span> <span style='color:#7f0055; font-weight:bold; '>composes</span> }</span>;
	}
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> IntraComponentInteraction <span style='color:#7f0055; font-weight:bold; '>class</span> Interaction
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>invariant</span> isIntraComponent: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(targetAndContextNotNull)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> context->oclType() = target->oclType()</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>	}</span>
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> InterComponentInteraction <span style='color:#7f0055; font-weight:bold; '>class</span> Interaction
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>invariant</span> isInterComponent: </span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>if</span>(targetAndContextNotNull)</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>then</span> context->oclType() &lt;> target->oclType()</span>
<span style='color:#000000; '>				<span style='color:#7f0055; font-weight:bold; '>else</span> <span style='color:#7f0055; font-weight:bold; '>true</span></span>
<span style='color:#000000; '>			<span style='color:#7f0055; font-weight:bold; '>endif</span>;</span>
<span style='color:#000000; '>	}</span>
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> ReadWriteInteraction <span style='color:#7f0055; font-weight:bold; '>class</span> Interaction
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>invariant</span> targetIsKnowledge: <span style='color:#7f0055; font-weight:bold; '>self</span>.target.oclIsKindOf(Knowledge);</span>
<span style='color:#000000; '>	}</span>
	<span style='color:#7f0055; font-weight:bold; '>abstract</span> <span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Subsystem <span style='color:#7f0055; font-weight:bold; '>class</span> Element;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Delegation <span style='color:#7f0055; font-weight:bold; '>class</span> IntraComponentInteraction;
	<span style='color:#7f0055; font-weight:bold; '><span style='color:#7f0055; font-weight:bold; '>class</span></span> Coordination <span style='color:#7f0055; font-weight:bold; '>class</span> IntraComponentInteraction
	<span style='color:#000000; '>{</span>
<span style='color:#000000; '>		property inverse : Coordination[1];</span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>invariant</span> isInverse: <span style='color:#7f0055; font-weight:bold; '>self</span>.inverse.target = <span style='color:#7f0055; font-weight:bold; '>self</span>.context </span>
<span style='color:#000000; '>		<span style='color:#7f0055; font-weight:bold; '>and</span> <span style='color:#7f0055; font-weight:bold; '>self</span>.inverse.context = <span style='color:#7f0055; font-weight:bold; '>self</span>.target;</span>
<span style='color:#000000; '>	}</span>
}
</pre>
