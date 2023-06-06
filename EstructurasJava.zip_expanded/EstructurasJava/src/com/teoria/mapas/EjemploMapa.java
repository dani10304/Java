package com.teoria.mapas;

import java.util.HashMap;

public class EjemploMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tengo una camisa para cada día de la semana : Map
		//tengo 5 camisas : lista - List
		//tengo 5 camisas que NO puedo repetir : conjunto - Set
		//index es una posición. key es la clave dentro de un map
		
		//HashMap
		HashMap<String, Cliente>mapa=new HashMap<>();
		mapa.put("100M", new Cliente("juan", "madrid"));
		mapa.put("200M", new Cliente("marta", "sevilla"));
		mapa.put("300M", new Cliente("luis", "toledo"));
		mapa.put("200M", new Cliente("laura", "córdoba"));//update
		
		mapa.forEach((k,v)->System.out.println(v.getNombre()));
		
		
		
		//TreeMap
		//para nodos
		
		//HashTable - soporta sincronización : thread - safe
		
		
	}//cierra main

}//cierra class
