package nl.han.ica.breakout;

import java.util.List;

import nl.han.ica.oopg.collision.ICollidableWithGameObjects;
import nl.han.ica.oopg.objects.GameObject;
import processing.core.PGraphics;

public abstract class Block extends GameObject implements ICollidableWithGameObjects {
	protected int color;
	protected final int textColor = 0; //black
	protected int health;

	

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(PGraphics g) {

		g.fill(color);
		g.rect(getX(), getY(), width, height);
		g.fill(textColor);
		g.text(health, getX() + width / 2, getY() + height / 1.5f);
	}

	@Override
	public abstract void gameObjectCollisionOccurred(List<GameObject> collidedGameObjects);
		

}
