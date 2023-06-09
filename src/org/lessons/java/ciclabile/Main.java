package org.lessons.java.ciclabile;

public class Main {

    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8};
        Ciclo ciclo = new Ciclo(numeri);

        int numeroElementi = numeri.length;

        while (ciclo.hasAncoraElementi() && numeroElementi > 0) {
            int elemento = ciclo.getElementoSuccessivo();
            System.out.println(elemento);
            numeroElementi--;
        }
    }
}
