package models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empresa {

    private String nombre;
    private String direccion;
    private boolean servDomicilio;
    private int numeroCarros;
    private List<Empleados> empleados;


    public boolean domicio() {
        if (servDomicilio) {
            System.out.println("Tiene servicio de domicio!!");
            return true;
        }
        System.out.println("No tiene servicio de domicio!!");
        return false;
    }
}
