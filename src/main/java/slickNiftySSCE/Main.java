package slickNiftySSCE;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;

import de.lessvoid.nifty.render.batch.spi.BatchRenderBackend;
import de.lessvoid.nifty.slick2d.render.batch.SlickBatchRenderBackendFactory;

public class Main extends BasicGame {
	

	public static void main (String[] args) {
		AppGameContainer agc;
		try {
			agc = new AppGameContainer(new Main());
			agc.setDisplayMode(600, 480, false);
			agc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Main() {
		super("");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
		g.setDrawMode(Graphics.MODE_NORMAL);
		g.setColor(Color.green);
		g.fillRect(gc.getWidth()/4, gc.getHeight()/4, gc.getWidth()/2, gc.getHeight()/2);
		
		g.clearAlphaMap();
		g.setDrawMode(Graphics.MODE_ALPHA_MAP);
		g.setColor(new Color (0, 0, 0, 100));
		g.fill(new Circle(gc.getWidth()/4, gc.getHeight()/4, 64));
		
		g.setDrawMode(Graphics.MODE_ALPHA_BLEND);
		g.fillRect(0, 0, gc.getWidth(), gc.getHeight());
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		BatchRenderBackend renderer = SlickBatchRenderBackendFactory.create(gc);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {}
	
}
