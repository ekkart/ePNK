package geditor.diagram.navigator;

import geditor.Arc;
import geditor.Geometry;
import geditor.Line;
import geditor.Point;
import geditor.diagram.edit.parts.ArcEditPart;
import geditor.diagram.edit.parts.GeometryEditPart;
import geditor.diagram.edit.parts.Point2EditPart;
import geditor.diagram.edit.parts.PointEditPart;
import geditor.diagram.part.GEditorDiagramEditorPlugin;
import geditor.diagram.part.GEditorVisualIDRegistry;
import geditor.diagram.providers.GEditorElementTypes;

import geditor.diagram.providers.GEditorParserProvider;
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

/**
 * @generated
 */
public class GEditorNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GEditorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GEditorNavigatorItem
				&& !isOwnView(((GEditorNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GEditorNavigatorGroup) {
			GEditorNavigatorGroup group = (GEditorNavigatorGroup) element;
			return GEditorDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GEditorNavigatorItem) {
			GEditorNavigatorItem navigatorItem = (GEditorNavigatorItem) element;
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
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://geditor/1.0?Geometry", GEditorElementTypes.Geometry_1000); //$NON-NLS-1$
		case ArcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geditor/1.0?Arc", GEditorElementTypes.Arc_4001); //$NON-NLS-1$
		case PointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geditor/1.0?Point", GEditorElementTypes.Point_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GEditorDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GEditorElementTypes.isKnownElementType(elementType)) {
			image = GEditorElementTypes.getImage(elementType);
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
		if (element instanceof GEditorNavigatorGroup) {
			GEditorNavigatorGroup group = (GEditorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GEditorNavigatorItem) {
			GEditorNavigatorItem navigatorItem = (GEditorNavigatorItem) element;
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
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001Text(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArc_4001Text(View view) {
		Arc domainModelElement = (Arc) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			GEditorDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPoint_2001Text(View view) {
		IParser parser = GEditorParserProvider.getParser(
				GEditorElementTypes.Point_2001,
				view.getElement() != null ? view.getElement() : view,
				GEditorVisualIDRegistry.getType(Point2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GEditorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGeometry_1000Text(View view) {
		Geometry domainModelElement = (Geometry) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getGlobalAppearancePath();
		} else {
			GEditorDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return GeometryEditPart.MODEL_ID.equals(GEditorVisualIDRegistry
				.getModelID(view));
	}

}
