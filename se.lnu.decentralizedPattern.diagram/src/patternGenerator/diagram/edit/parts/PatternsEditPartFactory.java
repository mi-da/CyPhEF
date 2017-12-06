package patternGenerator.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class PatternsEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {

			case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ConcretePatternEditPart(view);

			case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.SlaveEditPart(view);

			case patternGenerator.diagram.edit.parts.SlaveNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.SlaveNameEditPart(view);

			case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.MasterEditPart(view);

			case patternGenerator.diagram.edit.parts.MasterNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.MasterNameEditPart(view);

			case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.PeerEditPart(view);

			case patternGenerator.diagram.edit.parts.PeerNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.PeerNameEditPart(view);

			case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.RegionalPlannerEditPart(view);

			case patternGenerator.diagram.edit.parts.RegionalPlannerNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.RegionalPlannerNameEditPart(view);

			case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.NodeEditPart(view);

			case patternGenerator.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.NodeNameEditPart(view);

			case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart(view);

			case patternGenerator.diagram.edit.parts.UnderlyingSubsystemNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.UnderlyingSubsystemNameEditPart(view);

			case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ManagedSystemEditPart(view);

			case patternGenerator.diagram.edit.parts.ManagedSystemNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ManagedSystemNameEditPart(view);

			case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.HPeerEditPart(view);

			case patternGenerator.diagram.edit.parts.HPeerNameEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.HPeerNameEditPart(view);

			case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.MonitorEditPart(view);

			case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ExecuteEditPart(view);

			case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.AnalyzeEditPart(view);

			case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.PlanEditPart(view);

			case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.KnowledgeEditPart(view);

			case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Monitor2EditPart(view);

			case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Analyze2EditPart(view);

			case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Plan2EditPart(view);

			case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Execute2EditPart(view);

			case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Knowledge2EditPart(view);

			case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Plan3EditPart(view);

			case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Monitor3EditPart(view);

			case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Analyze3EditPart(view);

			case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Plan4EditPart(view);

			case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Execute3EditPart(view);

			case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Knowledge3EditPart(view);

			case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Monitor4EditPart(view);

			case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Analyze4EditPart(view);

			case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Execute4EditPart(view);

			case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Monitor5EditPart(view);

			case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Analyze5EditPart(view);

			case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Plan5EditPart(view);

			case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.Execute5EditPart(view);

			case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart(view);

			case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.CoordinationEditPart(view);

			case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.DelegationEditPart(view);

			case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart(view);

			case patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.MonitorCheckEditPart(view);

			case patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID:
				return new patternGenerator.diagram.edit.parts.ExecuteActEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
