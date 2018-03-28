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
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 */
package org.pnml.tools.epnk.helpers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Graphics;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.ToolInfo;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

public class FlatAccess {
		
	private List<Place> places;
	private List<Transition> transitions;
	
	private Map<RefPlace,Place> ref2place;
	private Map<RefTransition,Transition> ref2transition;
	
	private Map<Place,List<RefPlace>> place2ref;
	private Map<Transition,List<RefTransition>> transition2ref;
	
	private FlatAccessAdapter adapter;
	
	/**
	 * Creates a FlatAccess for a net. Note that this should not be
	 * used anymore.
	 *
	 * @deprecated use {@link #getFlatAccess()} instead.  
	 */
	@Deprecated
	public FlatAccess(PetriNet net) {
		this(net, null);
	}
	
	FlatAccess(PetriNet net, FlatAccessAdapter adapter) {
		super();
		this.adapter = adapter;
		
		places = new ArrayList<Place>();
		transitions = new ArrayList<Transition>();
		ref2place = new HashMap<RefPlace,Place>();
		ref2transition = new HashMap<RefTransition,Transition>();
		place2ref = new HashMap<Place,List<RefPlace>>();
		transition2ref = new HashMap<Transition,List<RefTransition>>();
		
		List<Object> objects = NetFunctions.getAllNetObjects(net);
		for (Object object: objects) {
			if (object instanceof Place) {
				places.add((Place) object); 
			} else if (object instanceof Transition) {
				transitions.add((Transition) object); 
			} else if (object instanceof RefPlace) {
				RefPlace refPlace = (RefPlace) object;
				if (!ref2place.containsKey(refPlace)) {
					resolveRefPlace((RefPlace) object);
				};
			} else if (object instanceof RefTransition) {
				RefTransition refTransition = (RefTransition) object;
				if (!ref2transition.containsKey(refTransition)) {
					resolveRefTransition((RefTransition) object);
				};				
			}
		}
		
		// make the list unmodifiable
		places = Collections.unmodifiableList(places);
		transitions = Collections.unmodifiableList(transitions);
	}
	
	/**
	 * Returns an unmodifiable list of all places of the Petri net.
	 * 
	 * @return
	 */
	public List<Place> getPlaces() {
		return places;
	}

	/**
	 * Returns an unmodifiable list of all transitions of the Petri net.
	 * 
	 * @return
	 */
	public List<Transition> getTransitions() {
		return transitions;
	}
	
	public Place resolve(PlaceNode node) {
		if (node instanceof Place) {
			return (Place) node;
		}
		return ref2place.get(node);
	}
	
	public Transition resolve(TransitionNode node) {
		if (node instanceof Transition) {
			return (Transition) node;
		}
		return ref2transition.get(node);
	}
	
	/**
	 * Returns an unmodifiable list of all reference places that
	 * refer to the place.
	 * 
	 * @param p the place
	 * @return unmodifiable list of all reference places 
	 */
    public List<RefPlace> getRefPlaces(Place p) {
    	List<RefPlace> refPlaces = place2ref.get(p);
    	if (refPlaces != null) {
    		return Collections.unmodifiableList(refPlaces);
    	} else {
    		return Collections.emptyList();
    	}
    }
    
	/**
	 * Returns an unmodifiable list of all reference transitions that
	 * refer to the transition.
	 * 
	 * @param t the transition
	 * @return unmodifiable list of all reference transitions 
	 */
    public List<RefTransition> getRefTransitions(Transition t) {
    	List<RefTransition> refTransitions = transition2ref.get(t);
    	if (refTransitions != null) {
    		return Collections.unmodifiableList(refTransitions);
    	} else {
    		return Collections.emptyList();
    	}
    }
	
	public List<Arc> getOut(Node node) {
		ArrayList<Arc> result = new ArrayList<Arc>();
		
		if (node instanceof PlaceNode) {
			PlaceNode placeNode = (PlaceNode) node;
			Place place = resolve(placeNode);
			if (place != null ) {
				result.addAll(place.getOut());
				List<RefPlace> list = place2ref.get(place);
				if (list != null) {
					for (RefPlace rp: list) {
						result.addAll(rp.getOut());
					}
				}
			}
		}
		
		if (node instanceof TransitionNode) {
			TransitionNode transitionNode = (TransitionNode) node;
			Transition transition = resolve(transitionNode);
			if (transition != null ) {
				result.addAll(transition.getOut());
				List<RefTransition> list = transition2ref.get(transition);
				if (list != null) {
					for (RefTransition rt: list) {
						result.addAll(rt.getOut());
					}
				}
			}
		}
		
		return result;
	}
	
	public List<Arc> getIn(Node node) {
		ArrayList<Arc> result = new ArrayList<Arc>();
		
		if (node instanceof PlaceNode) {
			PlaceNode placeNode = (PlaceNode) node;
			Place place = resolve(placeNode);
			if (place != null ) {
				result.addAll(place.getIn());
				List<RefPlace> list = place2ref.get(place);
				if (list != null) {
					for (RefPlace rp: list) {
						result.addAll(rp.getIn());
					}
				}
			}
		}
		
		if (node instanceof TransitionNode) {
			TransitionNode transitionNode = (TransitionNode) node;
			Transition transition = resolve(transitionNode);
			if (transition != null ) {
				result.addAll(transition.getIn());
				List<RefTransition> list = transition2ref.get(transition);
				if (list != null) {
					for (RefTransition rt: list) {
						result.addAll(rt.getIn());
					}
				}
			}
		}
		
		return result;
	}
	
	private void resolveRefPlace(RefPlace refPlace) {
		HashSet<RefPlace> met = new HashSet<RefPlace>();
		Place place = null;
		
		while (refPlace != null && 
				!met.contains(refPlace) &&
				!ref2place.containsKey(refPlace)) {
			met.add(refPlace);
			PlaceNode placeNode = refPlace.getRef();
			if (placeNode instanceof Place) {
				place = (Place) placeNode;
				refPlace = null;
			} else {
				refPlace = (RefPlace) placeNode;
			}
		}
		
		if (ref2place.containsKey(refPlace)) {
			place = ref2place.get(refPlace);
		}
		if (place != null) {
			for (RefPlace ref: met) {
				ref2place.put(ref, place);
				List<RefPlace> list = place2ref.get(place);
				if (list == null) {
					list = new ArrayList<RefPlace>();
					place2ref.put(place, list);
				}
				list.add(ref);
			}
		}
	}
	
	private void resolveRefTransition(RefTransition refTransition) {
		HashSet<RefTransition> met = new HashSet<RefTransition>();
		Transition transition = null;
		
		while (refTransition != null && 
				!met.contains(refTransition) &&
				!ref2transition.containsKey(refTransition)) {
			met.add(refTransition);
			TransitionNode transitionNode = refTransition.getRef();
			if (transitionNode instanceof Transition) {
				transition = (Transition) transitionNode;
				refTransition = null;
			} else {
				refTransition = (RefTransition) transitionNode;
			}
		}
		
		if (ref2transition.containsKey(refTransition)) {
			transition = ref2transition.get(refTransition);
		}
		if (transition != null) {
			for (RefTransition ref: met) {
				ref2transition.put(ref, transition);
				List<RefTransition> list = transition2ref.get(transition);
				if (list == null) {
					list = new ArrayList<RefTransition>();
					transition2ref.put(transition, list);
				}
				list.add(ref);
			}
		}
	}	
	
	public boolean addInvalidationListener(Adapter listener) {
		if (adapter != null) {
			return adapter.addInvalidationListener(listener);
		} else {
			return false;
		}
	}
	
	public boolean removeInvalidationListener(Adapter listener) {
		if (adapter != null) {
			return adapter.removeInvalidationListener(listener);
		} else {
			return false;
		}
	}
	
	static public FlatAccess getFlatAccess(PetriNet net) {
		FlatAccess flatAccess = null;
		for (Adapter adapter: net.eAdapters()) {
			if (adapter instanceof FlatAccessAdapter) {
				flatAccess = ((FlatAccessAdapter) adapter).getFlatAccess();
				if (flatAccess != null) {
					return flatAccess;
				}
			}
			
		}

		while (flatAccess == null) {
			FlatAccessAdapter adapter = new FlatAccessAdapter(net);
			flatAccess = adapter.getFlatAccess();
		}
		
		return flatAccess;
	}
	
}

/**
 * This is an adapter that contains a FlatAccess for a Petrinet object.
 * This adapter and net will be removed when the net changes. This way, only
 * one instance of FlatAccess needs to be created and can be used by different
 * parts of the software (avoiding the need for creating the FlatAccess for
 * the same net multiple time).
 * 
 * @generated NOT
 */
class FlatAccessAdapter extends EContentAdapter {
	
	private final PetriNet petrinet;
	private FlatAccess flatAccess;
	
	private Set<Adapter> invalidationlisteners;

	public FlatAccessAdapter(PetriNet petrinet) {
		super();
		this.petrinet = petrinet;
		this.flatAccess = new FlatAccess(petrinet, this);
		petrinet.eAdapters().add(this);
		invalidationlisteners = new HashSet<Adapter>();
	}
	
	/**
	 * Returns a FlatAccess object for the Petri net; the same FlatAccess will
	 * be return as long as the Petri net does not change.
	 * 
	 * @return the flat access for the Petri net; it might be null!
	 */
	public synchronized FlatAccess getFlatAccess() {
		return flatAccess;
	}
	
	public synchronized boolean addInvalidationListener(Adapter adapter) {
		if (flatAccess != null && invalidationlisteners != null) {
			invalidationlisteners.add(adapter);
			return true;
		}
		return false;
	}
	
	public synchronized boolean removeInvalidationListener(Adapter adapter) {
		if (flatAccess != null && invalidationlisteners != null) {
			invalidationlisteners.remove(adapter);
			return true;
		}
		return false;
	}
	
	private synchronized boolean invalidate() {
		boolean result = flatAccess != null;
		flatAccess = null;
		return result;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		java.lang.Object feature = notification.getFeature();
		if (!notification.isTouch() && flatAccess != null &&
				feature != PnmlcoremodelPackage.eINSTANCE.getObject_Graphics() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getLabel_Graphics() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getPage_Labelproxy() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getPage_PageLabelProxy() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getPetriNet_Toolspecific() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getObject_Toolspecific() &&
				feature != PnmlcoremodelPackage.eINSTANCE.getLabel_Toolspecific() ) {
			// ignore notifications on graphical and tool specific information (in particular diagram info)
			if (invalidate()) {
				this.petrinet.eAdapters().remove(this);
				for (Adapter adapter: this.invalidationlisteners) {
					adapter.notifyChanged(notification);
				}
				invalidationlisteners = null;
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(java.lang.Object type) {
		return type.equals(FlatAccessAdapter.class);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#addAdapter(org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected void addAdapter(Notifier notifier) {
		if (!(notifier instanceof Graphics) &&
				!(notifier instanceof ToolInfo)) {
			// do not add adapter to graphical information, tool specific information and beyond
			super.addAdapter(notifier);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#selfAdapt(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	protected void selfAdapt(Notification notification) {
		java.lang.Object notifier = notification.getNotifier();
		if (!(notifier instanceof Graphics) &&
				!(notifier instanceof ToolInfo)) {
			// do not handle adapters on graphical information, tool specific information and beyond
			super.selfAdapt(notification);
		}
	}

}
