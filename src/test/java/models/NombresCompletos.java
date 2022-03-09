package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NombresCompletos {

    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String SegundoApellido;
}
