package patternGenerator.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PatternsParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser slaveName_5001Parser;

	/**
	* @generated
	*/
	private IParser getSlaveName_5001Parser() {
		if (slaveName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			slaveName_5001Parser = parser;
		}
		return slaveName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser masterName_5003Parser;

	/**
	* @generated
	*/
	private IParser getMasterName_5003Parser() {
		if (masterName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			masterName_5003Parser = parser;
		}
		return masterName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser peerName_5004Parser;

	/**
	* @generated
	*/
	private IParser getPeerName_5004Parser() {
		if (peerName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			peerName_5004Parser = parser;
		}
		return peerName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser regionalPlannerName_5005Parser;

	/**
	* @generated
	*/
	private IParser getRegionalPlannerName_5005Parser() {
		if (regionalPlannerName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			regionalPlannerName_5005Parser = parser;
		}
		return regionalPlannerName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser nodeName_5006Parser;

	/**
	* @generated
	*/
	private IParser getNodeName_5006Parser() {
		if (nodeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			nodeName_5006Parser = parser;
		}
		return nodeName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser underlyingSubsystemName_5007Parser;

	/**
	* @generated
	*/
	private IParser getUnderlyingSubsystemName_5007Parser() {
		if (underlyingSubsystemName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			underlyingSubsystemName_5007Parser = parser;
		}
		return underlyingSubsystemName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser managedSystemName_5009Parser;

	/**
	* @generated
	*/
	private IParser getManagedSystemName_5009Parser() {
		if (managedSystemName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagedSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagedSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			managedSystemName_5009Parser = parser;
		}
		return managedSystemName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser hPeerName_5010Parser;

	/**
	* @generated
	*/
	private IParser getHPeerName_5010Parser() {
		if (hPeerName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			EAttribute[] editableFeatures = new EAttribute[] {
					patternGenerator.PatternGeneratorPackage.eINSTANCE.getManagingSystem_Name() };
			patternGenerator.diagram.parsers.MessageFormatParser parser = new patternGenerator.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			hPeerName_5010Parser = parser;
		}
		return hPeerName_5010Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case patternGenerator.diagram.edit.parts.SlaveNameEditPart.VISUAL_ID:
			return getSlaveName_5001Parser();
		case patternGenerator.diagram.edit.parts.MasterNameEditPart.VISUAL_ID:
			return getMasterName_5003Parser();
		case patternGenerator.diagram.edit.parts.PeerNameEditPart.VISUAL_ID:
			return getPeerName_5004Parser();
		case patternGenerator.diagram.edit.parts.RegionalPlannerNameEditPart.VISUAL_ID:
			return getRegionalPlannerName_5005Parser();
		case patternGenerator.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
			return getNodeName_5006Parser();
		case patternGenerator.diagram.edit.parts.UnderlyingSubsystemNameEditPart.VISUAL_ID:
			return getUnderlyingSubsystemName_5007Parser();
		case patternGenerator.diagram.edit.parts.ManagedSystemNameEditPart.VISUAL_ID:
			return getManagedSystemName_5009Parser();
		case patternGenerator.diagram.edit.parts.HPeerNameEditPart.VISUAL_ID:
			return getHPeerName_5010Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(patternGenerator.diagram.part.PatternsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (patternGenerator.diagram.providers.PatternsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
