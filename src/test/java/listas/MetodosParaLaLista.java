package listas;

import java.util.ArrayList;

public class MetodosParaLaLista {

    /**
     * imprimir todos los elementos de la lista:
     *
     * @param myListicaMia
     */
    static void imprimirLista(ArrayList<String> myListicaMia) {
        for (String elementosLista : myListicaMia) {
            System.out.println(elementosLista);
        }
    }

    public static void hacerStream(ArrayList<String> RunningList) {
        for (String myElements : RunningList) {
            System.out.println(myElements.toUpperCase());
        }
    }

    /**
     * este es para eliminar un elemento con un void
     *
     * @param removiendo
     * @param numero
     */
    static void removerElemento(ArrayList<String> removiendo, int numero) {
        removiendo.remove(numero);
    }

    /**
     * Este es para añadir un elemento con un void
     *
     * @param adding
     * @param marcaCoche
     */
    static void addElement(ArrayList<String> adding, String marcaCoche) {
        adding.add(marcaCoche);
    }

    /**
     * Este es para eliminar un elemento con pero retornando un Integer
     *
     * @param removing
     * @param eliminar
     * @return
     */
    static int eleminandoUnElemento(ArrayList<String> removing, int eliminar) {
        removing.remove(eliminar);
        return eliminar;
    }
}


