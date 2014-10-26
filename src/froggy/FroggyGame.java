package froggy;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class FroggyGame extends BasicGame {
	
	Image background;
	Image ground;
	private Frog frog;
	private Tree[] trees;
	
	public static final int GAME_WIDTH = 1440;
	public static final int GAME_HEIGHT = 960;
	public static final int GROUND_LEVEL = 860;
	public static final float FROG_JUMPDOWN_VY = 40;
	public static final float G = (float) -0.5;
	public static final float TREE_VX = -8;
	
	private boolean isStarted = false;
	//private Tree tree;
	
	public FroggyGame(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		background.draw(0, 0, GAME_WIDTH, GAME_HEIGHT);
		//tree.render();
		frog.render();
		for (Tree tree : trees) {
			tree.render();
		}
		ground.draw(0, GROUND_LEVEL);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background = new Image("picture/background.jpg");
		ground = new Image("picture/ground.png");
		frog = new Frog(300, GROUND_LEVEL, FROG_JUMPDOWN_VY);
		
		initTrees();
	}

	private void initTrees() throws SlickException {
		trees = new Tree[3];
		for (int i = 0; i < 3; i++) {
			trees[i] = new Tree(GAME_WIDTH/2, GAME_HEIGHT/2, TREE_VX);
		}
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		if (isStarted == true) {
			frog.update();
			for (int i = 0 ; i < 3 ; i++) {
				trees[i].update();
			}
		}
	}
	
	@Override
	public void keyPressed(int key, char c) {
		if (key == Input.KEY_SPACE) {
	    	isStarted = true;
	    	frog.jump();
	    }
	}


	public static void main(String[] args) {
		try {
			FroggyGame game = new FroggyGame("Froggy Game");
			AppGameContainer appgc = new AppGameContainer(game);
			appgc.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
			appgc.setMinimumLogicUpdateInterval(1000 / 60);
			appgc.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
}