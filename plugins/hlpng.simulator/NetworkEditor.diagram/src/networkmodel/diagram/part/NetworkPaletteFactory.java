package networkmodel.diagram.part;

import java.util.Collections;
import java.util.List;

import networkmodel.diagram.providers.NetworkElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class NetworkPaletteFactory
{

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot)
	{
		paletteRoot.add(createNetworkmodel1Group());
	}

	/**
	 * Creates "networkmodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createNetworkmodel1Group()
	{
		PaletteGroup paletteContainer = new PaletteGroup(
		        Messages.Networkmodel1Group_title);
		paletteContainer.setId("createNetworkmodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createDirectedEdge2CreationTool());
		paletteContainer.add(createCategory3CreationTool());
		paletteContainer.add(createUndirectedEdge4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(
		        Messages.Node1CreationTool_title,
		        Messages.Node1CreationTool_desc,
		        Collections.singletonList(NetworkElementTypes.Node_2002));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NetworkElementTypes
		        .getImageDescriptor(NetworkElementTypes.Node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDirectedEdge2CreationTool()
	{
		LinkToolEntry entry = new LinkToolEntry(
		        Messages.DirectedEdge2CreationTool_title,
		        Messages.DirectedEdge2CreationTool_desc,
		        Collections
		                .singletonList(NetworkElementTypes.DirectedEdge_4001));
		entry.setId("createDirectedEdge2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NetworkElementTypes
		        .getImageDescriptor(NetworkElementTypes.DirectedEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCategory3CreationTool()
	{
		NodeToolEntry entry = new NodeToolEntry(
		        Messages.Category3CreationTool_title,
		        Messages.Category3CreationTool_desc,
		        Collections.singletonList(NetworkElementTypes.Category_2001));
		entry.setId("createCategory3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NetworkElementTypes
		        .getImageDescriptor(NetworkElementTypes.Category_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUndirectedEdge4CreationTool()
	{
		LinkToolEntry entry = new LinkToolEntry(
		        Messages.UndirectedEdge4CreationTool_title,
		        Messages.UndirectedEdge4CreationTool_desc,
		        Collections
		                .singletonList(NetworkElementTypes.UndirectedEdge_4002));
		entry.setId("createUndirectedEdge4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(NetworkElementTypes
		        .getImageDescriptor(NetworkElementTypes.UndirectedEdge_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry
	{

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
		        List<IElementType> elementTypes)
		{
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool()
		{
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry
	{

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
		        List<IElementType> relationshipTypes)
		{
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool()
		{
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
