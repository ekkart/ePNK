package networkmodel.diagram.providers;

import networkmodel.diagram.part.NetworkDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers
{

	protected ElementInitializers()
	{
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance()
	{
		ElementInitializers cached = NetworkDiagramEditorPlugin.getInstance()
		        .getElementInitializers();
		if(cached == null)
		{
			NetworkDiagramEditorPlugin.getInstance().setElementInitializers(
			        cached = new ElementInitializers());
		}
		return cached;
	}
}
