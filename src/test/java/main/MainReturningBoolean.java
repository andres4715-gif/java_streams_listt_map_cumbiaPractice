package main;

import hashMap.ReturningBoolean;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainReturningBoolean {

    // El metodo static siempre se va a imprimir de primero.
    static {
        int num1 = 1;
        int num2 = 3;
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma);
    }

    @Test(priority = 1, enabled = true, description = "Adding dataInfo")
    public void checkingMaps() {
        ReturningBoolean.checkIfExistsInDb.put("FS_6767_UBS", true);
        ReturningBoolean.checkIfExistsInDb.put("FS_6768_UBS", false);
        ReturningBoolean.checkIfExistsInDb.put("FS_6769_UBS", true);
        ReturningBoolean.checkIfExistsInDb.put("FS_0000_UBS", true);

        Assert.assertTrue(ReturningBoolean.isFsTestPlanProduction("6767", "UBS"));
        Assert.assertTrue(ReturningBoolean.isFsTestPlanProduction("0000", "UBS"));
        Assert.assertFalse(ReturningBoolean.isFsTestPlanProduction("8888", "UBS"));
        Assert.assertTrue(ReturningBoolean.isFsTestPlanProduction("9999", "UBS"));
        Assert.assertFalse(ReturningBoolean.isFsTestPlanProduction("6768", "UBS"));
        Assert.assertTrue(ReturningBoolean.isFsTestPlanProduction("6769", "UBS"));
        Assert.assertEquals(6, ReturningBoolean.checkIfExistsInDb.size());
    }
}
