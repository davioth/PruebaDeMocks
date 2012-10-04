package com.davioth.PruebasDeMocks.PowerMock;

public class ClaseIniciada {

	private String propiedad;
	
	public String getPropiedad() {
		System.out.println("Se llama al getter con valor ===> " + propiedad);
		return propiedad;
	}

	public void setPropiedad(String propiedad) {
		this.propiedad = propiedad;
	}

	public ClaseIniciada() {
		System.out.println("Se llama al constructor ===> " + propiedad);
	}

}
