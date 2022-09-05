package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipo, String marca) {
        super("Teclado", marca);
        Teclado.contadorTeclados++;
        this.idTeclado = Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.idTeclado);
        str.append(" ");
        str.append(this.getTipoEntrada());
        str.append(" ");
        str.append(this.getMarca());

        return str.toString();
    }
}
