package dk.dtu.imm.se2.group6.model;

import java.util.ArrayList;
import java.util.List;

/* @author: Felix Rubio (s102122)  */
public class Face
{
	//For each vertex there is a normal
	private List<Integer> vertices = null;
	private List<Integer> normals = null;
	
	public Face()
	{
		vertices = new ArrayList<Integer>();
		normals = new ArrayList<Integer>();
	}

	public List<Integer> getVertices()
    {
    	return vertices;
    }
	public List<Integer> getNormals()
	{
		return normals;
	}

	public void setVertices(List<Integer> vertices)
    {
    	this.vertices = vertices;
    }
	
	public void setNormals(List<Integer> normals)
	{
		this.normals = normals;
	}


}
