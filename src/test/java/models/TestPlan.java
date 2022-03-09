package models;

import lombok.Data;


@Data
public class TestPlan {
  public static final String DATE_FORMAT = "M/d/yyyy";

  //plan profiles
  private String planCode;
  private String brokerDealerCode;
  private String providerCode;
  private String isActive;
  private Integer marlinPlanProfileId;
  private String advisorPlanName;

  //plan profile details
  private String planName;
  private String effectiveDate;
  private String fundedDate;
  private String cancelDate;
  private String planContactEmail;
  private String planAdvisorEmail;

  //fs plan mapping
  private String fsPlanCode;
  //private String fsProviderName; //client name
  private String fsPlanName;
  private String fsClientCode;  //client code

  //eligible plans
  private String createInFs;
  private String fsProductCode;
  private String fsProgram;
  private String fsMenu;

  //fs cancel
  private String cancelInFs;
  private String fsCancelDate;
  private String fsEin;
  private String fsPn;

  //fs compliance
  private String complianceStatus;
  private String complianceDate;

  //rj fields
  private String createInMarlin;
  private String planContactImportSuccessful;
  private String includeInContactFile;
  private String planContactName;
  private String planAdvisorName;
  private String shellAccount;

  //fs only
  private boolean isUnconfirmed = false;  //defaults to false

  //plan contact import only
  private String welcomeImportError;


  public String getSanitizedPlanCode() {
    return planCode.replace("'","").trim();
  }

  public boolean isActive() {
    return Boolean.parseBoolean(isActive);
  }

  public boolean isCreatedInFs() {
    return Boolean.parseBoolean(createInFs);
  }

  public boolean isCancelledInFs() {
    return isCreatedInFs() && Boolean.parseBoolean(cancelInFs);
  }

  public boolean isPlanContactImportSuccessful() {
    return Boolean.parseBoolean(planContactImportSuccessful);
  }

  public boolean isIncludeInContactFile() {
    return Boolean.parseBoolean(includeInContactFile);
  }

  /**
   * Check if plan is actually cancelled in Marlin.
   * @return true if cancelDate is in the past
   */

  public boolean isCreatedInMarlin() {
    return Boolean.parseBoolean(createInMarlin);
  }

  /**
   * Get the unique provider/plancode combo id.
   * @return provider.plancode
   */
  public String getMarlinUniquePlanCode() {
    return (providerCode.trim() + "." + getSanitizedPlanCode()).toLowerCase();
  }

  /**
   * Get the unique provider/plancode combo id.
   * @return provider.plancode
   */
  public String getFsUniquePlanCode() {
    return (fsClientCode.toLowerCase().trim() + "." + fsPlanCode.toLowerCase()).trim();
  }
}
