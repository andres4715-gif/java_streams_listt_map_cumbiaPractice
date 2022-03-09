package javaFuncionalStreams;

import lombok.Getter;

@Getter
public class Gasto {

    private String dato;
    private int valor;

    public Gasto(String dato, int valor) {
        this.dato = dato;
        this.valor = valor;
    }
}
