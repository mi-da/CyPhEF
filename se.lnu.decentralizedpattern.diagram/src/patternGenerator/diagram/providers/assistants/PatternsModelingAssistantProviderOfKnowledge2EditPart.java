package patternGenerator.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PatternsModelingAssistantProviderOfKnowledge2EditPart
		extends patternGenerator.diagram.providers.PatternsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((patternGenerator.diagram.edit.parts.Knowledge2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(patternGenerator.diagram.edit.parts.Knowledge2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((patternGenerator.diagram.edit.parts.Knowledge2EditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			patternGenerator.diagram.edit.parts.Knowledge2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.MonitorEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.ExecuteEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.AnalyzeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.PlanEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.KnowledgeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.MonitorEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.ExecuteEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.AnalyzeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.PlanEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.KnowledgeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.MonitorEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.ExecuteEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.AnalyzeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.PlanEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.KnowledgeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.MonitorEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.ExecuteEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.AnalyzeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.PlanEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.KnowledgeEditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge2EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Knowledge3EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute4EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Monitor5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Analyze5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Plan5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		if (targetEditPart instanceof patternGenerator.diagram.edit.parts.Execute5EditPart) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((patternGenerator.diagram.edit.parts.Knowledge2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(patternGenerator.diagram.edit.parts.Knowledge2EditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((patternGenerator.diagram.edit.parts.Knowledge2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(patternGenerator.diagram.edit.parts.Knowledge2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((patternGenerator.diagram.edit.parts.Knowledge2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(patternGenerator.diagram.edit.parts.Knowledge2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		} else if (relationshipType == patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006) {
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
			types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		}
		return types;
	}

}
