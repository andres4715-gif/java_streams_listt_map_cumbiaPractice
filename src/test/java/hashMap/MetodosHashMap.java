package hashMap;

import java.util.HashMap;

public class MetodosHashMap {

    public static void addAllHashMap(HashMap<String, Integer> mio, String key, Integer value) {
        mio.put(key, value);
        System.out.println("La llave ingresada es: " + key);
    }

    public static void getSomeValue(HashMap<String, Integer> mio) {
        for (String mirarKey : mio.keySet()) {
            System.out.println(mirarKey);
        }
    }
}
