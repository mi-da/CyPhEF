
package patternGenerator.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class PatternsPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createMasterSlave2Group());
		paletteRoot.add(createRegionalPlanning3Group());
		paletteRoot.add(createHierarchicalControl4Group());
		paletteRoot.add(createInformationSharingCoordinatedControl5Group());
	}

	/**
	* Creates "Default" palette tool group
	* @generated
	*/
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(patternGenerator.diagram.part.Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(patternGenerator.diagram.part.Messages.Default1Group_desc);
		paletteContainer.add(createManagedSystem1CreationTool());
		paletteContainer.add(createNode2CreationTool());
		paletteContainer.add(createInterComponentInteraction3CreationTool());
		paletteContainer.add(createReadWriteInteraction4CreationTool());
		paletteContainer.add(createDelegation5CreationTool());
		paletteContainer.add(createCoordination6CreationTool());
		paletteContainer.add(createMonitor7CreationTool());
		paletteContainer.add(createAnalyze8CreationTool());
		paletteContainer.add(createPlan9CreationTool());
		paletteContainer.add(createExecute10CreationTool());
		paletteContainer.add(createKnowledge11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Master/Slave" palette tool group
	* @generated
	*/
	private PaletteContainer createMasterSlave2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				patternGenerator.diagram.part.Messages.MasterSlave2Group_title);
		paletteContainer.setId("createMasterSlave2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(patternGenerator.diagram.part.Messages.MasterSlave2Group_desc);
		paletteContainer.add(createMaster1CreationTool());
		paletteContainer.add(createSlave2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Regional Planning" palette tool group
	* @generated
	*/
	private PaletteContainer createRegionalPlanning3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				patternGenerator.diagram.part.Messages.RegionalPlanning3Group_title);
		paletteContainer.setId("createRegionalPlanning3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(patternGenerator.diagram.part.Messages.RegionalPlanning3Group_desc);
		paletteContainer.add(createUnderlyingSubsystem1CreationTool());
		paletteContainer.add(createRegionalPlanner2CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Hierarchical Control" palette tool group
	* @generated
	*/
	private PaletteContainer createHierarchicalControl4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				patternGenerator.diagram.part.Messages.HierarchicalControl4Group_title);
		paletteContainer.setId("createHierarchicalControl4Group"); //$NON-NLS-1$
		paletteContainer.setDescription(patternGenerator.diagram.part.Messages.HierarchicalControl4Group_desc);
		paletteContainer.add(createHPeer1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Information Sharing/Coordinated Control" palette tool group
	* @generated
	*/
	private PaletteContainer createInformationSharingCoordinatedControl5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				patternGenerator.diagram.part.Messages.InformationSharingCoordinatedControl5Group_title);
		paletteContainer.setId("createInformationSharingCoordinatedControl5Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(patternGenerator.diagram.part.Messages.InformationSharingCoordinatedControl5Group_desc);
		paletteContainer.add(createPeer1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createManagedSystem1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.ManagedSystem1CreationTool_title,
				patternGenerator.diagram.part.Messages.ManagedSystem1CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009));
		entry.setId("createManagedSystem1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNode2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Node2CreationTool_title,
				patternGenerator.diagram.part.Messages.Node2CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Node_2006));
		entry.setId("createNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Node_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInterComponentInteraction3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				patternGenerator.diagram.part.Messages.InterComponentInteraction3CreationTool_title,
				patternGenerator.diagram.part.Messages.InterComponentInteraction3CreationTool_desc,
				Collections.singletonList(
						patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002));
		entry.setId("createInterComponentInteraction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes.getImageDescriptor(
				patternGenerator.diagram.providers.PatternsElementTypes.InterComponentInteraction_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReadWriteInteraction4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				patternGenerator.diagram.part.Messages.ReadWriteInteraction4CreationTool_title,
				patternGenerator.diagram.part.Messages.ReadWriteInteraction4CreationTool_desc,
				Collections.singletonList(
						patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006));
		entry.setId("createReadWriteInteraction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelegation5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				patternGenerator.diagram.part.Messages.Delegation5CreationTool_title,
				patternGenerator.diagram.part.Messages.Delegation5CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004));
		entry.setId("createDelegation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Delegation_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCoordination6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				patternGenerator.diagram.part.Messages.Coordination6CreationTool_title,
				patternGenerator.diagram.part.Messages.Coordination6CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003));
		entry.setId("createCoordination6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Coordination_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMonitor7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3006);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3012);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3017);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Monitor7CreationTool_title,
				patternGenerator.diagram.part.Messages.Monitor7CreationTool_desc, types);
		entry.setId("createMonitor7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Monitor_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAnalyze8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3007);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3013);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3018);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Analyze8CreationTool_title,
				patternGenerator.diagram.part.Messages.Analyze8CreationTool_desc, types);
		entry.setId("createAnalyze8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Analyze_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPlan9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3008);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3011);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3014);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Plan9CreationTool_title,
				patternGenerator.diagram.part.Messages.Plan9CreationTool_desc, types);
		entry.setId("createPlan9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Plan_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExecute10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3009);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3015);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3019);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Execute10CreationTool_title,
				patternGenerator.diagram.part.Messages.Execute10CreationTool_desc, types);
		entry.setId("createExecute10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Execute_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createKnowledge11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3010);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Knowledge11CreationTool_title,
				patternGenerator.diagram.part.Messages.Knowledge11CreationTool_desc, types);
		entry.setId("createKnowledge11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Knowledge_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMaster1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Master1CreationTool_title,
				patternGenerator.diagram.part.Messages.Master1CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Master_2003));
		entry.setId("createMaster1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Master_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSlave2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Slave2CreationTool_title,
				patternGenerator.diagram.part.Messages.Slave2CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001));
		entry.setId("createSlave2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUnderlyingSubsystem1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.UnderlyingSubsystem1CreationTool_title,
				patternGenerator.diagram.part.Messages.UnderlyingSubsystem1CreationTool_desc, Collections.singletonList(
						patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007));
		entry.setId("createUnderlyingSubsystem1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRegionalPlanner2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.RegionalPlanner2CreationTool_title,
				patternGenerator.diagram.part.Messages.RegionalPlanner2CreationTool_desc, Collections
						.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005));
		entry.setId("createRegionalPlanner2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHPeer1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.HPeer1CreationTool_title,
				patternGenerator.diagram.part.Messages.HPeer1CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010));
		entry.setId("createHPeer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPeer1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				patternGenerator.diagram.part.Messages.Peer1CreationTool_title,
				patternGenerator.diagram.part.Messages.Peer1CreationTool_desc,
				Collections.singletonList(patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004));
		entry.setId("createPeer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(patternGenerator.diagram.providers.PatternsElementTypes
				.getImageDescriptor(patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
