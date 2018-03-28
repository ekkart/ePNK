package dk.dtu.imm.se2.group6.geometry;


/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class Vector 
{
	Point start;
	Point end;
	
	Point normPoint;
	
	public Vector(Point point)
	{
		this.start = new Point(0, 0, 0);
		this.end = point;
		
		this.normPoint = point;
	}
	
	public Vector(Point start, Point end)
	{
		this.start = start;
		this.end = end;
		
		this.normPoint = end.subtract(start);
	}
	
	public double length()
	{
		return end.distance(start);
	}

	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}

	public Point getNormPoint() {
		return normPoint;
	}
	
	public double getX()
	{
		return normPoint.getX();
	}
	
	public double getY()
	{
		return normPoint.getY();
	}
	
	public double getZ()
	{
		return normPoint.getZ();
	}
	
	public String toString()
	{
		return normPoint.toString();
	}
}
