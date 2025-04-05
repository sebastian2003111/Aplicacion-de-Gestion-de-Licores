package com.mycompany.licoresdelviejomundo;

/**
 *
 * @author SEBASTIAN BOHORQUEZ
 */
public class Whisky extends Licor {
    
    public Whisky(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override
    public String servir() {
        return "Sirviendo la gaseosa: " + getNombre();
    }
    
}
