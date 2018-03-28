package org.pnml.tools.epnk.gmf.extensions.graphics.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.managers.graphics.resources.GraphicsResourcesManager;
import org.pnml.tools.epnk.pnmlcoremodel.Fill;
import org.pnml.tools.epnk.pnmlcoremodel.NodeGraphics;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsInfo;
import org.pnml.tools.epnk.pnmlcoremodel.presentation.MultipleEditorsRegistry;

/**
 * This is the default PlaceFigure for ePNK diagrams. It was actually copied
 * from automatically generated class of GMF in the PlaceEditPart. The reason
 * for factoring out this class was making it easier to use when changing
 * the graphical appearance.
 * 
 * @generated NOT
 * @author eki
 *
 */
public class PlaceFigure extends Ellipse implements IUpdateableFigure {
	
	public final Place place;
	
	private boolean imageExists;
	
	/*
	public PlaceFigure() {
		this(null);
	}
	*/
	
	public PlaceFigure(Place place) {
		this.place = place;
		this.setLayoutManager(new XYLayout());
		this.setLineWidth(1);
	}

	/**
	 * This method is called, when some attributes of the place have changed.
	 * The figure can then update its appearance. This should be overridden by
	 * figures that depend on the place's attributes.
	 */
	@Override
	public void update() {
	}

	@Override
	protected void fillShape(Graphics graphics) {
		imageExists = false;
		org.pnml.tools.epnk.pnmlcoremodel.Graphics graphicsInfo = null;
		if (place != null) {
			graphicsInfo = place.getGraphics();
		}
		if (graphicsInfo != null && graphicsInfo instanceof NodeGraphics) {
			Fill  fill = ((NodeGraphics) graphicsInfo).getFill();
			if (fill != null && fill.getImage() != null) {
				
				MultipleEditorsInfo info = MultipleEditorsRegistry.getInstance().getInfo(place);
				GraphicsResourcesManager graphicalResourceManager = info.getGraphicsResourcesManager();
			    Image image = graphicalResourceManager.getImage(place, fill.getImage().toString());
			    if (image != null) {
			    	org.eclipse.swt.graphics.Rectangle srcBounds = image.getBounds();
			    	Rectangle targetBounds = this.getBounds();
			    	graphics.drawImage(image,
			    			srcBounds.x, srcBounds.y, srcBounds.width, srcBounds.height,
			    			targetBounds.x, targetBounds.y, targetBounds.width, targetBounds.height);
			    	imageExists = true;
			    }
			}
		}
		
		if (!imageExists) { 
			super.fillShape(graphics);
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		if (!imageExists) {
			super.outlineShape(graphics);
		}
	}

}
