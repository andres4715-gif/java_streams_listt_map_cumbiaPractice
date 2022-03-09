package json;

import org.json.JSONObject;

public class Json_manipulation {

    private static final String cluster_bpc = "qa-fi360-testaws";

    /**
     * Generando un objeto JSON
     */
    public static String myJson() {
        JSONObject myObject = new JSONObject();

        // Cadenas de texto básicas
        myObject.put("name", "Andres");
        myObject.put("last_name", "Rios");

        // Valores primitivos
        myObject.put("age", new Integer(21));
        myObject.put("bank_account_balance", new Double(20.2));
        myObject.put("is_developer", new Boolean(true));

        // Matrices
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        myObject.put("number_list", myList);

        // Objeto dentro de objeto
        JSONObject subdata = new JSONObject();
        myObject.put("extra_data", subdata);

        // Generar cadena de texto JSON
        JSONObject myJsonData = myObject;
        System.out.println(myJsonData.get("name"));
        System.out.println(myJsonData);
        if (myJsonData.get("name").toString() == "Andres") {
            System.out.println("Si es el user que quiero:");
        }

        return myJsonData.get("name").toString();
    }

    public static String utilizandoElresultadoAnterior() {
        String cluster = cluster_bpc;
        String check = Json_manipulation.myJson();
        String between = cluster + "-" + check;
        return between;
    }

    public static String nombre() {
        String mycheck = Json_manipulation.myJson();
        return "hola";
    }

    public static boolean utilizandoElresultadoAnteriorBoolean() {
        String cluster = cluster_bpc;
        String check = Json_manipulation.myJson();
        String between = cluster + "-" + check;
        if (between == "qa-fi360-testaws-Andres") {
            return true;
        } else {
            return false;
        }
    }

    public static void usuariosMetro() {
        JSONObject myMetroUsers = new JSONObject();
        myMetroUsers.put("id", new Integer(78));
        myMetroUsers.put("firstName", "Liliana");
        myMetroUsers.put("lastName", "Gonzalez");
        myMetroUsers.put("estatura", new Double(1.78));
        myMetroUsers.put("Status", new Boolean(true));
        System.out.println(myMetroUsers);
    }
}
