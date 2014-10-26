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
		tree.draw(x, y, 100000/y, 190000/y);
	}
	
	public void randomTreeHigh() {
		Random random = new Random();
		this.y = 480 + random.nextInt(150);
	}
	
	public void update() {
		if (x <= 0) {
			x = FroggyGame.GAME_WIDTH;
			randomTreeHigh();
		}
		x += vx;
	}

}
