package dk.dtu.imm.se2.group6.handler;

import java.util.List;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IHandler;
import dk.dtu.imm.se2.group6.interfaces.IModel;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.utils.CollisionDetector;
import dk.dtu.imm.se2.group6.utils.PositioningManager;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class MotionHandlerWrapper implements IHandler
{
	private MotionHandler motionHandler = null;
	
	public MotionHandlerWrapper(IModel model, IPath path, int speed, 
			CollisionDetector collisionDetector)
	{
		List<Point> pathPoints = path.subdividePath(MotionHandler.getScaledSpeed(speed));
		PositioningManager positioningManager = new PositioningManager(pathPoints,
				collisionDetector);
		int currentTimeUnit = positioningManager.position(model);

		this.motionHandler = new MotionHandler(model, pathPoints, currentTimeUnit,
				collisionDetector);
	}
	
	public boolean handle(GL2 gl)
	{
		return motionHandler.handle(gl);
	}
}
