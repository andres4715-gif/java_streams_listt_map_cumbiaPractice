package javaFuncionalStreams;

public class CompraComputador {

    private String Marca;
    private int valor;
    private String color;

    public CompraComputador(String marca, int valor, String color) {
        Marca = marca;
        this.valor = valor;
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
