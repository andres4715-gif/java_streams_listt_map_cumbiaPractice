package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.StepDefinitions;
import javaFuncionalStreams.SomeExamples;

public class TestNgMavenSecondClass {

    @Test(priority = 1, enabled = true, description = "checking oneMoreTest")
    public void oneMoreTest() {
        System.out.println("This is a TestNG-Maven based test");
        StepDefinitions.colorAutifonos("Blancos");
    }

    @Test(priority = 2, description = "checking checkingList")
    public void checkingList() {
        System.out.println("La respuesta es: " + SomeExamples.check());
        Assert.assertTrue(SomeExamples.check());
    }
}
