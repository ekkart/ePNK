package org.pnml.tools.epnk.extensions.codegenerator.runtime.engine;


import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;


public class ExecutionGUI extends JFrame  {
	
	private static final long serialVersionUID = 1L;

	private ExecutionEngine engine;
	
	private HashMap<AbstractPetrinet,PetrinetButtonPanel> pnPanelMap;
	
	public ExecutionGUI(ExecutionEngine engine) {
		super();
		this.engine = engine;
		pnPanelMap = new HashMap<AbstractPetrinet,PetrinetButtonPanel>();
		
		this.setTitle("Petri nets: Execution Environment");
		this.setSize(600,600);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		
		Dimension minSize = new Dimension(0, 0);
		Dimension prefSize = new Dimension(Short.MAX_VALUE, Short.MAX_VALUE);
		Dimension maxSize = new Dimension(Short.MAX_VALUE,Short.MAX_VALUE );
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.setVisible(true);

		
		// Add a listener that terminates the application,
		// when the GUI window is closed.
		this.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
	}
	
	public void addPetrinet(AbstractPetrinet pn) {
		PetrinetButtonPanel panel = new PetrinetButtonPanel(this.engine,pn);
		
		this.add(panel,this.pnPanelMap.size());
		this.setVisible(true);
		
		pnPanelMap.put(pn,panel);
	}
	
	public void updatePetrinets(Set<AbstractPetrinet> petrinets) {
		for (AbstractPetrinet pn : petrinets) {
			PetrinetButtonPanel panel = pnPanelMap.get(pn);
			if (pn != null) {
				panel.updateButtons();
			}
		}
	}
	
	public void removePetrinet(AbstractPetrinet pn) {
		PetrinetButtonPanel panel = pnPanelMap.get(pn);
		if (panel != null) {
			this.remove(panel);
			this.setVisible(true);
			pnPanelMap.remove(pn);
		}
	}

}
