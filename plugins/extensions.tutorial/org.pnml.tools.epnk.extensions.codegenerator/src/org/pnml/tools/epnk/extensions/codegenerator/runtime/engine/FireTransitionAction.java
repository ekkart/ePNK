package org.pnml.tools.epnk.extensions.codegenerator.runtime.engine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FireTransitionAction implements ActionListener {
	
	private PetrinetButtonPanel panel;
	private int  t;
	
	public FireTransitionAction(PetrinetButtonPanel panel, int t) {
		this.panel = panel;
		this.t = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		panel.getPetrinet().fire(t);
		panel.updateButtons();
	}

}
