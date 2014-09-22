package froggy;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FroggyGame extends BasicGame {
	
	Image background;
	
	public FroggyGame(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		background.draw(0, 0, 1440, 960);	
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background = new Image("picture/background.jpg");	
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		// TODO Auto-generated method stub	
	}


	public static void main(String[] args) {
		try {
			FroggyGame game = new FroggyGame("Froggy Game");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(1440, 960, false);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
}