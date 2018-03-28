import dk.dtu.imm.se2.petrinets.Node;
import dk.dtu.imm.se2.petrinets.PObject;
import dk.dtu.imm.se2.petrinets.Petrinet;
import dk.dtu.imm.se2.petrinets.Place;
import dk.dtu.imm.se2.petrinets.Transition;
import dk.dtu.imm.se2.petrinets.codegenerator.Utils;

import java.util.HashMap;

public class CLASS {

	private String className;
	
	private int noPlaces;
	private int noTransitions;

	private HashMap<Integer,Place> intPlaces;
	private HashMap<Integer,Transition> intTransitions;
	private HashMap<Place,Integer> placesInt;

	private void initialize(Petrinet pn) {
		className = Utils.convert2ClassName(pn.getName());
		
		intPlaces = new HashMap<Integer,Place>();
		intTransitions = new HashMap<Integer,Transition>();
		placesInt = new HashMap<Place,Integer>();
		
		noPlaces = 0;
		noTransitions = 0;
		
		for (PObject object: pn.getObject()) {
			if (object instanceof Place) {
				Place p = (Place) object;
				intPlaces.put(noPlaces,p);
				placesInt.put(p,noPlaces);
				noPlaces++;
			} else if (object instanceof Transition) {
				Transition t = (Transition) object;
				intTransitions.put(noTransitions,t);
				noTransitions++;
			}
		}
	}

	private Place getPlace(int p) {
		if (intPlaces != null) {
			return intPlaces.get(p);
		} 
	    
		return null;
	}
	
	private int getPlaceNo(Node n) {
		if (n instanceof Place && placesInt != null) {
			Place p = (Place) n;
			return placesInt.get(p).intValue();
		}
		
		return -1;
		
	}

	private Transition getTransition(int t) {
		if (intTransitions != null) {
			return intTransitions.get(t);
		} 
	    
		return null;
	}

	public String generate(Object argument) {
		return "";
	} 
}
