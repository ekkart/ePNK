package org.pnml.tools.epnk.extensions.codegenerator.examples.generated;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;

public class Mutual_exclusion extends AbstractPetrinet {

	public Mutual_exclusion() {
		super(new int[]{1, 1, 0, 0, 1, 0, 0}, new String[]{"t1.1", "t2.1", "t3.1", "t1.2", "t2.2", "t3.2"} );
	}

	public boolean enabled(int t) {
		switch (t) {
		case 0:
			return marking[1] >= 1;
                    
		case 1:
			return marking[2] >= 1 && marking[0] >= 1;
                    
		case 2:
			return marking[3] >= 1;
                    
		case 3:
			return marking[4] >= 1;
                    
		case 4:
			return marking[5] >= 1 && marking[0] >= 1;
                    
		case 5:
			return marking[6] >= 1;
                    
		default:
			return false;	
		}
	}

	public void fire(int t) {
		if (! enabled(t))
			return;
		
		switch (t) {
		case 0:		
			marking[1] =  marking[1] - 1;
			marking[2] =  marking[2] + 1;
			break;
			
		case 1:		
			marking[2] =  marking[2] - 1;
			marking[0] =  marking[0] - 1;
			marking[3] =  marking[3] + 1;
			break;
			
		case 2:		
			marking[3] =  marking[3] - 1;
			marking[1] =  marking[1] + 1;
			marking[0] =  marking[0] + 1;
			break;
			
		case 3:		
			marking[4] =  marking[4] - 1;
			marking[5] =  marking[5] + 1;
			break;
			
		case 4:		
			marking[5] =  marking[5] - 1;
			marking[0] =  marking[0] - 1;
			marking[6] =  marking[6] + 1;
			break;
			
		case 5:		
			marking[6] =  marking[6] - 1;
			marking[4] =  marking[4] + 1;
			marking[0] =  marking[0] + 1;
			break;
						
		}
	}
		
	public static void main(String[] args) {
		Mutual_exclusion pn = new Mutual_exclusion();
		pn.start();
	}

}
