package patternGenerator.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ConcretePatternItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConcretePatternItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.ConcretePattern_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.SlaveCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Master_2003 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.MasterCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.PeerCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.RegionalPlannerCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.Node_2006 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.NodeCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.UnderlyingSubsystemCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.ManagedSystemCreateCommand(req));
		}
		if (patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010 == req.getElementType()) {
			return getGEFWrapper(new patternGenerator.diagram.edit.commands.HPeerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
