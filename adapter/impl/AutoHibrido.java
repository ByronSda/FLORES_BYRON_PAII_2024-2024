package adapter.impl;

public class AutoHibrido {
	private boolean conectado = false;

	public AutoHibrido() {
		System.out.println("Auto h�brido creado ");
		this.conectado = false;
	}

	public void conectar() {
		System.out.println("Conectando bater�a el�ctrica");
		this.conectado = true;

	}

	public void activar() {
		if (conectado) {
			System.out.println("Activando el auto hibrido");
		} else {
			System.out.println("No esta activada la bateria el�ctrica");
		}

	}

	public void moverRapido() {
		if (conectado) {
			System.out.println("No puede acelerar hasatca conectar el motor mec�nico: conectando.... ");
			System.out.println(".... acelerando ");
		} else {
			System.out.println("El carro acelera porque esta solo con motor mec�nico ");
		}

	}

	public void detener() {
		if (this.conectado) {
			System.out.println("Deteniendo el motor el�ctrico");
		} else {
			System.out.println("Debemos cambiar a motor el�ctrico.... ");
			System.out.println("Deteniendo ");
		}

	}

	public void desconectar() {
		this.conectado = false;
		System.out.println("Desconectando motor mec�nico y el�ctrico ");

	}
}
