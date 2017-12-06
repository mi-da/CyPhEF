package patternGenerator.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import patternGenerator.PatternGeneratorFactory;

/**
 * @generated
 */
public class HPeerCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	public HPeerCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	* FIXME: replace with setElementToEdit()
	* @generated
	*/
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		return true;

	}

	/**
	* @generated NOT
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		patternGenerator.decentralizedPattern.HPeer newElement = patternGenerator.decentralizedPattern.DecentralizedPatternFactory.eINSTANCE
				.createHPeer();

		patternGenerator.DecentralizedControlPattern owner = (patternGenerator.DecentralizedControlPattern) getElementToEdit();

		patternGenerator.Monitor m = PatternGeneratorFactory.eINSTANCE.createMonitor();
		patternGenerator.Analyze a = PatternGeneratorFactory.eINSTANCE.createAnalyze();
		patternGenerator.Plan p = PatternGeneratorFactory.eINSTANCE.createPlan();
		patternGenerator.Execute e = PatternGeneratorFactory.eINSTANCE.createExecute();

		patternGenerator.InterComponentInteraction ma = PatternGeneratorFactory.eINSTANCE
				.createInterComponentInteraction();
		ma.setContext(m);
		ma.setTarget(a);
		patternGenerator.InterComponentInteraction ap = PatternGeneratorFactory.eINSTANCE
				.createInterComponentInteraction();
		ap.setContext(a);
		ap.setTarget(p);
		patternGenerator.InterComponentInteraction pe = PatternGeneratorFactory.eINSTANCE
				.createInterComponentInteraction();
		pe.setContext(p);
		pe.setTarget(e);

		newElement.setMonitor(m);
		newElement.setAnalyze(a);
		newElement.setPlan(p);
		newElement.setExecute(e);

		owner.getElements().add(newElement);
		owner.getElements().add(ma);
		owner.getElements().add(ap);
		owner.getElements().add(pe);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	* @generated
	*/
	protected void doConfigure(patternGenerator.decentralizedPattern.HPeer newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest()).getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest()).getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
