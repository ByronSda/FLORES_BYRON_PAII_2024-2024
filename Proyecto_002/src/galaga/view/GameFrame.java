package galaga.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import galaga.controller.Container;

public class GameFrame extends JFrame implements KeyListener {

	/**
	 * @author Byron Flores
	 * @Titulo
	 */

	private static final long serialVersionUID = 11;
	private JPanel contentPane;
	private Container container;

	public GameFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);

		container = new Container();
		contentPane = new JPanel();
		contentPane.setBackground(Color.black);
		setContentPane(contentPane);
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		super.paint(g);
		container.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		setFocusable(true);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A: {
			container.moveLeft(20);
			break;
		}
		case KeyEvent.VK_D: {
			container.moveRight(20);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value:");
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
