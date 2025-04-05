package com.mycompany.licoresdelviejomundo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Licor> licores;

    public Pedido() {
        licores = new ArrayList<>();
    }

    public void agregarLicor(Licor licor) {
        licores.add(licor);
    }

    public void eliminarLicor(Licor licor) {
        licores.remove(licor);
    }

    public void limpiarPedido() {
        licores.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (Licor licor : licores) {
            total += licor.getPrecio();
        }
        return total;
    }

    public List<Licor> getLicores() {
        return licores;
    }

    public String generarResumen() {
        StringBuilder resumen = new StringBuilder("Resumen del pedido:\n\n");
        for (Licor licor : licores) {
            resumen.append("- ").append(licor.toString()).append("\n");
        }
        resumen.append("\nTotal: $").append(calcularTotal());
        return resumen.toString();
    }

    public boolean estaVacio() {
        return licores.isEmpty();
    }
}