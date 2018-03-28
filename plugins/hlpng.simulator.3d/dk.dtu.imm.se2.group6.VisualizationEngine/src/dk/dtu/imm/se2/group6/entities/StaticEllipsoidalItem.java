package dk.dtu.imm.se2.group6.entities;
/**
 * @author: Christian Sj�green - s072429
 */

import java.util.ArrayList;
import java.util.List;


import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.visual.Animator;

public class StaticEllipsoidalItem extends AbstractStaticItem implements IPath
{
	protected List<Point> inputPoints = null;

	protected double approxLength = 0;
	
	
	public StaticEllipsoidalItem(List<Point> inputPoints, String texture,
			Animator scene)
    {
		super(scene, texture);
		this.inputPoints = inputPoints;
		this.texturePath = texture;
    }
	
	//From Geditor by Radu:
	//Radu:"The polynomial function for calculating a Catmull-Rom spline"
	//Used by getCurvePoint.
	private float b(int i, float t) {
		switch (i) {
		case -2:
			return ((-t + 2) * t - 1) * t / 2;
		case -1:
			return (((3 * t - 5) * t) * t + 2) / 2;
		case 0:
			return ((-3 * t + 4) * t + 1) * t / 2;
		case 1:
			return ((t - 1) * t * t) / 2;
		}
		return 0; //we only get here if an invalid i is specified
	}

	//From Geditor by Radu
	//Radu:"evaluate a point on the B spline"
	//Could be called from CurveCreator but would require too much type conversion.
	private Point getCurvePoint(int i, float t) {
		float px = 0;
		float pz = 0;
		for (int j = -2; j <= 1; j++) {
			px += b(j, t) * inputPoints.get(i + j).getX();
			pz += b(j, t) * inputPoints.get(i + j).getZ();
		}
		return new Point(px, 0, pz);
	}
	
	@Override
    public List<Point> subdividePath(double length)
    {
		approxLength = 0;
		double subApproxLength;
		int steps = 0;
		List<Point> curve = new ArrayList<Point>();
		List<Point> subCurve = new ArrayList<Point>();
		try{

			if(inputPoints.size() == 2)
			{
				return inputPoints;
			}
			
			curve.add(getCurvePoint(2, 0));
			for (int i = 2; i < inputPoints.size() - 1; i++) {
				subApproxLength = 0;
				subCurve = new ArrayList<Point>();
				for (int j = 1; j <= 12; j++) {
					subCurve.add(getCurvePoint(i, j / (float) 12));
				}
				for(int j = 0; j < 11; j++)
				{
					subApproxLength+=subCurve.get(j).distance(subCurve.get(j+1));
				}
				steps = (int)Math.round((subApproxLength / length));
				for (int j = 1; j <= steps; j++) {
					curve.add(getCurvePoint(i, j / (float) steps));
				}
			}
			for(int i = 0; i < curve.size()-1; i++)
			{
				approxLength+=curve.get(i).distance(curve.get(i+1));
			}
		} catch(Exception e)
		{
			System.out.println("Exception caught! Bad Arc! "+e.getMessage());
		}
		if(curve.size() < 2)
		{
			return errorList();
		}
		return curve;
    }
	
	private List<Point> errorList()
	{
		System.out.println("Error! No curve generated for item #"+this.id);
		System.out.println("Adding default path from (0,0,0) to (2,0,2)...");
		List<Point> el = new ArrayList<Point>();
		el.add(new Point(0,0,0));
		el.add(new Point(2,0,2));
		return el;
	}
	
	@Override
	public double length()
	{
		return approxLength;
	}
	
	public List<Point> getInputPoints() {
		return inputPoints;
	}

	@Override
	public Point getStart() {
		return pathPoints.get(0);
	}

	@Override
    public Point getEnd()
    {
		return pathPoints.get(pathPoints.size() - 1);
    }
}
