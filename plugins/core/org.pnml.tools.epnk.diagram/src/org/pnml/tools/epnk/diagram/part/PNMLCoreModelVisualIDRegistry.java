package org.pnml.tools.epnk.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyTextEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefTransitionEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.TransitionEditPart;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PNMLCoreModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.pnml.tools.epnk.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PageEditPart.MODEL_ID.equals(view.getType())) {
				return PageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated NOT
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			// eki: needed to make this more defensive
			// view = (View) view.eContainer();
			EObject object = view.eContainer();
			if (object == null || !(object instanceof View)) {
				return null;
			}
			view = (View) object;
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
				PNMLCoreModelDiagramEditorPlugin.getInstance().logError(
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
		if (PnmlcoremodelPackage.eINSTANCE.getPage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Page) domainElement)) {
			return PageEditPart.VISUAL_ID;
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
		String containerModelID = org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry
				.getModelID(containerView);
		if (!PageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PageEditPart.VISUAL_ID:
			if (PnmlcoremodelPackage.eINSTANCE.getPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return PlaceEditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getRefPlace().isSuperTypeOf(
					domainElement.eClass())) {
				return RefPlaceEditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())) {
				return TransitionEditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getPage().isSuperTypeOf(
					domainElement.eClass())) {
				return Page2EditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getRefTransition()
					.isSuperTypeOf(domainElement.eClass())) {
				return RefTransitionEditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getLabelProxy().isSuperTypeOf(
					domainElement.eClass())) {
				return LabelProxyEditPart.VISUAL_ID;
			}
			if (PnmlcoremodelPackage.eINSTANCE.getPageLabelProxy()
					.isSuperTypeOf(domainElement.eClass())) {
				return PageLabelProxyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry
				.getModelID(containerView);
		if (!PageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PageEditPart.VISUAL_ID:
			if (PlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RefPlaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Page2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RefTransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelProxyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PageLabelProxyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelProxyEditPart.VISUAL_ID:
			if (LabelProxyTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PageLabelProxyEditPart.VISUAL_ID:
			if (PageLabelProxyTextEditPart.VISUAL_ID == nodeVisualID) {
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
		if (PnmlcoremodelPackage.eINSTANCE.getArc().isSuperTypeOf(
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
	private static boolean isDiagram(Page element) {
		return true;
	}

}
