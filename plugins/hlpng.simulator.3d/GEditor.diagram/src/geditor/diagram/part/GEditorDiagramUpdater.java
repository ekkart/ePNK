package geditor.diagram.part;

import geditor.Arc;
import geditor.GObject;
import geditor.GeditorPackage;
import geditor.Geometry;
import geditor.Line;
import geditor.Point;
import geditor.diagram.edit.parts.ArcEditPart;
import geditor.diagram.edit.parts.GeometryEditPart;
import geditor.diagram.edit.parts.PointEditPart;
import geditor.diagram.providers.GEditorElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GEditorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<GEditorNodeDescriptor> getSemanticChildren(View view) {
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorNodeDescriptor> getGeometry_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GEditorNodeDescriptor> result = new LinkedList<GEditorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGeometryObjects().iterator(); it
				.hasNext();) {
			GObject childElement = (GObject) it.next();
			int visualID = GEditorVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PointEditPart.VISUAL_ID) {
				result.add(new GEditorNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getContainedLinks(View view) {
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000ContainedLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2001ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getIncomingLinks(View view) {
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case PointEditPart.VISUAL_ID:
			return getPoint_2001IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getOutgoingLinks(View view) {
		switch (GEditorVisualIDRegistry.getVisualID(view)) {
		case PointEditPart.VISUAL_ID:
			return getPoint_2001OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getGeometry_1000ContainedLinks(
			View view) {
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getPoint_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getPoint_2001IncomingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getArc_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getPoint_2001OutgoingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<GEditorLinkDescriptor> getArc_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<GEditorLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			Geometry container) {
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		for (Iterator<?> links = container.getGeometryObjects().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != GEditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point dst = link.getEnd();
			Point src = link.getStart();
			result.add(new GEditorLinkDescriptor(src, dst, link,
					GEditorElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GEditorLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			Point target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != GeditorPackage.eINSTANCE
					.getArc_End()
					|| false == setting.getEObject() instanceof Arc) {
				continue;
			}
			Arc link = (Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != GEditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point src = link.getStart();
			result.add(new GEditorLinkDescriptor(src, target, link,
					GEditorElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<GEditorLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			Point source) {
		Geometry container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Geometry) {
				container = (Geometry) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<GEditorLinkDescriptor> result = new LinkedList<GEditorLinkDescriptor>();
		for (Iterator<?> links = container.getGeometryObjects().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != GEditorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Point dst = link.getEnd();
			Point src = link.getStart();
			if (src != source) {
				continue;
			}
			result.add(new GEditorLinkDescriptor(src, dst, link,
					GEditorElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

}
