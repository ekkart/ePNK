package org.pnml.tools.epnk.gmf.extensions.graphics;

import org.eclipse.draw2d.IFigure;

/**
 * Interface representing Draw2D figures that have a built-in handle to
 * update them (based on a model element they are attached to). The
 * updated is implemented in the update method.
 * 
 * @author eki
 * @generated NOT (created manually)
 */
public interface IUpdateableFigure extends IFigure {

	
	/**
	 * This method is called, when some attributes of the model element have changed.
	 * The figure can then update its appearance. This should be overridden by
	 * figures that depend on the model elements attributes.
	 */
	public void update();
	
}
