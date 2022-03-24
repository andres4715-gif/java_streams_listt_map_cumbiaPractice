package javaFuncionalStreams;

import java.util.ArrayList;

public class JavaFuncionalGasto {

    // TODO CHECK THIS LINK: https://www.arquitecturajava.com/programacion-funcional-java-8-streams/
    public static void main(String[] args) {
        ArrayList<Gasto> lista = new ArrayList<Gasto>();
        lista.add(new Gasto("Vuelo", 80));
        lista.add(new Gasto("Alimentacion", 50));
        lista.add(new Gasto("hospedage", 70));
        lista.add(new Gasto("peajes", 95));
        lista.add(new Gasto("hospedajeCaro", 300));

        double totalIvaPagado = 0;
        for (Gasto myViaje : lista) {
            if (myViaje.getValor() * 1.21 < 100) {
                totalIvaPagado = totalIvaPagado + myViaje.getValor() * 1.21;
            }
        }
        System.out.println(totalIvaPagado);
    }
}


