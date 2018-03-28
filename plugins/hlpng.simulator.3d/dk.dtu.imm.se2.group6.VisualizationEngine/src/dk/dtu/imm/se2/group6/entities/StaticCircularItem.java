package dk.dtu.imm.se2.group6.entities;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se2.group6.geometry.GeometryUtils;
import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.visual.Animator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class StaticCircularItem extends StaticLinearItem 
{
	protected Point center;
	protected double angle;
	protected boolean counterClockwise;
	protected int stepAngle;
	
	public StaticCircularItem(Point start, Point end, Point center, 
			int stepAngle, boolean counterClockwise, String texture, 
			Animator scene) 
	{
		super(start, end, texture, scene);
		this.center = center;
		this.counterClockwise = counterClockwise;
		this.stepAngle = stepAngle;
		this.angle = Math.floor(GeometryUtils.circleAngle(center, start, end));
	}

	@Override
	public double length()
	{
		return 2.0 * Math.PI * getRadius() * (angle / 360.0);
	}
	
	private static List<Point> polygonizePath(Point center, 
			Point start, Point end, int stepAngle, double angle)
	{
		List<Point> points = new ArrayList<Point>();
		
		points.add(start);
		for(int i = 0; i + stepAngle < angle; i += stepAngle)
		{
			points.add(GeometryUtils.rotateYaxis(center, start, i));
		}
		points.add(end);

		return points;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getAngle() {
		return angle;
	}

	public boolean isCounterClockwise() {
		return counterClockwise;
	}

	public double getRadius()
    {
    	return start.distance(center);
    }
	
	@Override
    public List<Point> subdividePath(double length)
    {
		int stepAngle = (int)(angle * length / length());
		if(stepAngle < 1)
		{
			stepAngle = 1;
		}
		
		if(!counterClockwise)
		{
			return polygonizePath(center, end, start, stepAngle, angle);
		}
		return polygonizePath(center, start, end, stepAngle, angle);
    }
}
