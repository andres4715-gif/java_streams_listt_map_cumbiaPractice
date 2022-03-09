package metodosAplicables;

import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<String>();

        lista1.add("Juan");
        lista1.add("Luis");
        lista1.add("Carlos");

        MetodosUtiles.imprimir(lista1);
        lista1.add(0, "Ana");
        MetodosUtiles.imprimir(lista1);
        lista1.remove(0);
        MetodosUtiles.imprimir(lista1);
        lista1.remove("Carlos");
        MetodosUtiles.imprimir(lista1);
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());

        if (lista1.contains("Ana"))
            System.out.println("El nombre 'Ana' si esta almacenado en la lista");
        else
            System.out.println("El nombre 'Ana' no esta almacenado en la lista");
        System.out.println("El segundo elemento de la lista es: " + lista1.get(1));

        lista1.clear();

        if (lista1.isEmpty())
            System.out.println("La lista se encuentra vacía");
    }
}
