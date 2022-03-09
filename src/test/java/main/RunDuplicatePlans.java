package main;

import java.util.ArrayList;
import java.util.List;
import models.Plans;
import org.testng.Assert;
import utils.StepDefinitions;

public class RunDuplicatePlans {

  public static void main(String[] args) {

    List<Plans> planList = new ArrayList<>();
    planList.add(new Plans("A", "A"));
    planList.add(new Plans("B", "B"));
    planList.add(new Plans("C", "C"));
    planList.add(new Plans("D", "A"));
    planList.add(new Plans("E", "A"));
    planList.add(new Plans("F", "A"));
    System.out.println(planList.size());

    boolean result = StepDefinitions.checkDuplicatedLines(planList);
    System.out.println(result);

    boolean desdeQueTeConoci = StepDefinitions.checkingList(planList);
    System.out.println("List is complete: " + desdeQueTeConoci);

    int cantidadDatosList = StepDefinitions.checkingCantidadDatos(planList);
    Assert.assertEquals(StepDefinitions.checkingCantidadDatos(planList), 6);
    System.out.println(cantidadDatosList);

    boolean checkingIfExist = StepDefinitions.checkingIfExist(planList);
    System.out.println(checkingIfExist);
  }
}
