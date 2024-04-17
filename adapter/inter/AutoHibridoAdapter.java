package adapter.inter;

import adapter.impl.AutoHibrido;

public class AutoHibridoAdapter extends Auto {

	private AutoHibrido autoHibrido;

	public AutoHibridoAdapter() {
		System.out.println("Creando Auto Hibrido adaptador ");
		this.autoHibrido = new AutoHibrido();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motores por medio del adapter");
		this.autoHibrido.conectar();
		this.autoHibrido.activar();

	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando por medio del adapter");
		this.autoHibrido.moverRapido();

	}

	@Override
	public void apagar() {
		System.out.println("Apagando por medio del adapter");
		this.autoHibrido.detener();
		this.autoHibrido.desconectar();

	}

}
