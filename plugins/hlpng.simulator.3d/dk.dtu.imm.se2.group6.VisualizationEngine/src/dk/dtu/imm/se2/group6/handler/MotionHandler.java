package dk.dtu.imm.se2.group6.handler;

import java.util.List;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IHandler;
import dk.dtu.imm.se2.group6.interfaces.IModel;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.utils.CollisionDetector;
import dk.dtu.imm.se2.group6.utils.OrientationManager;
import dk.dtu.imm.se2.group6.utils.Position;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class MotionHandler implements IHandler
{
	private static final int SPEED_SCALE = 300;
	
	private CollisionDetector collisionDetector = null;
	private IModel model = null;
	
	private int currentTimeUnit;
	private List<Point> pathPoints = null;
	private OrientationManager orientationManager = null;
	private int orientationAdjustmentCoefficient = 3;
	
	private boolean animFinished = false;
	
	public MotionHandler(IModel model, IPath path, int speed, 
			CollisionDetector collisionDetector)
	{
		this.model = model;
		this.collisionDetector = collisionDetector;
		
		this.pathPoints = path.subdividePath(getScaledSpeed(speed));
		this.orientationManager = new OrientationManager();

		this.currentTimeUnit = 0;
	}
	
	public MotionHandler(IModel model, List<Point> pathPoints, int position,
			CollisionDetector collisionDetector)
	{
		this.model = model;
		this.collisionDetector = collisionDetector;
		this.currentTimeUnit = position;
		this.pathPoints = pathPoints;
		
		this.orientationManager = new OrientationManager();
	}
	
	public boolean handle(GL2 gl)
	{
		if(!model.stop() && currentTimeUnit < pathPoints.size())
		{
			Position newPosition = calcPosition(orientationManager,
					orientationAdjustmentCoefficient, currentTimeUnit, pathPoints);
			Position prevPosition = model.getPosition();
	
			model.getBoundingSurface().update(newPosition);
			if(!collisionDetector.checkCollision(model))
			{
				model.setPosition(newPosition);
				currentTimeUnit++;
			}
			else
			{
				model.getBoundingSurface().update(prevPosition);
			}	
		}

		if(!model.stop() && !animFinished && currentTimeUnit >= pathPoints.size() - 1)
		{
			animFinished = true;
			return true;
		}
		
		return false;
	}
	
	private static Position calcPosition(OrientationManager om,
			int orientationAdjustmentCoefficient, int currentTimeUnit,
			List<Point> pathPoints)
	{
		Point newPosition = pathPoints.get(currentTimeUnit);
		Point controlPoint = pathPoints.get(getPointIndex(currentTimeUnit, 
				pathPoints.size(), orientationAdjustmentCoefficient));
		float orientationAngle = angle(om, newPosition, controlPoint);
		
		return new Position(newPosition, orientationAngle);
	}
	
	private static float angle(OrientationManager om, Point p1, Point p2)
	{
		return (float)-om.calculateItemDrawingAngle(p1, p2);
	}
	
	private static int getPointIndex(int currentTimeUnit, int size, int steps)
	{
		for(int i = steps; i > 0; i--)
		{
			if(currentTimeUnit - i >= 0)
			{
				return currentTimeUnit - i;
			}
		}
		for(int i = steps; i > 0; i--)
		{
			if(currentTimeUnit + i < size)
			{
				return currentTimeUnit + i;
			}
		}
		
		throw new RuntimeException("Cannot find the second point!");
	}
	
	public static double getScaledSpeed(int speed)
	{
		return (1.0 * speed) / (1.0 * SPEED_SCALE);
	}
}
