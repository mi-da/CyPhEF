package patternGenerator.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PatternsVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "se.lnu.decentralizedPattern.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID.equals(view.getType())) {
				return patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getConcretePattern()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((patternGenerator.decentralizedPattern.ConcretePattern) domainElement)) {
			return patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getModelID(containerView);
		if (!patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getSlave()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getMaster()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getPeer()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getRegionalPlanner()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getUnderlyingSubsystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagedSystem()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID;
			}
			if (patternGenerator.decentralizedPattern.DecentralizedPatternPackage.eINSTANCE.getHPeer()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getMonitor().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getExecute().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getPlan().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getKnowledge()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getMonitor().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getPlan().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getExecute().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getKnowledge()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getPlan().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getMonitor().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getPlan().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getExecute().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getKnowledge()
					.isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getMonitor().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getExecute().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID;
			}
			break;
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getMonitor().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getAnalyze().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getPlan().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID;
			}
			if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getExecute().isSuperTypeOf(domainElement.eClass())) {
				return patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getModelID(containerView);
		if (!patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.SlaveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.MasterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.PeerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.RegionalPlannerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.UnderlyingSubsystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.ManagedSystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			if (patternGenerator.diagram.edit.parts.HPeerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getInterComponentInteraction()
				.isSuperTypeOf(domainElement.eClass())) {
			return patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID;
		}
		if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getCoordination()
				.isSuperTypeOf(domainElement.eClass())) {
			return patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID;
		}
		if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getDelegation().isSuperTypeOf(domainElement.eClass())) {
			return patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID;
		}
		if (patternGenerator.PatternGeneratorPackage.eINSTANCE.getReadWriteInteraction()
				.isSuperTypeOf(domainElement.eClass())) {
			return patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(patternGenerator.decentralizedPattern.ConcretePattern element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			return false;
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
