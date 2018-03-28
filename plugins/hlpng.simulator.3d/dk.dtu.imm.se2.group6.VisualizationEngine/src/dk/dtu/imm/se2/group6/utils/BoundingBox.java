package dk.dtu.imm.se2.group6.utils;

import java.util.ArrayList;
import java.util.List;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.GeometryUtils;
import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IBoundingSurface;
import dk.dtu.imm.se2.group6.model.ObjLoader;
import dk.dtu.imm.se2.group6.scene.AbstractScene;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class BoundingBox implements IBoundingSurface
{
	private List<Point> points = null;
	private List<Point> face = null;
	private Point center = null;
	private double radius = 0.0;
	private double angle = 0.0;
	private ObjLoader collisionSignalModel = null;
	
	public BoundingBox(List<Point> points, Point center, double orientationAngle)
	{
		this.points = points;
		update(new Position(center, (float)orientationAngle));
	}
	
	public BoundingBox(List<Point> points, Point center, double orientationAngle,
			ObjLoader collisionSignalModel)
	{
		this.points = points;
		this.collisionSignalModel = collisionSignalModel;
		update(new Position(center, (float)orientationAngle));
	}
	
	public BoundingBox(List<Point> points, ObjLoader collisionSignalModel)
	{
		this.points = points;
		this.collisionSignalModel = collisionSignalModel;
	}
	
	public BoundingBox(List<Point> points)
	{
		this.points = points;
	}
	
	@Override
	public IBoundingSurface clone()
	{
		if(center == null)
		{
			return null;
		}
		return new BoundingBox(points, new Point(center), angle);
	}
	
	@Override
    public void update(Position position)
    {
		this.center = position.getPoint();
		this.angle = position.getOrientation();
		this.radius = points.get(0).distance(points.get(2)) / 2.0;
		this.face = new ArrayList<Point>();
		// translate
		for(Point p : points)
		{
			Point translated = center.add(p);
			Point rotated = GeometryUtils.rotateYaxis(center, translated, angle);
			face.add(rotated);
		}
    }

	@Override
	public Point getCenter()
	{
		return center;
	}

	@Override
	public boolean checkCollision(IBoundingSurface surface)
	{
		if(!(surface instanceof BoundingBox))
		{
			throw new RuntimeException("Wrong surface!");	
		}
		
		if(surface != null && surface.getCenter() != null && face != null)
		{	
			BoundingBox box = (BoundingBox) surface;
			
			if(radius + box.getRadius() < center.distance(box.getCenter()))
			{
				return false;
			}
			if(center.distance(box.getCenter()) < (
					box.getFace().get(1).distance(box.getFace().get(2)) / 2.0 + 
					(getFace().get(1).distance(getFace().get(2))) / 2.0))
			{
				return true;
			}
			
			for(Point p : face)
			{
				if(GeometryUtils.insideConvexQuad(p, box.getFace().get(0), 
						box.getFace().get(1), box.getFace().get(2), 
						box.getFace().get(3)))
				{
					return true;
				}
			}
			for(Point p : box.getFace())
			{
				if(GeometryUtils.insideConvexQuad(p, face.get(0), 
						face.get(1), face.get(2), face.get(3)))
				{
					return true;
				}
			}	
		}
		return false;
	}

	@Override
	public void show(GL2 gl, AbstractScene scene)
	{		
		if(face == null)
		{
			return;
		}
		// signal
		if(collisionSignalModel != null)
		{
			gl.glPushMatrix();
				gl.glTranslated(center.getX(), face.get(0).getY(), center.getZ());
				gl.glRotated(angle, 0, 1, 0);
				collisionSignalModel.showModel(scene, gl);
			gl.glPopMatrix();
		}
		// box
		else
		{
			gl.glPushMatrix();
        		float[] cyanLight = { 0.0f, 0.0f, 1.0f, 0.3f };
        		scene.setMaterialColor(cyanLight, gl);

    			gl.glBegin(GL2.GL_QUADS);
        			for(Point p: face)
        			{
        				gl.glVertex3d(p.getX(), p.getY(), p.getZ());
        			}
        			
        			for(int i = 0; i < face.size(); i++)
        			{
        				Point p0 = face.get(i); 
        				Point p1 = face.get((i + 1) % face.size());
        				Point p2 = new Point(p0.getX(), 0, p0.getZ());
        				Point p3 = new Point(p1.getX(), 0, p1.getZ());
        				
        				gl.glVertex3d(p0.getX(), p0.getY(), p0.getZ());
        				gl.glVertex3d(p1.getX(), p1.getY(), p1.getZ());
        				gl.glVertex3d(p3.getX(), p3.getY(), p3.getZ());
        				gl.glVertex3d(p2.getX(), p2.getY(), p2.getZ());
        			}
    			gl.glEnd();	
			gl.glPopMatrix();
		}
	}

	public List<Point> getFace()
    {
    	return face;
    }
	
	public double getRadius()
    {
    	return radius;
    }

	@Override
    public double getAngle()
    {
	    return angle;
    }
}
