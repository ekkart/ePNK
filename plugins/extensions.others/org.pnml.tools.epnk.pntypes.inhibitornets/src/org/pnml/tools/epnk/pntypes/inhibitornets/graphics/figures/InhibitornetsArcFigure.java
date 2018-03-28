/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2012 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 */
package org.pnml.tools.epnk.pntypes.inhibitornets.graphics.figures;

import org.eclipse.draw2d.RotatableDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.CircleDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pntypes.inhibitornets.Arc;
import org.pnml.tools.epnk.pntypes.inhibitornets.ArcType;
import org.pnml.tools.epnk.pntypes.inhibitornets.ArcTypes;

/**
 * Simple extension of the Figure for arcs.
 * 
 * @generated NOT (created manually)
 * @author eki
 */
public class InhibitornetsArcFigure extends ArcFigure {
	
	private ArcTypes type;
	
	public InhibitornetsArcFigure(Arc arc) {
		super(arc);
		type = getType();
		setGraphics();
	}
	
	@Override
	public void update() {
		ArcTypes oldType = type;
		type = getType();
		if (oldType != type) {
			setGraphics();
		}
	}

	/**
	 * This method does the whole update job for this figure.
	 */
	private void setGraphics() {
		RotatableDecoration targetDecorator = null;
		RotatableDecoration sourceDecorator = null;

		if (type.equals(ArcTypes.NORMAL)) {
			targetDecorator = new ArrowHeadDecoration();
		} else if (type.equals(ArcTypes.INHIBIT)) {
			CircleDecoration circleDecoration = new CircleDecoration();
			circleDecoration.setLineWidth(this.getLineWidth());
			targetDecorator = circleDecoration;
		} else if (type.equals(ArcTypes.READ)) {
			targetDecorator = new ArrowHeadDecoration();
			sourceDecorator = new ArrowHeadDecoration();
		}
		this.setTargetDecoration(targetDecorator);
		this.setSourceDecoration(sourceDecorator);
	}
	
	private ArcTypes getType() {
		if (this.arc instanceof Arc) {
			ArcType type = ((Arc)arc).getType();
			if (type == null) {
				return ArcTypes.NORMAL;
			} else {
				return type.getText();
			}
		} else {
			return ArcTypes.NORMAL;
		}
	}

}
