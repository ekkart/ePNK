package geditor.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;


/**
 * This class is used to draw a Catmull-Rom curve for circular arcs.
 * 
 * All credit for this class is given to lambert@cse.unsw.edu.au
 * The code was retrieved from <a href=http://www.cse.unsw.edu.au/~lambert/splines/>here</a>
 * A summary of the theory of Catmull-Rom splines can be read here: http://www.mvps.org/directx/articles/catmull/
 * 
 * @author Radu Gatej(s111337)
 *
 */
public class CurveCreator {
	
	final int STEPS = 12;
	
	private List<PrecisionPoint> controlPoints;
	
	public PointList getControlPoints() {
		PointList intControlPoints = new PointList();
		for(PrecisionPoint point: controlPoints) {
			intControlPoints.addPoint(point.x, point.y);
		}
		
		return intControlPoints;
		
	}
	
	public List<PrecisionPoint> getPrecisionControlPoints() {
		return controlPoints;
	}

	public void setControlPoints(PointList controlPoints) {
		for(int i=0;i<controlPoints.size();i++) {
			this.controlPoints.add(new PrecisionPoint(controlPoints.getPoint(i)));
		}
	}

	public CurveCreator() {
		controlPoints = new ArrayList<PrecisionPoint>();
	}
	
	public CurveCreator(PointList controlPoints) {
		this.controlPoints = new ArrayList<PrecisionPoint>();
		for(int i=0;i<controlPoints.size();i++) {
			this.controlPoints.add(new PrecisionPoint(controlPoints.getPoint(i)));
		}
	}
	
	public CurveCreator(List<PrecisionPoint> controlPoints) {
		this.controlPoints = controlPoints;
	}
	//The polynomial function for calculating a Catmull-Rom spline
			float b(int i, float t) {
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

			//evaluate a point on the B spline
			PrecisionPoint getCurvePoint(int i, float t) {
				float px = 0;
				float py = 0;
				for (int j = -2; j <= 1; j++) {
					px += b(j, t) * controlPoints.get(i + j).x;
					py += b(j, t) * controlPoints.get(i + j).y;
				}
				return new PrecisionPoint(px, py);
			}

			

			public void drawCurve(Graphics g) {

				Polygon pol = new Polygon();
				Point q = getCurvePoint(2, 0);
				pol.addPoint(q);
				for (int i = 2; i < controlPoints.size() - 1; i++) {
					for (int j = 1; j <= STEPS; j++) {
						q = getCurvePoint(i, j / (float) STEPS);
						pol.addPoint(q);
					}
				}
				g.drawPolyline(pol.getPoints());
			}
			
			public List<PrecisionPoint> getPrecisionPolygonPoints() {
				//in case there are only two visible points in the curve(which means a total of 4 points)
				//then just send the two visible points so a straight line can be correctly drawn.
				if(controlPoints.size() > 4) {
				List<PrecisionPoint> pol = new ArrayList<PrecisionPoint>();
				PrecisionPoint q = getCurvePoint(2, 0);
				pol.add(q);
				for (int i = 2; i < controlPoints.size() - 1; i++) {
					for (int j = 1; j <= STEPS; j++) {
						q = getCurvePoint(i, j / (float) STEPS);
						pol.add(q);
					}
				}
				return pol;
				} else {
					List<PrecisionPoint> polygonPoints = new ArrayList<PrecisionPoint>();
					polygonPoints.add(controlPoints.get(1));
					polygonPoints.add(controlPoints.get(controlPoints.size()-2));
					return polygonPoints;
				}
			}
			
			public PointList getPolygonPoints() {
				PointList polygonPoints = new PointList();
				for(PrecisionPoint point: this.getPrecisionPolygonPoints()) {
					polygonPoints.addPoint(point);
				}
				
				return polygonPoints;
			}
			
			public void clearPoints() {
				this.controlPoints.clear();
			}


}
