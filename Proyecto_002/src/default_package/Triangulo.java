package default_package;

import interface_package.InterfaceMetodos;

public class Triangulo implements InterfaceMetodos {

	@Override
	public void Dibujar() {
		System.out.println("Triangulo: ");
		System.out.println(" ");
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  ***** ");
		System.out.println(" ******* ");
		System.out.println("*********");
		System.out.println(" ");


	}

}
