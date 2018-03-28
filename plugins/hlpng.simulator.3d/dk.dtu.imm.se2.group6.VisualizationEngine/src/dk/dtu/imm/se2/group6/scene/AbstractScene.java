package dk.dtu.imm.se2.group6.scene;
import java.awt.*;
import java.awt.event.*;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;

import javax.swing.event.MouseInputListener;

import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.util.FPSAnimator;

/*
 * Author: Mindaugas Laganeckas (s100972)
 */

public abstract class AbstractScene extends GLCanvas implements GLEventListener, 
					MouseWheelListener, MouseInputListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	private IntBuffer selectBuffer = Buffers.newDirectIntBuffer(512);

	protected float viewRotx = 40.0f;
	protected float viewRoty = 0.0f;
	protected float viewRotz = 0.0f;
	
	protected float viewCenterX = 0.0f;
	protected float viewCenterY = 0.0f;
	
	private int prevCenterX = 0;
	private int prevCenterY = 0;
	
	private int prevMouseX = 0;
	private int prevMouseY = 0;
	
	private int currMouseX = 0;
	private int currMouseY = 0;
	
	protected float maxZoom = 50f;
	
	protected boolean inSelectionMode = false;
	protected boolean inRecenterMode = false;
	
	private float zoomDistance = 20f;
	
	private int fps = 50;
	
	private int recenterSpeed = 10;
	
	/** The OpenGL animator. */
    protected FPSAnimator animator = null;
	
	public AbstractScene(int width, int height) 
    {
		super(createGLCapabilities());
    	setSize(width, height);
        addGLEventListener(this);
        addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		animator = new FPSAnimator(this, fps);
    }
	
	private static GLCapabilities createGLCapabilities() 
    {
        GLCapabilities capabilities = new GLCapabilities(GLProfile.getDefault());
        capabilities.setRedBits(8);
        capabilities.setBlueBits(8);
        capabilities.setGreenBits(8);
        capabilities.setAlphaBits(8);
        return capabilities;
    }

	public void init(GLAutoDrawable drawable) 
	{
		final GL2 gl = drawable.getGL().getGL2();
        
        // Define "clear" color.
        gl.glClearColor(0.3f, 0.3f, 0.3f, 0f);
        
        // Enable smooth shading.
        gl.glShadeModel(GL2.GL_SMOOTH);

        // Enable z- (depth) buffer for hidden surface removal. 
        gl.glEnable(GL2.GL_DEPTH_TEST);
        gl.glDepthFunc(GL2.GL_LEQUAL);

        // We want a nice perspective.
        gl.glHint(GL2.GL_PERSPECTIVE_CORRECTION_HINT, GL2.GL_NICEST);

        gl.glEnable(GL2.GL_BLEND); 
        gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
        
        // light
        setLight(gl);
	}
	
  	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) 
  	{
  		final GL2 gl = drawable.getGL().getGL2();
		
		float h = (float)height / (float)width;
		        
		gl.glMatrixMode(GL2.GL_PROJECTION);
		
		gl.glLoadIdentity();
		gl.glFrustum(-1.0f, 1.0f, -h, h, 5.0f, 60.0f);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glTranslatef(0.0f, 0.0f, -40.0f);
	}
	
    protected void setLight(GL2 gl)
    {
		// In the line below, we are storing the values for a white ambient
		// light at
		// half intensity (0.5f).
		// Because all the numbers are 0.5f, we will end up with a light that's
		// halfway between off (black)
		// and full brightness (white). Red, blue and green mixed at the same
		// value
		// will create a shade
		// from black(0.0f) to white(1.0f). Without an ambient light,
		// spots where there is no diffuse light will appear very dark.
		FloatBuffer lightAmbient = FloatBuffer.wrap(new float[] { 0.5f, 0.5f,
		        0.5f, 1.0f }); // Ambient Light Values ( NEW )
		// In the next line we're storing the values for a super bright, full
		// intensity diffuse light.
		// All the values are 1.0f. This means the light is as bright as we can
		// get
		// it.
		// A diffuse light this bright lights up the front of the crate nicely.
		FloatBuffer lightDiffuse = FloatBuffer.wrap(new float[] { 1.0f, 1.0f,
		        1.0f, 1.0f }); // Diffuse Light Values ( NEW )

		FloatBuffer LightPosition = FloatBuffer.wrap(new float[] { 0.0f, 0.0f,
		        12.0f, 1.0f }); // Light Position ( NEW )

    	// Setup the lightning
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, lightAmbient);
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, lightDiffuse);
		gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, LightPosition);
		gl.glEnable(GL2.GL_LIGHT1);
		gl.glEnable(GL2.GL_LIGHTING);
    }
    
    public void setMaterialColor(float[] color, GL2 gl)
    {
    	gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, color, 0);
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_DIFFUSE, color, 0);
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, color, 0);
        
        // Set material properties.
        gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, 300f);
    }
    
    public void setMaterialColor(float[] ambient, float[] diffuse, 
    		float[] specullar, float shininess, GL2 gl)
    {
    	gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_AMBIENT, ambient, 0);
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_DIFFUSE, diffuse, 0);
        gl.glMaterialfv(GL2.GL_FRONT, GL2.GL_SPECULAR, specullar, 0);
        
        // Set material properties.
        gl.glMaterialf(GL2.GL_FRONT, GL2.GL_SHININESS, shininess);
    }
	
    public void display(GLAutoDrawable drawable) 
    {
    	final GL2 gl = drawable.getGL().getGL2();
    	
    	gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		
		setCamera(gl, new GLU());
		
		gl.glPushMatrix();
		
		gl.glTranslatef(-viewCenterX, -viewCenterY, 0);
		
		gl.glRotatef(viewRotx, 1.0f, 0.0f, 0.0f);
		gl.glRotatef(viewRoty, 0.0f, 1.0f, 0.0f);
		gl.glRotatef(viewRotz, 0.0f, 0.0f, 1.0f);
		
		
		paint(gl);
		        
		gl.glPopMatrix();
    }
    
    protected void setCamera(GL2 gl, GLU glu) 
    {
    	// Change to projection matrix.
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();

        // Perspective.
        float widthHeightRatio = (float) getWidth() / (float) getHeight();
        glu.gluPerspective(45, widthHeightRatio, 1, 1000);
        glu.gluLookAt(0, 0, zoomDistance, 
        		0, 0, 0,
        		0, 1, 0);
        
        // Change back to model view matrix.
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    
    public void displayChanged(GLAutoDrawable drawable, 
    		boolean modeChanged, boolean deviceChanged){}
  
	// Methods required for the implementation of MouseListener
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	
	public void mouseReleased(MouseEvent e)
	{
		if(e.getButton() == MouseEvent.BUTTON3)
		{
			inRecenterMode = false;
		}
	}
	

	public void mousePressed(MouseEvent e) 
	{
		prevMouseX = e.getX();
		prevMouseY = e.getY();
		
		if(e.getButton() == MouseEvent.BUTTON1)
		{
			currMouseX = e.getX();
			currMouseY = e.getY();
			inSelectionMode = true;
		}
		
		if(e.getButton() == MouseEvent.BUTTON3)
		{
			prevCenterX = e.getX();
			prevCenterY = e.getY();
			inRecenterMode = true;
		}
	}

	// Methods required for the implementation of MouseMotionListener
	public void mouseDragged(MouseEvent e) 
	{
		int x = e.getX();
	    int y = e.getY();
	    
	    Dimension size = e.getComponent().getSize();
	    
		if(inRecenterMode)
		{
			viewCenterX += recenterSpeed*((float)(prevCenterX-x) / (float)size.width);
			viewCenterY += recenterSpeed*((float)(y-prevCenterY) / (float)size.height);
			
			prevCenterX = x;
			prevCenterY = y;
		} else {
		
		    float thetaY = 360.0f * ((float)(x - prevMouseX) / (float)size.width);
		    float thetaX = 360.0f * ((float)(prevMouseY - y) / (float)size.height);
		    
		    prevMouseX = x;
		    prevMouseY = y;
		
		    viewRotx += thetaX;
		    viewRoty += thetaY;
		}
	}
    
	public void mouseMoved(MouseEvent e) {}

	// Methods required for the implementation of MouseWheelListener
	public void mouseWheelMoved(MouseWheelEvent e) 
	{
		if(zoomDistance + e.getUnitsToScroll() / 5.0f > 0.5)
		{
			zoomDistance += e.getUnitsToScroll() / 5.0f;
		}
		if(zoomDistance > maxZoom)
			zoomDistance = maxZoom;
	}
	
	public abstract void paint(GL2 gl);
	
	protected void startPicking(GL2 gl)
	{
		// get the current viewport
		int viewport[] = new int[4];
		gl.glGetIntegerv(GL2.GL_VIEWPORT, viewport, 0);
		int width = viewport[2];
	    int height = viewport[3];
		
		// initialise the selection buffer
		selectBuffer.clear();
		gl.glSelectBuffer(selectBuffer.capacity(), selectBuffer);
		
		// switch to selection mode
		// make an empty name stack
		// save the original projection matrix
		gl.glMatrixMode(GL2.GL_PROJECTION);
	    gl.glPushMatrix();
	    gl.glRenderMode(GL2.GL_SELECT);
	    gl.glLoadIdentity();
		
		// create a 5x5 pixel picking volume near the cursor location
		GLU glu = new GLU();
		glu.gluPickMatrix(currMouseX, height - currMouseY, 5.0, 5.0, viewport, 0);
		
		/* set projection (perspective or orthogonal) exactly as it is in
		normal rendering (i.e. duplicate the gluPerspective() call
		in resizeView()) */
		float widthHeightRatio = (float) width / (float) height;
        glu.gluPerspective(45, widthHeightRatio, 1, 1000);
        glu.gluLookAt(0, 0, zoomDistance, 0, 0, 0, 0, 1, 0);
		gl.glMatrixMode(GL2.GL_MODELVIEW);
		
		gl.glInitNames();
	}
	
	protected Integer endPicking(GL2 gl)
	{
		// return to normal rendering mode, and process hits
		inSelectionMode = false;
				
		// restore original projection matrix
		gl.glMatrixMode(GL2.GL_PROJECTION);
	    gl.glPopMatrix();
	    gl.glMatrixMode(GL2.GL_MODELVIEW);
	    
		int numHits = gl.glRenderMode(GL2.GL_RENDER);
		if(numHits > 0)
		{
			return processHits(numHits);
		}
		
		return null;
	}

	public Integer processHits(int numHits)
	{	
		if(numHits == 0) return null;
		
		// storage for the name ID closest to the viewport
		Integer selectedNameID = null;
		
		// dummy initial values
		float smallestZ = Float.MAX_VALUE;
		int offset = 0;
		/*
		 * iterate through the hit records, saving the smallest z value and the
		 * name ID associated with it
		 */
		for(int i = 0; i < numHits; i++)
		{
			int numNames = selectBuffer.get(offset);
			offset++;
			// minZ and maxZ are taken from the Z buffer
			float minZ = getDepth(offset);
			offset++;
			// store the smallest z value
			if(minZ < smallestZ)
			{
				smallestZ = minZ;
			}
			offset++;

			for(int j = 0; j < numNames; j++)
			{
				int nameID = selectBuffer.get(offset);

				if(j == (numNames - 1))
				{
					// if the last one (the top element on the stack)
					if(smallestZ == minZ)
					{
						// is this the smallest min z?
						selectedNameID = nameID; // then store it's name ID
					}
				}
				offset++;
			}
		}
		return selectedNameID;
	}

	private float getDepth(int offset)
	{
		long depth = (long) selectBuffer.get(offset);
		// return as a float between 0 and 1
		return (1.0f + ((float) depth / 0x7fffffff));
	}

	public FPSAnimator getAnimator()
    {
    	return animator;
    }

	public void setAnimator(FPSAnimator animator)
    {
    	this.animator = animator;
    }
	
	@Override
    public void dispose(GLAutoDrawable drawable)
    {
		this.animator.stop();
    }
}
