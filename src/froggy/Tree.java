package froggy;

import java.util.Random;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tree {
	
	private Image tree;
	private float x;
	private float y;
	private float vx;
	
	public Tree(float x, float y, float vx) throws SlickException {
		this.x = x;
		this.y = y;
		this.vx = vx;
		tree = new Image("picture/tree.png");
	}
		 
	public void render() {
		randomTreeHigh();
		tree.draw(x, y, 150, 400);
	}
	
	public void randomTreeHigh() {
		Random random = new Random();
		this.y = random.nextInt(240);
	}
	
	public void update() {
		if (x == 0) {
			x = FroggyGame.GAME_WIDTH;
		}
		x += vx;
	}

}
