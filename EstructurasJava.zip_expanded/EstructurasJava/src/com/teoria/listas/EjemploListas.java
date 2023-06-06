package com.teoria.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class EjemploListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//interfaz List tienes varias clases
		//auto-size
		//ArrayList - soporta duplicados - ordenados por un index (ai)
		ArrayList<String>lista=new ArrayList<String>();
		lista.add("madrid");
		lista.add("sevilla");
		lista.add("madrid"); //soportan duplicados
		//recorrer AL con programación funcional
		lista.forEach(item->{System.out.println(item);});
		lista.remove(2);
		lista.forEach(item->{System.out.println(item);});
		
		//Vector - sincronizado. Concurrencia
		Vector<String>vector=new Vector<String>();
		vector.add("juan");
		vector.add("marta");
		vector.add("juan"); //soportan duplicados
		//recorrer AL con programación funcional
		vector.forEach(item->{System.out.println(item);});
		vector.remove(2);
		vector.forEach(item->{System.out.println(item);});
		
		//LinkedList - uso más eficiente de memoria al recorrer.
		LinkedList<String>lista_enlazada=new LinkedList<String>(); // soporta duplicados
		lista_enlazada.add("madrid");
		lista_enlazada.add("sevilla");
		lista_enlazada.add("madrid"); //soportan duplicados
		lista_enlazada.addFirst("córdoba");
		//recorrer AL con programación funcional
		lista_enlazada.forEach(item->{System.out.println(item);});
		lista_enlazada.remove(2);
		lista_enlazada.forEach(item->{System.out.println(item);});
		
	}//cierra main

}//cierra class
