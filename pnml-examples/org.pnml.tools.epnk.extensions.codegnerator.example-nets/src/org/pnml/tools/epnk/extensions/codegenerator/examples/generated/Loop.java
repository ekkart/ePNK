package org.pnml.tools.epnk.extensions.codegenerator.examples.generated;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;

public class Loop extends AbstractPetrinet {

	public Loop() {
		super(new int[]{2, 0}, new String[]{"t1", "t2"} );
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
			marking[0] =  marking[0] - 1;
			marking[1] =  marking[1] + 1;
			break;
			
		case 1:		
			marking[1] =  marking[1] - 1;
			marking[0] =  marking[0] + 1;
			break;
						
		}
	}
		
	public static void main(String[] args) {
		Loop pn = new Loop();
		pn.start();
	}

}
