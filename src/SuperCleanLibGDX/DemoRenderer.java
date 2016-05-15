package SuperCleanLibGDX;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.Gdx;

public class DemoRenderer
{
	public static float CAMERA_WIDTH = 0f;
    public static float CAMERA_HEIGHT = 0f;

    public OrthographicCamera camera;		
	private BitmapFont font;    
	private SpriteBatch fontBatch;
	
	public void setSize (int w, int h) 
	{
		camera.setToOrtho(false,w,h);				
	}
	
	public DemoRenderer() 
	{						
        fontBatch = new SpriteBatch();		
		camera = new OrthographicCamera();	
		font = new BitmapFont();
        font.setColor(Color.BLACK);					
	}

	public void render() 
	{		
		setupRenderBuffer();				
		drawloading();		
	}

	private void setupRenderBuffer()
	{
		Color bgcolor = new Color(Color.WHITE);					
		Gdx.gl.glClearColor(bgcolor.r, bgcolor.g,bgcolor.b, 1);
		Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);        
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);			
	}	

	public void drawloading()
	{
		fontBatch.begin();
		font.draw(fontBatch, "Super Clean LibGDX Project Template by Brent Parish", (CAMERA_WIDTH/2) - 150, CAMERA_HEIGHT/2 + 30);             
        fontBatch.end();
	}		
}
