package main;

import javaFuncionalStreams.Eletrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class MainEletrodomesticos {

    public static void main(String[] args) {
        List<Eletrodomesticos> myList = new ArrayList<>();

        myList.add(new Eletrodomesticos("fridge", "while", 45));
        myList.add(new Eletrodomesticos("stove", "red", 5));
        myList.add(new Eletrodomesticos("microware", "black", 30));

        int total = 0;
        for(Eletrodomesticos myValue: myList) {
            total = total + myValue.getPrice();
        }

        System.out.println("El valor de los electrodomesticos es: " + total);
    }
}
