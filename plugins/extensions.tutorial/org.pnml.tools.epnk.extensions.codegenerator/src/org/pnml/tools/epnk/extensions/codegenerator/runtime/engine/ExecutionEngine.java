package org.pnml.tools.epnk.extensions.codegenerator.runtime.engine;

import java.util.HashMap;
import java.util.Set;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.AbstractPetrinet;


public class ExecutionEngine {
	
	private static ExecutionEngine instance;
	
	private ExecutionGUI gui;
	private int maxId;
	
	private HashMap<AbstractPetrinet,Integer> pnIdMap; 
	
	/** 
	 * Constructor of the execution engine. Since the
	 * execution engine is a singleton, the constructor
	 * is private. 
	 */
	private ExecutionEngine() {
		gui = new ExecutionGUI(this);
		maxId = 1;
        pnIdMap = new HashMap<AbstractPetrinet,Integer>();
	}
	
	public ExecutionGUI getGUI() {
		return gui;
	}
	
    public synchronized int getNewId() {
    	return maxId++;
    }
	
	public synchronized void addPetrinet(AbstractPetrinet pn) {
		pnIdMap.put(pn, getNewId());
		gui.addPetrinet(pn);
	}
	
	public synchronized void updatePetrinets(Set<AbstractPetrinet> petrinets) {
		gui.updatePetrinets(petrinets);
	}
	
	public synchronized void removePetrinet(AbstractPetrinet pn) {
		pnIdMap.remove(pn);
		gui.removePetrinet(pn);
	}
	
	public int getID(AbstractPetrinet pn) {
		if (pnIdMap.containsKey(pn)) {
			return pnIdMap.get(pn).intValue();
		}
		
		return 0;
	}
	
	/**
	 * Return the single instance of the execution engine.
	 * 
	 * @return the singleton execution engine
	 */
	public synchronized static ExecutionEngine getInstance() {
		if (instance == null) {
			instance = new ExecutionEngine();
		}
	    return instance;
	}
	
}
