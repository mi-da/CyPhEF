package patternGenerator.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class PatternsNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PatternsNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<patternGenerator.diagram.navigator.PatternsNavigatorItem> result = new ArrayList<patternGenerator.diagram.navigator.PatternsNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof patternGenerator.diagram.navigator.PatternsNavigatorGroup) {
			patternGenerator.diagram.navigator.PatternsNavigatorGroup group = (patternGenerator.diagram.navigator.PatternsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof patternGenerator.diagram.navigator.PatternsNavigatorItem) {
			patternGenerator.diagram.navigator.PatternsNavigatorItem navigatorItem = (patternGenerator.diagram.navigator.PatternsNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {

		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup links = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ConcretePattern_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Slave_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Master_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Peer_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_RegionalPlanner_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Node_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_UnderlyingSubsystem_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ManagedSystem_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_HPeer_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Knowledge_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Monitor_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Analyze_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Plan_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Node sv = (Node) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup incominglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup outgoinglinks = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Execute_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_InterComponentInteraction_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_InterComponentInteraction_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Coordination_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Coordination_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Delegation_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_Delegation_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ReadWriteInteraction_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ReadWriteInteraction_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_MonitorCheck_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_MonitorCheck_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID: {
			LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem> result = new LinkedList<patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			patternGenerator.diagram.navigator.PatternsNavigatorGroup target = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ExecuteAct_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			patternGenerator.diagram.navigator.PatternsNavigatorGroup source = new patternGenerator.diagram.navigator.PatternsNavigatorGroup(
					patternGenerator.diagram.part.Messages.NavigatorGroupName_ExecuteAct_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					patternGenerator.diagram.part.PatternsVisualIDRegistry
							.getType(patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID
				.equals(patternGenerator.diagram.part.PatternsVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<patternGenerator.diagram.navigator.PatternsNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<patternGenerator.diagram.navigator.PatternsNavigatorItem> result = new ArrayList<patternGenerator.diagram.navigator.PatternsNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new patternGenerator.diagram.navigator.PatternsNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem) {
			patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem abstractNavigatorItem = (patternGenerator.diagram.navigator.PatternsAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
