package dk.dtu.imm.se2.group6.interfaces;

import javax.swing.JFrame;

import geditor.GObject;
import Appearence.Shape;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public interface IAnimator
{
	public abstract void move(Integer itemId, Integer pathId, int speed);

	public abstract void appear(int modelId, GObject position, boolean visible);

	public abstract void appear(int modelId, int pathId, GObject position,
	        boolean visible);

	public abstract void appear(int modelId, int pathId, boolean visible);
	
	public void appear(int modelId, int pathId, int speed);

	public abstract void trigger(int modelId);

	public abstract int createModel(Shape shape, boolean visibility);

	public abstract int createStaticItem(GObject gObject, Shape shape,
	        String globalPath);

	public abstract void initRequested();

	public abstract ISimulator getSimulator();
	
	public void setUpdatePosition(boolean updatePosition);
	
	public void setInitStart(boolean initStart);
	
	public boolean isInitStart();
	
	public void setReset(boolean reset);
	
	public void setVisible(boolean visible);
	
	public void setWindow(JFrame window);

	public void setSimulator(ISimulator simulator);
}