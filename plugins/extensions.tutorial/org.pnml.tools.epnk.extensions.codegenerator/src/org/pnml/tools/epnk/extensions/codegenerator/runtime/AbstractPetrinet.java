/**
 * 
 */
package org.pnml.tools.epnk.extensions.codegenerator.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.pnml.tools.epnk.extensions.codegenerator.runtime.engine.ExecutionEngine;



/**
 * @author kindler
 *
 */
public abstract class AbstractPetrinet {

	protected int[] init;
	protected String[] tnames;
	
	protected int[] marking;
	
	private ExecutionEngine engine;
	
	private boolean started;
	private boolean terminated;
	
	private Set<AbstractPetrinet> registeredNets;

	
	public AbstractPetrinet(int[] marking, String[] tnames) {
		this.init = marking.clone();
		this.tnames = tnames.clone();
		
		this.marking = marking.clone();
		
		started = false;
		terminated = false;
		
		registeredNets = new HashSet<AbstractPetrinet>();
		
		engine = ExecutionEngine.getInstance();
	}
	
	public String[] getTransitions() {
		return tnames.clone();
	}

	/**
	 * Checks whether transition with number t is enabled.
	 * The transition t must be between 0 and tnames.length
	 * 
	 * @param t
	 */
	abstract public boolean enabled(int t);
	
	/**
	 * Fires transition with number t (if it is enabled).
	 * The transition t must be between 0 and tnames.length
	 * 
	 * @param t
	 */
	abstract public void fire(int t);
	
	/**
	 * Resets the system to its initial state.
	 */
	public void reset() {
		marking = init.clone();
	}
	
	final public void start() {
		if (! started ) {
			engine.addPetrinet(this);
			started = true;
		}		
	}

	final public void stop() {
		if (started && ! terminated) {
			terminated = true;
			engine.removePetrinet(this);
			engine.updatePetrinets(registeredNets);
		}			
	}
	
	final boolean terminated() {
		return terminated;
	}
	
	/**
	 * Checks whether another Petri net is terminated and registers
	 * this  Petri net for notification in case of termination of the
	 * other Petri net. Note that this method should only be called
	 * from within object this itself (which, unfortunately, cannot be
	 * guaranteed by Java visibility constraints).
	 * 
	 * @param pn
	 * @return
	 */
	final public boolean terminated(AbstractPetrinet pn) {
		boolean result = pn.terminated();
		if (!result && pn != this) {
			pn.register(this);
		}
		return result;
	}
	
	/**
	 * Registers an other Petri net to be notified (so that engine can
	 * update GUI), when this net terminates.
	 * 
	 * @param pn
	 */
	final private void register(AbstractPetrinet pn) {
		registeredNets.add(pn);
	}
	
	/**
	 * Reads an int from the standard input. This is a routine taken
	 * from Ian F. Darwin (http://www.darwinsys.com/) modified by
	 * Ekkart Kindler for the purpose of this class.
	 * 
	 * @author  Ian F. Darwin, http://www.darwinsys.com/
	 */
	private int readInt () {	  
	    String line = null;
	    try {
	      BufferedReader is = new BufferedReader(
	        new InputStreamReader(System.in));
	      line = is.readLine();
	      return Integer.parseInt(line);
	    } catch (NumberFormatException ex) {
	      return -1;
	    } catch (IOException e) {
	      return -1;
	    }
	}
	
	/**
	 * Simulates the system on the console. The user is shown the activated
	 * transitions and asked to chose one. The selected transition is fired.
	 * If he selects a not enabled or invalid transition, the simulation is
	 * stopped.
	 */	
	public void run() {
		do {
			System.out.println("Enabled: ");

			for (int i = 0; i < tnames.length; i++ ) {
				if (enabled(i)) {
					System.out.println("  " + i + ": " + tnames[i]);
				}
			}

			System.out.print("Choose transition number: ");
			int selected = readInt();
			if (enabled(selected))
				fire(selected);
			else
				return;
		} while(true);
	}

}
