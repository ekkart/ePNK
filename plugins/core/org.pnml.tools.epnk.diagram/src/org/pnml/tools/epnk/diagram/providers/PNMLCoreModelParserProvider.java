package org.pnml.tools.epnk.diagram.providers;

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
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.parsers.MessageFormatParser;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * @generated
 */
public class PNMLCoreModelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser labelProxyText_5004Parser;

	/**
	 * @generated
	 */
	private IParser getLabelProxyText_5004Parser() {
		if (labelProxyText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PnmlcoremodelPackage.eINSTANCE
					.getLabelProxy_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelProxyText_5004Parser = parser;
		}
		return labelProxyText_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser pageLabelProxyText_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPageLabelProxyText_5003Parser() {
		if (pageLabelProxyText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PnmlcoremodelPackage.eINSTANCE
					.getPageLabelProxy_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pageLabelProxyText_5003Parser = parser;
		}
		return pageLabelProxyText_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LabelProxyTextEditPart.VISUAL_ID:
			return getLabelProxyText_5004Parser();
		case PageLabelProxyTextEditPart.VISUAL_ID:
			return getPageLabelProxyText_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PNMLCoreModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PNMLCoreModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PNMLCoreModelElementTypes.getElement(hint) == null) {
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
		@SuppressWarnings("unchecked")
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
