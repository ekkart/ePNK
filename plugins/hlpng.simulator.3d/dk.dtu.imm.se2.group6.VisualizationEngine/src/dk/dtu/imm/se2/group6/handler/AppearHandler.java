package dk.dtu.imm.se2.group6.handler;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.interfaces.IHandler;
import dk.dtu.imm.se2.group6.interfaces.IModel;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class AppearHandler implements IHandler
{
	private IModel model = null;

	public AppearHandler(IModel model)
	{
		this.model = model;
	}
	
	@Override
	public boolean handle(GL2 gl)
	{
		model.show(gl);
    	
		return false;
	}
}
