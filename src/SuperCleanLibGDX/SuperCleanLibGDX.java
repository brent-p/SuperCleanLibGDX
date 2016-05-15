package SuperCleanLibGDX;

import SuperCleanLibGDX.DemoRenderer;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class SuperCleanLibGDX extends Game implements Screen
{	
	private DemoRenderer demoRenderer;

	public static void main (String[] arg) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();        
        cfg.title = "SuperCleanLibGDX";
        cfg.width = 1024;
        cfg.height = 768;
        cfg.fullscreen = false;
        cfg.vSyncEnabled = true;
        new LwjglApplication(new SuperCleanLibGDX(), cfg);
	}

	public SuperCleanLibGDX()
	{
	}

	@Override
	public void create() 
	{
		setScreen(this);
	}
	
	@Override
	public void show() 
	{
		demoRenderer = new DemoRenderer();
	}

	@Override
	public void hide() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void resize(int width, int height) 
	{
		DemoRenderer.CAMERA_WIDTH = width;
		DemoRenderer.CAMERA_HEIGHT = height;
		if (demoRenderer != null)demoRenderer.setSize(width, height);		
	}

	@Override
	public void render(float delta) 
	{				
		demoRenderer.render();	
	}

	@Override
	public void pause() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void resume() 
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() 
	{
		// TODO Auto-generated method stub
	}
}