package org.pnml.tools.epnk.extensions.codegenerator.examples.generated;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;

public class Loop1 extends AbstractPetrinet {

	public Loop1() {
		super(new int[0], new String[0]);
	}

	public boolean enabled(int t) {
		return false;
	}

	public void fire(int t) {
	}
		
	public static void main(String[] args) {
		Loop1 pn = new Loop1();
		pn.start();
	}

}
