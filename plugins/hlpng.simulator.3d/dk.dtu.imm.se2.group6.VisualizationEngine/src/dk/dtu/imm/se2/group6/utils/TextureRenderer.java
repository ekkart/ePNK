package dk.dtu.imm.se2.group6.utils;

import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;

import dk.dtu.imm.se2.group6.geometry.Point;

import java.io.File;
import java.io.IOException;
import javax.media.opengl.GL2;
import javax.media.opengl.GLException;
import javax.media.opengl.GLProfile;

/*
 * Author: Johannes Rasmussen (s062988)
 */

public class TextureRenderer 
{     
    private Texture texture = null;
    
	public TextureRenderer(GLProfile profile, String path) throws GLException, IOException 
    {
    	File file = new File(path);
    	TextureData data = TextureIO.newTextureData(profile, file, true, null);
    	this.texture = TextureIO.newTexture(data);
    }
    
	public void drawTexturedPlane(GL2 gl, Point bl, Point br, Point tr, Point tl)
	{
		texture.enable(gl);
		
/*		texture.setTexParameteri(gl, GL2.GL_TEXTURE_MAG_FILTER,
		        GL2.GL_NEAREST);
		texture.setTexParameteri(gl, GL2.GL_TEXTURE_MIN_FILTER,
		        GL2.GL_NEAREST);*/
		
		texture.bind(gl);

		gl.glDisable(GL2.GL_LIGHTING);
		
		gl.glBegin(GL2.GL_QUADS);
			// Bottom Left Of The Texture
    		gl.glTexCoord2f(0.0f, 0.0f);
    		gl.glVertex3f((float)bl.getX(), (float)bl.getY(), (float)bl.getZ()); 
    		// Bottom Right Of The Texture 
    		gl.glTexCoord2f(1.0f, 0.0f);
    		gl.glVertex3f((float)br.getX(), (float)br.getY(), (float)br.getZ());
    		// Top Right Of The Texture
    		gl.glTexCoord2f(1.0f, 1.0f);
    		gl.glVertex3f((float)tr.getX(), (float)tr.getY(), (float)tr.getZ());
    		// Top Left Of The Texture
    		gl.glTexCoord2f(0.0f, 1.0f);
    		gl.glVertex3f((float)tl.getX(), (float)tl.getY(), (float)tl.getZ());
		gl.glEnd();
		
		texture.disable(gl);

		gl.glEnable(GL2.GL_LIGHTING);
	}
}