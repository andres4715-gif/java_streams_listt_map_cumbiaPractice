package main;

import org.testng.annotations.Test;
import utils.StepDefinitions;

public class Maping {
  @Test (priority = 1, enabled = true)
  public void mainMaping () {
    StepDefinitions.checkIfIsAddedOnDb(StepDefinitions.chekingFiduciaries(
        "45", "UBS"));
  }
}
