package com.mycompany.licoresdelviejomundo;

public class Cervezas extends Licor {
    
    public Cervezas(String nombre, double precio) {
        super(nombre, precio);
    }
    
    @Override
    public String servir() {
        return "Sirviendo la cerveza: " + getNombre();
    }
}
