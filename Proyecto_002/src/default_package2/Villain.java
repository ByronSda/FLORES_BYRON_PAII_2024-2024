package default_package2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import interfaz_package2.dieable;
import interfaz_package2.drawable;
import interfaz_package2.movable;
import interfaz_package2.shootable;

public class Villain implements drawable, movable, dieable, shootable {

	static int x;
	static int y;
	private float velocidadY = 1;
	private ArrayList<Bullets> bullets;
	static int score;
	private Random random;
	private boolean gameOver;
	private GFrame mainFrame;
	private Hero hero;
	private boolean gameEnded = false;

	public ArrayList<Bullets> getBullets() {
		return bullets;
	}

	public void setBullets(ArrayList<Bullets> bullets) {
		this.bullets = bullets;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Villain(GFrame mainWindow, Hero hero) {
		this.mainFrame = mainWindow;
		this.hero = hero;
		initialize();
	}

	public Villain() {
		initialize();
	}

	public void generateRandomPosition() {
		x = 15 + random.nextInt(700);
		y = (int) (0 + velocidadY);
	}

	@Override
	public void draw(Graphics g) {
		if (gameOver) {
			return;
		}
		g.setColor(Color.GREEN);
		int[] vx2 = { x, x + 40, x + 40, x + 20, x };
		int[] vy2 = { y, y, y + 50, y + 30, y + 50 };
		g.fillPolygon(vx2, vy2, 5);

		for (Bullets bullet : bullets) {
			bullet.draw(g);
		}
	}

	@Override
	public void move() {

		if (gameOver) {

			return;
		}

		y += velocidadY;

		if (y >= 405 || y <= 0) {
			gameOver = true;
			showGameOverMessage();
		}

		for (Bullets bullet : bullets) {
			bullet.move();
		}

	}

	private void initialize() {
		bullets = new ArrayList<>();
		random = new Random();
		gameOver = false;

		generateRandomPosition();

	}

	@Override
	public void shoot() {
		if (Math.random() < 0.01) {
			bullets.add(new Bullets(x, y, false));
		}
	}

	public void checkBulletCollision() {
		Iterator<Bullets> bulletIterator = bullets.iterator();
		while (bulletIterator.hasNext()) {
			Bullets bullet = bulletIterator.next();
			int bulletX = bullet.getX();
			int bulletY = bullet.getY();

			double distance = Math.sqrt(Math.pow(bulletX - hero.getX(), 2) + Math.pow(bulletY - hero.getY(), 2));
			if (distance <= 30) {
				hero.reduceLife();
				bulletIterator.remove();
				if (hero.getLife() == 0) {
					showGameOverMessage();

				}
			}
		}

	}

	@Override
	public void die() {
		checkBulletCollision();
	}

	public void showGameOverMessage() {
		JOptionPane.showMessageDialog(mainFrame, "Game Over \nLife: " + hero.getLife() + "\nScore: " + getScore());
		gameEnded = true;
		mainFrame.dispose();
	}

	public void plusScore() {
		score += 100;

		if (score < 0) {
			score = 0;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}