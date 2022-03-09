package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import utils.StepDefinitionEmpresaEmpleados;

public class MainEmpleadosEmpresas {

  public static void main(String[] args) {
    List<String> nombrePorA = new ArrayList<String>();

    StepDefinitionEmpresaEmpleados objeto1 = new StepDefinitionEmpresaEmpleados();
    for (String nombreMiniso : objeto1.listaDeNombresEmpleados()) {
      System.out.println(nombreMiniso);
    }

    StepDefinitionEmpresaEmpleados apelliConfiar = new StepDefinitionEmpresaEmpleados();
    System.out.println("Apellidos de Confiar: *********** " );
    for(String apelliConfi1 : apelliConfiar.listaDeApellidosEmpleadosConfiar()){
      if (apelliConfi1.contains("Rios")){
        System.out.println("La lista contiene el apellido de Rios");
      }else{
      System.out.println("La lista no contiene el apellido Rios ");
      }
      if (apelliConfi1.matches("Agudelo")){
        System.out.println(apelliConfi1.toUpperCase());
      }else{
        System.out.println("Es mejor no hacer nada");
      }
        if (apelliConfi1.startsWith("T")) {
          System.out.println(apelliConfi1.toLowerCase());
        }else {
          System.out.println("No hago nada");
        }
    }

    System.out.println("..:: Lista de nombres Empleados Carvajal ::..");
    StepDefinitionEmpresaEmpleados objeto2 = new StepDefinitionEmpresaEmpleados();
    for (String nombreCarvajal : objeto2.listaEmpleadosCarbajal()) {
      System.out.println(nombreCarvajal);
    }

    System.out.println("..:: Estos son los nombres que inicial por A de la lista de Miniso ::..");
    objeto1.listaDeNombresEmpleados()
        .stream()
        .filter(e -> e.startsWith("A"))
        .sorted()
        .forEach(System.out::println);

    System.out
        .println("..:: Estos son los nombres que inician con M de la lista de Carvajal ::.. ");
    objeto1.listaEmpleadosCarbajal()
        .stream()
        .filter(i -> i.startsWith("M"))
        .sorted()
        .forEach(System.out::println);

    System.out.println("..:: Para capturar el objeto ::.. ");

    // Esta es para tener el objeto;

    nombrePorA = objeto1.listaDeNombresEmpleados()
        .stream()
        .filter(e -> e.startsWith("A"))
        .sorted()
        .collect(Collectors.toList());
    System.out.println("Debe imprimir Alverto. " + nombrePorA.get(0));
    System.out.println("Debe imprimir Andres. " + nombrePorA.get(1));
  }
}
