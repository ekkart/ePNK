package org.pnml.tools.epnk.diagram.part;

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
import org.pnml.tools.epnk.diagram.edit.parts.ArcEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.LabelProxyObjectEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.Page2EditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PageLabelProxyEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.PlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefPlaceEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.RefTransitionEditPart;
import org.pnml.tools.epnk.diagram.edit.parts.TransitionEditPart;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.LabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PageLabelProxy;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
public class PNMLCoreModelDiagramUpdater {

	/**
	 * @generated
	 */

	public static List<PNMLCoreModelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelNodeDescriptor> getPage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) view.getElement();
		LinkedList<PNMLCoreModelNodeDescriptor> result = new LinkedList<PNMLCoreModelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getObject().iterator(); it.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = PNMLCoreModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PlaceEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RefPlaceEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Page2EditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RefTransitionEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLabelproxy().iterator(); it
				.hasNext();) {
			LabelProxy childElement = (LabelProxy) it.next();
			int visualID = PNMLCoreModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == LabelProxyEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPageLabelProxy().iterator(); it
				.hasNext();) {
			PageLabelProxy childElement = (PageLabelProxy) it.next();
			int visualID = PNMLCoreModelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PageLabelProxyEditPart.VISUAL_ID) {
				result.add(new PNMLCoreModelNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getContainedLinks(View view) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_1000ContainedLinks(view);
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001ContainedLinks(view);
		case RefPlaceEditPart.VISUAL_ID:
			return getRefPlace_2002ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2003ContainedLinks(view);
		case Page2EditPart.VISUAL_ID:
			return getPage_2004ContainedLinks(view);
		case RefTransitionEditPart.VISUAL_ID:
			return getRefTransition_2005ContainedLinks(view);
		case LabelProxyEditPart.VISUAL_ID:
			return getLabelProxy_2009ContainedLinks(view);
		case PageLabelProxyEditPart.VISUAL_ID:
			return getPageLabelProxy_2008ContainedLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getIncomingLinks(View view) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001IncomingLinks(view);
		case RefPlaceEditPart.VISUAL_ID:
			return getRefPlace_2002IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2003IncomingLinks(view);
		case Page2EditPart.VISUAL_ID:
			return getPage_2004IncomingLinks(view);
		case RefTransitionEditPart.VISUAL_ID:
			return getRefTransition_2005IncomingLinks(view);
		case LabelProxyEditPart.VISUAL_ID:
			return getLabelProxy_2009IncomingLinks(view);
		case PageLabelProxyEditPart.VISUAL_ID:
			return getPageLabelProxy_2008IncomingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getOutgoingLinks(View view) {
		switch (PNMLCoreModelVisualIDRegistry.getVisualID(view)) {
		case PlaceEditPart.VISUAL_ID:
			return getPlace_2001OutgoingLinks(view);
		case RefPlaceEditPart.VISUAL_ID:
			return getRefPlace_2002OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_2003OutgoingLinks(view);
		case Page2EditPart.VISUAL_ID:
			return getPage_2004OutgoingLinks(view);
		case RefTransitionEditPart.VISUAL_ID:
			return getRefTransition_2005OutgoingLinks(view);
		case LabelProxyEditPart.VISUAL_ID:
			return getLabelProxy_2009OutgoingLinks(view);
		case PageLabelProxyEditPart.VISUAL_ID:
			return getPageLabelProxy_2008OutgoingLinks(view);
		case ArcEditPart.VISUAL_ID:
			return getArc_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPage_1000ContainedLinks(
			View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPlace_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefPlace_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getTransition_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPage_2004ContainedLinks(
			View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefTransition_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getLabelProxy_2009ContainedLinks(
			View view) {
		LabelProxy modelElement = (LabelProxy) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_LabelProxy_Object_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPageLabelProxy_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getArc_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPlace_2001IncomingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefPlace_2002IncomingLinks(
			View view) {
		RefPlace modelElement = (RefPlace) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getTransition_2003IncomingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPage_2004IncomingLinks(
			View view) {
		Page modelElement = (Page) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefTransition_2005IncomingLinks(
			View view) {
		RefTransition modelElement = (RefTransition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Arc_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getLabelProxy_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPageLabelProxy_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getArc_4001IncomingLinks(
			View view) {
		Arc modelElement = (Arc) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPlace_2001OutgoingLinks(
			View view) {
		Place modelElement = (Place) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefPlace_2002OutgoingLinks(
			View view) {
		RefPlace modelElement = (RefPlace) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getTransition_2003OutgoingLinks(
			View view) {
		Transition modelElement = (Transition) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPage_2004OutgoingLinks(
			View view) {
		Page modelElement = (Page) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getRefTransition_2005OutgoingLinks(
			View view) {
		RefTransition modelElement = (RefTransition) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Arc_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getLabelProxy_2009OutgoingLinks(
			View view) {
		LabelProxy modelElement = (LabelProxy) view.getElement();
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_LabelProxy_Object_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getPageLabelProxy_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PNMLCoreModelLinkDescriptor> getArc_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<PNMLCoreModelLinkDescriptor> getContainedTypeModelFacetLinks_Arc_4001(
			Page container) {
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		for (Iterator<?> links = container.getObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PNMLCoreModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new PNMLCoreModelLinkDescriptor(src, dst, link,
					PNMLCoreModelElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PNMLCoreModelLinkDescriptor> getIncomingTypeModelFacetLinks_Arc_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PnmlcoremodelPackage.eINSTANCE
					.getArc_Target()
					|| false == setting.getEObject() instanceof Arc) {
				continue;
			}
			Arc link = (Arc) setting.getEObject();
			if (ArcEditPart.VISUAL_ID != PNMLCoreModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getSource();
			result.add(new PNMLCoreModelLinkDescriptor(src, target, link,
					PNMLCoreModelElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PNMLCoreModelLinkDescriptor> getIncomingFeatureModelFacetLinks_LabelProxy_Object_4004(
			Object target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PnmlcoremodelPackage.eINSTANCE
					.getLabelProxy_Object()) {
				result.add(new PNMLCoreModelLinkDescriptor(
						setting.getEObject(), target,
						PNMLCoreModelElementTypes.LabelProxyObject_4004,
						LabelProxyObjectEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PNMLCoreModelLinkDescriptor> getOutgoingTypeModelFacetLinks_Arc_4001(
			Node source) {
		Page container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Page) {
				container = (Page) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		for (Iterator<?> links = container.getObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Arc) {
				continue;
			}
			Arc link = (Arc) linkObject;
			if (ArcEditPart.VISUAL_ID != PNMLCoreModelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PNMLCoreModelLinkDescriptor(src, dst, link,
					PNMLCoreModelElementTypes.Arc_4001, ArcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PNMLCoreModelLinkDescriptor> getOutgoingFeatureModelFacetLinks_LabelProxy_Object_4004(
			LabelProxy source) {
		LinkedList<PNMLCoreModelLinkDescriptor> result = new LinkedList<PNMLCoreModelLinkDescriptor>();
		Object destination = source.getObject();
		if (destination == null) {
			return result;
		}
		result.add(new PNMLCoreModelLinkDescriptor(source, destination,
				PNMLCoreModelElementTypes.LabelProxyObject_4004,
				LabelProxyObjectEditPart.VISUAL_ID));
		return result;
	}

}
