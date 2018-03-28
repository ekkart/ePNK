package dk.dtu.imm.se2.group6.utils;
/**
 * @author: Christian Sj�green - s072429
 */
import java.io.IOException;

import javax.media.opengl.GL2;
import javax.media.opengl.GLException;
import javax.media.opengl.GLProfile;

import dk.dtu.imm.se2.group6.geometry.Point;

public class EarthBox extends TextureRenderer{

	public EarthBox(GLProfile profile, String path) throws GLException,
			IOException {
		super(profile, path);
	}
	
	public void drawBox(GL2 gl, Point bl, Point br, Point tr, Point tl, Point down, float height)
	{
		Point vect = down.multiply(height);
		drawTexturedPlane(gl,bl,br,br.subtract(vect),bl.subtract(vect));
		drawTexturedPlane(gl,br,tr,tr.subtract(vect),br.subtract(vect));
		drawTexturedPlane(gl,tr,tl,tl.subtract(vect),tr.subtract(vect));
		drawTexturedPlane(gl,tl,bl,bl.subtract(vect),tl.subtract(vect));
		drawTexturedPlane(gl,tr.subtract(vect),br.subtract(vect),bl.subtract(vect),tl.subtract(vect));
	}

}
