package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {

    private String nombre;
    private Integer edad;
    private double estatura;
    private char sexo;

    public int tomarDato() {
        if (estatura > 1.45) {
            return 1111;
        } else {
            return 2222;
        }
    }
}
