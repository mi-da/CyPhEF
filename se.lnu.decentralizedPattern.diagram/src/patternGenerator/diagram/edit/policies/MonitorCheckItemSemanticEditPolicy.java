package patternGenerator.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class MonitorCheckItemSemanticEditPolicy
		extends patternGenerator.diagram.edit.policies.PatternsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MonitorCheckItemSemanticEditPolicy() {
		super(patternGenerator.diagram.providers.PatternsElementTypes.MonitorCheck_4007);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
