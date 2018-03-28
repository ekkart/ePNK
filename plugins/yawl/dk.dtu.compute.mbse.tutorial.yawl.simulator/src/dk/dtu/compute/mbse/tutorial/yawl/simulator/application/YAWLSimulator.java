package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetannotationsFactory;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.applications.adapters.NetChangeListener;
import org.pnml.tools.epnk.applications.ui.ApplicationUIManager;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.Marking;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.YawlannotationsFactory;
import dk.dtu.compute.mbse.yawl.Action;
import dk.dtu.compute.mbse.yawl.Arc;
import dk.dtu.compute.mbse.yawl.CType;
import dk.dtu.compute.mbse.yawl.Condition;
import dk.dtu.compute.mbse.yawl.functions.ControlFlowType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;
import marking.NetMarking;


public class YAWLSimulator extends ApplicationWithUIManager {
	
	private NetChangeListener netChangeListener;
	
	public YAWLSimulator(PetriNet petrinet) {
		super(petrinet);
		getNetAnnotations().setName("A simple YAWL simulator");
		ApplicationUIManager manager = this.getPresentationManager();
		manager.addActionHandler(new EnabledTransitionHandler(this));
		manager.addActionHandler(new SelectArcHandler(this));
		manager.addPresentationHandler(new YAWLAnnotationsPresentationHandler());
		
		netChangeListener = new NetChangeListener(this);		
	}

	@Override
	protected void initializeContents() {
		NetMarking initialMarking = computeInitialMarking();
		NetAnnotation initialAnnotation = computeAnnotation(initialMarking);
		initialAnnotation.setNet(this.getPetrinet());
		
		this.getNetAnnotations().getNetAnnotations().add(initialAnnotation);
		this.getNetAnnotations().setCurrent(initialAnnotation);
	}

	NetMarking computeMarking() {
		NetMarking marking = new NetMarking();
		for (ObjectAnnotation annotation: this.getNetAnnotations().getCurrent().getObjectAnnotations()) {
			if (annotation instanceof Marking) {
				Marking markingAnnotation = (Marking) annotation;
				Object object = markingAnnotation.getObject();
				if (object instanceof Condition && markingAnnotation.getValue() > 0) {
					marking.setMarking((Condition) object, markingAnnotation.getValue());
				}
			}
		}
		return marking;
	}

	NetMarking computeInitialMarking() {
		FlatAccess flatAccess = FlatAccess.getFlatAccess(getPetrinet());
		NetMarking marking = new NetMarking();
		for (Place place: flatAccess.getPlaces()) {
			if (place instanceof Condition) {
				Condition condition = (Condition) place;
				CType type = YAWLFunctions.getType(condition);
				if (type.equals(CType.START)) {
					marking.setMarking(condition, 1);
				}
			}
		}
		return marking;
	}
	
	NetMarking fireTransition(NetMarking marking1,  Arc selectedInArc, Action action, Collection<Arc> selectedOutArcs) {
		FlatAccess flatAccess = FlatAccess.getFlatAccess(getPetrinet());
		NetMarking marking2 = new NetMarking(marking1);
		
		ControlFlowType joinType = YAWLFunctions.getJoinType(action);
		if (joinType.equals(ControlFlowType.AND) ||
				joinType.equals(ControlFlowType.SINGLE)) {
			for (Object in: flatAccess.getIn(action)) {
				if (in instanceof Arc) {
					Arc inArc = (Arc) in;
					if (!YAWLFunctions.isResetArc(inArc)) {
						Object source  = inArc.getSource();
						if (source instanceof PlaceNode) {
							source = flatAccess.resolve((PlaceNode) source);
							if (source instanceof Condition) {
								Condition condition = (Condition) source;
								marking2.decrementMarkingBy(condition, 1);
							}
						}
					}
				}
			}
		} else if (joinType.equals(ControlFlowType.OR)) {
			for (Object in: flatAccess.getIn(action)) {
				if (in instanceof Arc) {
					Arc inArc = (Arc) in;
					if (!YAWLFunctions.isResetArc(inArc)) {
						Object source  = inArc.getSource();
						if (source instanceof PlaceNode) {
							source = flatAccess.resolve((PlaceNode) source);
							if (source instanceof Condition) {
								Condition condition = (Condition) source;
								if (marking2.getMarking(condition) > 0) {
									marking2.decrementMarkingBy(condition, 1);
								}
							}
						}
					}
				}
			}
		} else if (joinType.equals(ControlFlowType.XOR) && selectedInArc != null && !YAWLFunctions.isResetArc(selectedInArc)) {
			Node target = selectedInArc.getTarget();
			if (target instanceof TransitionNode) {
				Transition transition = flatAccess.resolve((TransitionNode) target);
				if (action == transition ) {
					Object source  = selectedInArc.getSource();
					if (source instanceof PlaceNode) {
						source = flatAccess.resolve((PlaceNode) source);
						if (source instanceof Condition) {
							Condition condition = (Condition) source;
							marking2.decrementMarkingBy(condition, 1);
						}
					}
				}
			}
		}
		
		for (Object in: flatAccess.getIn(action)) {
			if (in instanceof Arc) {
				Arc inArc = (Arc) in;
				if (YAWLFunctions.isResetArc(inArc)) {
					Object source  = inArc.getSource();
					if (source instanceof PlaceNode) {
						source = flatAccess.resolve((PlaceNode) source);
						if (source instanceof Condition) {
							marking2.setMarking((Condition) source, 0);
						}
					}
				}
			}
		}
		
		ControlFlowType splitType = YAWLFunctions.getSplitType(action);
		if (splitType.equals(ControlFlowType.AND) || splitType.equals(ControlFlowType.SINGLE)) {
			for (Object out: flatAccess.getOut(action)) {
				if (out instanceof Arc) {
					Arc outArc = (Arc) out;
					Object target  = outArc.getTarget();
					if (target instanceof PlaceNode) {
						target = flatAccess.resolve((PlaceNode) target);
						if (target instanceof Condition) {
							Condition condition = (Condition) target;
							marking2.incrementMarkingBy(condition, 1);
						}
					}
				}
			}
		} else if ((splitType.equals(ControlFlowType.OR) || splitType.equals(ControlFlowType.XOR)) && selectedOutArcs != null) {
			for (Arc outArc: selectedOutArcs) {
				Node source = outArc.getSource();
				if (source instanceof TransitionNode) {
					source = flatAccess.resolve((TransitionNode) source);
				}
				if (action == source) {
					Object target  = outArc.getTarget();
					if (target instanceof PlaceNode) {
						target = flatAccess.resolve((PlaceNode) target);
						if (target instanceof Condition) {
							Condition condition = (Condition) target;
							marking2.incrementMarkingBy(condition, 1);;
						}
					}
				}
			}
		}

		return marking2;
	}

	
	boolean enabled(NetMarking marking, Action action) {
		// XXX This does not work yet if there is more than one arc between the same
		//     place and the same transition! But this should be excluded by constraints anyway.
		FlatAccess flatAccess = FlatAccess.getFlatAccess(getPetrinet());
		ControlFlowType joinType = YAWLFunctions.getJoinType(action);
		if (joinType.equals(ControlFlowType.AND)  ||
				joinType.equals(ControlFlowType.SINGLE)) {
			for (Object in: flatAccess.getIn(action)) {
				if (in instanceof Arc) {
					Arc arc = (Arc) in;
					if (!YAWLFunctions.isResetArc(arc)) {
						Object source = arc.getSource();
						if (source instanceof PlaceNode) {
							source = flatAccess.resolve((PlaceNode) source);
							if (source instanceof Condition) {
								if (marking.getMarking((Condition) source) < 1) {
									return false;
								}
							} else {
								return false;
							}
						} else {
							return false;
						}
					}
				}
			}
			return true;
		} else if (joinType.equals(ControlFlowType.OR) ||
				joinType.equals(ControlFlowType.XOR)) {
			for (Object in: flatAccess.getIn(action)) {
				if (in instanceof Arc) {
					Arc arc = (Arc) in;
					if (!YAWLFunctions.isResetArc(arc)) {
						Object source = arc.getSource();
						if (source instanceof PlaceNode) {
							source = flatAccess.resolve((PlaceNode) source);
							if (source instanceof Condition) {
								if (marking.getMarking((Condition) source) > 0) {
									return true;
								}
							}
						}
					}
				}
			}
			return false;
		}
		
		return false;
	}

	NetAnnotation computeAnnotation(NetMarking marking) {
		FlatAccess flatAccess = FlatAccess.getFlatAccess(getPetrinet());
		NetAnnotation annotation = NetannotationsFactory.eINSTANCE.createNetAnnotation();
		annotation.setNet(getPetrinet());
		Map<Object,Marking> place2MarkingAnnotation = new HashMap<Object,Marking>();
		for (Condition condition: marking.getSupport()) {
			int value = marking.getMarking(condition);
			if (value > 0) {
				Marking markingAnnotation = YawlannotationsFactory.eINSTANCE.createMarking();
				markingAnnotation.setValue(value);
				markingAnnotation.setObject(condition);
				annotation.getObjectAnnotations().add(markingAnnotation);
				place2MarkingAnnotation.put(condition, markingAnnotation);
				// also annotate reference places with the current marking of the place
				for (PlaceNode ref: flatAccess.getRefPlaces(condition)) {
					Marking  markingAnnotationRef =  YawlannotationsFactory.eINSTANCE.createMarking();
					markingAnnotationRef.setValue(value);
					markingAnnotationRef.setObject(ref);
					annotation.getObjectAnnotations().add(markingAnnotationRef);
					place2MarkingAnnotation.put(ref, markingAnnotationRef);
				}
			}
		}
		
		Set<Action> enabled = new HashSet<Action>();
		Set<Arc> startORmarking = new HashSet<Arc>();
		
		for (Transition action: flatAccess.getTransitions()) {
			if (action instanceof Action) {
				if (enabled(marking, (Action) action)) {
					enabled.add((Action) action);
					
					if (YAWLFunctions.getJoinType(action).equals(ControlFlowType.OR)) {
						for (Object in: flatAccess.getIn(action)) {
							if (in instanceof Arc) {
								if (!YAWLFunctions.isResetArc((Arc) in)) {
									startORmarking.add((Arc) in);
									Node source = ((Arc) in).getSource();
									if (source instanceof PlaceNode) {
										Place place = flatAccess.resolve((PlaceNode) source);
										if (place instanceof Condition) {
											if (marking.getMarking((Condition) place) == 0) {
												startORmarking.add((Arc) in);
											}
										}
									}
								}
							}
						}
					}
					
					EnabledTransition transitionAnnotation =
							YawlannotationsFactory.eINSTANCE.createEnabledTransition();
					transitionAnnotation.setObject(action);
					annotation.getObjectAnnotations().add(transitionAnnotation);
					
					for (RefTransition refTransition: flatAccess.getRefTransitions(action)) {
						EnabledTransition transitionAnnotation2 =
								YawlannotationsFactory.eINSTANCE.createEnabledTransition();
						transitionAnnotation2.setObject(refTransition);
						transitionAnnotation2.setResolved(transitionAnnotation);
						annotation.getObjectAnnotations().add(transitionAnnotation2);
					}

					
					if (YAWLFunctions.getJoinType(action).equals(ControlFlowType.XOR)) {
						boolean first = true; 
						for (Object in: flatAccess.getIn(action)) {
							if (in instanceof Arc) {
								if (!YAWLFunctions.isResetArc((Arc) in)) {
									Marking sourceMarking = place2MarkingAnnotation.get(((Arc) in).getSource());
									if (sourceMarking != null) {
										SelectArc arcAnnotation = YawlannotationsFactory.eINSTANCE.createSelectArc();
										arcAnnotation.setObject(((Arc) in));
										arcAnnotation.setSourceMarking(sourceMarking);
										arcAnnotation.setTargetTransition(transitionAnnotation);
										if (first) {
											arcAnnotation.setSelected(true);
											first = false;
										} else {
											arcAnnotation.setSelected(false);
										}
										annotation.getObjectAnnotations().add(arcAnnotation);
									}
								}
							}
						}
					}
					
					if (YAWLFunctions.getSplitType(action).equals(ControlFlowType.XOR)) {
						boolean first = true; 
						for (Object out: flatAccess.getOut(action)) {
							if (out instanceof Arc) {
								SelectArc arcAnnotation = YawlannotationsFactory.eINSTANCE.createSelectArc();
								arcAnnotation.setObject(((Arc) out));
								arcAnnotation.setSourceTransition(transitionAnnotation);
								if (first) {
									arcAnnotation.setSelected(true);
									first = false;
								} else {
									arcAnnotation.setSelected(false);
								}
								annotation.getObjectAnnotations().add(arcAnnotation);
							}
						}
					}
					
					if (YAWLFunctions.getSplitType(action).equals(ControlFlowType.OR)) {
						for (Object out: flatAccess.getOut(action)) {
							if (out instanceof Arc) {
								SelectArc arcAnnotation = YawlannotationsFactory.eINSTANCE.createSelectArc();
								arcAnnotation.setObject(((Arc) out));
								arcAnnotation.setSourceTransition(transitionAnnotation);
								arcAnnotation.setSelected(true);
								annotation.getObjectAnnotations().add(arcAnnotation);
							}
						}
					}
					
					

				}
			}
		}
		
		// In the remainder, the annotations for possible tokens arriving on the preset of OR-joins
		// are computed in a combination of a backwards and forward marking algorithm
		Set<org.pnml.tools.epnk.pnmlcoremodel.Object> backwards = 
				new HashSet<org.pnml.tools.epnk.pnmlcoremodel.Object>();
		List<Arc> added = new LinkedList<Arc>();
		added.addAll(startORmarking);
		while (!added.isEmpty()) {
			Arc arc = added.remove(0);
			if (!YAWLFunctions.isResetArc(arc) && 
					!backwards.contains(arc)) {
				Object source = arc.getSource();
				if (source instanceof PlaceNode) {
					Place place = flatAccess.resolve((PlaceNode) source);
					if (place instanceof Condition) {
						if (marking.getMarking((Condition) place) == 0 ) {
							backwards.add(arc);
							if (!backwards.contains(place)) {
								backwards.add(place);
								for (Object in : flatAccess.getIn(place)) {
									if (in instanceof Arc) {
										added.add((Arc) in);
									}
								}
							}
						}	
					}
				} else if (source instanceof TransitionNode) {
					Transition transition = flatAccess.resolve((TransitionNode) source);
					if (transition instanceof Action) {
						Action action = (Action) transition;
						if (!YAWLFunctions.getJoinType(action).equals(ControlFlowType.OR)) {
							backwards.add(arc);
							if (!enabled.contains(action) &&
									!backwards.contains(action)) {
								backwards.add(action);
								for (Object in : flatAccess.getIn(action)) {
									if (in instanceof Arc) {
										added.add((Arc) in);
									}
								}
							}
						}
					}
				}
			}
		}
		
		Set<org.pnml.tools.epnk.pnmlcoremodel.Object> forward = 
				new HashSet<org.pnml.tools.epnk.pnmlcoremodel.Object>();
		added.clear(); // should be empty anyway
		for (Action action: enabled) {
			for (Object out: flatAccess.getOut(action)) {
				if (out instanceof Arc) {
					added.add((Arc) out);
				}
			}
		}
		while (!added.isEmpty()) {
			Arc arc = added.remove(0);
			if (backwards.contains(arc) && !forward.contains(arc)) {
				forward.add(arc);
				Object source = arc.getTarget();
				if (source instanceof PlaceNode) {
					Place place = flatAccess.resolve((PlaceNode) source);
					if (place instanceof Condition &&
							backwards.contains(place) &&
							!forward.contains(place)) {
						forward.add(place);
						for (Object out: flatAccess.getOut(place)) {
							if (out instanceof Arc) {
								added.add((Arc) out);
							}
						}
					}
				} else if (source instanceof TransitionNode) {
					Transition transition = flatAccess.resolve((TransitionNode) source);
					if (transition instanceof Action  &&
							backwards.contains(transition) &&
							!forward.contains(transition)) {
						forward.add(transition);
						for (Object out: flatAccess.getOut(transition)) {
							if (out instanceof Arc) {
								added.add((Arc) out);
							}
						}
						
					}
				}
			}
			
		}
		for (Object object: forward) {
			if (object instanceof Arc) {
				Arc arc = (Arc) object;
				Object source = arc.getSource();
				if (source instanceof TransitionNode) {
					Transition transition = flatAccess.resolve((TransitionNode) source);
					ControlFlowType splitType = YAWLFunctions.getSplitType(transition);
					if (!enabled.contains(transition) ||
							(!splitType.equals(ControlFlowType.OR) &&
									!splitType.equals(ControlFlowType.XOR))) {
						// make sure that no arc annotation is created if there would be a SelectArc annotation already
						ObjectAnnotation objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
						objectAnnotation.setObject(arc);
						annotation.getObjectAnnotations().add(objectAnnotation);
					}
				} else {
					ObjectAnnotation objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
					objectAnnotation.setObject(arc);
					annotation.getObjectAnnotations().add(objectAnnotation);
				}
			} else if (object instanceof Node) {
				ObjectAnnotation objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
				objectAnnotation.setObject((Node) object);
				annotation.getObjectAnnotations().add(objectAnnotation);
				if (object instanceof Place) {
					for (RefPlace refPlace: flatAccess.getRefPlaces((Place) object)) {
						objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
						objectAnnotation.setObject(refPlace);
						annotation.getObjectAnnotations().add(objectAnnotation);
					}
				} else if (object instanceof Transition) {
					for (RefTransition refTransition: flatAccess.getRefTransitions((Transition) object)) {
						objectAnnotation = NetannotationsFactory.eINSTANCE.createObjectAnnotation();
						objectAnnotation.setObject(refTransition);
						annotation.getObjectAnnotations().add(objectAnnotation);
					}
				}
			}
		}
		return annotation;
	}

	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.Application#isSavable()
	 */
	@Override
	public boolean isSavable() {
		return true;
	}


	/* (non-Javadoc)
	 * @see org.pnml.tools.epnk.applications.Application#shutDown()
	 */
	@Override
	protected void shutDown() {
		super.shutDown();
		
		if (netChangeListener != null) {
			netChangeListener.dispose();
			netChangeListener = null;
		}
	}
	
	
}
