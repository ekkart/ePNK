package dk.dtu.imm.se2.group6.entities;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.visual.Animator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class StaticLinearItem extends AbstractStaticItem implements IPath
{
	protected Point start;
	protected Point end;
	
	
	public StaticLinearItem(Point start, Point end, String texture, Animator scene)
	{
		super(scene, texture);
		this.start = start;
		this.end = end;
	}
	
	@Override
	public double length()
	{
		return end.distance(start);
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	@Override
    public List<Point> subdividePath(double length)
    {
		List<Point> points = new ArrayList<Point>();
		
		points.add(getStart());
		
		int no = (int)(length() / length);
		
		for(int i = 1; i < no; i++)
		{
			double k = i;
			Point p1 = getStart().multiply(1.0 - k * length / length());
			Point p2 = getEnd().multiply(k * length / length());
			points.add(p1.add(p2));
		}
		
		points.add(getEnd());
		
	    return points;
    }
}
