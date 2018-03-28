package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.PlaceEndFigure;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.StrangeArcTypeFigure;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.TransitionEndFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

/**
 * This is a simple example of a graphical extension that is plugged in to the
 * ePNK diagram editor. It uses different shapes for different ArcTypes in
 * the ArcTypes Petri net type example.
 * 
 * @generated NOT (manually created class)
 * @author eki
 *
 */
public class StrangeGraphicalExtension extends GraphicalExtension {

	/**
	 * Returns a singleton list with the ARCTYPES net type.
	 */
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(PtnetPackage.eINSTANCE.getPTNet());
		return list;
	}
	
	

	@Override
	public boolean appliesToSubNettypes(EClass nettype) {
		return true;
	}

	/**
	 * Returns a list referring to the EClass Arc of the ARCTYPES net type
	 * and the standard place and transition.
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (PtnetPackage.eINSTANCE.getPTNet().isSuperTypeOf(netType)) {
			list.add(PtnetPackage.eINSTANCE.getArc());
			list.add(PnmlcoremodelPackage.eINSTANCE.getTransition());
			list.add(PtnetPackage.eINSTANCE.getPlace());
		}
		return list;
	}

	@Override
	public boolean appliesToSubNetobjects(EClass nettype, EClass elementtype) {
		if (PtnetPackage.eINSTANCE.getPlace().isSuperTypeOf(elementtype)) {
			return true;
		}
		return false;
	}

	@Override
	public int getExtensionPriority(EClass netType, EClass elementType) {
		return 0;
	}


	/**
	 * Returns the specific ArcTypeFigure for arcs of the ArcType net type.
	 */
	@Override
	public ArcFigure createArcFigure(Arc arc) {
		if (arc instanceof Arc) {
			return new StrangeArcTypeFigure(arc);
		}
		return null;
	}

	/**
	 * Returns the specific PlaceEndFigure for all places (a bad idea, but
	 * just a test -- the net type should be declared in a separate method).
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
	    return new PlaceEndFigure(place);
		// return null;
	}

	/**
	 * Returns the specific  TransitionEndFigure for all transitions (a bad idea, but
	 * just a test -- the net type should be declared in a separate method).
	 */
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		// if (NetFunctions.getPetriNetType(transition) instanceof ARCTYPES) {
			return new TransitionEndFigure(transition);
		// }
		//return null;
	}

}
