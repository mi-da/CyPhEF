package patternGenerator.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
