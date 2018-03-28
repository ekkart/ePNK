package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import org.eclipse.draw2d.MouseEvent;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import ptnetsimulator.PlaceSelectionAnnotation;

public class SelectPlaceHandler implements IActionHandler {

	private PTNetSimulatorApplication application;
	
	public SelectPlaceHandler(PTNetSimulatorApplication application) {
		super();		
		this.application = application;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		if (annotation instanceof PlaceSelectionAnnotation) {
			PlaceSelectionAnnotation placeAnnotation = (PlaceSelectionAnnotation) annotation;
			placeAnnotation.setSelected(!placeAnnotation.isSelected());
			application.update();
			return true; 
		}
		return false; 
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

}
