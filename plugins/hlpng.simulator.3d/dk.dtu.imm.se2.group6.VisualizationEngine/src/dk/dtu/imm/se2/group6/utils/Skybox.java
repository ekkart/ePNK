package dk.dtu.imm.se2.group6.utils;
/**
 * @author: Christian Sj�green - s072429
 */

import javax.media.opengl.GL2;
import javax.media.opengl.GLProfile;

import dk.dtu.imm.se2.group6.geometry.Point;


public class Skybox  {

private TextureRenderer renderers[];

    public Skybox(GLProfile profile, String[] textures){
    	renderers = new TextureRenderer[6];
    	for(int i = 0; i < 6; i++)
    	{
    		if(textures[i] != null)
    		{
    			try{
    				renderers[i] = new TextureRenderer(profile,textures[i]);
    			}catch(Exception e){
    				System.out.println("Failed to load skybox texture: "+e.getMessage());
    			}
    		}
    	}
    }

	public void drawSkybox(GL2 gl, double size)
	{
		//Skybox Points
		Point top0 = new Point(-size,size,size);
		Point top1 = new Point(-size,size,-size);
		Point top2 = new Point(size,size,-size);
		Point top3 = new Point(size,size,size);
		
		Point bot0 = new Point(-size,-size,size);
		Point bot1 = new Point(-size,-size,-size);
		Point bot2 = new Point(size,-size,-size);
		Point bot3 = new Point(size,-size,size);

		if(renderers[0]!=null)
		renderers[0].drawTexturedPlane(gl,top3,top0,bot0,bot3);
		if(renderers[1]!=null)
		renderers[1].drawTexturedPlane(gl,top2,top3,bot3,bot2);
		if(renderers[2]!=null)
		renderers[2].drawTexturedPlane(gl,top1,top2,bot2,bot1);
		if(renderers[3]!=null)
		renderers[3].drawTexturedPlane(gl,top0,top1,bot1,bot0);
		if(renderers[4]!=null)
		renderers[4].drawTexturedPlane(gl,top3,top2,top1,top0);
		if(renderers[5]!=null)
		renderers[5].drawTexturedPlane(gl,bot0,bot1,bot2,bot3);
	}
}
