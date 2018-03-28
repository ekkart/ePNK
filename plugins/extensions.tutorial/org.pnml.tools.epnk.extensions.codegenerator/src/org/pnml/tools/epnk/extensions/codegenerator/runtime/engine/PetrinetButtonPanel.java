package org.pnml.tools.epnk.extensions.codegenerator.runtime.engine;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;


public class PetrinetButtonPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton[] buttons;
	private AbstractPetrinet petrinet;

	public PetrinetButtonPanel(ExecutionEngine engine, AbstractPetrinet pn) {
		super();
		
		// Container pane = engine.getGUI(); 
		
		petrinet = pn;
		
		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, pn.getClass().getName()+": "+engine.getID(pn));
		
		this.setBorder(titled);

		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// BoxLayout layout = new BoxLayout(this,BoxLayout.X_AXIS);
		// this.setLayout(layout);

		JButton button = new JButton("Stop");
		button.addActionListener(new StopPetrinetAction(this));
		button.setEnabled(true);
		this.add(button);
		
		String[] names = pn.getTransitions();
		buttons = new JButton[names.length];
		for (int i= 0; i< buttons.length; i++) {
			buttons[i] = new JButton(names[i]);
			buttons[i].setEnabled(pn.enabled(i));
			buttons[i].addActionListener(new FireTransitionAction(this,i));
			this.add(buttons[i]);
		}		
	}
	
	public void updateButtons() {
		for (int i= 0; i< buttons.length; i++) {
			buttons[i].setEnabled(petrinet.enabled(i));
		}
		this.setVisible(true);
	}
	
	public AbstractPetrinet getPetrinet() {
		return petrinet;
	}
	
}
