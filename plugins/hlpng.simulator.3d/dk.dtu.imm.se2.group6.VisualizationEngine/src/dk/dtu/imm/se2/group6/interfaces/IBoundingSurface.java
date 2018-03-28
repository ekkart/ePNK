package dk.dtu.imm.se2.group6.interfaces;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.scene.AbstractScene;
import dk.dtu.imm.se2.group6.utils.Position;

public interface IBoundingSurface
{
	public void update(Position p);
	public double getAngle();
	public Point getCenter();
	public boolean checkCollision(IBoundingSurface surface);
	public void show(GL2 gl, AbstractScene scene);
	public IBoundingSurface clone();
}
