package geditor.diagram.part;

import geditor.diagram.providers.GEditorElementTypes;

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

/**
 * @generated
 */
public class GEditorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeditor1Group());
	}

	/**
	 * Creates "geditor" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeditor1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Geditor1Group_title);
		paletteContainer.setId("createGeditor1Group"); //$NON-NLS-1$
		paletteContainer.add(createPoint1CreationTool());
		paletteContainer.add(createArc2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPoint1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Point1CreationTool_title,
				Messages.Point1CreationTool_desc,
				Collections.singletonList(GEditorElementTypes.Point_2001));
		entry.setId("createPoint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GEditorElementTypes
				.getImageDescriptor(GEditorElementTypes.Point_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArc2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Arc2CreationTool_title,
				Messages.Arc2CreationTool_desc,
				Collections.singletonList(GEditorElementTypes.Arc_4001));
		entry.setId("createArc2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GEditorElementTypes
				.getImageDescriptor(GEditorElementTypes.Arc_4001));
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
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
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
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
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
