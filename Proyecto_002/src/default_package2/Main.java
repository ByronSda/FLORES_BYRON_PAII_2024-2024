package default_package2;

import javax.swing.SwingUtilities;

/**
 * @author: Byron Flores 
 * Tema: Prototipo juego Galaga
 */

public class Main {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GFrame();
			}
		});
	}

}
