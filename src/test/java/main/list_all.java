package main;

import java.util.ArrayList;
import java.util.List;

public class list_all {

    public static void main(String[] args) {

        // Initializing a list of type arraylist
        List<String> disponibilidad = new ArrayList<String>();
        disponibilidad.add("10");
        disponibilidad.add("67");
        disponibilidad.add("98");
        System.out.println(disponibilidad);

        // Initializing a collection to be appended to list
        ArrayList<String> precio = new ArrayList<String>();
        precio.add("100");
        precio.add("200");
        precio.add("300");
        System.out.println(precio);

        precio.addAll(disponibilidad);

        List<String> newCompleteList = new ArrayList<String>(precio);

        System.out.println("La nueva lista es: " + newCompleteList);
    }
}
