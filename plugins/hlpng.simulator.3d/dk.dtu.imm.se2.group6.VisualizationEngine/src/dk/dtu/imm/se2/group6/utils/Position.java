package dk.dtu.imm.se2.group6.utils;

import dk.dtu.imm.se2.group6.geometry.Point;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class Position
{
	private Point point = null;
	private float orientation = 0.0f;
	
	public Position(Point point, float orientation)
	{
		this.point = point;
		this.orientation = orientation;
	}

	public Point getPoint()
    {
    	return point;
    }

	public float getOrientation()
    {
    	return orientation;
    }
}
