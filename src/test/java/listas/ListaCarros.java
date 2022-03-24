package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaCarros {
    public static void main(String[] args) {
        ArrayList<String> lCarros = new ArrayList<String>();
        lCarros.add("Aveo");
        lCarros.add("Clio");
        lCarros.add("Swift");

        ArrayList<String> devices = new ArrayList<String>();
        devices.add("mouse");
        devices.add("tv");
        devices.add("computador");
        devices.add("padmouse");
        devices.add("cargador");
        devices.add("calentador");
        devices.add("cable");
        devices.add("teclado");
        devices.add("pantalla");
        devices.add("pedales");

        List<String> myDevices = devices
                .stream()
                .filter(s -> s.startsWith("p"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("La lista de los devices es: " + myDevices);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(60);
        numbers.add(50);
        numbers.add(80);
        numbers.add(70);
        numbers.add(90);
        numbers.add(100);

        long myIntegerList = numbers
                .stream()
                .filter(s -> s > 50)
                .count();
        System.out.println("Los numeros mayores de 50 son: " + myIntegerList);
        if (myIntegerList >= 5) {
            System.out.println("La lista es mayor que 5");
        } else {
            System.out.println("la lista es menor que 5");
        }

        ArrayList<String> personas = new ArrayList<String>();
        personas.add("Andres");
        personas.add("Camilo");
        personas.add("Liliana");
        personas.add("Daniel");
        personas.add("Rosalba");
        personas.add("Katherine");

        System.out.println(personas);


        // implirmir desde el metodo
        lCarros.add("Kia");
        MetodosParaLaLista.imprimirLista(lCarros);
        System.out.println("La cantidad de datos en la lista es: " + lCarros.size());

        System.out.println("..:: Removiendo elemento ::.. ");
        MetodosParaLaLista.removerElemento(lCarros, 0);
        MetodosParaLaLista.imprimirLista(lCarros);

        System.out.println("..:: Añadiendo elemento ::.. ");
        MetodosParaLaLista.addElement(lCarros, "Mercedes");
        MetodosParaLaLista.imprimirLista(lCarros);

        System.out.println("..:: eliminando elemento ::.. ");
        MetodosParaLaLista.eleminandoUnElemento(lCarros, 2);
        MetodosParaLaLista.imprimirLista(lCarros);
    }
}
