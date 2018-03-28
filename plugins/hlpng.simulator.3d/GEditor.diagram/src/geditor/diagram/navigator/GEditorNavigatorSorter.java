package geditor.diagram.navigator;

import geditor.diagram.part.GEditorVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class GEditorNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GEditorNavigatorItem) {
			GEditorNavigatorItem item = (GEditorNavigatorItem) element;
			return GEditorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
