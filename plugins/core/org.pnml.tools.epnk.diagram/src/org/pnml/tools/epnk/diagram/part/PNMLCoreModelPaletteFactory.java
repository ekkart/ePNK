package org.pnml.tools.epnk.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.pnml.tools.epnk.diagram.providers.PNMLCoreModelElementTypes;

/**
 * @generated
 */
public class PNMLCoreModelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPnmlcoremodel1Group());
	}

	/**
	 * Creates "pnmlcoremodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createPnmlcoremodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Pnmlcoremodel1Group_title);
		paletteContainer.setId("createPnmlcoremodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createPlace1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		paletteContainer.add(createArc3CreationTool());
		paletteContainer.add(createPage4CreationTool());
		paletteContainer.add(createRefPlace5CreationTool());
		paletteContainer.add(createRefTransition6CreationTool());
		paletteContainer.add(createLabel7CreationTool());
		paletteContainer.add(createLinkLabel8CreationTool());
		paletteContainer.add(createPageLabel9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createPlace1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Place1CreationTool_title,
				Messages.Place1CreationTool_desc,
				Collections.singletonList(PNMLCoreModelElementTypes.Place_2001));
		entry.setId("createPlace1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.Place_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createTransition2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.Transition_2003));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.Transition_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createArc3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Arc3CreationTool_title,
				Messages.Arc3CreationTool_desc,
				Collections.singletonList(PNMLCoreModelElementTypes.Arc_4001));
		entry.setId("createArc3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.Arc_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createPage4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Page4CreationTool_title,
				Messages.Page4CreationTool_desc,
				Collections.singletonList(PNMLCoreModelElementTypes.Page_2004));
		entry.setId("createPage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.Page_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createRefPlace5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RefPlace5CreationTool_title,
				Messages.RefPlace5CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.RefPlace_2002));
		entry.setId("createRefPlace5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.RefPlace_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createRefTransition6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RefTransition6CreationTool_title,
				Messages.RefTransition6CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.RefTransition_2005));
		entry.setId("createRefTransition6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.RefTransition_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createLabel7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Label7CreationTool_title,
				Messages.Label7CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.LabelProxy_2009));
		entry.setId("createLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.LabelProxy_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createLinkLabel8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.LinkLabel8CreationTool_title,
				Messages.LinkLabel8CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.LabelProxyObject_4004));
		entry.setId("createLinkLabel8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.LabelProxyObject_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private ToolEntry createPageLabel9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PageLabel9CreationTool_title,
				Messages.PageLabel9CreationTool_desc,
				Collections
						.singletonList(PNMLCoreModelElementTypes.PageLabelProxy_2008));
		entry.setId("createPageLabel9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PNMLCoreModelElementTypes
				.getImageDescriptor(PNMLCoreModelElementTypes.PageLabelProxy_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
