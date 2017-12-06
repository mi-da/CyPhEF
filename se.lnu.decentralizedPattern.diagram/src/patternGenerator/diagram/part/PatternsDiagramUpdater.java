package patternGenerator.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class PatternsDiagramUpdater {

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getSemanticChildren(View view) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			return getConcretePattern_1000SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getSlave_2001SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getMaster_2003SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getPeer_2004SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getRegionalPlanner_2005SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2006SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getUnderlyingSubsystem_2007SemanticChildren(view);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getHPeer_2010SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getConcretePattern_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.ConcretePattern modelElement = (patternGenerator.decentralizedPattern.ConcretePattern) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			patternGenerator.Element childElement = (patternGenerator.Element) it.next();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view,
					childElement) == patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement,
						patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getSlave_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.Slave modelElement = (patternGenerator.decentralizedPattern.Slave) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Monitor childElement = modelElement.getMonitor();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Execute childElement = modelElement.getExecute();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getMaster_2003SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.Master modelElement = (patternGenerator.decentralizedPattern.Master) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Analyze childElement = modelElement.getAnalyze();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Plan childElement = modelElement.getPlan();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Knowledge childElement = modelElement.getKnowledge();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getPeer_2004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.Peer modelElement = (patternGenerator.decentralizedPattern.Peer) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Monitor childElement = modelElement.getMonitor();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Analyze childElement = modelElement.getAnalyze();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Plan childElement = modelElement.getPlan();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Execute childElement = modelElement.getExecute();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Knowledge childElement = modelElement.getKnowledge();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getRegionalPlanner_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.RegionalPlanner modelElement = (patternGenerator.decentralizedPattern.RegionalPlanner) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Plan childElement = modelElement.getPlan();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getNode_2006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.Node modelElement = (patternGenerator.decentralizedPattern.Node) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Monitor childElement = modelElement.getMonitor();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Analyze childElement = modelElement.getAnalyze();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Plan childElement = modelElement.getPlan();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Execute childElement = modelElement.getExecute();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Knowledge childElement = modelElement.getKnowledge();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getUnderlyingSubsystem_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.UnderlyingSubsystem modelElement = (patternGenerator.decentralizedPattern.UnderlyingSubsystem) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Monitor childElement = modelElement.getMonitor();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Analyze childElement = modelElement.getAnalyze();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Execute childElement = modelElement.getExecute();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsNodeDescriptor> getHPeer_2010SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		patternGenerator.decentralizedPattern.HPeer modelElement = (patternGenerator.decentralizedPattern.HPeer) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsNodeDescriptor>();
		{
			patternGenerator.Monitor childElement = modelElement.getMonitor();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Analyze childElement = modelElement.getAnalyze();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Plan childElement = modelElement.getPlan();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		{
			patternGenerator.Execute childElement = modelElement.getExecute();
			int visualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID) {
				result.add(new patternGenerator.diagram.part.PatternsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedLinks(View view) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			return getConcretePattern_1000ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getSlave_2001ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getMaster_2003ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getPeer_2004ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getRegionalPlanner_2005ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2006ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getUnderlyingSubsystem_2007ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			return getManagedSystem_2009ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getHPeer_2010ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
			return getMonitor_3001ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
			return getExecute_3002ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3003ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_3004ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
			return getKnowledge_3005ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
			return getMonitor_3006ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
			return getAnalyze_3007ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
			return getPlan_3008ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
			return getExecute_3009ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
			return getKnowledge_3010ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
			return getPlan_3011ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
			return getMonitor_3012ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
			return getAnalyze_3013ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
			return getPlan_3014ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
			return getExecute_3015ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
			return getKnowledge_3016ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
			return getMonitor_3017ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
			return getAnalyze_3018ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
			return getExecute_3019ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
			return getMonitor_3020ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
			return getAnalyze_3021ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
			return getPlan_3022ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return getExecute_3023ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getInterComponentInteraction_4002ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getCoordination_4003ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4004ContainedLinks(view);
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getReadWriteInteraction_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingLinks(View view) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getSlave_2001IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getMaster_2003IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getPeer_2004IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getRegionalPlanner_2005IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2006IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getUnderlyingSubsystem_2007IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			return getManagedSystem_2009IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getHPeer_2010IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
			return getMonitor_3001IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
			return getExecute_3002IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3003IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_3004IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
			return getKnowledge_3005IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
			return getMonitor_3006IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
			return getAnalyze_3007IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
			return getPlan_3008IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
			return getExecute_3009IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
			return getKnowledge_3010IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
			return getPlan_3011IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
			return getMonitor_3012IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
			return getAnalyze_3013IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
			return getPlan_3014IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
			return getExecute_3015IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
			return getKnowledge_3016IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
			return getMonitor_3017IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
			return getAnalyze_3018IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
			return getExecute_3019IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
			return getMonitor_3020IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
			return getAnalyze_3021IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
			return getPlan_3022IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return getExecute_3023IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getInterComponentInteraction_4002IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getCoordination_4003IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4004IncomingLinks(view);
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getReadWriteInteraction_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingLinks(View view) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getSlave_2001OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getMaster_2003OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getPeer_2004OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getRegionalPlanner_2005OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2006OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getUnderlyingSubsystem_2007OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			return getManagedSystem_2009OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getHPeer_2010OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
			return getMonitor_3001OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
			return getExecute_3002OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3003OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_3004OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
			return getKnowledge_3005OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
			return getMonitor_3006OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
			return getAnalyze_3007OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
			return getPlan_3008OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
			return getExecute_3009OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
			return getKnowledge_3010OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
			return getPlan_3011OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
			return getMonitor_3012OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
			return getAnalyze_3013OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
			return getPlan_3014OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
			return getExecute_3015OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
			return getKnowledge_3016OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
			return getMonitor_3017OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
			return getAnalyze_3018OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
			return getExecute_3019OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
			return getMonitor_3020OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
			return getAnalyze_3021OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
			return getPlan_3022OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return getExecute_3023OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getInterComponentInteraction_4002OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getCoordination_4003OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4004OutgoingLinks(view);
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getReadWriteInteraction_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getConcretePattern_1000ContainedLinks(
			View view) {
		patternGenerator.decentralizedPattern.ConcretePattern modelElement = (patternGenerator.decentralizedPattern.ConcretePattern) view
				.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getSlave_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMaster_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPeer_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getRegionalPlanner_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getNode_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getUnderlyingSubsystem_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getManagedSystem_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getHPeer_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3001ContainedLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3002ContainedLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3006ContainedLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3009ContainedLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3012ContainedLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3015ContainedLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3017ContainedLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3019ContainedLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3020ContainedLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3023ContainedLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getInterComponentInteraction_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getCoordination_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getDelegation_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getReadWriteInteraction_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getSlave_2001IncomingLinks(View view) {
		patternGenerator.decentralizedPattern.Slave modelElement = (patternGenerator.decentralizedPattern.Slave) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMaster_2003IncomingLinks(View view) {
		patternGenerator.decentralizedPattern.Master modelElement = (patternGenerator.decentralizedPattern.Master) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPeer_2004IncomingLinks(View view) {
		patternGenerator.decentralizedPattern.Peer modelElement = (patternGenerator.decentralizedPattern.Peer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getRegionalPlanner_2005IncomingLinks(
			View view) {
		patternGenerator.decentralizedPattern.RegionalPlanner modelElement = (patternGenerator.decentralizedPattern.RegionalPlanner) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getNode_2006IncomingLinks(View view) {
		patternGenerator.decentralizedPattern.Node modelElement = (patternGenerator.decentralizedPattern.Node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getUnderlyingSubsystem_2007IncomingLinks(
			View view) {
		patternGenerator.decentralizedPattern.UnderlyingSubsystem modelElement = (patternGenerator.decentralizedPattern.UnderlyingSubsystem) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getManagedSystem_2009IncomingLinks(
			View view) {
		patternGenerator.ManagedSystem modelElement = (patternGenerator.ManagedSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getHPeer_2010IncomingLinks(View view) {
		patternGenerator.decentralizedPattern.HPeer modelElement = (patternGenerator.decentralizedPattern.HPeer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Monitor_Check_4007(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Execute_Act_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3001IncomingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3002IncomingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3006IncomingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3003IncomingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3004IncomingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3009IncomingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3005IncomingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3007IncomingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3008IncomingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3010IncomingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3012IncomingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3013IncomingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3011IncomingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3015IncomingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3016IncomingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3014IncomingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3017IncomingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3018IncomingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3019IncomingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3020IncomingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3021IncomingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3022IncomingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3023IncomingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Coordination_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Delegation_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getInterComponentInteraction_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getCoordination_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getDelegation_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getReadWriteInteraction_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getSlave_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMaster_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPeer_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getRegionalPlanner_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getNode_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getUnderlyingSubsystem_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getManagedSystem_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getHPeer_2010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3001OutgoingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3002OutgoingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3006OutgoingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3003OutgoingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3004OutgoingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3009OutgoingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3005OutgoingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3007OutgoingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3008OutgoingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3010OutgoingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3012OutgoingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3013OutgoingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3011OutgoingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3015OutgoingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getKnowledge_3016OutgoingLinks(View view) {
		patternGenerator.Knowledge modelElement = (patternGenerator.Knowledge) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3014OutgoingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3017OutgoingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3018OutgoingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3019OutgoingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getMonitor_3020OutgoingLinks(View view) {
		patternGenerator.Monitor modelElement = (patternGenerator.Monitor) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getAnalyze_3021OutgoingLinks(View view) {
		patternGenerator.Analyze modelElement = (patternGenerator.Analyze) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getPlan_3022OutgoingLinks(View view) {
		patternGenerator.Plan modelElement = (patternGenerator.Plan) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getExecute_3023OutgoingLinks(View view) {
		patternGenerator.Execute modelElement = (patternGenerator.Execute) view.getElement();
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Coordination_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Delegation_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Execute_Act_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getInterComponentInteraction_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getCoordination_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getDelegation_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<patternGenerator.diagram.part.PatternsLinkDescriptor> getReadWriteInteraction_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedTypeModelFacetLinks_InterComponentInteraction_4002(
			patternGenerator.DecentralizedControlPattern container) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.InterComponentInteraction) {
				continue;
			}
			patternGenerator.InterComponentInteraction link = (patternGenerator.InterComponentInteraction) linkObject;
			if (patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002,
					patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedTypeModelFacetLinks_Coordination_4003(
			patternGenerator.DecentralizedControlPattern container) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.Coordination) {
				continue;
			}
			patternGenerator.Coordination link = (patternGenerator.Coordination) linkObject;
			if (patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003,
					patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedTypeModelFacetLinks_Delegation_4004(
			patternGenerator.DecentralizedControlPattern container) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.Delegation) {
				continue;
			}
			patternGenerator.Delegation link = (patternGenerator.Delegation) linkObject;
			if (patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004,
					patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedTypeModelFacetLinks_ReadWriteInteraction_4006(
			patternGenerator.DecentralizedControlPattern container) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.ReadWriteInteraction) {
				continue;
			}
			patternGenerator.ReadWriteInteraction link = (patternGenerator.ReadWriteInteraction) linkObject;
			if (patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006,
					patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingTypeModelFacetLinks_InterComponentInteraction_4002(
			patternGenerator.MapeComponent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getInteraction_Target()
					|| false == setting.getEObject() instanceof patternGenerator.InterComponentInteraction) {
				continue;
			}
			patternGenerator.InterComponentInteraction link = (patternGenerator.InterComponentInteraction) setting
					.getEObject();
			if (patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, target, link,
					patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002,
					patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingTypeModelFacetLinks_Coordination_4003(
			patternGenerator.MapeComponent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getInteraction_Target()
					|| false == setting.getEObject() instanceof patternGenerator.Coordination) {
				continue;
			}
			patternGenerator.Coordination link = (patternGenerator.Coordination) setting.getEObject();
			if (patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, target, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003,
					patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingTypeModelFacetLinks_Delegation_4004(
			patternGenerator.MapeComponent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getInteraction_Target() || false == setting.getEObject() instanceof patternGenerator.Delegation) {
				continue;
			}
			patternGenerator.Delegation link = (patternGenerator.Delegation) setting.getEObject();
			if (patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, target, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004,
					patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingTypeModelFacetLinks_ReadWriteInteraction_4006(
			patternGenerator.MapeComponent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getInteraction_Target()
					|| false == setting.getEObject() instanceof patternGenerator.ReadWriteInteraction) {
				continue;
			}
			patternGenerator.ReadWriteInteraction link = (patternGenerator.ReadWriteInteraction) setting.getEObject();
			if (patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent src = link.getContext();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, target, link,
					patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006,
					patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingFeatureModelFacetLinks_Monitor_Check_4007(
			patternGenerator.Subsystem target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getMonitor_Check()) {
				result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(setting.getEObject(), target,
						patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007,
						patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingFeatureModelFacetLinks_Execute_Act_4008(
			patternGenerator.Subsystem target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == patternGenerator.PatternGeneratorPackage.eINSTANCE
					.getExecute_Act()) {
				result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(setting.getEObject(), target,
						patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008,
						patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingTypeModelFacetLinks_InterComponentInteraction_4002(
			patternGenerator.MapeComponent source) {
		patternGenerator.DecentralizedControlPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof patternGenerator.DecentralizedControlPattern) {
				container = (patternGenerator.DecentralizedControlPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.InterComponentInteraction) {
				continue;
			}
			patternGenerator.InterComponentInteraction link = (patternGenerator.InterComponentInteraction) linkObject;
			if (patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			if (src != source) {
				continue;
			}
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002,
					patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingTypeModelFacetLinks_Coordination_4003(
			patternGenerator.MapeComponent source) {
		patternGenerator.DecentralizedControlPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof patternGenerator.DecentralizedControlPattern) {
				container = (patternGenerator.DecentralizedControlPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.Coordination) {
				continue;
			}
			patternGenerator.Coordination link = (patternGenerator.Coordination) linkObject;
			if (patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			if (src != source) {
				continue;
			}
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003,
					patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingTypeModelFacetLinks_Delegation_4004(
			patternGenerator.MapeComponent source) {
		patternGenerator.DecentralizedControlPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof patternGenerator.DecentralizedControlPattern) {
				container = (patternGenerator.DecentralizedControlPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.Delegation) {
				continue;
			}
			patternGenerator.Delegation link = (patternGenerator.Delegation) linkObject;
			if (patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			if (src != source) {
				continue;
			}
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004,
					patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingTypeModelFacetLinks_ReadWriteInteraction_4006(
			patternGenerator.MapeComponent source) {
		patternGenerator.DecentralizedControlPattern container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof patternGenerator.DecentralizedControlPattern) {
				container = (patternGenerator.DecentralizedControlPattern) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> links = container.getElements().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof patternGenerator.ReadWriteInteraction) {
				continue;
			}
			patternGenerator.ReadWriteInteraction link = (patternGenerator.ReadWriteInteraction) linkObject;
			if (patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID != patternGenerator.diagram.part.PatternsVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			patternGenerator.MapeComponent dst = link.getTarget();
			patternGenerator.MapeComponent src = link.getContext();
			if (src != source) {
				continue;
			}
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(src, dst, link,
					patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006,
					patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingFeatureModelFacetLinks_Monitor_Check_4007(
			patternGenerator.Monitor source) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> destinations = source.getCheck().iterator(); destinations.hasNext();) {
			patternGenerator.Subsystem destination = (patternGenerator.Subsystem) destinations.next();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(source, destination,
					patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007,
					patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingFeatureModelFacetLinks_Execute_Act_4008(
			patternGenerator.Execute source) {
		LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor> result = new LinkedList<patternGenerator.diagram.part.PatternsLinkDescriptor>();
		for (Iterator<?> destinations = source.getAct().iterator(); destinations.hasNext();) {
			patternGenerator.Subsystem destination = (patternGenerator.Subsystem) destinations.next();
			result.add(new patternGenerator.diagram.part.PatternsLinkDescriptor(source, destination,
					patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008,
					patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<patternGenerator.diagram.part.PatternsNodeDescriptor> getSemanticChildren(View view) {
			return PatternsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<patternGenerator.diagram.part.PatternsLinkDescriptor> getContainedLinks(View view) {
			return PatternsDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<patternGenerator.diagram.part.PatternsLinkDescriptor> getIncomingLinks(View view) {
			return PatternsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<patternGenerator.diagram.part.PatternsLinkDescriptor> getOutgoingLinks(View view) {
			return PatternsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
