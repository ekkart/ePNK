package geditor.diagram.part;

import geditor.GeditorPackage;
import geditor.Geometry;
import geditor.diagram.edit.parts.ArcEditPart;
import geditor.diagram.edit.parts.GeometryEditPart;
import geditor.diagram.edit.parts.Point2EditPart;
import geditor.diagram.edit.parts.PointEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GEditorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GEditor.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GeometryEditPart.MODEL_ID.equals(view.getType())) {
				return GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return geditor.diagram.part.GEditorVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GEditorDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeditorPackage.eINSTANCE.getGeometry().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Geometry) domainElement)) {
			return GeometryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = geditor.diagram.part.GEditorVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geditor.diagram.part.GEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (GeditorPackage.eINSTANCE.getPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return PointEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = geditor.diagram.part.GEditorVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geditor.diagram.part.GEditorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (PointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PointEditPart.VISUAL_ID:
			if (Point2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeditorPackage.eINSTANCE.getArc().isSuperTypeOf(
				domainElement.eClass())) {
			return ArcEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Geometry element) {
		return true;
	}

}
