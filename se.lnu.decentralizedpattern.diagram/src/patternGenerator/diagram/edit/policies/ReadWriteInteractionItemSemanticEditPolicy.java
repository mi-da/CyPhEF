package patternGenerator.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ReadWriteInteractionItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ReadWriteInteractionItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.ReadWriteInteraction_4006);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
