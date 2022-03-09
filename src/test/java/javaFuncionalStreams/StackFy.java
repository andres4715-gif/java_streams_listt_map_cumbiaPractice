package javaFuncionalStreams;

import java.util.ArrayList;
import java.util.List;

import models.Employee;
import org.testng.annotations.Test;
import utils.StepDefinitions;

public class StackFy {

    @Test(enabled = false)
    public void checkingList() {
        List<Employee> hola = new ArrayList<Employee>();

        hola.add(new Employee(1, "Jeff<", "Monsalve", 100000.0));
        hola.add(new Employee(2, "Liliana", "Monsa", 1450.0));
        hola.add(new Employee(3, "Carlos", "Mon", 106500.0));
        System.out.println("NO imprime nada, solo es para mirar");
    }

    @Test
    public void containsSomething() {
        System.out.println(StepDefinitions.myLittleList());
    }
}
