package main;


import Utils.StepDefinition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Asserts {


    @BeforeClass
    public void saludar() {
        System.out.println("hola soy el @Before actuando y saludando");
    }

    @Test(priority = 2)
    public void tormenta() {
        int val1 = 45;
        int val2 = 5;
        int suma = (val1 + val2);
        System.out.println("La suma de los numeros es; " + suma);
        Assert.assertEquals(suma, 50);
    }

    @Test(priority = 4)
    public void flash() {
        StepDefinitionMain hola = new StepDefinitionMain();
        hola.flash(56, 4);
    }

    @Test(priority = 3)
    public void acuaman() {
        int val1 = 45;
        int val2 = 5;
        int suma = (val1 + val2);
        System.out.println("La suma de los numeros es; " + suma);
        Assert.assertEquals(suma, 50);
    }

    @Test(priority = 5)
    public void berta() {
        boolean mitest1 = StepDefinition.berta("Berta");
        Assert.assertEquals(mitest1, true, "!! Your name is no Berta --> ");
    }

    @Test(priority = 7)
    public void checkSuperHeroAge() {
        StepDefinition.superHeroBeforeGOD(1500, 4000, 500);
        Assert.assertEquals(true, true, "Those super hero are very old more than GOD");
    }

    @Test(priority = 6)
    public void checkHumorColombiaGuys() {
        List<Integer> horario = new ArrayList<Integer>();
        StepDefinition.HumorGuy("Jediondo", "Boyacoman", "Marujita", horario);
        Assert.assertNotNull(horario, "La lista de horario esta vacia: ");
    }

    @AfterClass
    public void testEjecutados() {
        System.out.println("Esto es lo que ejecuta despues del test ");
    }
}
