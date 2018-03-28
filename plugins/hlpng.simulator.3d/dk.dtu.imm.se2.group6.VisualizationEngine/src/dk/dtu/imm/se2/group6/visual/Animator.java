package dk.dtu.imm.se2.group6.visual;

import geditor.Arc;
import geditor.GObject;
import geditor.Line;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;

import org.eclipse.core.runtime.FileLocator;

import Appearence.Shape;

import dk.dtu.imm.se2.group6.entities.Model;
import dk.dtu.imm.se2.group6.entities.StaticEllipsoidalItem;
import dk.dtu.imm.se2.group6.entities.StaticLinearItem;
import dk.dtu.imm.se2.group6.geometry.Point;
import dk.dtu.imm.se2.group6.handler.AppearHandler;
import dk.dtu.imm.se2.group6.handler.MotionHandler;
import dk.dtu.imm.se2.group6.handler.MotionHandlerWrapper;
import dk.dtu.imm.se2.group6.handler.TriggerHandler;
import dk.dtu.imm.se2.group6.interfaces.IAnimator;
import dk.dtu.imm.se2.group6.interfaces.IModel;
import dk.dtu.imm.se2.group6.interfaces.IPath;
import dk.dtu.imm.se2.group6.interfaces.ISimulator;
import dk.dtu.imm.se2.group6.model.ObjLoader;
import dk.dtu.imm.se2.group6.scene.AbstractScene;
import dk.dtu.imm.se2.group6.utils.CollisionDetector;
import dk.dtu.imm.se2.group6.utils.EarthBox;
import dk.dtu.imm.se2.group6.utils.OrientationManager;
import dk.dtu.imm.se2.group6.utils.Position;
import dk.dtu.imm.se2.group6.utils.Scaler;
import dk.dtu.imm.se2.group6.utils.Skybox;
import dk.dtu.imm.se2.group6.utils.TextureRenderer;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public class Animator extends AbstractScene implements IAnimator
{
	private static final long serialVersionUID = 1L;

	private JFrame window = null;
	private Animator me = null;

	private int planeMax = 10;
	private int planeMin = -10;
	private double yAxis = -0.01;
	private double scalingParam = 1.2;
	private boolean indicateCollision = true;

	private Scaler scaler = null;

	private ArrayList<IModel> models = null;
	private ArrayList<IPath> path = null;
	private HashMap<Integer, IModel> modelMap = null;
	private HashMap<Integer, IPath> itemMap = null;

	private ArrayList<Point> points = null;

	private CollisionDetector collisionDetector = null;

	private boolean updatePosition = false;

	private ISimulator simulator = null;

	private String planeTexture = null;
	private TextureRenderer renderer = null;
	private String earthTexture = null;
	private EarthBox earthBox = null;
	private String[] skyboxTextures = null;
	private Skybox skybox = null;
	private ObjLoader collisionSignalModel = null;
	
	//private Skybox skybox = null;

	private boolean initPath = false;
	private boolean initFinished = false;
	private boolean reset = false;
	private boolean initStart = true;

	public Animator(int width, int height, ISimulator simulator, 
			String planeTexture, String collisionSignal, String earthTexture, String[] skyboxTextures)
	{
		super(width, height);

		me = this;
		
		this.simulator = simulator;
		this.planeTexture = planeTexture;
		this.earthTexture = earthTexture;
		this.skyboxTextures = skyboxTextures;

		path = new ArrayList<IPath>();
		models = new ArrayList<IModel>();
		itemMap = new HashMap<Integer, IPath>();
		modelMap = new HashMap<Integer, IModel>();
		
		try
        {
	        collisionSignalModel = new ObjLoader(collisionSignal);
        }
        catch(Exception e)
        {
	        e.printStackTrace();
        }

		collisionDetector = new CollisionDetector();

		points = new ArrayList<Point>();

		me.requestFocus();
	}
	
	public Animator(int width, int height,
			String planeTexture, String collisionSignal, String earthTexture, String[] skyboxTextures)
	{
		this(width, height, null, planeTexture, collisionSignal, earthTexture, skyboxTextures);
	}

	@Override
	public void setVisible(boolean visible)
	{
		super.setVisible(visible);

		window.setVisible(visible);
	}

	public void paint(GL2 gl)
	{
		if(initPath)
		{
			this.skybox = new Skybox(me.getGLProfile(),skyboxTextures);
			try
			{
				this.earthBox = new EarthBox(me.getGLProfile(),earthTexture);
			}
			catch(Exception e)
			{
				System.out.println("Failed to load earthbox texture! "+e.getMessage());
			}
			try
			{
				this.renderer = new TextureRenderer(me.getGLProfile(), planeTexture);
			}
			catch(Exception e)
			{
				this.renderer = null;
				//e.printStackTrace();
			}
			
			for(IPath item : path)
			{
				item.init(gl);
			}
			initPath = false;
			initFinished = true;
			simulator.initCompleted(me);
		}

		if(initFinished)
		{
			gl.glPushMatrix();
			{
				if(skybox != null)
				{
					//This section by Christian Sj�green s072429
					//Set up camera for drawning the skybox.
					gl.glPushMatrix();
					gl.glLoadIdentity();
					new GLU().gluLookAt(0,0,0,
							0,0,1,
							0,1,0);
					
					gl.glRotatef(-viewRotx, 1.0f, 0.0f, 0.0f);
					gl.glRotatef(viewRoty, 0.0f, 1.0f, 0.0f);
					gl.glRotatef(viewRotz, 0.0f, 0.0f, 1.0f);
					gl.glDisable(GL2.GL_DEPTH_TEST); //Draw behind everything.
					
					gl.glColor4f(1,1,1,1);
					
					skybox.drawSkybox(gl,maxZoom+1);
					
					gl.glEnable(GL2.GL_DEPTH_TEST); //Draw normally.
					gl.glPopMatrix();
				}
				if(earthBox != null)
				{
					//This section by Christian Sj�green s072429
					earthBox.drawBox(gl, 
							new Point(planeMin, yAxis, planeMax), 
					        new Point(planeMin, yAxis, planeMin),
					        new Point(planeMax, yAxis, planeMin), 
					        new Point(planeMax, yAxis, planeMax),
					        new Point(0,1,0),
					        2.0f);
				}
				if(renderer != null) //Main plane
				{
					renderer.drawTexturedPlane(gl, new Point(planeMin, yAxis,
					        planeMax), new Point(planeMin, yAxis, planeMin),
					        new Point(planeMax, yAxis, planeMin), new Point(
					                planeMax, yAxis, planeMax));
				}
				else
				{
					float[] yellowLight = {0, 0, 0, 0.5f};//{1.0f, 1.0f, 0.0f, 0.5f};
					setMaterialColor(yellowLight, gl);
					
					gl.glBegin(GL2.GL_POLYGON);
						gl.glVertex3d(planeMin, yAxis, planeMin);
						gl.glVertex3d(planeMin, yAxis, planeMax);
						gl.glVertex3d(planeMax, yAxis, planeMax);
						gl.glVertex3d(planeMax, yAxis, planeMin);
					gl.glEnd();
				}
			}

			// display path
			{
				for(IPath item : path)
				{
					item.show(gl);
				}
			}

			// displays models
			{
				for(IModel item : models)
				{
					if(item.animationFinished())
					{
						simulator.animationFinished(item.getId(), me);
					}
					item.show(gl, updatePosition);
				}
				if(inSelectionMode)
				{
					pickModels(gl);
				}
				
				// resets models
				if(reset)
				{	
					for(IModel item : models)
					{
						item.reset();
					}
					
					reset = false;
					updatePosition = false;
					
					collisionDetector.resetCollisionFlag();
					
					simulator.reset(me);
				}
			}
			
			gl.glPopMatrix();
		}
	}
	
	/*
	 * Animator interface functions
	 */
	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#move(java.lang.Integer, java.lang.Integer, int)
	 */
	@Override
	public void move(Integer itemId, Integer pathId, int speed)
	{
		if(speed <= 0)
		{
			throw new RuntimeException("Speed has to be faster than 0.");
		}

		IModel model = modelMap.get(itemId);
		if(model != null)
		{
			IPath path = itemMap.get(pathId);
			if(path != null)
			{
				model.setVisible(true);
				MotionHandler handler = new MotionHandler(model, path, speed,
				        collisionDetector);
				model.setHandler(handler);
				model.getBoundingSurface().update(model.getPosition());
			}
			else
			{
				throw new RuntimeException("Wrong path ID!");
			}
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#appear(int, geditor.GObject, boolean)
	 */
	@Override
	public void appear(int modelId, GObject position, boolean visible)
	{
		IModel model = modelMap.get(modelId);
		if(model != null)
		{
			model.setVisible(visible);

			if(position instanceof geditor.Point)
			{
				geditor.Point gPoint = (geditor.Point) position;
				Point scaled = new Point(gPoint.getX(), gPoint.getY(),
				        gPoint.getZ());
				scaler.scalePoint(scaled);
				model.setPosition(new Position(scaled, 0f));
				AppearHandler handler = new AppearHandler(model);
				model.setHandler(handler);
			}
			else
			{
				throw new RuntimeException("Not a point!!");
			}
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}
	
	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#appear(int, int, geditor.GObject, boolean)
	 */
	@Override
	public void appear(int modelId, int pathId, GObject position, boolean visible)
	{
		IModel model = modelMap.get(modelId);
		if(model != null)
		{
			model.setVisible(visible);
			IPath path = itemMap.get(pathId);
			if(path != null)
			{
				if(position instanceof geditor.Point)
				{
					geditor.Point gPoint = (geditor.Point) position;
					Point scaled = new Point(gPoint.getX(), gPoint.getY(),
					        gPoint.getZ());
					scaler.scalePoint(scaled);
					model.setPosition(new Position(scaled, getAdjustmentAngle(path)));
					AppearHandler handler = new AppearHandler(model);
					model.setHandler(handler);
				}
				else
				{
					throw new RuntimeException("Wrong path ID!");
				}
			}
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}
	
	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#appear(int, int, boolean)
	 */
	@Override
	public void appear(int modelId, int pathId, boolean visible)
	{
		IModel model = modelMap.get(modelId);
		if(model != null)
		{
			model.setVisible(visible);
			
			IPath path = itemMap.get(pathId);
			if(path != null)
			{
				float angle = getAdjustmentAngle(path);
				model.setPosition(new Position(path.getPathPoints().get(0), angle));
				AppearHandler handler = new AppearHandler(model);
				model.setHandler(handler);
				model.getBoundingSurface().update(new Position(path.getPathPoints().get(0), angle));
			}
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}
	@Override
	public void appear(int modelId, int pathId, int speed)
	{
		if(speed <= 0)
		{
			throw new RuntimeException("Speed has to be faster than 0.");
		}

		IModel model = modelMap.get(modelId);
		if(model != null)
		{
			IPath path = itemMap.get(pathId);
			if(path != null)
			{
				model.setVisible(true);
				MotionHandlerWrapper handler = new MotionHandlerWrapper(model, 
						path, speed, collisionDetector);
				model.setHandler(handler);
				model.getBoundingSurface().update(model.getPosition());
			}
			else
			{
				throw new RuntimeException("Wrong path ID!");
			}
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}
	private static float getAdjustmentAngle(IPath path)
	{
		if(path.getPathPoints().size() < 2)
		{
			return 0f;
		}
		
		OrientationManager manager = new OrientationManager();
		return -(float)manager.calculateItemDrawingAngle(path.getPathPoints().get(0),
				path.getPathPoints().get(1));
	}
	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#trigger(int)
	 */
	@Override
	public void trigger(int modelId)
	{
		IModel model = modelMap.get(modelId);
		if(model != null)
		{
			TriggerHandler handler = new TriggerHandler(model, model.getHandler());
			model.setHandler(handler);
		}
		else
		{
			throw new RuntimeException("Wrong model ID!");
		}
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#createModel(Appearence.Shape, boolean)
	 */
	@Override
	public int createModel(Shape shape, boolean visibility)
	{
		Model model = new Model(me, collisionDetector, collisionSignalModel, 
				shape, visibility);
		models.add(model);
		
		collisionDetector.register(model);

		return model.getId();
	}

	/**
	 * @author jjepsen (s011936)
	 * 
	 * All graphics paths are now saved relative to run-time workbench.
	 * "platform:/resource/example_project"
	 * However they must be converted to native Java path 
	 * before they are passed to OpenGL.
	 */
	
	static public String toNativeJavaPath(String relative) {

		// check if path is outside workbench
		String prefix = "platform:/resource"; 
		if (!(relative.startsWith(prefix))) 
			return relative;
		
		// if path relative, then make it native
		URL anURL = null;
		try {
			anURL = new URL(relative);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		

		URL nativePath = null;
		try {
			nativePath = FileLocator.resolve(anURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return nativePath.getPath();
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#createStaticItem(geditor.GObject, Appearence.Shape, java.lang.String)
	 */
	@Override
	public int createStaticItem(GObject gObject, Shape shape, String globalPath)
	{
		String appPath = globalPath;
		if(gObject.getAppearancePath() != null && !gObject.getAppearancePath().equals(""))
		{
			appPath = gObject.getAppearancePath();
		}
		
		appPath = toNativeJavaPath(appPath);
		if(gObject instanceof Line)
		{
			Line line = (Line) gObject;
			Point start = new Point(line.getStart().getX(), line.getStart()
			        .getY(), line.getStart().getZ());
			Point end = new Point(line.getEnd().getX(), line.getEnd().getY(),
			        line.getEnd().getZ());
			StaticLinearItem item = new StaticLinearItem(start, end, 
					appPath, me);
			path.add(item);

			points.add(item.getStart());
			points.add(item.getEnd());

			return item.getId();

		}
		else if(gObject instanceof Arc)
		{
			//This section by Christian Sj�green s072429
			Arc curve = (Arc) gObject;
			ArrayList<Point> inputPoints = new ArrayList<Point>();
			for(geditor.Point p : curve.getControlPoints())
			{
				inputPoints.add(new Point(p.getX(),p.getY(),p.getZ()));
			}
			StaticEllipsoidalItem item = new StaticEllipsoidalItem(inputPoints,
					appPath, me);
			path.add(item);

			points.addAll(item.getInputPoints());

			return item.getId();
		}

		throw new RuntimeException("GObject is neither line nor arc!");
	}

	private void pickModels(GL2 gl)
	{
		startPicking(gl);

		for(IModel item : modelMap.values())
		{
			gl.glPushName(item.getId());
			item.show(gl);
			gl.glPopName();
		}

		Integer selectedId = endPicking(gl);
		if(selectedId != null)
		{
			IModel item = modelMap.get(selectedId);
			if(item != null)
			{
				item.setSelected(!item.isSelected());
			}
		}
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#initRequested()
	 */
	@Override
	public void initRequested()
	{
		// scaling points
		scaler = new Scaler(points, planeMax, planeMin, scalingParam);
		for(Point point : points)
		{
			scaler.scalePoint(point);
		}

		// adding to a map
		{
			for(IModel item : models)
			{
				modelMap.put(item.getId(), item);
			}

			for(IPath item : path)
			{
				itemMap.put(item.getId(), item);
			}
		}

		// finishing to initialize items
		initPath = true;

		// start the animation thread
		animator.start();
	}

	/* (non-Javadoc)
	 * @see dk.dtu.imm.se2.group6.visual.IAnimator#getSimulator()
	 */
	@Override
	public ISimulator getSimulator()
	{
		return simulator;
	}

	public boolean isUpdatePosition()
	{
		return updatePosition;
	}

	@Override
	public void setUpdatePosition(boolean updatePosition)
	{
		this.updatePosition = updatePosition;
	}

	public boolean isReset()
    {
    	return reset;
    }

	@Override
	public void setReset(boolean reset)
    {
    	this.reset = reset;
    }

	@Override
	public boolean isInitStart()
    {
    	return initStart;
    }

	@Override
	public void setInitStart(boolean initStart)
    {
    	this.initStart = initStart;
    }

	public boolean isIndicateCollision()
    {
    	return indicateCollision;
    }

	public void setIndicateCollision(boolean indicateCollision)
    {
    	this.indicateCollision = indicateCollision;
    }

	public JFrame getWindow()
    {
    	return window;
    }

	@Override
	public void setWindow(JFrame window)
    {
    	this.window = window;
    }

	@Override
	public void setSimulator(ISimulator simulator)
    {
    	this.simulator = simulator;
    }
}