package dk.dtu.imm.se2.group6.handler;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.interfaces.IHandler;
import dk.dtu.imm.se2.group6.interfaces.IModel;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */
public class TriggerHandler implements IHandler
{
	private IModel model = null;
	private IHandler prevHandler = null;
	
	public TriggerHandler(IModel model, IHandler prevHandler)
	{
		this.model = model;
		this.prevHandler = prevHandler;
	}
	
	@Override
	public boolean handle(GL2 gl)
	{
		boolean finished = false;
		if(prevHandler != null)
		{
			finished = prevHandler.handle(gl);	
		}
    	
		if(finished)
		{
			return true;
		}
		
    	if(model.isSelected())
    	{
    		model.setSelected(false);
    		return true;
    	}
		return false;
	}
}
