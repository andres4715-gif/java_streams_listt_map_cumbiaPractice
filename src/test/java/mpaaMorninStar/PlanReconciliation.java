package mpaaMorninStar;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


public class PlanReconciliation {

    @Test
    public void runDataTest() {
        List<PlanReconciliationReportData> attachmentData = new ArrayList<>();
        List<String> onlyShellAccount = new ArrayList<>();
        attachmentData.add(new PlanReconciliationReportData("ADP", "103851", "MPAA-1371-TEST", "Say it with Flowers of Allen Park", "TRUE", "FALSE"));
        attachmentData.add(new PlanReconciliationReportData("ADP", "107843", "", "Century/AAA, Ltd. d/b/a AAA Supply 401k Plan", "TRUE", "FALSE"));
        attachmentData.add(new PlanReconciliationReportData("ADP", "107875", "", "Atrium Animal Hospital 401 (K) Plan", "TRUE", "FALSE"));
        attachmentData.add(new PlanReconciliationReportData("ADP", "10903", "", "4-F Ranch, Inc. 401(k) Plan", "TRUE", "FALSE"));
        attachmentData.add(new PlanReconciliationReportData("ADP", "259727", "MPAA-1371-TEST-2", "Witness Inspection 401(K) Plan", "TRUE", "FALSE"));

        for (PlanReconciliationReportData runningRows : attachmentData) {
            String gettingShellAccount = runningRows.getShellAccount();
            onlyShellAccount.add(gettingShellAccount);
        }
        System.out.println(onlyShellAccount);
    }
}
