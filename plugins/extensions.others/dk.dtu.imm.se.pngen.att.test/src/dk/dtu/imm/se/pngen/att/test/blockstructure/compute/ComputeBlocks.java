package dk.dtu.imm.se.pngen.att.test.blockstructure.compute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Block;
import dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructureFactory;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Choice;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Loop;
import dk.dtu.imm.se.pngen.att.test.blockstructure.Sequence;

public class ComputeBlocks {
	
	
	public static Block computeBlocks(PetriNet net) {
		FlatAccess flat = FlatAccess.getFlatAccess(net);
		Place start = null;
		Place end = null;
		
		for (Place place: flat.getPlaces()) {
		    Name name = place.getName();	
		    if (name != null) {
		    	if ("start".equals(name.getText())) {
		    		if (start == null) {
		    			start = place;
		    		} else {
		    			// no unique start place
		    			return null;
		    		}
		    	}

		    	if ("end".equals(name.getText())) {
		    		if (end == null) {
		    			end = place;
		    		} else {
		    			// no unique end place;
		    			return null;
		    		}
		    	}
		    }
		}
		
		if (start != null && end != null) {
			
			Block block = computeBlock(flat, new HashSet<Object>(), start, end);
			if (block != null) {
				Set<Place> places = new HashSet<Place>(flat.getPlaces());
				places.removeAll(block.getCovered());
				if (!places.isEmpty()) {
					return null;
				}
				Set<Transition> transitions = new HashSet<Transition>(flat.getTransitions());
				transitions.removeAll(block.getCovered());
				if (!transitions.isEmpty()) {
					return null;
				}
			}

			return block; 
		} else {
			// Missing a start or end place
			return null;
		}
	}
	
	public static boolean insertArc(Arc arc, Set<Object> elements, List<Arc> list, Map<Arc,Set<Object>> arc2set) {
		if (list.isEmpty()) {
			list.add(arc);
			arc2set.put(arc, elements);
			return true;
		} else {
			for (int i=0; i < list.size(); i++) {
				Set<Object> set = arc2set.get(list.get(i));
				if (elements.containsAll(set)) {
					arc2set.put(arc, elements);
					list.add(i, arc);
					return true;
				} else if (!set.containsAll(elements)) {
					return false;
				}
			}
			list.add(arc);
			arc2set.put(arc, elements);
			return true;
		}
	}
	
	public static List<Arc> computeLoopReturnArcs(FlatAccess flat, Set<Object> marked, List<Arc> arcs) {
		List<Arc> result = new ArrayList<Arc>();
	    Map<Arc,Set<Object>> arc2set = new HashMap<Arc,Set<Object>>();
		for (Arc arc: arcs) {
			Set<Object> elements = new HashSet<Object>();
			if (isLoopReturn(flat, marked, arc, elements)) {
				elements.retainAll(flat.getPlaces());
				if (!insertArc(arc, elements, result, arc2set)) {
					// could not successfully be inserted
					return new ArrayList<Arc>();
				}
			}
		}
		return result;
	}
	  
	public static boolean isLoopReturn(FlatAccess flat, Set<Object> marked, Arc arc, Set<Object> explored) {
		Node node = arc.getTarget();
		if (node instanceof PlaceNode) {
			Place startPlace = flat.resolve((PlaceNode) node);
			List<Object> added = new ArrayList<Object>();
			added.add(arc);
			while (!added.isEmpty()) {
				Object object = added.remove(0);
				if (object.equals(startPlace)) {
					explored.add(object);
				} else if (marked.contains(object)) {
					return false;
				} else {
					if (!explored.contains(object)) {
						explored.add(object);
						if (object instanceof Arc) {
							node = ((Arc) object).getSource();
							if (node instanceof PlaceNode) {
								object = flat.resolve((PlaceNode) node);
							} else if (node instanceof TransitionNode) {
								object = flat.resolve((TransitionNode) node);
							} else {
								object = null;
							}
							if (object != null) {
								added.add(object); 
							}
						} else if (object instanceof Node) {
							added.addAll(flat.getIn((Node) object));
						}
					}
				}	
			}
			if (explored.contains(startPlace)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static Loop computeLoop(FlatAccess flat, Set<Object> matched, List<Arc> arcs, Place start) {
		if (!arcs.isEmpty()) {
			Arc arc = arcs.remove(0);
			Node node = arc.getSource();
			if (!(node instanceof TransitionNode)) {
				return null;
			} 
			Transition transition = flat.resolve((TransitionNode) node);
			List<Arc> inArcs = flat.getIn(transition);
			if (inArcs.size() != 1) {
				// not a loop
				return null;
			} else {
				Arc in = inArcs.get(0);
				Node node2 = in.getSource();
				if (node2 instanceof PlaceNode) {
					Place place = flat.resolve((PlaceNode) node2);
					Atomic atomic = computeAtomic(flat, new HashSet<Object>(matched), in, start);
					if (atomic == null) {
						// should not happen, but something was wrong here
						return null;
					} else {
						List<Object> atomicMatched = atomic.getCovered();
						// Note: the end of the loop should not be marked
						//       as matched yet (so that other loops) could
						//       use the same place as the end of the loop.
						atomicMatched.remove(atomic.getStart());
						matched.addAll(atomicMatched);
						Block body = null;
						if (arcs.isEmpty()) {
							body = computeBlock(flat, new HashSet<Object>(matched), start, place);
						} else {
							body = computeLoop(flat, new HashSet<Object>(matched), arcs, start);
							if (body != null) {
								Place end = body.getEnd();
								if (!end.equals(place)) {
									matched.addAll(body.getCovered());
									Block rest = computeBlock(flat, new HashSet<Object>(matched), end, place);
									if (rest != null) {
										if (rest.isStartsafe()) {
											if (rest instanceof Sequence) {
												Sequence sequence = (Sequence) rest;
												sequence.setStart(body.getStart());
												sequence.setStartsafe(body.isStartsafe());
												sequence.getSubblocks().add(0,body);
												sequence.getCovered().addAll(body.getCovered());
												body = sequence;
											} else {
												Sequence sequence = BlockstructureFactory.eINSTANCE.createSequence();
												List<Block> blocks = sequence.getSubblocks();
												blocks.add(body);
												blocks.add(rest);
												List<Object> covered = sequence.getCovered();
												covered.addAll(body.getCovered());
												covered.addAll(rest.getCovered());
												sequence.setStart(body.getStart());
												sequence.setStartsafe(body.isStartsafe());
												sequence.setEnd(rest.getEnd());
												sequence.setEndsafe(rest.isEndsafe());
												body = sequence;
											}
										} else {
											return null;
										}
									} else {
										return null;
									}
								}
							} else {
								return null;
							}
						}
						if (body != null) {
							Loop loop = BlockstructureFactory.eINSTANCE.createLoop();
							loop.setStart(start);
							loop.setStartsafe(false);
							loop.setEnd(place);
							loop.setEndsafe(false);
							loop.setBack(atomic);
							loop.setBody(body);
							List<Object> covered = loop.getCovered();
							covered.addAll(atomic.getCovered());
							covered.addAll(body.getCovered());
							return loop;
						} 	
					}
				} 
			}
		}
		return null;
	}

	public static Block computeBlock(FlatAccess flat, Set<Object> matched, Place start, Place end) {
		if (start != null && start.equals(end)) {
			// for now, the empty sequence is not considered to be a
			// sequence construct
			return null;
		}
		List<Block> blocks = new ArrayList<Block>();
		
		while (!start.equals(end)) {
			List<Arc> inArcs = flat.getIn(start);
			inArcs.removeAll(matched);
			List<Arc> loopReturnArcs = computeLoopReturnArcs(flat,matched,inArcs);
			inArcs.removeAll(loopReturnArcs);
			if (inArcs.size() > 0) {
				if (end == null) {
					break;
				} else {
					return null;
				}					
			} else {

				if (!loopReturnArcs.isEmpty()) {
					Loop loop = computeLoop(flat, new HashSet<Object>(matched), loopReturnArcs, start);
					if (loop != null) {
						blocks.add(loop);
						matched.addAll(loop.getCovered());
						start = loop.getEnd();
					} else {
						return null;
					}
				} else {
					List<Arc> outArcs = flat.getOut(start);
					outArcs.removeAll(matched);
					if (outArcs.size() > 1) {
						Choice choice = computeChoice(flat,new HashSet<Object>(matched),start,null);
						if (choice != null) {
							blocks.add(choice);
							matched.addAll(choice.getCovered());
							start = choice.getEnd();
						} else {
							// net structure is incorrect
							return null;
						}
					} else if (outArcs.size() == 1) {
						Atomic atomic = computeAtomic(flat, new HashSet<Object>(matched), outArcs.get(0), null);
						if (atomic != null) {
							blocks.add(atomic);
							matched.addAll(atomic.getCovered());
							start = atomic.getEnd();
						} else {
							// net structure is incorrect
							return null;
						}
					} else {
						// This is not necessarily incorrect; it could be considered
						// as an special termination; but for now, we do not consider
						// this case to be illegal
						return null;
					}
				}
			}
		}
		
		if (end == null || start.equals(end)) {
			if (blocks.size() > 1) {
				boolean safe = true;
				for (int i=0; i+1 < blocks.size() && safe; i++) {
					safe = blocks.get(i).isEndsafe() || blocks.get(i+1).isStartsafe();
				}
				if (!safe) {
					return null;
				}
				Sequence sequence = BlockstructureFactory.eINSTANCE.createSequence();
				Block block = blocks.get(0);
				sequence.setStart(block.getStart());
				sequence.setStartsafe(block.isStartsafe());
				block= blocks.get(blocks.size()-1);
				sequence.setEnd(block.getEnd());
				sequence.setEndsafe(block.isEndsafe());
				sequence.getSubblocks().addAll(blocks);
				List<Object> covered = sequence.getCovered();
				for (Block block1: blocks) {
					covered.addAll(block1.getCovered());
				}
				return sequence;
			} else if (blocks.size() == 1) {
				return blocks.get(0);		
			} else {
				// we could return the empty block here; but this is
				// not yet defined;
				return null;
			} 
		} else {
			return null;
		}
	}
	
	public static Block computeBlock(FlatAccess flat, Set<Object> matched, Arc in, Place end) {
		if (matched.contains(in)) {
			// no legal block
			return null;
		} else {
			Atomic atomic = computeAtomic(flat, new HashSet<Object>(matched), in, null);
			if (atomic != null) {
				Place start = atomic.getEnd();
				if (end != null && start.equals(end)) {
					return atomic;
				} else {
  
					matched.addAll(atomic.getCovered());
					List<Arc> arcsIn = flat.getIn(start);
					arcsIn.removeAll(matched);
					if (arcsIn.size() > 0) {
						if (arcsIn.size() > 1 &&  end == null) {
							return atomic;
						} else if (arcsIn.size() == 1 && end == null) {
							Arc arc = arcsIn.get(0);
							if (!isLoopReturn(flat,matched,arc,new HashSet<Object>())) {
								return atomic;
							}
						}
					}
					
					Block block = computeBlock(flat, matched, start, end);
					if (block instanceof Sequence) {
						Sequence sequence = (Sequence) block;
						sequence.setStart(atomic.getStart());
						sequence.setStartsafe(true);
						sequence.getSubblocks().add(0, atomic);
						sequence.getCovered().addAll(atomic.getCovered());
						return sequence;
					} else if (block != null) {
						Sequence sequence = BlockstructureFactory.eINSTANCE.createSequence();
						List<Block> subblocks = sequence.getSubblocks();
						subblocks.add(atomic);
						subblocks.add(block);
						sequence.setStart(atomic.getStart());
						sequence.setStartsafe(true);
						sequence.setEnd(block.getEnd());
						sequence.setEndsafe(block.isEndsafe());
						List<Object> covered = sequence.getCovered();
						covered.addAll(atomic.getCovered());
						covered.addAll(block.getCovered());
						return sequence;
					}
				}
			}
		}
		return null;
	}

	public static Atomic computeAtomic(FlatAccess flat, Set<Object> matched, Arc in, Place end) {
		Node target = in.getTarget();
		Node source = in.getSource();
		if (source instanceof PlaceNode && target instanceof TransitionNode) {
			Place start = flat.resolve((PlaceNode) source);
			Transition transition = flat.resolve((TransitionNode) target);
			if (!matched.contains(transition)) {
				List<Arc> out  = transition.getOut();
				if (transition.getIn().size() == 1 && out.size() == 1) {
					Arc arc = out.get(0);
					target = arc.getTarget();
					if (target instanceof PlaceNode) {
						Place place = flat.resolve((PlaceNode) target);
						if (end == null || place.equals(end)) {
							Atomic atomic = BlockstructureFactory.eINSTANCE.createAtomic();
							List<Object> objects = atomic.getCovered();
							objects.add(source);
							objects.add(in);
							objects.add(transition);
							objects.add(arc);
							objects.add(place);
							atomic.setStart(start);
							atomic.setStartsafe(true);
							atomic.setTransition(transition);
							atomic.setEnd(place);
							atomic.setEndsafe(true);
							return atomic;
						}
					}
				}
			}
		}
		return null;
	}
	
	public static Choice computeChoice(FlatAccess flat, Set<Object> matched, Place start, Place end) {
		List<Arc> startArcs = flat.getOut(start);
		startArcs.removeAll(matched);
		if (startArcs == null || startArcs.size() < 2 ) {
			// this is not a Choice
			return null;
		}
		Block block = computeBlock(flat, new HashSet<Object>(matched), startArcs.remove(0), end);
		if (block ==  null || !block.isStartsafe() || !block.isEndsafe()) {
			// this is not a Choice
			return null;
		}
		List<Block> choices = new ArrayList<Block>();
		choices.add(block);
		matched.addAll(block.getCovered());
		if (end == null) {
			end = block.getEnd();
		}
		
		for (Arc out: startArcs) {
			Block otherblock = computeBlock(flat, new HashSet<Object>(matched), out, end);
			if (otherblock != null) {
				choices.add(otherblock);
				matched.addAll(otherblock.getCovered());
			} else {
				return null;
			}
		}
		
		Choice choice = BlockstructureFactory.eINSTANCE.createChoice();
		choice.setStart(start);
		choice.setStartsafe(true);
		choice.setEnd(end);
		choice.setEndsafe(true);
		List<Object> nodeList = choice.getCovered();
		List<Block> subblocks = choice.getSubblocks();
		for (Block block2: choices) {
			nodeList.addAll(block2.getCovered());
			subblocks.add(block2);
		}
		
		return choice;
	}
	
}


