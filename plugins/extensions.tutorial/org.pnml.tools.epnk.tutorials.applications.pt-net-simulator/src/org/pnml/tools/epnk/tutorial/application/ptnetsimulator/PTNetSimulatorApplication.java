package org.pnml.tools.epnk.tutorial.application.ptnetsimulator;

import java.util.HashMap;
import java.util.Map;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.adapters.NetChangeListener;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.pntypes.ptnet.Arc;
import org.pnml.tools.epnk.pntypes.ptnet.PTArcAnnotation;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;

import ptnetsimulator.Mode;
import ptnetsimulator.PlaceMarkingAnnotation;
import ptnetsimulator.PtnetsimulatorFactory;
import ptnetsimulator.TransitionActivationAnnotation;

public class PTNetSimulatorApplication extends ApplicationWithUIManager {

	private NetChangeListener changeListener;
	
	public PTNetSimulatorApplication(PetriNet petrinet) {
		super(petrinet);
		changeListener = new NetChangeListener(this);

		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new FireTransitionHandler(this));
		manager.addActionHandler(new SelectPlaceHandler(this));
		manager.addPresentationHandler(new PTSimulationPresentationHandler());
	}

	@Override
	protected void initializeContents() {
		Map<Place,Integer> initialMarking = computeInitialMarking();
		NetAnnotation initialAnnotation = computeAnnotation(initialMarking);
		initialAnnotation.setNet(this.getPetrinet());
		
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	Map<Place,Integer> computeMarking() {
		Map<Place,Integer> marking = new HashMap<Place,Integer>();
		for (ObjectAnnotation annotation: this.getNetAnnotations().getCurrent().getObjectAnnotations()) {
			if (annotation instanceof PlaceMarkingAnnotation) {
				PlaceMarkingAnnotation markingAnnotation = (PlaceMarkingAnnotation) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Place && markingAnnotation.getText() > 0) {
					Place ptPlace = (Place) object;
					marking.put(ptPlace, markingAnnotation.getText());
				}
			}
		}
		return marking;
	}

	Map<Place,Integer> computeInitialMarking() {
		FlatAccess flatNet = FlatAccess.getFlatAccess(this.getPetrinet());
		Map<Place,Integer> marking = new HashMap<Place,Integer>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Place place: flatNet.getPlaces()) {
			if (place instanceof org.pnml.tools.epnk.pntypes.ptnet.Place) {
				org.pnml.tools.epnk.pntypes.ptnet.Place ptPlace = (org.pnml.tools.epnk.pntypes.ptnet.Place) place;
				PTMarking ptMarking = ptPlace.getInitialMarking();
				if (ptMarking != null && ptMarking.getText() != null) {
					marking.put(ptPlace,ptMarking.getText().getValue());
				} 
			}
		}
		return marking;
	}
	
	Map<Place,Integer> fireTransition(Map<Place,Integer> marking1, Transition transition) {
		Map<Place,Integer> marking2 = new HashMap<Place,Integer>(marking1);
		
		Map<Place,Integer> consumes = consumes(transition);
		for (Place place: consumes.keySet()) {
			if (marking2.containsKey(place)) {
				marking2.put(place, marking2.get(place) - consumes.get(place));
			} else {
				// This should not happen! In the context of this simulator this, can
				// happen only when the net is changed while the simulator is running already.
				marking2.put(place, -consumes.get(place));
			}
		}
		
		Map<Place,Integer> produces = produces(transition);
		for (Place place: produces.keySet()) {
			if (marking2.containsKey(place)) {
				marking2.put(place, marking2.get(place) + produces.get(place));
			} else {
				marking2.put(place, produces.get(place));
			}
		}

		return marking2;
	}

	
	boolean enabled(Map<Place,Integer> marking, Transition transition) {
		Map<Place,Integer> consumes = consumes(transition);
		for (Place place: consumes.keySet()) {
			if (marking.containsKey(place)) {
				if (marking.get(place) < consumes.get(place)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
	
	Map<Place,Integer> consumes(Transition transition) {
		FlatAccess flatNet = FlatAccess.getFlatAccess(getPetrinet());
		Map<Place,Integer> result = new HashMap<Place,Integer>();
		for (Object arc: flatNet.getIn(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				PTArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object source = ptArc.getSource();
				if (source instanceof PlaceNode) {
					source = flatNet.resolve((PlaceNode) source);
					if (source instanceof Place) {
						int needed = 1; 
						if (ptArcAnnotation != null) {
							needed = ptArcAnnotation.getText().getValue();
						}
						int current = 0;
						if (result.containsKey((Place) source)) {
							current = result.get((Place) source);
						}
						result.put((Place) source, current + needed);
					}
				}
			}
		}
		return result;
	}
	
	Map<Place,Integer> produces(Transition transition) {
		FlatAccess flatNet = FlatAccess.getFlatAccess(getPetrinet());
		Map<Place,Integer> result = new HashMap<Place,Integer>();
		for (Object arc: flatNet.getOut(transition)) {
			if (arc instanceof Arc) {
				Arc ptArc = (Arc) arc;
				PTArcAnnotation ptArcAnnotation = ptArc.getInscription();
				Object target = ptArc.getTarget();
				if (target instanceof PlaceNode) {
					target = flatNet.resolve((PlaceNode) target);
					if (target instanceof Place) {
						int produced = 1; 
						if (ptArcAnnotation != null) {
							produced = ptArcAnnotation.getText().getValue();
						}
						int current = 0;
						if (result.containsKey((Place) target)) {
							current = result.get((Place) target);
						}
						result.put((Place) target, current + produced);
					}
				}
			}
		}
		return result;
	}

	NetAnnotation computeAnnotation(Map<Place,Integer> marking) {
		FlatAccess flatNet = FlatAccess.getFlatAccess(this.getPetrinet());
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		for (Place place: marking.keySet()) {
			int value = marking.get(place);
			if (value > 0) {
				PlaceMarkingAnnotation markingAnnotation = PtnetsimulatorFactory.eINSTANCE.createPlaceMarkingAnnotation();
				markingAnnotation.setText(value);
				markingAnnotation.setObject(place);
				annotation.getObjectAnnotations().add(markingAnnotation);
				// also annotate reference places with the current marking of the place
				for (PlaceNode ref: flatNet.getRefPlaces(place)) {
					PlaceMarkingAnnotation markingAnnotationRef = PtnetsimulatorFactory.eINSTANCE.createPlaceMarkingAnnotation();
					markingAnnotationRef.setText(value);
					markingAnnotationRef.setObject(ref);
					annotation.getObjectAnnotations().add(markingAnnotationRef);	
				}
			}
		}
		
		for (Transition transition: flatNet.getTransitions()) {
			if (enabled(marking, transition)) {
				TransitionActivationAnnotation transitionAnnotation =
						PtnetsimulatorFactory.eINSTANCE.createTransitionActivationAnnotation();
				transitionAnnotation.setObject(transition);
				transitionAnnotation.setMode(Mode.ENABLED);
				annotation.getObjectAnnotations().add(transitionAnnotation);
				// also annotate reference transitions referring to an enabled transition 
				for (TransitionNode ref: flatNet.getRefTransitions(transition)) {
					transitionAnnotation =
							PtnetsimulatorFactory.eINSTANCE.createTransitionActivationAnnotation();
					transitionAnnotation.setObject(ref);
					transitionAnnotation.setMode(Mode.ENABLED);
					annotation.getObjectAnnotations().add(transitionAnnotation);
				}
			}
		}
		return annotation;
	}
	
	

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.Application#shutDown()
	 */
	@Override
	protected void shutDown() {
		super.shutDown();
		if (changeListener != null) {
			this.changeListener.dispose();
		}
	}

	@Override
	public boolean isSavable() {
		return true;
	}

}
