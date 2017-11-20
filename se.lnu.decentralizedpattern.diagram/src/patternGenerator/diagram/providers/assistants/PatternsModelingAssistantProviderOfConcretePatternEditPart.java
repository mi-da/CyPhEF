package patternGenerator.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PatternsModelingAssistantProviderOfConcretePatternEditPart
		extends patternGenerator.diagram.providers.PatternsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Slave_2001);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Master_2003);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Peer_2004);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.RegionalPlanner_2005);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.Node_2006);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.UnderlyingSubsystem_2007);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.ManagedSystem_2009);
		types.add(patternGenerator.diagram.providers.PatternsElementTypes.HPeer_2010);
		return types;
	}

}
