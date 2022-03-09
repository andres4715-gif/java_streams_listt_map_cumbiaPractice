package Utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StepDefinition {

    public static int pitar(int numero1, int numero2) {
        int retorna = numero1 + numero2;
        System.out.println(retorna);
        return retorna;
    }

    public static int suma(int val1, int val2, int val3) {
        int theValueIs = (val1 + val2 + val3);
        return theValueIs;
    }

    public static boolean berta(String nombre) {
        if (nombre == "Berta") {
            System.out.println("The result was success:");
            return true;
        } else {
            System.out.println("The result was fail");
            return false;
        }
    }

    public static int totalHeroAge(int supermanAge, int thorAge, int wonderWomanAge) {
        int totalAge = (supermanAge + thorAge + wonderWomanAge);
        System.out.println("Total age for this super Hero are: " + totalAge);
        return totalAge;
    }

    public static boolean superHeroBeforeGOD(int superman, int thor, int wonderWoman) {
        int superHeroAge = totalHeroAge(superman, thor, wonderWoman);
        if (superHeroAge >= 2000) {
            System.out.println("Those super hero are before GOD");
            return true;
        } else {
            System.out.println("Those super hero are after GOD");
            return false;
        }
    }

    public static int HumorGuy(String humorGuy1, String HumorGuy2, String HumorGuy3, List<Integer> pepito) {
        List<String> ColombiaHumor = new ArrayList<String>();
        ColombiaHumor.add(humorGuy1);
        ColombiaHumor.add(HumorGuy2);
        ColombiaHumor.add(HumorGuy3);
        pepito.add(8);
        pepito.add(9);
        pepito.add(10);

        System.out.println("El tamaño de la lista es: " + ColombiaHumor.size());
        System.out.println(pepito);

        // Imprimir con el metodo for!!
        for (String print : ColombiaHumor) {
            System.out.println("Humorista: " + print);
        }

        return ColombiaHumor.size();
    }
}
