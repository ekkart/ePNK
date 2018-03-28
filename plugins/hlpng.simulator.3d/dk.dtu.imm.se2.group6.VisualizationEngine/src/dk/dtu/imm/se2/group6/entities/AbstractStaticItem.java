package dk.dtu.imm.se2.group6.entities;

import java.util.List;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.utils.TextureQuads;
import dk.dtu.imm.se2.group6.utils.TextureRenderer;
import dk.dtu.imm.se2.group6.visual.Animator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public abstract class AbstractStaticItem extends AbstractItem implements IPath
{
	protected TextureRenderer renderer = null;
	protected List<Point> pathPoints = null;
	protected List<Point> quadPoints = null;
	protected String texturePath = null;
	
	public AbstractStaticItem(Animator scene, String texture)
    {
	    super(scene);
	    this.texturePath = texture;
    }

	@Override
	public void show(GL2 gl)
	{
		drawPath(gl, quadPoints, renderer);
	}

	@Override
	public void init(GL2 gl)
	{
		try
        {
	        this.renderer = new TextureRenderer(this.scene.getGLProfile(),
	        		this.texturePath);
        }
        catch(Exception e)
        {
	        e.printStackTrace();
        }
		
		this.pathPoints = subdividePath(0.2);
		TextureQuads tq = new TextureQuads(0.4);
		this.quadPoints = tq.calcQuads(subdividePath(0.2));
	}
	
	protected void drawPath(GL2 gl, List<Point> points, 
			TextureRenderer renderer)
	{
		if(renderer != null)
		{
			for(int i = 0; i < points.size(); i += 4)
			{
				renderer.drawTexturedPlane(gl, points.get(i), points.get(i + 1), 
						points.get(i + 2), points.get(i + 3));
			}
		}
		else
		{
			gl.glBegin(GL2.GL_QUADS);
    			for(Point p : points)
    			{
    				gl.glVertex3d(p.getX(), p.getY(), p.getZ());
    			}
			gl.glEnd();
		}
	}

	public List<Point> getPathPoints()
    {
    	return pathPoints;
    }

}
