package networkmodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import networkmodel.Category;
import networkmodel.DirectedEdge;
import networkmodel.Network;
import networkmodel.NetworkObject;
import networkmodel.NetworkmodelPackage;
import networkmodel.Node;
import networkmodel.UndirectedEdge;
import networkmodel.diagram.edit.parts.CategoryEditPart;
import networkmodel.diagram.edit.parts.DirectedEdgeEditPart;
import networkmodel.diagram.edit.parts.NetworkEditPart;
import networkmodel.diagram.edit.parts.NodeEditPart;
import networkmodel.diagram.edit.parts.UndirectedEdgeEditPart;
import networkmodel.diagram.providers.NetworkElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class NetworkDiagramUpdater
{

	/**
	 * @generated
	 */
	public static List<NetworkNodeDescriptor> getSemanticChildren(View view)
	{
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case NetworkEditPart.VISUAL_ID:
				return getNetwork_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkNodeDescriptor> getNetwork_1000SemanticChildren(
	        View view)
	{
		if(!view.isSetElement())
		{
			return Collections.emptyList();
		}
		Network modelElement = (Network) view.getElement();
		LinkedList<NetworkNodeDescriptor> result = new LinkedList<NetworkNodeDescriptor>();
		for(Iterator<?> it = modelElement.getCategories().iterator(); it
		        .hasNext();)
		{
			Category childElement = (Category) it.next();
			int visualID = NetworkVisualIDRegistry.getNodeVisualID(view,
			        childElement);
			if(visualID == CategoryEditPart.VISUAL_ID)
			{
				result.add(new NetworkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for(Iterator<?> it = modelElement.getNetwork().iterator(); it.hasNext();)
		{
			NetworkObject childElement = (NetworkObject) it.next();
			int visualID = NetworkVisualIDRegistry.getNodeVisualID(view,
			        childElement);
			if(visualID == NodeEditPart.VISUAL_ID)
			{
				result.add(new NetworkNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getContainedLinks(View view)
	{
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case NetworkEditPart.VISUAL_ID:
				return getNetwork_1000ContainedLinks(view);
			case CategoryEditPart.VISUAL_ID:
				return getCategory_2001ContainedLinks(view);
			case NodeEditPart.VISUAL_ID:
				return getNode_2002ContainedLinks(view);
			case DirectedEdgeEditPart.VISUAL_ID:
				return getDirectedEdge_4001ContainedLinks(view);
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getUndirectedEdge_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getIncomingLinks(View view)
	{
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case CategoryEditPart.VISUAL_ID:
				return getCategory_2001IncomingLinks(view);
			case NodeEditPart.VISUAL_ID:
				return getNode_2002IncomingLinks(view);
			case DirectedEdgeEditPart.VISUAL_ID:
				return getDirectedEdge_4001IncomingLinks(view);
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getUndirectedEdge_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getOutgoingLinks(View view)
	{
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case CategoryEditPart.VISUAL_ID:
				return getCategory_2001OutgoingLinks(view);
			case NodeEditPart.VISUAL_ID:
				return getNode_2002OutgoingLinks(view);
			case DirectedEdgeEditPart.VISUAL_ID:
				return getDirectedEdge_4001OutgoingLinks(view);
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getUndirectedEdge_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getNetwork_1000ContainedLinks(
	        View view)
	{
		Network modelElement = (Network) view.getElement();
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_DirectedEdge_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_UndirectedEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getCategory_2001ContainedLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getNode_2002ContainedLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getDirectedEdge_4001ContainedLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getUndirectedEdge_4002ContainedLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getCategory_2001IncomingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getNode_2002IncomingLinks(
	        View view)
	{
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
		        .find(view.eResource().getResourceSet().getResources());
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_DirectedEdge_4001(
		        modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UndirectedEdge_4002(
		        modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getDirectedEdge_4001IncomingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getUndirectedEdge_4002IncomingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getCategory_2001OutgoingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getNode_2002OutgoingLinks(
	        View view)
	{
		Node modelElement = (Node) view.getElement();
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_DirectedEdge_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_UndirectedEdge_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getDirectedEdge_4001OutgoingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NetworkLinkDescriptor> getUndirectedEdge_4002OutgoingLinks(
	        View view)
	{
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getContainedTypeModelFacetLinks_DirectedEdge_4001(
	        Network container)
	{
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		for(Iterator<?> links = container.getNetwork().iterator(); links
		        .hasNext();)
		{
			EObject linkObject = (EObject) links.next();
			if(false == linkObject instanceof DirectedEdge)
			{
				continue;
			}
			DirectedEdge link = (DirectedEdge) linkObject;
			if(DirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new NetworkLinkDescriptor(src, dst, link,
			        NetworkElementTypes.DirectedEdge_4001,
			        DirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getContainedTypeModelFacetLinks_UndirectedEdge_4002(
	        Network container)
	{
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		for(Iterator<?> links = container.getNetwork().iterator(); links
		        .hasNext();)
		{
			EObject linkObject = (EObject) links.next();
			if(false == linkObject instanceof UndirectedEdge)
			{
				continue;
			}
			UndirectedEdge link = (UndirectedEdge) linkObject;
			if(UndirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			result.add(new NetworkLinkDescriptor(src, dst, link,
			        NetworkElementTypes.UndirectedEdge_4002,
			        UndirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getIncomingTypeModelFacetLinks_DirectedEdge_4001(
	        Node target,
	        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences)
	{
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
		        .get(target);
		for(EStructuralFeature.Setting setting : settings)
		{
			if(setting.getEStructuralFeature() != NetworkmodelPackage.eINSTANCE
			        .getUndirectedEdge_Target()
			        || false == setting.getEObject() instanceof DirectedEdge)
			{
				continue;
			}
			DirectedEdge link = (DirectedEdge) setting.getEObject();
			if(DirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node src = link.getSource();
			result.add(new NetworkLinkDescriptor(src, target, link,
			        NetworkElementTypes.DirectedEdge_4001,
			        DirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getIncomingTypeModelFacetLinks_UndirectedEdge_4002(
	        Node target,
	        Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences)
	{
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
		        .get(target);
		for(EStructuralFeature.Setting setting : settings)
		{
			if(setting.getEStructuralFeature() != NetworkmodelPackage.eINSTANCE
			        .getUndirectedEdge_Target()
			        || false == setting.getEObject() instanceof UndirectedEdge)
			{
				continue;
			}
			UndirectedEdge link = (UndirectedEdge) setting.getEObject();
			if(UndirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node src = link.getSource();
			result.add(new NetworkLinkDescriptor(src, target, link,
			        NetworkElementTypes.UndirectedEdge_4002,
			        UndirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getOutgoingTypeModelFacetLinks_DirectedEdge_4001(
	        Node source)
	{
		Network container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for(EObject element = source; element != null && container == null; element = element
		        .eContainer())
		{
			if(element instanceof Network)
			{
				container = (Network) element;
			}
		}
		if(container == null)
		{
			return Collections.emptyList();
		}
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		for(Iterator<?> links = container.getNetwork().iterator(); links
		        .hasNext();)
		{
			EObject linkObject = (EObject) links.next();
			if(false == linkObject instanceof DirectedEdge)
			{
				continue;
			}
			DirectedEdge link = (DirectedEdge) linkObject;
			if(DirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if(src != source)
			{
				continue;
			}
			result.add(new NetworkLinkDescriptor(src, dst, link,
			        NetworkElementTypes.DirectedEdge_4001,
			        DirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NetworkLinkDescriptor> getOutgoingTypeModelFacetLinks_UndirectedEdge_4002(
	        Node source)
	{
		Network container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for(EObject element = source; element != null && container == null; element = element
		        .eContainer())
		{
			if(element instanceof Network)
			{
				container = (Network) element;
			}
		}
		if(container == null)
		{
			return Collections.emptyList();
		}
		LinkedList<NetworkLinkDescriptor> result = new LinkedList<NetworkLinkDescriptor>();
		for(Iterator<?> links = container.getNetwork().iterator(); links
		        .hasNext();)
		{
			EObject linkObject = (EObject) links.next();
			if(false == linkObject instanceof UndirectedEdge)
			{
				continue;
			}
			UndirectedEdge link = (UndirectedEdge) linkObject;
			if(UndirectedEdgeEditPart.VISUAL_ID != NetworkVisualIDRegistry
			        .getLinkWithClassVisualID(link))
			{
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getSource();
			if(src != source)
			{
				continue;
			}
			result.add(new NetworkLinkDescriptor(src, dst, link,
			        NetworkElementTypes.UndirectedEdge_4002,
			        UndirectedEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

}
