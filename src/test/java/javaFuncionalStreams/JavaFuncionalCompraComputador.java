package javaFuncionalStreams;

import java.util.ArrayList;

public class JavaFuncionalCompraComputador {

    public static void main(String[] args) {
        ArrayList<CompraComputador> mybuy = new ArrayList<CompraComputador>();
        mybuy.add(new CompraComputador("Lenovo", 70, "Negro"));
        mybuy.add(new CompraComputador("Dell", 30, "Gris"));
        mybuy.add(new CompraComputador("Compac", 90, "Crema"));

        int sumaCompra = 0;
        for (CompraComputador myValue : mybuy) {
            sumaCompra = sumaCompra + myValue.getValor();
        }
        System.out.println(sumaCompra);
    }
}
