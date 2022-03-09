package javaFuncionalStreams;

import java.util.Arrays;
import java.util.List;

public class SomeExamples {

    public static boolean check() {
        String einstein = "la imaginacion es mas importante que el conocimiento";
        String[] splited = einstein.split(("\\s+"));

        List<String> words = Arrays.asList(splited);
        long medidor = 2;
        long checking = words
                .stream()
                .filter(w -> w.startsWith("i"))
                .distinct()
                .count();
        return (medidor == (int) checking);
    }
}
