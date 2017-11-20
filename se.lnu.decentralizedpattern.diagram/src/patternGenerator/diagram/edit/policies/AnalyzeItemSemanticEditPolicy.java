package patternGenerator.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AnalyzeItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AnalyzeItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
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
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
					incomingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(incomingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(incomingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(
					outgoingLink) == patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(outgoingLink) == patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getVisualID(outgoingLink) == patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID) {
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
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002 == req
				.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.InterComponentInteractionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.CoordinationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.DelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ReadWriteInteractionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002 == req
				.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.InterComponentInteractionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.CoordinationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.DelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ReadWriteInteractionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getGEFWrapper(
					new patternGenerator.diagram.edit.commands.InterComponentInteractionReorientCommand(req));
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.CoordinationReorientCommand(req));
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.DelegationReorientCommand(req));
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ReadWriteInteractionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
