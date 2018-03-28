package org.pnml.tools.epnk.extensions.codegenerator.examples.manual;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;

/**
 * This is an example class representing the behaviour of a Petri net.
 * A class like this should be automatically generated from a Petri net
 * model. Before creating the JET templates, it is always a good idea
 * to have a concrete example, which then is gradually converted into
 * the JET-template.
 * 
 * @author kindler
 *
 */
public class Petrinet extends AbstractPetrinet {

	public Petrinet() {
		super(new int[]{1,0}, new String[] {"t1", "t2"} );
	}

	public boolean enabled(int t) {
		switch (t) {
		case 0:
			return marking[0] >= 1;
			
		case 1:
			return marking[1] >= 1;
			
		default:
			return false;	
		}
	}

	public void fire(int t) {
		if (! enabled(t))
			return;
		
		switch (t) {
		case 0:
			marking[0] = marking[0] - 1;
			marking[1] = marking[1] + 1;
			break;
		
		case 1:
			marking[1] = marking[1] - 1;
			marking[0] = marking[0] + 2;
			break;
		}
	}
	
	public static void main(String[] args) {
		Petrinet pn = new Petrinet();
		pn.start();
	}

}
