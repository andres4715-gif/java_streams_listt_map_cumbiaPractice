package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarrosCompradosList {
    private String marca;
    private String color;
    private String cogineria;
    private String placa;
    private String kilometraje;
    private boolean llantaRepuesto;

    public static void suma(int val1, int val2) {
        int resultado = (val1 + val2);
        System.out.println(resultado);
    }

    public static int retornar(int value) {
        System.out.println(value);
        return value;
    }

    public static boolean checkinNumber() {
        int see = retornar(5);
        if (see >= 18) {
        } else {
            System.out.println("No puede trabajar!!");
            return false;
        }
        System.out.println("Si puede trabajar");
        return true;
    }
}
