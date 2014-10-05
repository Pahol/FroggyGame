package froggy;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Frog {
	
	public static final int FROG_WIDTH = 75;
	public static final int FROG_HEIGHT = 75;
	public static final int FROG_JUMP_UP_VY = 17;
	
	private float x;
	private float y;
	private Image image;
	private float vy;
	private float vjump;
	 
	public Frog(float x, float y, float vjump) throws SlickException {
		this.x = x;
		this.y = y;
		image = new Image("picture/frog.png");
		this.vy = FROG_JUMP_UP_VY;
		this.vjump = vjump;
	}
	 
	public void render() {
		image.draw(x, y - FROG_HEIGHT, FROG_WIDTH, FROG_HEIGHT);
	}

	public void update() {
		y -= vy;
		vy += FroggyGame.G/2;
		if (isCollide(y) == true) {
			vy = FROG_JUMP_UP_VY;
		}
	}

	private boolean isCollide(float y) {
		if(y >= FroggyGame.GROUND_LEVEL) {
			return true;
		}
		else {
			return false;
		}
	}

	public void jump() {
		vy = -vjump;		
	}
}
