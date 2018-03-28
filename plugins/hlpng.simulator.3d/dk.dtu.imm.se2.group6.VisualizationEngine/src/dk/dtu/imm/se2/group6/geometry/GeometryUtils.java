package dk.dtu.imm.se2.group6.geometry;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class GeometryUtils 
{
	public static Vector crossProduct(Vector v0, Vector v1)
	{	    
	    double x = v0.getY() * v1.getZ() - v0.getZ() * v1.getY();
	    double y = v0.getZ() * v1.getX() - v0.getX() * v1.getZ();
	    double z = v0.getX() * v1.getY() - v0.getY() * v1.getX();

	    return new Vector(new Point(x, y, z));
	}
	
	public static double crossProductDeterminant(Vector v0, Vector v1)
	{	    
	    double x = v0.getY() * v1.getZ() - v0.getZ() * v1.getY();
	    double y = v0.getZ() * v1.getX() - v0.getX() * v1.getZ();
	    double z = v0.getX() * v1.getY() - v0.getY() * v1.getX();

	    return x - y + z;
	}
	
	public static double dotProduct(Vector v0, Vector v1)
	{	    
	    return v0.getX() * v1.getX() + v0.getY() * v1.getY() + v0.getZ() * v1.getZ();
	}
	
	public static double circleAngle(Point center, Point start, Point end)
	{
		Vector v0 = new Vector(center, start);
		Vector v1 = new Vector(center, end);
		
		double angleRad = Math.acos(dotProduct(v0, v1) / (v0.length() * v1.length()));
		double angleDeg = Math.toDegrees(angleRad);
		
		double test = crossProductDeterminant(v0, v1);
		if(test < 0)
		{
			angleDeg = 360.0 - angleDeg;
		}
		
		return angleDeg;
	}
	
	public static Point rotateYaxis(Point center, Point start, double angleDegrees)
	{
		Point p = new Point(start.subtract(center));
		
		double radAngle = Math.toRadians(angleDegrees);
		
		double x = p.getX();
		double z = p.getZ();
		
		p.setX(x * Math.cos(radAngle) + z * Math.sin(radAngle));
		p.setZ(-x * Math.sin(radAngle) + z * Math.cos(radAngle));
		
		return p.add(center);
	}
	
	public static boolean sameSide(Point point, Point lineStart, Point lineEnd,
			Point control)
	{
		Vector mainLine = new Vector(lineStart, lineEnd);
		Vector controlLine = new Vector(lineStart, control);
		Vector testLine = new Vector(lineStart, point);
		
		Vector controlVector = crossProduct(mainLine, controlLine);
		Vector testVector = crossProduct(mainLine, testLine);
		
		if(dotProduct(controlVector, testVector) >= 0)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean insideConvexQuad(Point point,
			Point p1, Point p2, Point p3, Point p4)
	{

		if(!sameSide(point, p1, p2, p4))
		{
			return false;
		}
		if(!sameSide(point, p2, p3, p1))
		{
			return false;
		}
		if(!sameSide(point, p3, p4, p2))
		{
			return false;
		}
		if(!sameSide(point, p4, p1, p3))
		{
			return false;
		}		
		
		return true;
	}
}
