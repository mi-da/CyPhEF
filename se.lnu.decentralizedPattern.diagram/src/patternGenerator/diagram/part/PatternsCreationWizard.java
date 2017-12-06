package patternGenerator.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class PatternsCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected patternGenerator.diagram.part.PatternsCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected patternGenerator.diagram.part.PatternsCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(patternGenerator.diagram.part.Messages.PatternsCreationWizardTitle);
		setDefaultPageImageDescriptor(patternGenerator.diagram.part.PatternsDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDecentralizedPatternWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new patternGenerator.diagram.part.PatternsCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "patterngenerator_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(patternGenerator.diagram.part.Messages.PatternsCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				patternGenerator.diagram.part.Messages.PatternsCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new patternGenerator.diagram.part.PatternsCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "patterngenerator") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".patterngenerator_diagram".length()); //$NON-NLS-1$
					setFileName(patternGenerator.diagram.part.PatternsDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "patterngenerator")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(patternGenerator.diagram.part.Messages.PatternsCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				patternGenerator.diagram.part.Messages.PatternsCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = patternGenerator.diagram.part.PatternsDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						patternGenerator.diagram.part.PatternsDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								patternGenerator.diagram.part.Messages.PatternsCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						patternGenerator.diagram.part.Messages.PatternsCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
