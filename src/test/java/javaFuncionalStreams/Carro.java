package javaFuncionalStreams;

import lombok.Getter;

@Getter
public class Carro {

    private String marca;
    private String modelo;
    private int valor;

    public Carro(String marca, String modelo, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }
}
