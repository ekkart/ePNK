package dk.dtu.imm.se2.group6.interfaces;

import java.util.List;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public interface IPath extends IDisplay
{
	public List<Point> subdividePath(double length);
	public double length();
	public void init(GL2 gl);
	public Point getStart();
	public Point getEnd();
	public List<Point> getPathPoints();
}
