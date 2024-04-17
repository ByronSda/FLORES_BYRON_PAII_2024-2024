package adapter.impl;

import adapter.inter.Auto;

public class AutoGasolina extends Auto {

	@Override
	public void encender() {
		System.out.println("Encender AutoGasolina ");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerar AutoGasolina ");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagar AutoGasolina ");
		
	}

}
