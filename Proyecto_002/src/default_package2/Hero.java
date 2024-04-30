package default_package2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

import interfaz_package2.dieable;
import interfaz_package2.drawable;
import interfaz_package2.movable;
import interfaz_package2.shootable;

public class Hero implements drawable, movable, dieable, shootable, KeyListener {

	private int x;
	private int y;
	static int life = 100;
	private Villain villain;
	private boolean movingLeft = false;
	private boolean movingRight = false;
	private GFrame gframe;
	private float velocidad = 6f;
	private ArrayList<Bullets> bullets;

	public ArrayList<Bullets> getBullets() {
		return bullets;
	}

	public void setBullets(ArrayList<Bullets> bullets) {
		this.bullets = bullets;
	}

	public void setWindow(GFrame window) {
		this.gframe = window;

	}

	public void setVillain(Villain villain) {
		this.villain = villain;
	}

	public Hero(GFrame window, Villain villain) {

		x = 400;
		y = 599;
		bullets = new ArrayList<>();
		setWindow(window);
		this.villain = villain;
	}

	public static int getLife() {
		return life;
	}

	public static void setLife(int life) {
		Hero.life = life;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);

		int[] vx1 = { x, x + 40, x - 40 };
		int[] vy1 = { 530, 580, 580 };
		g.fillPolygon(vx1, vy1, 3);
		for (Bullets bullet : bullets) {
			bullet.draw(g);
		}
	}

	@Override
	public void shoot() {

		if (spacePressed) {
			int bulletY = 540;
			bullets.add(new Bullets(x, bulletY, true));
			spacePressed = false;
		}
	}

	private boolean spacePressed = false;

	@Override
	public void move() {
		if (movingLeft) {
			moveLeft();
		} else if (movingRight) {
			moveRight();
		}

		Iterator<Bullets> iterator = bullets.iterator();
		while (iterator.hasNext()) {
			Bullets bullet = iterator.next();
			bullet.move();
		}

	}

	public void moveLeft() {
		x -= velocidad;
	}

	public void moveRight() {
		x += velocidad;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
			movingLeft = true;
		} else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
			movingRight = true;
		} else if (keyCode == KeyEvent.VK_SPACE) {

			spacePressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
			movingLeft = false;
		} else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
			movingRight = false;
		}
	}

	public void reduceLife() {
		life -= 10;

		if (life < 0) {
			life = 0;
		}
	}

	@Override
	public void die() {
		checkBulletCollision();
	}

	public void checkBulletCollision() {
		Iterator<Bullets> bulletIterator = bullets.iterator();
		while (bulletIterator.hasNext()) {
			Bullets bullet = bulletIterator.next();
			int bulletX = bullet.getX();
			int bulletY = bullet.getY();

			double distance = Math.sqrt(Math.pow(bulletX - villain.getX(), 2) + Math.pow(bulletY - villain.getY(), 2));
			if (distance <= 30) {
				bulletIterator.remove();
				villain.setScore(villain.getScore() + 100);
				villain.generateRandomPosition();
			}
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}