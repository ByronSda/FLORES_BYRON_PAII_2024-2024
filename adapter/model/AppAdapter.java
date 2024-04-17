package adapter.model;

import java.util.Scanner;

import adapter.impl.AutoDiesel;
import adapter.impl.AutoGasolina;
import adapter.inter.Auto;
import adapter.inter.AutoHibridoAdapter;

public class AppAdapter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc;
		Auto autoH = new AutoHibridoAdapter();

		do {

			System.out.println("   ");
			System.out.println("--Que auto va a elegir?--");
			System.out.println("1. Auto Diesel");
			System.out.println("2. Auto Gasolina");
			System.out.println("3. Auto Hibrido");
			System.out.println("4. Salir");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				Auto autoD;
				autoD = new AutoDiesel();

				System.out.println("   ");
				System.out.println("Seleccione una opcion: ");
				System.out.println("1.Encender");
				System.out.println("2.Acelerar");
				System.out.println("3.Apagar");
				int accionD = sc.nextInt();

				switch (accionD) {
				case 1:
					autoD.encender();
					break;
				case 2:
					autoD.acelerar();
					;
					break;
				case 3:
					autoD.apagar();
					;
					break;
				}
				break;

			case 2:

				Auto autoG;
				autoG = new AutoGasolina();

				System.out.println("   ");
				System.out.println("Seleccione una opcion: ");
				System.out.println("1.Encender");
				System.out.println("2.Acelerar");
				System.out.println("3.Apagar");
				int accionG = sc.nextInt();

				switch (accionG) {

				case 1:
					autoG.encender();
					break;
				case 2:
					autoG.acelerar();
					;
					break;
				case 3:
					autoG.apagar();
					;
					break;
				}

				break;

			case 3:

				System.out.println("   ");
				System.out.println("Seleccione una opcion: ");
				System.out.println("1.Encender");
				System.out.println("2.Acelerar");
				System.out.println("3.Apagar");
				int accionH = sc.nextInt();

				switch (accionH) {

				case 1:
					autoH.encender();
					break;
				case 2:
					autoH.acelerar();
					;
					break;
				case 3:
					autoH.apagar();
					;
					break;

				}
				break;

			case 4:

				System.out.println("   ");
				System.out.println("Hasta pronto!");
				break;

			default:
			}
		} while (opc != 4);

		sc.close();
	}

}
