package dk.dtu.imm.se2.group6.utils;

/*
 * Author: Christian Sj�green (s072429)
 */

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se2.group6.geometry.Point;

public class TextureQuads {
	
	private double quadSize;

	public TextureQuads(double size)
	{
		quadSize = size;
	}
	
	public List<Point> calcQuads(List<Point> path)
	{
		int size = path.size();
		List<Point> quadCorners = new ArrayList<Point>();
		quadCorners.add(quadPoint(path.get(0),path.get(0),path.get(1),quadSize,true));
		quadCorners.add(quadPoint(path.get(0),path.get(0),path.get(1),quadSize,false));
		for(int i = 1; i < path.size()-1; i++)
		{
			quadCorners.add(quadPoint(path.get(i-1),path.get(i),path.get(i+1),quadSize,false));
			quadCorners.add(quadPoint(path.get(i-1),path.get(i),path.get(i+1),quadSize,true));
			quadCorners.add(quadPoint(path.get(i-1),path.get(i),path.get(i+1),quadSize,true));
			quadCorners.add(quadPoint(path.get(i-1),path.get(i),path.get(i+1),quadSize,false));
		}
		quadCorners.add(quadPoint(path.get(size-2),path.get(size-1),path.get(size-1),quadSize,false));
		quadCorners.add(quadPoint(path.get(size-2),path.get(size-1),path.get(size-1),quadSize,true));
		
		return quadCorners;
	}
	
	private Point unitVector (Point p1, Point p2)
	{
		double dist = p1.distance(p2);
		return new Point((p2.getX()-p1.getX())/dist,
				(p2.getY()-p1.getY())/dist,
				(p2.getZ()-p1.getZ())/dist);
	}
	
	private Point quadPoint(Point a, Point b, Point c, double size, boolean invertX)
	{
		Point vector = unitVector(a,c).multiply(size);
		if(invertX)
		{
			return new Point(b.getX()-vector.getZ(),b.getY(),b.getZ()+vector.getX());
		} else {
			return new Point(b.getX()+vector.getZ(),b.getY(),b.getZ()-vector.getX());
		}
	}
}
