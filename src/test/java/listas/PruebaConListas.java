package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Carro;
import models.Persona;


public class PruebaConListas {

    public static void main(String[] args) {
        prueba();
    }

    private static void prueba() {

        // En esta lo que se quiere es mira si se puede tomar solo una parte de la lista:
        List<Persona> myPasajeros = new ArrayList<Persona>();
        myPasajeros.add(new Persona("Andres", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("Carlos", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("Esteban", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("Mario", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("Carmen", 28, 1.78, 'F'));
        myPasajeros.add(new Persona("Estefania", 28, 1.78, 'F'));
        myPasajeros.add(new Persona("Diana", 28, 1.78, 'F'));
        myPasajeros.add(new Persona("Liliana", 28, 1.78, 'F'));
        myPasajeros.add(new Persona("Daniel", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("Estella", 28, 1.78, 'F'));
        myPasajeros.add(new Persona("Marlon", 28, 1.78, 'M'));
        myPasajeros.add(new Persona("iroman", 56, 1.45, 'M'));

        List<Persona> arrlist2 = myPasajeros.subList(2, 5);
        System.out.println("Esteban, mario y Carmen: " + arrlist2);
        // Fin de este ejercicio:

        // --> Inicio de este ejercicio: <--
        // En esta se pretende mirar como es el tema enviar una lista desde un modelo:
        Carro myCarro = new Carro("KIV566", "chevrolet", 4, myPasajeros, 2012);

        System.out.println("El primer pasajero es: " + myPasajeros.get(0).getNombre() + " En el carro de placas " + myCarro.getPlaca());

        List<Persona> personajes = new ArrayList<Persona>();
        personajes.add(new Persona("Fiona", 787, 1.20, 'F'));
        personajes.add(new Persona("Maravilla", 1000, 1.80, 'F'));
        personajes.add(new Persona("Thor", 4000, 1.90, 'M'));
        personajes.add(new Persona("Iroman", 45, 1.80, 'M'));

        System.out.println("Debe pagar impuestos: " + myCarro.cobrarImpuestos());
        System.out.println("La lista de pasageros es: " + myPasajeros.size());
        System.out.println("La nueva lista tiene " + arrlist2.size() + " posiciones");
        System.out.println(arrlist2.get(0).getNombre());
        System.out.println(personajes.get(1).getNombre());

        System.out.println("Recorriendo con un ciclo for: ");
        for (Persona holasss : personajes) {
            System.out.println(holasss.getNombre() + " - " + holasss.tomarDato());
        }

        System.out.println("Recorriendo con un Iterador: ");
        Iterator iter = personajes.iterator();
        while (iter.hasNext()) {
            Persona persona = (Persona) iter.next();
            System.out.println(persona.getNombre() + " - " + persona.tomarDato());
        }

        System.out.println("Obteniendo solo los nombres de la lista con el metodo Iterador:");
        Iterator myIterador = personajes.iterator();
        while (myIterador.hasNext()) {
            Persona persona = (Persona) myIterador.next();
            System.out.println(persona.getNombre());
        }
    }
}
