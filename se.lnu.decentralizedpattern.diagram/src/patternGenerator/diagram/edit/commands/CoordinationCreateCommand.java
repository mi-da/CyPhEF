package patternGenerator.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class CoordinationCreateCommand extends EditElementCommand {

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
	private final patternGenerator.DecentralizedControlPattern container;

	/**
	* @generated
	*/
	public CoordinationCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
		container = deduceContainer(source, target);
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof patternGenerator.MapeComponent) {
			return false;
		}
		if (target != null && false == target instanceof patternGenerator.MapeComponent) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		if (getContainer() == null) {
			return false;
		}
		return patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreateCoordination_4003(getContainer(), getSource(), getTarget());
	}

	/**
	* @generated NOT
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		patternGenerator.Coordination newElement = patternGenerator.PatternGeneratorFactory.eINSTANCE
				.createCoordination();
		newElement.setContext(getSource());
		newElement.setTarget(getTarget());

		patternGenerator.Coordination newElement2 = patternGenerator.PatternGeneratorFactory.eINSTANCE
				.createCoordination();

		newElement2.setContext(getTarget());
		newElement2.setTarget(getSource());
		newElement.setInverse(newElement2);
		newElement2.setInverse(newElement);
		getContainer().getElements().add(newElement);
		getContainer().getElements().add(newElement2);

		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	* @generated
	*/
	protected void doConfigure(patternGenerator.Coordination newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
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
	protected patternGenerator.MapeComponent getSource() {
		return (patternGenerator.MapeComponent) source;
	}

	/**
	* @generated
	*/
	protected patternGenerator.MapeComponent getTarget() {
		return (patternGenerator.MapeComponent) target;
	}

	/**
	* @generated
	*/
	public patternGenerator.DecentralizedControlPattern getContainer() {
		return container;
	}

	/**
	* Default approach is to traverse ancestors of the source to find instance of container.
	* Modify with appropriate logic.
	* @generated
	*/
	private static patternGenerator.DecentralizedControlPattern deduceContainer(EObject source, EObject target) {
		// Find container element for the new link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof patternGenerator.DecentralizedControlPattern) {
				return (patternGenerator.DecentralizedControlPattern) element;
			}
		}
		return null;
	}

}
