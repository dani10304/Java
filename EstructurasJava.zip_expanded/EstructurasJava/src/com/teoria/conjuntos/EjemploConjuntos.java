package com.teoria.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EjemploConjuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conjuntos. Interfaz Set : No soporta repeticiones
		
		
		//HashSet - tabla de dispersión - rendimiento bueno en operaciones básicas. lento en list - no garantiza orden
		HashSet<String>conjunto=new HashSet<>();
		conjunto.add("madrid");
		conjunto.add("sevilla");
		conjunto.add("madrid");
		
		conjunto.forEach(item->System.out.println(item));
		conjunto.remove("sevilla");
		conjunto.forEach(item->System.out.println(item));
		//LinkedHashset - tabla Clientes - indice por un campo : más eficiente al listar.Muestra ordenado
		System.out.println("linked");
		LinkedHashSet<String>conjunto_enlazado=new LinkedHashSet<>();
		conjunto_enlazado.add("madrid");
		conjunto_enlazado.add("sevilla");
		conjunto_enlazado.add("madrid");
		
		conjunto_enlazado.forEach(item->System.out.println(item));
		conjunto_enlazado.remove("sevilla");
		conjunto_enlazado.forEach(item->System.out.println(item));
		
		//TreeSet - XML : nodos padres e hijos
		System.out.println("tree");
		TreeSet<String>arbol=new TreeSet<>();
		arbol.add("madrid");
		arbol.add("sevilla");
		arbol.add("madrid");
		
		arbol.forEach(item->System.out.println(item));
		arbol.remove("sevilla");
		arbol.forEach(item->System.out.println(item));
		
	}//cierra main

}//cierra class




