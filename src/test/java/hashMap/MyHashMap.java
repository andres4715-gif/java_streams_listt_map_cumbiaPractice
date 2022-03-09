package hashMap;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        MetodosHashMap familia = new MetodosHashMap();

        HashMap<String, Integer> calzado = new HashMap<String, Integer>();
        calzado.put("Liliana", 36);
        calzado.put("Daniel", 41);
        calzado.put("Andres", 40);
        calzado.put("Katherine", 37);

        System.out.println(calzado.size());
        System.out.println(calzado.get("Daniel"));
        System.out.println(calzado);

        for (int myCicloFor : calzado.values()) {
            System.out.println(myCicloFor);
        }

        System.out.println("..:: only values ::..");

        System.out.println(calzado.containsValue(41));
        boolean value = (calzado.containsValue(41));

        if (value) {
            System.out.println("el calzado de Daniel si esta disponible: " + value);
        }

        System.out.println("..:: Estas son las key ::.. ");
        for (String lasKey : calzado.keySet()) {
            System.out.println(lasKey);
        }

        System.out.println("Katerine calza: " + calzado.get("Katherine"));

        familia.addAllHashMap(calzado, "mama", 36);
        System.out.println("la nuevo lista despues del metodo es: ");
        for (String print : calzado.keySet()) {
            System.out.println(print);
        }

        familia.addAllHashMap(calzado, "MamaPowerRanger", 38);
        for (String print : calzado.keySet()) {
            System.out.println(print);
        }
        familia.addAllHashMap(calzado, "Rosalba", 40);
        familia.getSomeValue(calzado);
    }
}
