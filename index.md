# OCL Rules

<xmp>
   class Peer extends patternGenerator::ManagingSystem {
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
</xmp>
