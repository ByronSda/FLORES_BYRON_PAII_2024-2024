package galaga.controller;

import java.awt.Graphics;

import galaga.model.Hero;
import galaga.model.Opponents;

public class Container {

	Hero hero = new Hero();
	Opponents opponent = new Opponents();

	public void draw(Graphics graphics) {
		hero.draw(graphics);
		opponent.draw(graphics);

	}

	public void moveLeft(int variable) {
		hero.moveLeft(variable);
	}

	public void moveRight(int variable) {
		hero.moveRight(variable);

	}
}
