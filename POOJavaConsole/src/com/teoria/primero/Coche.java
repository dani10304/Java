package com.teoria.primero;

public class Coche {
    
    //propiedades-campos
    private int puertas;
    private String marca;
    private boolean electrico;
    
    //Constructor no tiene retorno de tipo de datos
    public Coche() {}//permite crear un objeto sin propiedades
    //ejemplo de sobrecarga
    public Coche(int puertas, String marca, boolean electrico) {
        super();
        this.puertas = puertas;
        this.marca = marca;
        this.electrico = electrico;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        if(puertas==3 | puertas==5)
        this.puertas = puertas;
        else
            System.out.println("solo 3 o 5 puertas");
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isElectrico() {
        return electrico;
    }
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
}