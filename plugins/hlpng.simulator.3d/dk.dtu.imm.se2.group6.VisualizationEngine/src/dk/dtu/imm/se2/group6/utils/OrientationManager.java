package dk.dtu.imm.se2.group6.utils;

import dk.dtu.imm.se2.group6.geometry.Point;

/** 
 * 
 * @author s011936, Jesper Jepsen
 *
 * Class collects the methods for calculating orientations of 3D items.
 * Feel free to add additional methods.
 *
 */

public class OrientationManager {

	/**
	 * @auther s011936, Jesper Jepsen
	 * 
	 * Test method. Should be commented out per default.
	 */
		
/*	public static void main(String [] args) {
		OrientationManager m = new OrientationManager();
	
		Point p1 = new Point(-1, 0, 0);
		Point p2 = new Point(1, 0, 0);
		System.out.println(m.calculateItemDrawingAngle(p1, p2));
	} */

	/**
	 * @author s011936, Jesper Jepsen
	 * 
	 * @param p1 is a point on a line in the plane defined by y=0.
	 * @param p2 in another point on the same line.
	 * @return angle between line defined by p1 and p2, and the line defined by
	 * z=0, y=0 (the x-axis itself).
	 */
	
	public double calculateItemDrawingAngle(Point p1, Point p2) {
		
		double adjacent = p2.getX() - p1.getX();
		double opposite = p2.getZ() - p1.getZ();
		
		if(Math.abs(opposite) < 1e-8)
		{
			return 0.0;
		}
		
		if(Math.abs(adjacent) < 1e-8)
		{
			return 90.0;
		}
		
		double angleRad = Math.atan(opposite/adjacent);
		
		return Math.toDegrees(angleRad);
	}
} 