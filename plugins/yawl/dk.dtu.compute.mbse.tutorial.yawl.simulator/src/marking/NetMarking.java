package marking;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;

import dk.dtu.compute.mbse.yawl.Condition;


/**
 * This class represents a marking of a YAWL Net.
 * This should guarantee a uniform way of dealing with markings and
 * avoid a lot of redundant code scattered in the simulator.
 * 
 * @author ekki@dtu.dk
 *
 */
public class NetMarking {
	
	private Map<Condition,Integer> marking;

	/**
	 * Creates a new empty marking.
	 */
	public NetMarking() {
		marking = new HashMap<Condition,Integer>();
	}
	
	/**
	 * Creates a new marking, which is a copy of a given marking.
	 */
	public NetMarking(NetMarking marking) {
		this();
		for (Condition condition: marking.getSupport()) {
			this.setMarking(condition, marking.getMarking(condition));
		}
	}

	/**
	 * Sets the marking of a given condition to the given value. 
	 */
	public void setMarking(Condition condition,int value) {
		if (value > 0) {
			marking.put(condition, value);
		} else {
			marking.remove(condition);
		}
	}

	/**
	 * Returns the marking of a given condition. 
	 */
	public int getMarking(Condition condition) {
		Integer mark = marking.get(condition);
		if (mark != null && mark >= 0) {
			return mark;
		} else {
			return 0;
		}
	}

	/**
	 * Increments the marking of a given condition by a given increment. 
	 */
	public void incrementMarkingBy(Condition condition, int increment) {
		Assert.isLegal(increment >= 0, "The incrememt must be greater or equal than 0");
		setMarking(condition, getMarking(condition) + increment);
	}
	
	/**
	 * Decrements the marking of a given condition by a given decrement. 
	 */
	public void decrementMarkingBy(Condition condition, int decrement) {
		Assert.isLegal(decrement >= 0, "The decrememt must be greater or equal than 0");
		Assert.isLegal(getMarking(condition) >= decrement, "Marking of condition must be greater than the decrement");
		setMarking(condition, getMarking(condition) - decrement);
	}
	
	/* *
	 * Adds marking2 to this marking.
	 * /
	public void add(NetMarking marking2) {
		for (Condition condition: marking2.marking.keySet()) {
			int m2 = marking2.marking.get(condition);
			Integer mark1 = marking.get(condition);
			int m1 = 0;
			if (mark1 != null) {
				m1 = mark1;
			}
			if (m1 + m2 > 0) {
				marking.put(condition, m1 + m2);
			} else {
				marking.remove(condition);
			}
		}
	}
	
	*/
	
	/**
	 * Returns the set of all conditions that have at least one token, which is
	 * often called the support of the marking.
	 */
	public Collection<Condition> getSupport() {
		return java.util.Collections.unmodifiableCollection(marking.keySet());
	}

}