package com.mycompany.licoresdelviejomundo;

public class Ron extends Licor {
    
    public Ron(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override
    public String servir(){
       return "Sirviendo la gaseosa: " + getNombre(); 
    }
    
} 
