package org.pnml.tools.epnk.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.pnml.tools.epnk.diagram.part.PNMLCoreModelVisualIDRegistry;

/**
 * @generated
 */
public class PNMLCoreModelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PNMLCoreModelNavigatorItem) {
			PNMLCoreModelNavigatorItem item = (PNMLCoreModelNavigatorItem) element;
			return PNMLCoreModelVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
