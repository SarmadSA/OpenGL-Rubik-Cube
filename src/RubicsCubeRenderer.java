import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import static com.jogamp.opengl.GL.GL_DEPTH_TEST;

public class RubicsCubeRenderer extends GLCanvas implements GLEventListener {

    //Properties
    private static final String TITILE = "Rubik's Cube";
    private static final int CANVAS_WIDTH  = 640;
    private static final int CANVAS_HEIGHT = 480;
    private static final int FPS = 60;

    private GLU glu;


    //Constructor
    public RubicsCubeRenderer(){

    }

    @Override
    public void init(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();
        this.glu = new GLU();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); //Set background color to black
        gl.glClearDepth(1.0f);
        gl.glEnable(GL_DEPTH_TEST);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {}

    @Override
    public void display(GLAutoDrawable drawable) {

    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }
}
