package dk.dtu.compute.mbse.tutorial.yawl.graphics.factory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.compute.mbse.tutorial.yawl.graphics.figures.YAWLActionFigure;
import dk.dtu.compute.mbse.tutorial.yawl.graphics.figures.YAWLArcFigure;
import dk.dtu.compute.mbse.tutorial.yawl.graphics.figures.YAWLConditionFigure;
import dk.dtu.compute.mbse.yawl.YawlPackage;

/**
 * The class for defining the graphical extensions of YAWL nets.
 * 
 * @generated NOT
 * @author ekki@dtu.dk
 */
public class YAWLGraphics extends GraphicalExtension {

	
	public YAWLGraphics() {
		super();
	}

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> results = new ArrayList<EClass>();
		results.add(YawlPackage.eINSTANCE.getYAWLNet());
		return results;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> results = new ArrayList<EClass>();
		if (netType.equals(YawlPackage.eINSTANCE.getYAWLNet())) {
			results.add(YawlPackage.eINSTANCE.getArc());
			results.add(YawlPackage.eINSTANCE.getCondition());
			results.add(YawlPackage.eINSTANCE.getAction());
		}
		return results;
	}

	@Override
	public IArcFigure createArcFigure(Arc arc) {
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc) {
			return new YAWLArcFigure(arc);
		}
		return null;
	}

	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof dk.dtu.compute.mbse.yawl.Condition) {
			return new YAWLConditionFigure(place);
		}
		return null;
	}

	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		if (transition instanceof dk.dtu.compute.mbse.yawl.Action) {
			return new YAWLActionFigure(transition);
		}
		return null;
	}

}
