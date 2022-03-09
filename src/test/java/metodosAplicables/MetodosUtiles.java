package metodosAplicables;

import java.util.List;

public class MetodosUtiles {

    static void imprimir(List<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + "-");
        System.out.println();
    }
}
