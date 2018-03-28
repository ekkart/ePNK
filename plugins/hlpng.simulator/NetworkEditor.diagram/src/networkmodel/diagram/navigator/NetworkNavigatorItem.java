package networkmodel.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class NetworkNavigatorItem extends NetworkAbstractNavigatorItem
{

	/**
	 * @generated
	 */
	static
	{
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory()
		{

			public Object getAdapter(Object adaptableObject, Class adapterType)
			{
				if(adaptableObject instanceof networkmodel.diagram.navigator.NetworkNavigatorItem
				        && (adapterType == View.class || adapterType == EObject.class))
				{
					return ((networkmodel.diagram.navigator.NetworkNavigatorItem) adaptableObject)
					        .getView();
				}
				return null;
			}

			public Class[] getAdapterList()
			{
				return supportedTypes;
			}
		}, networkmodel.diagram.navigator.NetworkNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public NetworkNavigatorItem(View view, Object parent, boolean isLeaf)
	{
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView()
	{
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf()
	{
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj)
	{
		if(obj instanceof networkmodel.diagram.navigator.NetworkNavigatorItem)
		{
			return EcoreUtil
			        .getURI(getView())
			        .equals(EcoreUtil
			                .getURI(((networkmodel.diagram.navigator.NetworkNavigatorItem) obj)
			                        .getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode()
	{
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
