package default_package2;

import java.awt.Color;
import java.awt.Graphics;

import interfaz_package2.drawable;
import interfaz_package2.movable;

public class Bullets implements drawable, movable {

	private int x;
	private int y;
	private final int speed = 8;
	private boolean isHeroBullet;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Bullets(int x, int y, boolean isHeroBullet) {
		this.x = x;
		this.y = y;
		this.isHeroBullet = isHeroBullet;
	}

	public boolean isHeroBullet() {
		return isHeroBullet;
	}

	@Override
	public void move() {
		if (isHeroBullet) {
			y -= speed;
		} else {
			y += speed;
		}
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);

		int bulletY = isHeroBullet ? y - 10 : y + 10;
		g.fillOval(x, bulletY, 15, 10);

	}
}
