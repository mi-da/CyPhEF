package patternGenerator.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PatternsNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4010;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof patternGenerator.diagram.navigator.PatternsNavigatorItem) {
			patternGenerator.diagram.navigator.PatternsNavigatorItem item = (patternGenerator.diagram.navigator.PatternsNavigatorItem) element;
			return patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
