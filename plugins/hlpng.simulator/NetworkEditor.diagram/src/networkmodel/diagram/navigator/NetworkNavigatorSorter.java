package networkmodel.diagram.navigator;

import networkmodel.diagram.part.NetworkVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class NetworkNavigatorSorter extends ViewerSorter
{

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element)
	{
		if(element instanceof NetworkNavigatorItem)
		{
			NetworkNavigatorItem item = (NetworkNavigatorItem) element;
			return NetworkVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
