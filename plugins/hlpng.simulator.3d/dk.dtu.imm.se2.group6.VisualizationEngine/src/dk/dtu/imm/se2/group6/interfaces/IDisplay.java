package dk.dtu.imm.se2.group6.interfaces;

import javax.media.opengl.GL2;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

/*
 * Displays the object. An ID & boolean argument is used to handle selection in
 * OpenGL.
 */
public interface IDisplay
{
	public int getId();
	public void show(GL2 gl);
}
