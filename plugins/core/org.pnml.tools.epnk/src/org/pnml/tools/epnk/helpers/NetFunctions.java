package org.pnml.tools.epnk.helpers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.RefPlace;
import org.pnml.tools.epnk.pnmlcoremodel.RefTransition;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.structuredpntypemodel.Linker;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredPetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolDef;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUse;
import org.pnml.tools.epnk.structuredpntypemodel.SymbolUseMapping;

/** 
 * This class implements some helper methods for calculating properties
 * on nets and its elements.
 * 
 * @author kindler
 * @generated NOT
 *
 */
public class NetFunctions {
	
	public static PetriNet getPetriNet(EObject object) {
		// TODO this should be done a bit more defensively (only for
		//      Petri net elements.
		EObject o = object;
		
		while (o != null && !(o instanceof PetriNet) && o.eContainer() !=  null) {
			o = o.eContainer();
		}
		
		if (o instanceof PetriNet) {
			return (PetriNet) o;
		} else {
			return null;
		}	
	}
	
	public static PetriNetType getPetriNetType(EObject object) {
		PetriNet pn = getPetriNet(object);
		
		if (pn != null) {
			return pn.getType();
		}
		
		return null;
	}
	
	public static List<Object> getAllNetObjects(PetriNet net) {
		List<Object> list = new Vector<Object>();
		
		for (Page p:net.getPage()) {
			list.add(p);
			list.addAll(getAllPageObjects(p));
		}
		return list;
	}
	
	public static List<Object> getAllPageObjects(Page page) {
		List<Object> list = new Vector<Object>();
		
		for (Object object:page.getObject()) {
			list.add(object);
			if (object instanceof Page) {
				Page p = (Page) object;
				list.addAll(getAllPageObjects(p));
			}
		}	
		return list;	
	}
	
	/**
	 * Returns all sub pages of this page (including the page itself).
	 * 
	 * @param net
	 * @return all sub pages
	 */
	public static List<Page> getAllSubPages(Page page) {
		List<Page> list = new Vector<Page>();
		list.add(page);
		
		for (Object object: page.getObject()) {
			if (object instanceof Page) {
				list.addAll(getAllSubPages((Page) object));
			}
		}
		return list;
	}
	
	/**
	 * Resolves a PlaceNode to the Place it is referring to. If the reference cannot
	 * be resolved (because the references are null or the references are cyclic),
	 * the result is null.
	 * 
	 * @param placeNode
	 * @return the Place thePlaceNode ultimately refers to
	 */
	public static Place resolve(PlaceNode placeNode) {
		if (placeNode instanceof Place) {
			return (Place) placeNode;
		} else if (placeNode instanceof RefPlace) {
			RefPlace current = (RefPlace) placeNode;
			Set<RefPlace> passed = new HashSet<RefPlace>();
			while (!passed.contains(current)) {
				passed.add(current);
				PlaceNode ref = current.getRef();
				if (ref instanceof RefPlace) {
					current = (RefPlace) ref;
				} else if (ref instanceof Place){
					return (Place) ref;
				} else {
					return null;
				}
			}
		}
		return null;
	}
	
	/**
	 * Resolves a TransitionNode to the Transition it is referring to. If the reference cannot
	 * be resolved (because the references are null or the references are cyclic),
	 * the result is null.
	 * 
	 * @param transitionNode
	 * @return the Transition the transitionNode ultimately refers to
	 */
	public static Transition resolve(TransitionNode transitionNode) {
		if (transitionNode instanceof Transition) {
			return (Transition) transitionNode;
		} else if (transitionNode instanceof RefTransition) {
			RefTransition current = (RefTransition) transitionNode;
			Set<RefTransition> passed = new HashSet<RefTransition>();
			while (!passed.contains(current)) {
				passed.add(current);
				TransitionNode ref = current.getRef();
				if (ref instanceof RefTransition) {
					current = (RefTransition) ref;
				} else if (ref instanceof Transition){
					return (Transition) ref;
				} else {
					return null;
				}
			}
		}
		return null;
	}

	/**
	 * Resolves a Node to the Node it is referring to. If the reference cannot
	 * be resolved (because the references are null or the references are cyclic),
	 * the result is null. A page always resolves to itself.
	 * 
	 * @param  node
	 * @return the Node the node ultimately refers to
	 */
	public static Node resolve(Node node) {
		if (node instanceof TransitionNode) {
			return resolve((TransitionNode) node);
		} else if  (node instanceof PlaceNode) {
			return resolve((PlaceNode) node);
		} else if (node instanceof Page){
			return node;
		} else {
			return null;
		}
	}
	
	public static void linkNetSymbols(PetriNet net) {
		if (net != null) {
			PetriNetType type = net.getType();
			if (type instanceof StructuredPetriNetType) {
				Linker linker = ((StructuredPetriNetType) type).getLinker();
				if (linker != null) {
					SymbolUseMapping mapping = linker.getglobalLinks(net);
					for (SymbolUse use: mapping.getSymbolUses()) {
						SymbolDef def = mapping.getSymbolDef(use);
						if (def == null && use.eGet(use.getRefFeature()) != null) {
							use.setName(use.getName());
						}
						use.eSet(use.getRefFeature(), mapping.getSymbolDef(use));
					}
				}
			}
		}
	}
}
