package default_package2;

import java.awt.Graphics;

import interfaz_package2.dieable;
import interfaz_package2.drawable;
import interfaz_package2.movable;
import interfaz_package2.shootable;

public class Container {

	public void draw(drawable dr, Graphics g) {
		dr.draw(g);
	}

	public void move(movable mo) {
		mo.move();
	}

	public void die(dieable di) {
		di.die();
	}

	public void shoot(shootable sh) {
		sh.shoot();
	}

}
