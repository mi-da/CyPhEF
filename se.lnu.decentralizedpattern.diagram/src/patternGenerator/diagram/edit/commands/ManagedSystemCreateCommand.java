package patternGenerator.diagram.edit.commands;

import javax.swing.JDialog;

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

import patternGenerator.PhysicalNode;
import patternGenerator.diagram.runtime.cosimulation.PhysicalModel;
import patternGenerator.diagram.views.ManagedDialog;

/**
 * @generated
 */
public class ManagedSystemCreateCommand extends EditElementCommand {

	private PhysicalNode physicalNode = null;

	/**
	* @generated
	*/
	public ManagedSystemCreateCommand(CreateElementRequest req) {
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
		// Uncomment to put "phantom" objects into the diagram file.		
		// org.eclipse.emf.ecore.resource.Resource resource = 
		// 		((org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest) getRequest()).getContainer().eResource();
		// if (resource == null) {
		// 	return null;
		// }
		Resource resource = getElementToEdit().eResource();
		patternGenerator.ManagedSystem newElement = patternGenerator.PatternGeneratorFactory.eINSTANCE
				.createManagedSystem();

		System.out.println("IN EDIT");
		if(PhysicalModel.getPhysicalNodes() == null || PhysicalModel.getPhysicalNodes().isEmpty())
			PhysicalModel.init();
		
		ManagedDialog dialog = new ManagedDialog(PhysicalModel.getNonSelectedNodes());
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		newElement.setName(dialog.getPhysicalNode().getName());
		newElement.getAttributes().addAll(dialog.getPhysicalNode().getAttributes());

		resource.getContents().add(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	* @generated
	*/
	protected void doConfigure(patternGenerator.ManagedSystem newElement, IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
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
