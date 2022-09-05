package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipo, String marca) {
        super(tipo, marca);
        Raton.contadorRatones++;
        this.idRaton = Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.idRaton);
        str.append(" ");
        str.append(this.getTipoEntrada());
        str.append(" ");
        str.append(this.getMarca());
        str.append(" ");
        str.append(super.toString());

        return str.toString();
    }
}
