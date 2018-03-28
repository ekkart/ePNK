package dk.dtu.imm.se2.group6.utils;

import javax.media.opengl.GL2;

import com.jogamp.opengl.util.gl2.GLUT;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IBoundingSurface;
import dk.dtu.imm.se2.group6.scene.AbstractScene;

public class BoundingSphere implements IBoundingSurface
{
	private double radius;
	private Point center = null;
	private Point massCenter = null;
	
	public BoundingSphere(Point center, double radius, Point massCenter)
	{
		this.radius = radius;
		this.massCenter = massCenter;
		update(new Position(center, 0));
	}
	
	public BoundingSphere(double radius, Point massCenter)
	{
		this.radius = radius;
		this.massCenter = massCenter;
	}
	
	@Override
	public IBoundingSurface clone()
	{
		if(center == null)
		{
			return null;
		}
		return new BoundingSphere(new Point(center), radius, new Point(massCenter));
	}
	
	@Override
	public Point getCenter()
	{
		return center;
	}

	@Override
	public boolean checkCollision(IBoundingSurface surface)
	{
		if(!(surface instanceof BoundingSphere))
		{
			throw new RuntimeException("Wrong surface!");	
		}
		
		if(surface.getCenter() == null || center == null)
		{
			return false;
		}
		
		BoundingSphere sphere = (BoundingSphere)surface;
		
		if(radius + sphere.getRadius() < center.distance(sphere.getCenter()))
		{
			return false;	
		}
		
		return true;
	}
	@Override
	public void show(GL2 gl, AbstractScene scene)
	{
		if(center == null)
		{
			return;
		}
		
		Point p = center.add(massCenter);
		
		gl.glPushMatrix();

    		gl.glTranslated(p.getX(), p.getY(), p.getZ());
    
    		if(scene != null)
    		{
    			float[] cyanLight = { 0.0f, 0.0f, 1.0f, 0.1f };
    			scene.setMaterialColor(cyanLight, gl);	
    		}
    
    		GLUT glut = new GLUT();
    		glut.glutSolidSphere(radius, 20, 20);

		gl.glPopMatrix();
	}

	public double getRadius()
    {
    	return radius;
    }

	public void setRadius(double radius)
    {
    	this.radius = radius;
    }

	public void setCenter(Point center)
    {
    	this.center = center;
    }

	@Override
    public void update(Position p)
    {
		this.center = p.getPoint();
    }
	
	@Override
    public double getAngle()
    {
	    return 0;
    }
}
