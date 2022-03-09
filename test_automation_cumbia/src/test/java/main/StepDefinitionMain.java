package main;

import org.testng.Assert;

public class StepDefinitionMain {

    public void flash(int val1, int val2) {
        int suma = (val1 + val2);
        System.out.println("La suma de los numeros es; " + suma);
        Assert.assertEquals(suma, 60);
    }
}

