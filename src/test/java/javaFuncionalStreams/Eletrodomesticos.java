package javaFuncionalStreams;

import lombok.Getter;

@Getter
public class Eletrodomesticos {

    private String name;
    private String color;
    private int price;

    public Eletrodomesticos(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
