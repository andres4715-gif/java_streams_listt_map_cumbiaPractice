package mpaaMorninStar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlanReconciliationReportData {

  private String providerName;
  private String providerPlanId;
  private String shellAccount;
  private String planName;
  private String knownToRaymondJames;
  private String knownToMorningstar;


  /**
   * Converts the true/false string in the csv into a boolean.
   * @return boolean
   */
  public boolean isKnownToRj() {
    return Boolean.parseBoolean(knownToRaymondJames);
  }

  /**
   * Converts the true/false string in the csv into a boolean.
   * @return boolean
   */
  public boolean isKnownToMs() {
    return Boolean.parseBoolean(knownToMorningstar);
  }
}
