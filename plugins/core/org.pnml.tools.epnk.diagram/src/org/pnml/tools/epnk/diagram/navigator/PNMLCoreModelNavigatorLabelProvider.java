package org.pnml.tools.epnk.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyObjectEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefTransitionEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.TransitionEditPart;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelParserProvider;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * @generated
 */
public class PNMLCoreModelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PNMLCoreModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PNMLCoreModelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PNMLCoreModelNavigatorItem
				&& !isOwnView(((PNMLCoreModelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PNMLCoreModelNavigatorGroup) {
			PNMLCoreModelNavigatorGroup group = (PNMLCoreModelNavigatorGroup) element;
			return PNMLCoreModelDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof PNMLCoreModelNavigatorItem) {
			PNMLCoreModelNavigatorItem navigatorItem = (PNMLCoreModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?Place", PNMLCoreModelElementTypes.Place_2001); //$NON-NLS-1$
		case LabelProxyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?LabelProxy", PNMLCoreModelElementTypes.LabelProxy_2009); //$NON-NLS-1$
		case ArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://org.pnml.tools/epnk/pnmlcoremodel?Arc", PNMLCoreModelElementTypes.Arc_4001); //$NON-NLS-1$
		case RefTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?RefTransition", PNMLCoreModelElementTypes.RefTransition_2005); //$NON-NLS-1$
		case PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://org.pnml.tools/epnk/pnmlcoremodel?Page", PNMLCoreModelElementTypes.Page_1000); //$NON-NLS-1$
		case LabelProxyObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://org.pnml.tools/epnk/pnmlcoremodel?LabelProxy?object", PNMLCoreModelElementTypes.LabelProxyObject_4004); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?Transition", PNMLCoreModelElementTypes.Transition_2003); //$NON-NLS-1$
		case PageLabelProxyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?PageLabelProxy", PNMLCoreModelElementTypes.PageLabelProxy_2008); //$NON-NLS-1$
		case RefPlaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?RefPlace", PNMLCoreModelElementTypes.RefPlace_2002); //$NON-NLS-1$
		case Page2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.pnml.tools/epnk/pnmlcoremodel?Page", PNMLCoreModelElementTypes.Page_2004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PNMLCoreModelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PNMLCoreModelElementTypes.isKnownElementType(elementType)) {
			image = PNMLCoreModelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof PNMLCoreModelNavigatorGroup) {
			PNMLCoreModelNavigatorGroup group = (PNMLCoreModelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PNMLCoreModelNavigatorItem) {
			PNMLCoreModelNavigatorItem navigatorItem = (PNMLCoreModelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001Text(view);
		case LabelProxyEditPart.VISUAL_ID:
			return getLabelProxy_2009Text(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001Text(view);
		case RefTransitionEditPart.VISUAL_ID:
			return getRefTransition_2005Text(view);
		case PageEditPart.VISUAL_ID:
			return getPage_1000Text(view);
		case LabelProxyObjectEditPart.VISUAL_ID:
			return getLabelProxyObject_4004Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2003Text(view);
		case PageLabelProxyEditPart.VISUAL_ID:
			return getPageLabelProxy_2008Text(view);
		case RefPlaceEditPart.VISUAL_ID:
			return getRefPlace_2002Text(view);
		case Page2EditPart.VISUAL_ID:
			return getPage_2004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPage_1000Text(View view) {
		Page domainModelElement = (Page) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlace_2001Text(View view) {
		Place domainModelElement = (Place) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRefPlace_2002Text(View view) {
		RefPlace domainModelElement = (RefPlace) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2003Text(View view) {
		Transition domainModelElement = (Transition) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2004Text(View view) {
		Page domainModelElement = (Page) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRefTransition_2005Text(View view) {
		RefTransition domainModelElement = (RefTransition) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLabelProxy_2009Text(View view) {
		IParser parser = PNMLCoreModelParserProvider.getParser(
				PNMLCoreModelElementTypes.LabelProxy_2009,
				view.getElement() != null ? view.getElement() : view,
				PNMLCoreModelVisualIDRegistry
						.getType(LabelProxyTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPageLabelProxy_2008Text(View view) {
		IParser parser = PNMLCoreModelParserProvider.getParser(
				PNMLCoreModelElementTypes.PageLabelProxy_2008, view
						.getElement() != null ? view.getElement() : view,
				PNMLCoreModelVisualIDRegistry
						.getType(PageLabelProxyTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArc_4001Text(View view) {
		Arc domainModelElement = (Arc) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLabelProxyObject_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PageEditPart.MODEL_ID.equals(PNMLCoreModelVisualIDRegistry
				.getModelID(view));
	}

}
