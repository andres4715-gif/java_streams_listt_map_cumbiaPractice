package main;

import java.util.ArrayList;
import java.util.List;

import models.Plans;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaFuncionalStreams {

    @Test(priority = 1, enabled = true, description = "Checking Streams")
    public void checkingList() {

        List<Plans> misPlanes = new ArrayList<>();

        misPlanes.add(new Plans("A", "F"));
        misPlanes.add(new Plans("B", "G"));
        misPlanes.add(new Plans("C", "H"));
        misPlanes.add(new Plans("U", "I"));
        // misPlanes.add(new Plans("U",   "I"));
        // misPlanes.add(new Plans("U",   "I"));
        //misPlanes.add(new Plans("U",   "I"));

        int rowsCount = misPlanes.size();
        System.out.println("La cantidad de planes es: " + rowsCount);

        long distingCount = misPlanes
                .stream()
                .distinct() // Este metodo es para remover los duplicados.
                .count();
        System.out.println("La cantidad de datos que no son duplicados es: " + distingCount);
        Assert.assertEquals(rowsCount, (int) distingCount);
    }
}
