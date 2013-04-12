package de.ovgu.simplegame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class WizardGame extends BasicGame {

	private TiledMap grassMap;

	public WizardGame() {
		super("WizardGame");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppGameContainer app;
		try {
			app = new AppGameContainer(new WizardGame());
			app.setDisplayMode(500, 400, false);
			app.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
	
		grassMap=new TiledMap("resc/map/simplemap.tmx");
		grassMap.render(0, 0);
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

}
