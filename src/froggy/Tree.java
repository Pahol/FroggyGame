package froggy;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tree {
	
	private Image tree;
	private float x;
	private float y;
	
	public Tree(float x, float y) throws SlickException {
		this.x = x;
		this.y = y;
		tree = new Image("picture/tree.png");
	}
		 
	public void render() {
		tree.draw(x, y, 100, 400); 
	}

}
