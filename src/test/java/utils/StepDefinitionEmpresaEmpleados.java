package utils;

import java.util.ArrayList;
import java.util.List;

import models.Empleados;
import models.EmpleadosConfiar;
import models.Empresa;

public class StepDefinitionEmpresaEmpleados {

    public List<String> listaDeNombresEmpleados() {
        List<Empleados> misEmpleasosMiniso = new ArrayList<>();
        List<String> empleadosMiniso = new ArrayList<>();

        Empresa miniso = new Empresa("MINISO", "Calle los alamos", false, 4, misEmpleasosMiniso);

        misEmpleasosMiniso.add(new Empleados("Andres", "Gonsales", "Rios1", "Montoya1", true));
        misEmpleasosMiniso.add(new Empleados("Pedro", "Dario", "Rios2", "Montoya2", false));
        misEmpleasosMiniso.add(new Empleados("Esteban", "Prada", "Rios3", "Montoya3", true));
        misEmpleasosMiniso.add(new Empleados("Carlos", "David", "Rios4", "Montoya4", false));
        misEmpleasosMiniso.add(new Empleados("Alverto", "Stevan", "Rios4", "Montoya4", false));

        for (Empleados listaMiniso : misEmpleasosMiniso) {
            empleadosMiniso.add(listaMiniso.getPrimerNombre());
        }
        return empleadosMiniso;
    }

    public List<String> listaDeApellidosEmpleadosConfiar() {
        List<String> apellid = new ArrayList<>();
        List<EmpleadosConfiar> empleConfiar = new ArrayList<>();

        empleConfiar.add(new EmpleadosConfiar("Julian", "Stevan", "Rios", "Rios"));
        empleConfiar.add(new EmpleadosConfiar("Julian2", "Stevan2", "Rios2", "Agudelo"));
        empleConfiar.add(new EmpleadosConfiar("Julian3", "Stevan3", "Rios3", "Monsalve3"));
        empleConfiar.add(new EmpleadosConfiar("Julian4", "Stevan4", "Rios4", "Monsalve4"));

        for (EmpleadosConfiar listApelliConfi : empleConfiar) {
            apellid.add(listApelliConfi.getSegundoApellido());
        }
        return apellid;
    }

    public List<String> listaEmpleadosCarbajal() {
        List<String> empleadosCarbajal = new ArrayList<>();
        List<Empleados> EmpleadosCarbajal = new ArrayList<>();

        Empresa carvajal = new Empresa("Carvajal", "Calle los agucatala", true, 2, EmpleadosCarbajal);

        EmpleadosCarbajal.add(new Empleados("Iroman", "Piroma", "Star", "Sstar", true));
        EmpleadosCarbajal.add(new Empleados("Mujer Maravilla", "Mujer", "Mujer2", "Mujer3", false));
        EmpleadosCarbajal.add(new Empleados("Thor", "hombre", "hombre2", "hombre3", false));
        EmpleadosCarbajal.add(new Empleados("Capitan America", "hombre", "hombre2", "hombre3", false));

        for (Empleados listaCarbajal : EmpleadosCarbajal) {
            empleadosCarbajal.add(listaCarbajal.getPrimerNombre());
        }
        return empleadosCarbajal;
    }
}
