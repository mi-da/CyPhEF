package patternGenerator.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ExecuteActItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ExecuteActItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.ExecuteAct_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
