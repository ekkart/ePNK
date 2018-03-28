package org.pnml.tools.epnk.diagram.providers;

import org.pnml.tools.epnk.diagram.part.PNMLCoreModelDiagramEditorPlugin;

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
		ElementInitializers cached = PNMLCoreModelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			PNMLCoreModelDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}

}
