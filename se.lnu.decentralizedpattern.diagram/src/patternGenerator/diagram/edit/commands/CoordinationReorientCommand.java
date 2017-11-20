package patternGenerator.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CoordinationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public CoordinationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof patternGenerator.Coordination) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof patternGenerator.MapeComponent && newEnd instanceof patternGenerator.MapeComponent)) {
			return false;
		}
		patternGenerator.MapeComponent target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof patternGenerator.DecentralizedControlPattern)) {
			return false;
		}
		patternGenerator.DecentralizedControlPattern container = (patternGenerator.DecentralizedControlPattern) getLink()
				.eContainer();
		return patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCoordination_4003(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof patternGenerator.MapeComponent && newEnd instanceof patternGenerator.MapeComponent)) {
			return false;
		}
		patternGenerator.MapeComponent source = getLink().getContext();
		if (!(getLink().eContainer() instanceof patternGenerator.DecentralizedControlPattern)) {
			return false;
		}
		patternGenerator.DecentralizedControlPattern container = (patternGenerator.DecentralizedControlPattern) getLink()
				.eContainer();
		return patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistCoordination_4003(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setContext(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected patternGenerator.Coordination getLink() {
		return (patternGenerator.Coordination) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected patternGenerator.MapeComponent getOldSource() {
		return (patternGenerator.MapeComponent) oldEnd;
	}

	/**
	* @generated
	*/
	protected patternGenerator.MapeComponent getNewSource() {
		return (patternGenerator.MapeComponent) newEnd;
	}

	/**
	* @generated
	*/
	protected patternGenerator.MapeComponent getOldTarget() {
		return (patternGenerator.MapeComponent) oldEnd;
	}

	/**
	* @generated
	*/
	protected patternGenerator.MapeComponent getNewTarget() {
		return (patternGenerator.MapeComponent) newEnd;
	}
}
