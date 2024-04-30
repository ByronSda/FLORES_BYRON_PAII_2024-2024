package default_package;

import interface_package.InterfaceMetodos;

public class Circulo implements InterfaceMetodos {

	@Override
	public void Dibujar() {
		System.out.println("Circulo: ");
		System.out.println(" ");
		System.out.println("      *   ");
		System.out.println("  *       * ");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("  *       * ");
		System.out.println("      *      ");

	}

}
