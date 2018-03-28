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
package org.pnml.tools.epnk.pntypes.signalnets.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pntypes.signalnets.SignalnetsPackage;
import org.pnml.tools.epnk.pntypes.signalnets.graphics.figures.SignalnetArcFigure;
import org.pnml.tools.epnk.pntypes.signalnets.graphics.figures.SignalnetPlaceFigure;

/**
 * This is a simple example of a graphical extension that is plugged into the
 * ePNK diagram editor. It uses different shapes for different arc types in
 * signal nets and shows the initial marking graphically.
 * 
 * @generated NOT (manually created class)
 * @author eki
 *
 */
public class SignalnetGraphics extends GraphicalExtension {

	/**
	 * Returns a singleton list with the Inhibitor net type.
	 */
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(SignalnetsPackage.eINSTANCE.getSignalNet());
		return list;
	}

	/**
	 * Returns a list referring to the EClass Arc and the EClass Place 
	 * of the inhibitor net type .
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(SignalnetsPackage.eINSTANCE.getSignalNet())) {
			list.add(SignalnetsPackage.eINSTANCE.getArc());
			list.add(SignalnetsPackage.eINSTANCE.getPlace());
		}
		return list;
	}

	/**
	 * Returns the specific figure for arcs of the inhibitors net type.
	 */
	@Override
	public ArcFigure createArcFigure(Arc arc) {
		if (arc instanceof org.pnml.tools.epnk.pntypes.signalnets.Arc) {
			return new SignalnetArcFigure((org.pnml.tools.epnk.pntypes.signalnets.Arc) arc);
		}
		return null;
	}

	/**
	 * Returns the specific figure for places of the inhibitors net type.
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof org.pnml.tools.epnk.pntypes.signalnets.Place) {
			return new SignalnetPlaceFigure((org.pnml.tools.epnk.pntypes.signalnets.Place) place);
		}
		return null;
	}


}
