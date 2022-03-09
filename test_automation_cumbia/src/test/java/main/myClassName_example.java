package main;

import Utils.StepDefinition;
import org.testng.Assert;
import org.testng.annotations.*;

public class myClassName_example {

    @BeforeClass
    public void saludar() {
        System.out.println("hola soy el @Before actuando y saludando");
    }

    @BeforeMethod
    public void beforeMethods() {
        System.out.println("Antes de cada metodo: ");
    }

    @AfterMethod
    public void afterMethods() {
        System.out.println("Despues de cada metodo: ");
    }

    @Test
    // Assert.Method( actual, expected)
    public void primerTest() {
        int IwantToRecive = StepDefinition.suma(20, 20, 16);
        System.out.println("Soy el primer test");
        int checkintThisNumber = StepDefinition.pitar(46, 10);
        Assert.assertEquals(checkintThisNumber, IwantToRecive);
    }

    @Test
    public void segundoTest() {
        System.out.println("Soy el segundo test");
    }

    @Test
    public void tercerTest() {
        System.out.println("Soy el tercer test");
    }

    @AfterClass
    public void testEjecutados() {
        System.out.println("Esto es lo que ejecuta despues del test ");
    }
}
