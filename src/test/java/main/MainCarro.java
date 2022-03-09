package main;

import javaFuncionalStreams.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainCarro {

    public static void main(String[] args) {

        List<Carro> myList = new ArrayList<Carro>();

        myList.add(new Carro("Chevrolet", "Aveo", 20));
        myList.add(new Carro("Mazda", "3", 50));
        myList.add(new Carro("Renault", "Clio", 10));

        int totalValorCarros = 0;
        for (Carro myForLoop : myList) {
            totalValorCarros = totalValorCarros + myForLoop.getValor();
        }

        System.out.println("El valor de todos los carros es: " + totalValorCarros);
    }
}
