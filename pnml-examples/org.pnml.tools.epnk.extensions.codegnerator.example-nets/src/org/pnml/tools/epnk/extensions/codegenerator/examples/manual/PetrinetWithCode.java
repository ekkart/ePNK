package org.pnml.tools.epnk.extensions.codegenerator.examples.manual;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;

/**
 * This is an example class representing the behaviour of a Petri net.
 * This one contains also some actions.
 * A class like this should be automatically generated from a Petri net
 * model. Before creating the JET templates, it is always a good idea
 * to have a concrete example, which then is gradually converted into
 * the JET-template.
 * 
 * @author kindler
 *
 */
public class PetrinetWithCode extends AbstractPetrinet {

	public PetrinetWithCode() {
		super(new int[]{1,0}, new String[] {"t1", "t2"} );
	}
	
	public void action0() {
		new Petrinet().start();
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
			action0();
			marking[1] = marking[1] + 1;
			break;
		
		case 1:
			marking[1] = marking[1] - 1;
			marking[0] = marking[0] + 1;
			break;
		}
	}
	
	public static void main(String[] args) {
		PetrinetWithCode pn = new PetrinetWithCode();
		pn.start();
	}

}
