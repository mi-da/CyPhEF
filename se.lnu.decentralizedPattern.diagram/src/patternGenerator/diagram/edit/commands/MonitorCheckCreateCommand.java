package patternGenerator.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import patternGenerator.ManagingSystem;

/**
 * @generated
 */
public class MonitorCheckCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	public MonitorCheckCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	* @generated NOT
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof patternGenerator.Monitor) {
			return false;
		}
		if (target != null && false == target instanceof patternGenerator.Subsystem) {
			return false;
		}
		if (true == target instanceof patternGenerator.ManagingSystem
				&& ((ManagingSystem) target).getMonitor().equals(source)) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateMonitorCheck_4007(getSource(), getTarget());
	}

	/**
	* @generated 
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().getCheck().add(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected patternGenerator.Monitor getSource() {
		return (patternGenerator.Monitor) source;
	}

	/**
	* @generated
	*/
	protected patternGenerator.Subsystem getTarget() {
		return (patternGenerator.Subsystem) target;
	}
}
