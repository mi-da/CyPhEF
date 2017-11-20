package patternGenerator.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		patternGenerator.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		patternGenerator.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		patternGenerator.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		patternGenerator.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		patternGenerator.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return patternGenerator.diagram.part.PatternsDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
