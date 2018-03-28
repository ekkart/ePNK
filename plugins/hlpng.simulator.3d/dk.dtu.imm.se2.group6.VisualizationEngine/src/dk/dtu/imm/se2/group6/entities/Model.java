package dk.dtu.imm.se2.group6.entities;

import java.io.IOException;

import javax.media.opengl.GL2;

import Appearence.Shape;

import dk.dtu.imm.se2.group6.interfaces.IBoundingSurface;
import dk.dtu.imm.se2.group6.interfaces.IHandler;
import dk.dtu.imm.se2.group6.interfaces.IModel;
import dk.dtu.imm.se2.group6.model.ObjLoader;
import dk.dtu.imm.se2.group6.utils.BoundingBox;
import dk.dtu.imm.se2.group6.utils.CollisionDetector;
import dk.dtu.imm.se2.group6.utils.Position;
import dk.dtu.imm.se2.group6.visual.Animator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */
public class Model extends AbstractItem implements IModel
{	
	private IModel me = null;
	protected IHandler handler = null;
	protected IBoundingSurface boundingSurface = null;
	protected CollisionDetector collisionDetector = null;
	protected ObjLoader collisionSignalModel = null;
	protected boolean selected = false;
	protected ObjLoader objLoader = null;
	protected boolean visible = true;
	protected boolean animationFinished = false;
	protected Position position = null;
	
	protected boolean initialVisibility = true;
	
	private boolean updatePosition = false;
	
	public Model(Animator scene, CollisionDetector collisionDetector,
			ObjLoader collisionSignalModel, Shape shape, boolean initialVisibility)
	{
		super(scene);
		
		this.me = this;
		this.initialVisibility = initialVisibility;
		this.visible = initialVisibility;
		this.collisionDetector = collisionDetector;
		this.collisionSignalModel = collisionSignalModel;
		
		try
        {
	        objLoader = new ObjLoader(shape.getObjectStringPath());
        }
        catch(IOException e)
        {
	        e.printStackTrace();
        }
		
		this.boundingSurface = new BoundingBox(this.objLoader.getPlanePoints(),
				this.collisionSignalModel);
		//BoundingSphere(objLoader.getRadius(), objLoader.getCenter());//
	}
	@Override
	public void show(GL2 gl, boolean updatePosition)
	{
		this.updatePosition = updatePosition;
		if(handler != null)
		{
			animationFinished = handler.handle(gl);
			
			if(boundingSurface != null && 
					scene.isIndicateCollision() && 
					collisionDetector.isColliding(me))
			{
				boundingSurface.show(gl, scene);
			}
		}
		show(gl);
	}
	@Override
	public void show(GL2 gl)
	{
		if(visible && position != null)
		{
			gl.glPushMatrix();
        		gl.glTranslated(
        				position.getPoint().getX(), 
        				position.getPoint().getY(), 
        				position.getPoint().getZ());
        		gl.glRotatef(position.getOrientation(), 0, 1, 0);
        		objLoader.showModel(scene, gl);	
    		gl.glPopMatrix();
		}
	}
	@Override
	public void reset()
	{
		handler = null;
		animationFinished = false;
		boundingSurface = new BoundingBox(this.objLoader.getPlanePoints(),
				this.collisionSignalModel);
		//BoundingSphere(objLoader.getRadius(), objLoader.getCenter());//
		visible = initialVisibility;
		selected = false;
	}

	@Override
	public boolean stop()
	{
		return selected || !updatePosition;
	}
	@Override
	public boolean animationFinished()
	{
		return animationFinished;
	}
	@Override
	public IHandler getHandler()
    {
    	return handler;
    }
	@Override
	public void setHandler(IHandler handler)
    {
    	this.handler = handler;
    }
	@Override
	public IBoundingSurface getBoundingSurface()
    {
    	return boundingSurface;
    }
	@Override
	public void setBoundingSurface(IBoundingSurface boundingSurface)
    {
    	this.boundingSurface = boundingSurface;
    }
	@Override
	public boolean isSelected()
	{
		return selected;
	}
	@Override
	public void setSelected(boolean selected)
	{
		this.selected = selected;
	}
	@Override
	public boolean isVisible()
    {
    	return visible;
    }
	@Override
	public void setVisible(boolean visible)
    {
    	this.visible = visible;
    }
	@Override
	public Position getPosition()
    {
    	return position;
    }
	@Override
	public void setPosition(Position position)
    {
    	this.position = position;
    }
}
