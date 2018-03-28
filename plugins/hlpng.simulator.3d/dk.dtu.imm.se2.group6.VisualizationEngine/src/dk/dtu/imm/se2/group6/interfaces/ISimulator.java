package dk.dtu.imm.se2.group6.interfaces;

import dk.dtu.imm.se2.group6.interfaces.IAnimator;

/**
 * 
 * @author Du Nguyen, s082968
 *
 */

public interface ISimulator {

	public void animationFinished(int ItemID, IAnimator animator);
	
	public void reset(IAnimator animator);
	
	public void start(IAnimator animator);
	
	public void stop(IAnimator animator);
	
	public void initCompleted(IAnimator animator);
}
