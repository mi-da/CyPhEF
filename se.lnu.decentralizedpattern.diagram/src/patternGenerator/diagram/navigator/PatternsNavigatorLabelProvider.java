package patternGenerator.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class PatternsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorItem
				&& !isOwnView(((patternGenerator.diagram.navigator.PatternsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorGroup) {
			patternGenerator.diagram.navigator.PatternsNavigatorGroup group = (patternGenerator.diagram.navigator.PatternsNavigatorGroup) element;
			return patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorItem) {
			patternGenerator.diagram.navigator.PatternsNavigatorItem navigatorItem = (patternGenerator.diagram.navigator.PatternsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.example.org/patternGenerator/decentralizedPattern?ConcretePattern", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.ConcretePattern_1000);
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?Slave", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?Master", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Master_2003);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?Peer", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?RegionalPlanner", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?Node", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Node_2006);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?UnderlyingSubsystem", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007);
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/patternGenerator?ManagedSystem", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/patternGenerator/decentralizedPattern?HPeer", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010);
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Monitor", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Execute", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Analyze", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Plan", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Knowledge", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Monitor", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Analyze", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Plan", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Execute", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Knowledge", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Plan", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Monitor", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Analyze", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Plan", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Execute", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Knowledge", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Monitor", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Analyze", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Execute", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Monitor", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Analyze", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Plan", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/patternGenerator?Execute", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?InterComponentInteraction", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002);
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?Coordination", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003);
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?Delegation", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004);
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?ReadWriteInteraction", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
		case patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?Monitor?check", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007);
		case patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/patternGenerator?Execute?act", //$NON-NLS-1$
					patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& patternGenerator.diagram.providers.PatternsElementTypes.isKnownElementType(elementType)) {
			image = patternGenerator.diagram.providers.PatternsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorGroup) {
			patternGenerator.diagram.navigator.PatternsNavigatorGroup group = (patternGenerator.diagram.navigator.PatternsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorItem) {
			patternGenerator.diagram.navigator.PatternsNavigatorItem navigatorItem = (patternGenerator.diagram.navigator.PatternsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view)) {
		case patternGenerator.diagram.edit.parts.ConcretePatternEditPart.VISUAL_ID:
			return getConcretePattern_1000Text(view);
		case patternGenerator.diagram.edit.parts.SlaveEditPart.VISUAL_ID:
			return getSlave_2001Text(view);
		case patternGenerator.diagram.edit.parts.MasterEditPart.VISUAL_ID:
			return getMaster_2003Text(view);
		case patternGenerator.diagram.edit.parts.PeerEditPart.VISUAL_ID:
			return getPeer_2004Text(view);
		case patternGenerator.diagram.edit.parts.RegionalPlannerEditPart.VISUAL_ID:
			return getRegionalPlanner_2005Text(view);
		case patternGenerator.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2006Text(view);
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemEditPart.VISUAL_ID:
			return getUnderlyingSubsystem_2007Text(view);
		case patternGenerator.diagram.edit.parts.ManagedSystemEditPart.VISUAL_ID:
			return getManagedSystem_2009Text(view);
		case patternGenerator.diagram.edit.parts.HPeerEditPart.VISUAL_ID:
			return getHPeer_2010Text(view);
		case patternGenerator.diagram.edit.parts.MonitorEditPart.VISUAL_ID:
			return getMonitor_3001Text(view);
		case patternGenerator.diagram.edit.parts.ExecuteEditPart.VISUAL_ID:
			return getExecute_3002Text(view);
		case patternGenerator.diagram.edit.parts.AnalyzeEditPart.VISUAL_ID:
			return getAnalyze_3003Text(view);
		case patternGenerator.diagram.edit.parts.PlanEditPart.VISUAL_ID:
			return getPlan_3004Text(view);
		case patternGenerator.diagram.edit.parts.KnowledgeEditPart.VISUAL_ID:
			return getKnowledge_3005Text(view);
		case patternGenerator.diagram.edit.parts.Monitor2EditPart.VISUAL_ID:
			return getMonitor_3006Text(view);
		case patternGenerator.diagram.edit.parts.Analyze2EditPart.VISUAL_ID:
			return getAnalyze_3007Text(view);
		case patternGenerator.diagram.edit.parts.Plan2EditPart.VISUAL_ID:
			return getPlan_3008Text(view);
		case patternGenerator.diagram.edit.parts.Execute2EditPart.VISUAL_ID:
			return getExecute_3009Text(view);
		case patternGenerator.diagram.edit.parts.Knowledge2EditPart.VISUAL_ID:
			return getKnowledge_3010Text(view);
		case patternGenerator.diagram.edit.parts.Plan3EditPart.VISUAL_ID:
			return getPlan_3011Text(view);
		case patternGenerator.diagram.edit.parts.Monitor3EditPart.VISUAL_ID:
			return getMonitor_3012Text(view);
		case patternGenerator.diagram.edit.parts.Analyze3EditPart.VISUAL_ID:
			return getAnalyze_3013Text(view);
		case patternGenerator.diagram.edit.parts.Plan4EditPart.VISUAL_ID:
			return getPlan_3014Text(view);
		case patternGenerator.diagram.edit.parts.Execute3EditPart.VISUAL_ID:
			return getExecute_3015Text(view);
		case patternGenerator.diagram.edit.parts.Knowledge3EditPart.VISUAL_ID:
			return getKnowledge_3016Text(view);
		case patternGenerator.diagram.edit.parts.Monitor4EditPart.VISUAL_ID:
			return getMonitor_3017Text(view);
		case patternGenerator.diagram.edit.parts.Analyze4EditPart.VISUAL_ID:
			return getAnalyze_3018Text(view);
		case patternGenerator.diagram.edit.parts.Execute4EditPart.VISUAL_ID:
			return getExecute_3019Text(view);
		case patternGenerator.diagram.edit.parts.Monitor5EditPart.VISUAL_ID:
			return getMonitor_3020Text(view);
		case patternGenerator.diagram.edit.parts.Analyze5EditPart.VISUAL_ID:
			return getAnalyze_3021Text(view);
		case patternGenerator.diagram.edit.parts.Plan5EditPart.VISUAL_ID:
			return getPlan_3022Text(view);
		case patternGenerator.diagram.edit.parts.Execute5EditPart.VISUAL_ID:
			return getExecute_3023Text(view);
		case patternGenerator.diagram.edit.parts.InterComponentInteractionEditPart.VISUAL_ID:
			return getInterComponentInteraction_4002Text(view);
		case patternGenerator.diagram.edit.parts.CoordinationEditPart.VISUAL_ID:
			return getCoordination_4003Text(view);
		case patternGenerator.diagram.edit.parts.DelegationEditPart.VISUAL_ID:
			return getDelegation_4004Text(view);
		case patternGenerator.diagram.edit.parts.ReadWriteInteractionEditPart.VISUAL_ID:
			return getReadWriteInteraction_4006Text(view);
		case patternGenerator.diagram.edit.parts.MonitorCheckEditPart.VISUAL_ID:
			return getMonitorCheck_4007Text(view);
		case patternGenerator.diagram.edit.parts.ExecuteActEditPart.VISUAL_ID:
			return getExecuteAct_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getConcretePattern_1000Text(View view) {
		patternGenerator.decentralizedPattern.ConcretePattern domainModelElement = (patternGenerator.decentralizedPattern.ConcretePattern) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getType());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSlave_2001Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.SlaveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMaster_2003Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.Master_2003,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.MasterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPeer_2004Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.PeerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRegionalPlanner_2005Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.RegionalPlannerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNode_2006Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.Node_2006,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnderlyingSubsystem_2007Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.UnderlyingSubsystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getManagedSystem_2009Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.ManagedSystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHPeer_2010Text(View view) {
		IParser parser = patternGenerator.diagram.providers.PatternsParserProvider.getParser(
				patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010,
				view.getElement() != null ? view.getElement() : view,
				patternGenerator.diagram.part.PatternsVisualIDRegistry
						.getType(patternGenerator.diagram.edit.parts.HPeerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMonitor_3001Text(View view) {
		patternGenerator.Monitor domainModelElement = (patternGenerator.Monitor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedCheck());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExecute_3002Text(View view) {
		patternGenerator.Execute domainModelElement = (patternGenerator.Execute) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedAct());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPlan_3004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getKnowledge_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getMonitor_3006Text(View view) {
		patternGenerator.Monitor domainModelElement = (patternGenerator.Monitor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedCheck());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPlan_3008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExecute_3009Text(View view) {
		patternGenerator.Execute domainModelElement = (patternGenerator.Execute) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedAct());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKnowledge_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPlan_3011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getMonitor_3012Text(View view) {
		patternGenerator.Monitor domainModelElement = (patternGenerator.Monitor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedCheck());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPlan_3014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExecute_3015Text(View view) {
		patternGenerator.Execute domainModelElement = (patternGenerator.Execute) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedAct());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getKnowledge_3016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getMonitor_3017Text(View view) {
		patternGenerator.Monitor domainModelElement = (patternGenerator.Monitor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedCheck());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExecute_3019Text(View view) {
		patternGenerator.Execute domainModelElement = (patternGenerator.Execute) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedAct());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMonitor_3020Text(View view) {
		patternGenerator.Monitor domainModelElement = (patternGenerator.Monitor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedCheck());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAnalyze_3021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPlan_3022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExecute_3023Text(View view) {
		patternGenerator.Execute domainModelElement = (patternGenerator.Execute) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isHasOneManagedAct());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 3023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInterComponentInteraction_4002Text(View view) {
		patternGenerator.InterComponentInteraction domainModelElement = (patternGenerator.InterComponentInteraction) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isTargetAndContextNotNull());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCoordination_4003Text(View view) {
		patternGenerator.Coordination domainModelElement = (patternGenerator.Coordination) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isTargetAndContextNotNull());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDelegation_4004Text(View view) {
		patternGenerator.Delegation domainModelElement = (patternGenerator.Delegation) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isTargetAndContextNotNull());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReadWriteInteraction_4006Text(View view) {
		patternGenerator.ReadWriteInteraction domainModelElement = (patternGenerator.ReadWriteInteraction) view
				.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.isTargetAndContextNotNull());
		} else {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMonitorCheck_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getExecuteAct_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return patternGenerator.diagram.edit.parts.ConcretePatternEditPart.MODEL_ID
				.equals(patternGenerator.diagram.part.PatternsVisualIDRegistry.getModelID(view));
	}

}
