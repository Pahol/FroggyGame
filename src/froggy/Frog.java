package froggy;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Frog {
	
	public static final int FROG_WIDTH = 75;
	public static final int FROG_HEIGHT = 75;
	
	private float x;
	private float y;
	private Image image;
	private float vy;
	 
	public Frog(float x, float y, float vy) throws SlickException {
		this.x = x;
		this.y = y;
		image = new Image("picture/frog.png");
		this.vy = vy;
	}
	 
	public void render() {
		image.draw(x, y - FROG_HEIGHT, FROG_WIDTH, FROG_HEIGHT);
	}

	public void update() {
		y -= vy;
		vy += FroggyGame.G;
		if (y == FroggyGame.GROUND_LEVEL - FROG_HEIGHT) {
			vy = FroggyGame.DOT_INITIAL_VY;
		}
	}
}
