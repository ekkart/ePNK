package org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ARCTYPES;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.Arc;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.arctypes.ArctypesPackage;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.ArcTypeFigure;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.PlaceEndFigure;
import org.pnml.tools.epnk.extensions.tutorial.types.arctypes.graphicalextensions.figures.TransitionEndFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

/**
 * This is a simple example of a graphical extension that is plugged into the
 * ePNK diagram editor. It uses different shapes for different ArcTypes in
 * the ArcTypes Petri net type example.
 * 
 * @generated NOT (manually created class)
 * @author eki
 *
 */
public class ArcTypesGraphicalExtension extends GraphicalExtension {

	/**
	 * Returns a singleton list with the ARCTYPES net type.
	 */
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(ArctypesPackage.eINSTANCE.getARCTYPES());
		return list;
	}

	/**
	 * Returns a list referring to the EClass Arc of the ARCTYPES net type
	 * and the standard place and transition.
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(ArctypesPackage.eINSTANCE.getARCTYPES())) {
			list.add(ArctypesPackage.eINSTANCE.getArc());
			list.add(PnmlcoremodelPackage.eINSTANCE.getTransition());
			list.add(PnmlcoremodelPackage.eINSTANCE.getPlace());
		}
		return list;
	}


	/**
	 * Returns the specific ArcTypeFigure for arcs of the ArcType net type.
	 */
	@Override
	public ArcFigure createArcFigure(org.pnml.tools.epnk.pnmlcoremodel.Arc arc) {
		if (arc instanceof Arc) {
			return new ArcTypeFigure((Arc) arc);
		}
		return null;
	}

	/**
	 * Returns the specific PlaceEndFigure for all places (a bad idea, but
	 * just a test -- the net type should be declared in a separate method).
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (NetFunctions.getPetriNetType(place) instanceof ARCTYPES) {
			return new PlaceEndFigure(place);
		}
		return null;
	}

	/**
	 * Returns the specific  TransitionEndFigure for all transitions (a bad idea, but
	 * just a test -- the net type should be declared in a separate method).
	 */
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		if (NetFunctions.getPetriNetType(transition) instanceof ARCTYPES) {
			return new TransitionEndFigure(transition);
		}
		return null;
	}

}
