package dk.dtu.imm.se2.group6.utils;

import java.util.List;

import dk.dtu.imm.se2.group6.geometry.Point;

public class Scaler
{
	private Point maxPoint = null;
	private Point minPoint = null;
	
	private double planeMin = 0.0;
	private double planeMax = 0.0;
	
	private double scaleRatio = 2.0;
	
	public Scaler(List<Point> points, double planeMax, double planeMin, 
			double scaleRatio)
	{
		this.planeMax = planeMax;
		this.planeMin = planeMin;
		
		this.scaleRatio = scaleRatio;
		
		this.maxPoint = new Point(-Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE);
		this.minPoint = new Point(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		
		for(Point point : points)
		{
			updateMaxPoint(point, maxPoint);
			updateMinPoint(point, minPoint);
		}
	}
	
	public double scaleMax()
	{
		return planeMax / scaleRatio;
	}
	
	public double scaleMin()
	{
		return planeMin / scaleRatio;
	}
	
	public void scalePoint(Point p, double max, double min)
	{
		double diff = max - min;
		p.setX(min + scale(p.getX(), maxPoint.getX(), minPoint.getX()) * diff);
		p.setY(min + scale(p.getY(), maxPoint.getY(), minPoint.getY()) * diff);
		p.setZ(min + scale(p.getZ(), maxPoint.getZ(), minPoint.getZ()) * diff);
	}
	
	public void scalePoint(Point p)
	{
		scalePoint(p, scaleMax(), scaleMin());
	}
	
	public double scale(double value, double max, double min)
	{
		if(Math.abs(max - min) < 1e-8)
		{
			return 0.5;
		}
		return (value - min) / (max - min);
	}
	
	public static void updateMaxPoint(Point p, Point maxPoint)
	{
		if(maxPoint.getX() < p.getX())
		{
			maxPoint.setX(p.getX());
		}
		if(maxPoint.getY() < p.getY())
		{
			maxPoint.setY(p.getY());
		}
		if(maxPoint.getZ() < p.getZ())
		{
			maxPoint.setZ(p.getZ());
		}
	}
	
	public static void updateMinPoint(Point p, Point minPoint)
	{
		if(minPoint.getX() > p.getX())
		{
			minPoint.setX(p.getX());
		}
		if(minPoint.getY() > p.getY())
		{
			minPoint.setY(p.getY());
		}
		if(minPoint.getZ() > p.getZ())
		{
			minPoint.setZ(p.getZ());
		}
	}

	public Point getMaxPoint()
    {
    	return maxPoint;
    }

	public Point getMinPoint()
    {
    	return minPoint;
    }

	public double getPlaneMin()
    {
    	return planeMin;
    }

	public double getPlaneMax()
    {
    	return planeMax;
    }

	public double getScaleRatio()
    {
    	return scaleRatio;
    }

	public void setScaleRatio(double scaleRatio)
    {
    	this.scaleRatio = scaleRatio;
    }
}
