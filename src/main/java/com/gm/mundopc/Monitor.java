package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = Monitor.contadorMonitores++;
    }

    public Monitor(String marca, Double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.idMonitor);
        str.append(" ");
        str.append(this.marca);
        str.append(" ");
        str.append(this.tamaño);

        return str.toString();
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
}
