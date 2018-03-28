package geditor.diagram.providers;

import geditor.diagram.part.GEditorDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GEditorDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GEditorDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
