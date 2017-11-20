package patternGenerator.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MasterItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MasterItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.Master_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.AnalyzeCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.PlanCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.KnowledgeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(incomingLink) == patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(incomingLink) == patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(node)) {
			case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							incomingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
					if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
							outgoingLink) == patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(
						new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007 == req.getElementType()) {
			return null;
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.MonitorCheckCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ExecuteActCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* Returns command to reorient EReference based link. New link target or source
	* should be the domain model element associated with this node.
	* 
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID:
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.MonitorCheckReorientCommand(req));
		case patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID:
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ExecuteActReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
