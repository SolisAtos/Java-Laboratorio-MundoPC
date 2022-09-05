package com.gm.mundopc;

import java.util.ArrayList;

public class Orden {
    private final int idOrden;
    private ArrayList<Computadora> computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new ArrayList<>();
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras.add(computadora);
            this.contadorComputadoras++;
        } else {
            System.out.println("Máximo de computadoras alcanzado");
        }
    }

    public void mostrarOrden() {
        StringBuilder str = new StringBuilder();
        str.append("Tu orden es la #: ");
        str.append(this.idOrden);
        str.append("\n");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            str.append(this.computadoras.get(i).toString());
            str.append("\n");
        }

        System.out.println(str.toString());
    }
}
