package hashMap;

import java.util.HashMap;
import java.util.Map;

public class ReturningBoolean {

    public static Map<String, Boolean> checkIfExistsInDb = new HashMap<>();

    public static boolean isFsTestPlanProduction(String fiduciaryCode, String clientName) {
        String key = "FS_" + fiduciaryCode + "_" + clientName;
        if (!checkIfExistsInDb.containsKey(key)) {
            checkIfExistsInDb.put(key, isClientProduction(clientName, fiduciaryCode));
        }

        return checkIfExistsInDb.getOrDefault(key, false);
    }

    static boolean isClientProduction(String clientName, String fiduciaryCode) {

        if (clientName.equals("UBS") && fiduciaryCode.equals("8888")) {
            return false;
        }
        if (clientName.equals("UBS") && fiduciaryCode.equals("9999")) {
            return true;
        }
        if (clientName.equals("UBS") && fiduciaryCode.equals("1010")) {
            return false;
        }
        return false;
    }
}
