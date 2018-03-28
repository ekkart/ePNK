package experiment;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

public class QuadraticBezier {

	public static Point intermediate(Point p0, Point c, Point p1, float t) {
		float q0x = p0.x + t * (c.x - p0.x);
		float q0y = p0.y + t * (c.y - p0.y);
		
		float q1x = c.x + t * (p1.x - c.x);
		float q1y = c.y + t * (p1.y - c.y);
		
		float qx = q0x + t * (q1x - q0x);
		float qy = q0y + t * (q1y - q0y);
		
		return new Point(Math.round(qx),Math.round(qy)); 
	}

	public static void intermediate(Point p0, Point c, Point p1, PointList points) {
		intermediate(p0, c, p1, points, 0.0f, 0.5f, 1.0f);
	}

	public static void intermediate(Point p0, Point c, Point p1, PointList points, float t0, float m, float t1) {
		Point pt0 = intermediate(p0,c,p1, t0);
		Point pt1 = intermediate(p0,c,p1, t1);
		
		Point pm = intermediate(p0,c,p1, m);
		
		int dx = Math.abs(pm.x - Math.round((pt0.x + pt1.x)/2.0f));
		int dy = Math.abs(pm.y - Math.round((pt0.y + pt1.y)/2.0f));
		
		if (dx + dy > 1) {
			intermediate(p0,c,p1,points,t0,(t0+m)/2.0f,m);
			points.addPoint(pm);
			intermediate(p0,c,p1,points,m, (m+t1)/2.0f, t1);
		}
	}

	public static PointList allPoints(PointList list) {
		PointList result = new PointList();		
		if (list != null && list.size() > 0) {
			result.addPoint(list.getPoint(0));
			for (int i=0; i+2 < list.size() ; i = i+2) {
				intermediate(list.getPoint(i), list.getPoint(i+1), list.getPoint(i+2), result);
				result.addPoint(list.getPoint(i+2));
			}

			if (list.size() % 2 == 0) {
				result.addPoint(list.getPoint(list.size()-1));
			}
		}
		return result;
	}

}
