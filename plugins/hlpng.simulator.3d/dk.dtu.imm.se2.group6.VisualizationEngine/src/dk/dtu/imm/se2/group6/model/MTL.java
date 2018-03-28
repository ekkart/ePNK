package dk.dtu.imm.se2.group6.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


/* @author: Felix Rubio (s102122)  */
public class MTL
{
/*	newmtl Black_ball
	Ns 96.078431
	Ka 0.000000 0.000000 0.000000
	Kd 0.020482 0.132859 0.001604
	Ks 0.000000 0.000000 0.000000
	Ni 1.000000
	d 0.628205*/
	private String newmtl;
	private float ns;
	private Color ka;
	private Color kd;
	private Color ks;
	private float ni;
	private float d;
	private List<Face> faces = null;
	
	public MTL()
	{
		this.faces = new ArrayList<Face>();
	}
	
	public String toString()
	{
		return "newmtl " + getNewmtl() + "\n" +
			   "Ns " + getNs() + "\n" +
			   "Ka " + getKa() + "\n" +
			   "Kd " + getKd() + "\n" +
			   "Ks " + getKs() + "\n" +
			   "Ni " + getNi() + "\n" +
			   "d " + getD() + "\n";
	}
	
	public String getNewmtl()
    {
    	return newmtl;
    }
	public void setNewmtl(String newmtl)
    {
    	this.newmtl = newmtl;
    }
	public float getNs()
    {
    	return ns;
    }
	public void setNs(float ns)
    {
    	this.ns = ns;
    }
	public Color getKa()
    {
    	return ka;
    }
	public void setKa(Color ka)
    {
    	this.ka = ka;
    }
	public Color getKd()
    {
    	return kd;
    }
	public void setKd(Color kd)
    {
    	this.kd = kd;
    }
	public Color getKs()
    {
    	return ks;
    }
	public void setKs(Color ks)
    {
    	this.ks = ks;
    }
	public float getNi()
    {
    	return ni;
    }
	public void setNi(float ni)
    {
    	this.ni = ni;
    }

	public List<Face> getFaces()
    {
    	return faces;
    }

	public float getD()
    {
    	return d;
    }

	public void setD(float d)
    {
    	this.d = d;
    }
}
