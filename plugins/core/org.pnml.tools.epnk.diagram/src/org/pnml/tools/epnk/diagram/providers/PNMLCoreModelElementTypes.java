package org.pnml.tools.epnk.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
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
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

/**
 * @generated
 */
public class PNMLCoreModelElementTypes {

	/**
	 * @generated
	 */
	private PNMLCoreModelElementTypes() {
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Page_1000 = getElementType("org.pnml.tools.epnk.diagram.Page_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Place_2001 = getElementType("org.pnml.tools.epnk.diagram.Place_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefPlace_2002 = getElementType("org.pnml.tools.epnk.diagram.RefPlace_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_2003 = getElementType("org.pnml.tools.epnk.diagram.Transition_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2004 = getElementType("org.pnml.tools.epnk.diagram.Page_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefTransition_2005 = getElementType("org.pnml.tools.epnk.diagram.RefTransition_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LabelProxy_2009 = getElementType("org.pnml.tools.epnk.diagram.LabelProxy_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PageLabelProxy_2008 = getElementType("org.pnml.tools.epnk.diagram.PageLabelProxy_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Arc_4001 = getElementType("org.pnml.tools.epnk.diagram.Arc_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LabelProxyObject_4004 = getElementType("org.pnml.tools.epnk.diagram.LabelProxyObject_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return PNMLCoreModelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Page_1000, PnmlcoremodelPackage.eINSTANCE.getPage());

			elements.put(Place_2001, PnmlcoremodelPackage.eINSTANCE.getPlace());

			elements.put(RefPlace_2002,
					PnmlcoremodelPackage.eINSTANCE.getRefPlace());

			elements.put(Transition_2003,
					PnmlcoremodelPackage.eINSTANCE.getTransition());

			elements.put(Page_2004, PnmlcoremodelPackage.eINSTANCE.getPage());

			elements.put(RefTransition_2005,
					PnmlcoremodelPackage.eINSTANCE.getRefTransition());

			elements.put(LabelProxy_2009,
					PnmlcoremodelPackage.eINSTANCE.getLabelProxy());

			elements.put(PageLabelProxy_2008,
					PnmlcoremodelPackage.eINSTANCE.getPageLabelProxy());

			elements.put(Arc_4001, PnmlcoremodelPackage.eINSTANCE.getArc());

			elements.put(LabelProxyObject_4004,
					PnmlcoremodelPackage.eINSTANCE.getLabelProxy_Object());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Page_1000);
			KNOWN_ELEMENT_TYPES.add(Place_2001);
			KNOWN_ELEMENT_TYPES.add(RefPlace_2002);
			KNOWN_ELEMENT_TYPES.add(Transition_2003);
			KNOWN_ELEMENT_TYPES.add(Page_2004);
			KNOWN_ELEMENT_TYPES.add(RefTransition_2005);
			KNOWN_ELEMENT_TYPES.add(LabelProxy_2009);
			KNOWN_ELEMENT_TYPES.add(PageLabelProxy_2008);
			KNOWN_ELEMENT_TYPES.add(Arc_4001);
			KNOWN_ELEMENT_TYPES.add(LabelProxyObject_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PageEditPart.VISUAL_ID:
			return Page_1000;
		case PlaceEditPart.VISUAL_ID:
			return Place_2001;
		case RefPlaceEditPart.VISUAL_ID:
			return RefPlace_2002;
		case TransitionEditPart.VISUAL_ID:
			return Transition_2003;
		case Page2EditPart.VISUAL_ID:
			return Page_2004;
		case RefTransitionEditPart.VISUAL_ID:
			return RefTransition_2005;
		case LabelProxyEditPart.VISUAL_ID:
			return LabelProxy_2009;
		case PageLabelProxyEditPart.VISUAL_ID:
			return PageLabelProxy_2008;
		case ArcEditPart.VISUAL_ID:
			return Arc_4001;
		case LabelProxyObjectEditPart.VISUAL_ID:
			return LabelProxyObject_4004;
		}
		return null;
	}

}
