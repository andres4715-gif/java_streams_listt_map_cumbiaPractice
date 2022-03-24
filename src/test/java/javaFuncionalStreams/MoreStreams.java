package javaFuncionalStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import utils.StepDefinitions;

public class MoreStreams {

    @Test
    public void whenMapIdToEmployees_thenGetEmployeeStream() {
        List<Integer> numeros = new ArrayList<Integer>();
        Integer[] empId = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0};
        for (int x : empId) {
            if (x > 5) {
                numeros.add(x);
            }
        }

        System.out.println(numeros);
        List<Integer> reduciendo = numeros
                .stream()
                .filter(x -> x > 8)
                .collect(Collectors.toList());

        System.out.println(reduciendo.getClass().getSimpleName());

        Assert.assertTrue(StepDefinitions.checkingAfterNumeros(reduciendo, true, 1));
    }
}
