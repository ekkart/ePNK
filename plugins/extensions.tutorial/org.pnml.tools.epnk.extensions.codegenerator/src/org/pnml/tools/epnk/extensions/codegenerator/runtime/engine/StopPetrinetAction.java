package org.pnml.tools.epnk.extensions.codegenerator.runtime.engine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopPetrinetAction implements ActionListener {
	
	private PetrinetButtonPanel panel;
	
	public StopPetrinetAction(PetrinetButtonPanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.getPetrinet().stop();		
	}

}
