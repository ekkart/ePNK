package networkmodel.diagram.navigator;

import networkmodel.diagram.edit.parts.CategoryEditPart;
import networkmodel.diagram.edit.parts.CategoryNameEditPart;
import networkmodel.diagram.edit.parts.DirectedEdgeEditPart;
import networkmodel.diagram.edit.parts.NetworkEditPart;
import networkmodel.diagram.edit.parts.NodeEditPart;
import networkmodel.diagram.edit.parts.NodeLabelEditPart;
import networkmodel.diagram.edit.parts.UndirectedEdgeEditPart;
import networkmodel.diagram.part.NetworkDiagramEditorPlugin;
import networkmodel.diagram.part.NetworkVisualIDRegistry;
import networkmodel.diagram.providers.NetworkElementTypes;
import networkmodel.diagram.providers.NetworkParserProvider;

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
public class NetworkNavigatorLabelProvider extends LabelProvider implements
        ICommonLabelProvider, ITreePathLabelProvider
{

	/**
	 * @generated
	 */
	static
	{
		NetworkDiagramEditorPlugin
		        .getInstance()
		        .getImageRegistry()
		        .put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		NetworkDiagramEditorPlugin
		        .getInstance()
		        .getImageRegistry()
		        .put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath)
	{
		Object element = elementPath.getLastSegment();
		if(element instanceof NetworkNavigatorItem
		        && !isOwnView(((NetworkNavigatorItem) element).getView()))
		{
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element)
	{
		if(element instanceof NetworkNavigatorGroup)
		{
			NetworkNavigatorGroup group = (NetworkNavigatorGroup) element;
			return NetworkDiagramEditorPlugin.getInstance().getBundledImage(
			        group.getIcon());
		}

		if(element instanceof NetworkNavigatorItem)
		{
			NetworkNavigatorItem navigatorItem = (NetworkNavigatorItem) element;
			if(!isOwnView(navigatorItem.getView()))
			{
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view)
	{
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case NodeEditPart.VISUAL_ID:
				return getImage(
				        "Navigator?TopLevelNode?http://org.pnml.tools/network?Node", NetworkElementTypes.Node_2002); //$NON-NLS-1$
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getImage(
				        "Navigator?Link?http://org.pnml.tools/network?UndirectedEdge", NetworkElementTypes.UndirectedEdge_4002); //$NON-NLS-1$
			case NetworkEditPart.VISUAL_ID:
				return getImage(
				        "Navigator?Diagram?http://org.pnml.tools/network?Network", NetworkElementTypes.Network_1000); //$NON-NLS-1$
			case CategoryEditPart.VISUAL_ID:
				return getImage(
				        "Navigator?TopLevelNode?http://org.pnml.tools/network?Category", NetworkElementTypes.Category_2001); //$NON-NLS-1$
			case DirectedEdgeEditPart.VISUAL_ID:
				return getImage(
				        "Navigator?Link?http://org.pnml.tools/network?DirectedEdge", NetworkElementTypes.DirectedEdge_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType)
	{
		ImageRegistry imageRegistry = NetworkDiagramEditorPlugin.getInstance()
		        .getImageRegistry();
		Image image = imageRegistry.get(key);
		if(image == null && elementType != null
		        && NetworkElementTypes.isKnownElementType(elementType))
		{
			image = NetworkElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if(image == null)
		{
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element)
	{
		if(element instanceof NetworkNavigatorGroup)
		{
			NetworkNavigatorGroup group = (NetworkNavigatorGroup) element;
			return group.getGroupName();
		}

		if(element instanceof NetworkNavigatorItem)
		{
			NetworkNavigatorItem navigatorItem = (NetworkNavigatorItem) element;
			if(!isOwnView(navigatorItem.getView()))
			{
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view)
	{
		if(view.getElement() != null && view.getElement().eIsProxy())
		{
			return getUnresolvedDomainElementProxyText(view);
		}
		switch(NetworkVisualIDRegistry.getVisualID(view))
		{
			case NodeEditPart.VISUAL_ID:
				return getNode_2002Text(view);
			case UndirectedEdgeEditPart.VISUAL_ID:
				return getUndirectedEdge_4002Text(view);
			case NetworkEditPart.VISUAL_ID:
				return getNetwork_1000Text(view);
			case CategoryEditPart.VISUAL_ID:
				return getCategory_2001Text(view);
			case DirectedEdgeEditPart.VISUAL_ID:
				return getDirectedEdge_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCategory_2001Text(View view)
	{
		IParser parser = NetworkParserProvider
		        .getParser(NetworkElementTypes.Category_2001,
		                view.getElement() != null ? view.getElement() : view,
		                NetworkVisualIDRegistry
		                        .getType(CategoryNameEditPart.VISUAL_ID));
		if(parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(
			        view.getElement() != null ? view.getElement() : view),
			        ParserOptions.NONE.intValue());
		}
		else
		{
			NetworkDiagramEditorPlugin.getInstance().logError(
			        "Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDirectedEdge_4001Text(View view)
	{
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2002Text(View view)
	{
		IParser parser = NetworkParserProvider.getParser(
		        NetworkElementTypes.Node_2002,
		        view.getElement() != null ? view.getElement() : view,
		        NetworkVisualIDRegistry.getType(NodeLabelEditPart.VISUAL_ID));
		if(parser != null)
		{
			return parser.getPrintString(new EObjectAdapter(
			        view.getElement() != null ? view.getElement() : view),
			        ParserOptions.NONE.intValue());
		}
		else
		{
			NetworkDiagramEditorPlugin.getInstance().logError(
			        "Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUndirectedEdge_4002Text(View view)
	{
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNetwork_1000Text(View view)
	{
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view)
	{
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view)
	{
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig)
	{
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento)
	{
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement)
	{
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view)
	{
		return NetworkEditPart.MODEL_ID.equals(NetworkVisualIDRegistry
		        .getModelID(view));
	}

}
