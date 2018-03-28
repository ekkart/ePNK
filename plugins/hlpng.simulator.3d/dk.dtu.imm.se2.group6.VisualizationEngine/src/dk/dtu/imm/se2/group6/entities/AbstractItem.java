package dk.dtu.imm.se2.group6.entities;

import dk.dtu.imm.se2.group6.interfaces.IAnimator;
import dk.dtu.imm.se2.group6.interfaces.IDisplay;
import dk.dtu.imm.se2.group6.visual.Animator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public abstract class AbstractItem implements IDisplay
{
	private static int CURRENT_ITEM_ID = 1;
	protected int id;
	protected Animator scene;

	public AbstractItem(Animator scene)
	{
		this.id = CURRENT_ITEM_ID;
		this.scene = scene;

		CURRENT_ITEM_ID++;
	}

	public int getId()
	{
		return id;
	}

	public IAnimator getScene()
	{
		return scene;
	}
}
