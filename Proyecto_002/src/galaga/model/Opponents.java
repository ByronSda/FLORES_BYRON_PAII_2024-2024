package galaga.model;

import java.awt.Color;
import java.awt.Graphics;

public class Opponents implements Drawable, Movable {

	int[] cord_x = { 400, 450, 350, 400, 450 };
	int[] cord_y = { 500, 550, 550, 550, 450 };

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.GREEN);
		graphics.fillPolygon(cord_x, cord_y, 5);
	}

	@Override
	public void moveUp(int variable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDown(int variable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveLeft(int variable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveRight(int variable) {
		// TODO Auto-generated method stub

	}

}
