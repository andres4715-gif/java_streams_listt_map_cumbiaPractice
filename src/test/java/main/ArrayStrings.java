package main;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ArrayStrings {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("***" + now);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(getNombre("Andres") + " Estuvo en la cas el dia " + now);

        String Date = formatter.format(now);

        System.out.println("la fecha ya modificada es: " + Date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(dtf.format(now2));
        String mirando = "Enexcel-" + now + "datatest-" + now2;
        System.out.println(mirando);
        if (mirando.contains("Enexcel")) {
            String otraCadena = mirando + "con el complemento";
            System.out.println(otraCadena);
        } else {
            System.out.println(mirando + " No debe tener nada mas");
        }

        ArrayStrings holaaaa = new ArrayStrings();
        holaaaa.isIncludeInContactFile();
    }

    public static String getNombre(String name) {
        return name;
    }

    public boolean isIncludeInContactFile() {
        System.out.println("**************");

        int numero1 = 10;
        int numero2 = 23;
        if (numero1 + numero2 == 33) {
            return true;
        } else {
            return false;
        }
    }
}
