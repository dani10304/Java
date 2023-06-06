package com.teoria.prueba;

import com.teoria.primero.Coche;
import com.teoria.segundo.Hija;
import com.teoria.segundo.Padre;

public class Ejecutar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //Instanciar el objeto
        Coche coche1=new Coche(5,"seat", true);
        System.out.println(coche1);//muestra la posicion en memoria
        Coche coche2=new Coche();
        System.out.println(coche2);//muestra la posicion en memoria

        coche2.setPuertas(3);
        System.out.println("el coche tiene :"+coche2.getPuertas());
        
        //Hija hija1=new Hija();
        //hija1.saludar();
        
        //Padre padre1=new Padre();
        //padre1.saludar();

    }//cierra main

}//cierra class Ejecutar