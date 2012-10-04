package com.davioth.PruebasDeMocks.PowerMock;

public class ClaseMockeada {

	
	public void metodo() {
		
		for (int i = 0; i < 5; i++) {
			ClaseIniciada objeto = new ClaseIniciada();
			
			objeto.setPropiedad("Propiedad " + i);
			
			System.out.println(objeto.getPropiedad());
			
		}
		
	}
}
