package com.teoria.segundo;

//herencia
public class Hija extends Padre {
	
	//sobreescritura / override
	public void saludar() {
		super.saludar();
		System.out.println("hola desde la hija");
	}

	
}//cierra Hija
