package dk.dtu.imm.se2.group6.interfaces;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.utils.Position;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public interface IModel extends IDisplay
{
	public IBoundingSurface getBoundingSurface();
	public void setBoundingSurface(IBoundingSurface surface);
	public IHandler getHandler();
	public void setHandler(IHandler handler);
	public boolean isSelected();
	public void setSelected(boolean selected);
	public boolean isVisible();
	public void setVisible(boolean visible);
	public void setPosition(Position position);
	public Position getPosition();
	
	public void show(GL2 gl, boolean updatePosition);
	public boolean stop();
	public boolean animationFinished();
	public void reset();
}
