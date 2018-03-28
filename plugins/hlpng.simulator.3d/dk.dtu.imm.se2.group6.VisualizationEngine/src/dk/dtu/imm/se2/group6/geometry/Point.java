package dk.dtu.imm.se2.group6.geometry;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class Point 
{
	private double x;
	private double y;
	private double z;
	
	public Point()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Point(Point p)
	{
		this.x = p.getX();
		this.y = p.getY();
		this.z = p.getZ();
	}
	
	public Point(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double distance(Point p)
	{
		return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)
				+ Math.pow(this.z - p.getZ(), 2));
	}
	
	public Point middle(Point p)
	{
		return new Point((x + p.getX()) / 2.0, (y + p.getY()) / 2.0, (z + p.getZ()) / 2.0);
	}
	
	public Point multiply(double a)
	{
		return new Point(x * a, y * a, z * a);
	}
	
	public Point subtract(Point p)
	{
		return new Point(x - p.getX(), y - p.getY(), z - p.getZ());
	}
	
	public Point add(Point p)
	{
		return new Point(x + p.getX(), y + p.getY(), z + p.getZ());
	}
	
	public String toString()
	{
		return "x: " + x + " y: " + y + " z: " + z;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
    public int hashCode()
    {
	    final int prime = 31;
	    int result = 1;
	    long temp;
	    temp = Double.doubleToLongBits(x);
	    result = prime * result + (int) (temp ^ (temp >>> 32));
	    temp = Double.doubleToLongBits(y);
	    result = prime * result + (int) (temp ^ (temp >>> 32));
	    temp = Double.doubleToLongBits(z);
	    result = prime * result + (int) (temp ^ (temp >>> 32));
	    return result;
    }

	@Override
    public boolean equals(Object obj)
    {
	    if(this == obj)
	    {
		    return true;
	    }
	    if(obj == null)
	    {
		    return false;
	    }
	    if(!(obj instanceof Point))
	    {
		    return false;
	    }
	    Point other = (Point) obj;
	    double limit = 1e-8;
	    if(Math.abs(x - other.x) > limit)
	    {
		    return false;
	    }
	    if(Math.abs(y - other.y) > limit)
	    {
		    return false;
	    }
	    if(Math.abs(z - other.z) > limit)
	    {
		    return false;
	    }
	    return true;
    }
}
