package dk.dtu.imm.se2.group6.utils;

import java.util.List;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IModel;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class PositioningManager
{
	private List<Point> pathPoints = null;
	private OrientationManager orientationManager = null;
	private CollisionDetector collisionDetector = null;

	public PositioningManager(List<Point> pathPoints, 
			CollisionDetector collisionDetector)
	{
		this.collisionDetector = collisionDetector;
		
		this.pathPoints = pathPoints;
		this.orientationManager = new OrientationManager();
	}
	
	public int position(IModel model)
	{
		// set initial position
		model.setPosition(calcPosition(orientationManager,
				pathPoints.size() - 1, pathPoints));
		
		for(int i = pathPoints.size() - 1; i > 0 ; i--)
		{
			Position newPosition = calcPosition(orientationManager, i, pathPoints);
			
			Position prevPosition = model.getPosition();
			
			model.getBoundingSurface().update(newPosition);
			
			if(!collisionDetector.checkCollision(model))
			{
				model.setPosition(newPosition);
				return i;
			}
			else
			{
				model.getBoundingSurface().update(prevPosition);
			}	
		}
		return 0;
	}
	
	private static Position calcPosition(OrientationManager om, int currentIndex,
			List<Point> pathPoints)
	{
		Point currentPoint = pathPoints.get(currentIndex);
		Point prevPoint = currentPoint;
		if(currentIndex - 1 >= 0)
		{
			prevPoint = pathPoints.get(currentIndex - 1);
		}
		else if(currentIndex + 1 < pathPoints.size())
		{
			prevPoint = pathPoints.get(currentIndex + 1);	
		}
		float orientationAngle = (float)-om.calculateItemDrawingAngle(currentPoint, prevPoint);
		
		return new Position(currentPoint, orientationAngle);
	}
}
