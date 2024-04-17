package adapter.impl;

import adapter.inter.Auto;

public class AutoDiesel extends Auto{

	@Override
	public void encender() {
		System.out.println("Encender AutoDiesel ");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar AutoDiesel ");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagar AutoDiesel ");
		
	}

}
