package adapter.impl;

public class AutoHibrido {
	private boolean conectado = false;

	public AutoHibrido() {
		System.out.println("Auto híbrido creado ");
		this.conectado = false;
	}

	public void conectar() {
		System.out.println("Conectando batería eléctrica");
		this.conectado = true;

	}

	public void activar() {
		if (conectado) {
			System.out.println("Activando el auto hibrido");
		} else {
			System.out.println("No esta activada la bateria eléctrica");
		}

	}

	public void moverRapido() {
		if (conectado) {
			System.out.println("No puede acelerar hasatca conectar el motor mecánico: conectando.... ");
			System.out.println(".... acelerando ");
		} else {
			System.out.println("El carro acelera porque esta solo con motor mecánico ");
		}

	}

	public void detener() {
		if (this.conectado) {
			System.out.println("Deteniendo el motor eléctrico");
		} else {
			System.out.println("Debemos cambiar a motor eléctrico.... ");
			System.out.println("Deteniendo ");
		}

	}

	public void desconectar() {
		this.conectado = false;
		System.out.println("Desconectando motor mecánico y eléctrico ");

	}
}
