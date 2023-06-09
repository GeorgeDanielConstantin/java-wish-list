package org.lessons.java.ciclabile;

public class Ciclo {

    private final int[] numeri;
    private int i;

    public Ciclo(int[] numeri) {
        this.numeri = numeri;
        this.i = 0;
    }

    public int getElementoSuccessivo() {
        int elemento = numeri[i];
        i++;
        return elemento;
    }

    public boolean hasAncoraElementi() {
        return i < numeri.length;
    }
}
