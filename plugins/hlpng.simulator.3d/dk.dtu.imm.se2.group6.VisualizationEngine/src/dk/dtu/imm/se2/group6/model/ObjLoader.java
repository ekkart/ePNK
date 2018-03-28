package dk.dtu.imm.se2.group6.model;

import java.awt.Color;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.media.opengl.GL2;

import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.scene.AbstractScene;
import dk.dtu.imm.se2.group6.utils.Scaler;
import dk.dtu.imm.se2.group6.visual.*;

/* @author: Felix Rubio (s102122) */
public class ObjLoader
{
	private Map<String, MTL> matterials = null;
	private List<Point> points = null;
	private List<Point> normalsPoints = null;
	
	private double radius = 0.0;
	private Point center = null;
	private List<Point> planePoints = null;
	
	public ObjLoader(String objPath) throws IOException
	{
		points = new ArrayList<Point>();
		normalsPoints = new ArrayList<Point>(); 
		matterials = new HashMap<String, MTL>();
		
		{
			
			/**
			 * @author jjepsen (s011936)
			 * 
			 * Implements support for relative paths. Just one line added:
			 *
			 * objPath = Animator.toNativeJavaPath(objPath);
			 * 
			 * (method might be moved to .utils later)
			 * 
			 */
			try{	
				objPath = Animator.toNativeJavaPath(objPath);

				String mtlPath = objPath.substring(0,objPath.length() - 3);

				mtlPath = mtlPath + "mtl";

				BufferedReader in = new BufferedReader(new FileReader(mtlPath));

				String line = null;

				MTL currentMtl = null;

				while((line = in.readLine()) != null)
				{
					String[] parts = line.split("\\s+");
					currentMtl = parseMtl(parts, currentMtl, matterials);
				}

				in.close();
			}catch(FileNotFoundException e){
				System.err.println("Miss the mtl file, please include a mtl file with the obj file");

			}catch(IOException e){
		    	 System.err.println("Error reading the mtl file"+ e.getMessage());

		     }catch(Exception e){
				System.err.println("Error trying to read the material file -mtl");
			}
		}
		{
			BufferedReader in = new BufferedReader(new FileReader(objPath));
			MTL currentMtl = null;
	        String line = null;
	     try{
	    	  while((line = in.readLine()) != null)
		        {
		        	String[] parts = line.split("\\s+");
		        	//Vertex
		        	if(parts[0].equals("v"))
		    		{
		    			points.add(new Point(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3])));
		    		}//normal vertex
		        	else if(parts[0].equals("vn"))
		        	{
		        		normalsPoints.add(new Point(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3])));
		        	}//Material for the object
		        	else if(parts[0].equals("usemtl"))
		        	{
		        		currentMtl = matterials.get(parts[1]);
		        		if(currentMtl == null)
		        		{
		        			currentMtl = new MTL();
		        			currentMtl.setNewmtl(parts[1]);
		        			matterials.put(currentMtl.getNewmtl(), currentMtl);
		        		}
		        	}
		        	//Faces with normals (v1//vn1)
		        	else if(parts[0].equals("f"))
		    		{
		        		String[] point = null;
		    			Face face = new Face();
		    			for(int i = 1; i < parts.length; i++)
		    			{
		    				point = parts[i].split("//");
		    				face.getVertices().add(Integer.parseInt(point[0]));
		    				face.getNormals().add(Integer.parseInt(point[1]));
		    			}
		    			currentMtl.getFaces().add(face);
		    		}
		        }	
	    	 
	     }
	     
		catch(FileNotFoundException  e){
			System.err.println("File not found!"+e.getMessage() );
	     } catch(IOException e){
	    	System.err.println("You should introduce an obj file with the normals of the object"+ e.getMessage());
	     }
	     catch(Exception e){
	    	 //Might use of the Dialog window inside the JPanel to show and error 
	    	 //Window.ShowError("Error reading a obj file, check the file and include the normals in the object");
	    	 System.err.println("Error reading a obj file, check the file and include the normals in the object" + 
	    			 		e.getMessage());
	    	 
	     }	      
	        in.close();
		}
		
		{
			Point maxPoint = new Point(-Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE);
			Point minPoint = new Point(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			// calculate radius
			{
				for(Point p : points)
				{
					Scaler.updateMaxPoint(p, maxPoint);
					Scaler.updateMinPoint(p, minPoint);
				}
				radius = maxPoint.distance(minPoint) / 2.0;
			}
			// calculate plane points
			{
				planePoints = new ArrayList<Point>();
				planePoints.add(new Point(minPoint.getX(), maxPoint.getY(), 
						maxPoint.getZ()));
				planePoints.add(new Point(maxPoint.getX(), maxPoint.getY(), 
						maxPoint.getZ()));
				planePoints.add(new Point(maxPoint.getX(), maxPoint.getY(), 
						minPoint.getZ()));
				planePoints.add(new Point(minPoint.getX(), maxPoint.getY(), 
						minPoint.getZ()));
			}
			
			   center = new Point((maxPoint.getX() + minPoint.getX()) / 2.0, 
						(maxPoint.getY() + minPoint.getY()) / 2.0,
						(maxPoint.getZ() + minPoint.getZ()) / 2.0);
		}
	}

	public static float[] colorToFloat(Color color, float alpha)
	{
		float[] arr = new float[4];
		
		arr = color.getRGBColorComponents(arr);
		
		arr[3] = alpha;

		return arr;
	}
	
	public void showModel(AbstractScene scene, GL2 gl)
	{
		for(MTL mtl : matterials.values())
		{
			if(mtl.getKa() != null && mtl.getKd() != null && mtl.getKs() != null)
			{
				scene.setMaterialColor(colorToFloat(mtl.getKa(), mtl.getD()),
						colorToFloat(mtl.getKd(), mtl.getD()), 
						colorToFloat(mtl.getKs(), mtl.getD()), 
						mtl.getNs(), gl);	
			}

			gl.glPushMatrix();
				/* Example
				 *   glBegin(GL_POLYGON);
				 *		glNormal3d(  0.0,  0.0,  1.0);
				 *		glVertex3d(  1.0,  1.0,  1.0);
				 *		glVertex3d( -1.0,  1.0,  1.0);
				 *		glVertex3d( -1.0, -1.0,  1.0);
				 *		glVertex3d(  1.0, -1.0,  1.0);
				 *	glEnd();
				 */
				for(Face face : mtl.getFaces())
				{

					gl.glBegin(GL2.GL_POLYGON);

					for(int i=0; i < face.getVertices().size();i++)
					{
						Point n = getNormals().get(face.getNormals().get(i) - 1);
						gl.glNormal3d(n.getX(), n.getY(), n.getZ());
						Point p = getPoints().get(face.getVertices().get(i) - 1);
						gl.glVertex3d(p.getX(), p.getY(), p.getZ());
					}

					gl.glEnd();

				}
	    		
			gl.glPopMatrix();
		}
	}
	
	private static MTL parseMtl(String[] parts, MTL currentMtl,
	        Map<String, MTL> matterials)
	{
		if(parts[0].equals("newmtl"))
		{
			currentMtl = new MTL();
			currentMtl.setNewmtl(parts[1]);
			matterials.put(currentMtl.getNewmtl(), currentMtl);
		}
		else if(parts[0].equals("Ns"))
		{
			currentMtl.setNs(Float.parseFloat(parts[1]));
		}
		else if(parts[0].equals("Ni"))
		{
			currentMtl.setNi(Float.parseFloat(parts[1]));
		}
		else if(parts[0].equals("d"))
		{
			currentMtl.setD(Float.parseFloat(parts[1]));
		}
		else if(parts[0].equals("Ka"))
		{
			currentMtl.setKa(new Color(Float.parseFloat(parts[1]),
			        Float.parseFloat(parts[2]), Float
			                .parseFloat(parts[3])));
		}
		else if(parts[0].equals("Kd"))
		{
			currentMtl.setKd(new Color(Float.parseFloat(parts[1]),
			        Float.parseFloat(parts[2]), Float
			                .parseFloat(parts[3])));
		}
		else if(parts[0].equals("Ks"))
		{
			currentMtl.setKs(new Color(Float.parseFloat(parts[1]),
			        Float.parseFloat(parts[2]), Float
			                .parseFloat(parts[3])));
		}
		
		return currentMtl;
	}
	
	public List<Point> getPoints()
    {
    	return points;
    }
	
	public List<Point> getNormals()
	{
		return normalsPoints;
	}

	public Map<String, MTL> getMatterials()
    {
    	return matterials;
    }

	public double getRadius()
    {
    	return radius;
    }

	public Point getCenter()
    {
    	return center;
    }

	public List<Point> getPlanePoints()
    {
    	return planePoints;
    }

}
