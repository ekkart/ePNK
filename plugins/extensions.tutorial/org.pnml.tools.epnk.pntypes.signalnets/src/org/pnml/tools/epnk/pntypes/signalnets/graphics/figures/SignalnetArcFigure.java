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
package org.pnml.tools.epnk.pntypes.signalnets.graphics.figures;

import org.eclipse.draw2d.RotatableDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.ArrowHeadDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.CircleDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.decorations.FlashDecoration;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.pntypes.signalnets.Arc;
import org.pnml.tools.epnk.pntypes.signalnets.ArcType;
import org.pnml.tools.epnk.pntypes.signalnets.ArcTypes;

/**
 * Simple extension of the Figure for arcs.
 * 
 * @generated NOT (created manually)
 * @author eki
 */
public class SignalnetArcFigure extends ArcFigure {
	
	/**
	 * This is an internal type representing the type of arc dependent
	 * on the arc type attribute of the arc and to which nodes the
	 * arc is connected.
	 */
	private enum Type {
	    NORMAL, READ, INHIBIT, SIGNAL
	}
	
	/**
	 * The current type of the arc.
	 */
	private Type type;
	
	public SignalnetArcFigure(Arc arc) {
		super(arc);
		type = getType();
		setGraphics();
	}
	
	@Override
	public void update() {
		Type oldType = type;
		type = getType();
		if (oldType != type) {
			setGraphics();
		}
	}

	/**
	 * This method does the whole update job for this figure. It sets the
	 * appropriate decorators for the connection, dependent on the type.
	 */
	private void setGraphics() {
		RotatableDecoration targetDecorator = null;
		RotatableDecoration sourceDecorator = null;

		if (type == Type.READ) {
			targetDecorator = new ArrowHeadDecoration();
			sourceDecorator = new ArrowHeadDecoration();
		} else if (type == Type.INHIBIT) {
			targetDecorator =  new CircleDecoration();
		} else if (type == Type.SIGNAL) {
			sourceDecorator = new FlashDecoration();
			targetDecorator = new ArrowHeadDecoration();
		} else {
			targetDecorator = new ArrowHeadDecoration();
		} 

		this.setTargetDecoration(targetDecorator);
		this.setSourceDecoration(sourceDecorator);
	}
	
	/**
	 * Computes the current type of the arc, which depends on the
	 * arc type attribute and on the way it is connected to nodes.
	 * 
	 * @return the current type of the arc
	 */
	private Type getType() {
		if (this.arc instanceof Arc) {
			ArcType arctype = ((Arc)arc).getType();
			if (arctype != null) {
				switch (arctype.getText().getValue()) {
				case ArcTypes.READ_VALUE:
					return Type.READ;
				case ArcTypes.INHIBIT_VALUE:
					return Type.INHIBIT;
				}
			} else {
				Node source = arc.getSource();
				Node target = arc.getTarget();
				if (source instanceof TransitionNode && target instanceof TransitionNode) {
					return Type.SIGNAL;
				} 
			}
		}
		return Type.NORMAL;
	}

}
