package hashMap;

import java.util.HashMap;

public class MetodosHashMap {

    void addAllHashMap(HashMap<String, Integer> mio, String key, Integer value) {
        mio.put(key, value);
        System.out.println("La llave ingresada es: " + key);
    }

    void getSomeValue(HashMap<String, Integer> mio) {
        for (String mirarKey : mio.keySet()) {
            System.out.println(mirarKey);
        }
    }
}

