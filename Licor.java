/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.licoresdelviejomundo;

public abstract class Licor {
    private String nombre;
    private double precio;

    public Licor(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método común, puede ser sobreescrito si lo necesitas
    public String servir() {
        return "Sirviendo " + nombre;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
