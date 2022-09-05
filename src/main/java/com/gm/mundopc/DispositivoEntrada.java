package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipo, String marca) {
        this.tipoEntrada = tipo;
        this.marca = marca;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.tipoEntrada);
        str.append(" ");
        str.append(this.marca);

        return str.toString();
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipo) {
        this.tipoEntrada = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
