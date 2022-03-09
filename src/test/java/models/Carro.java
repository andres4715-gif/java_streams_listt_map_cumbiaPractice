package models;

import lombok.Data;

import java.util.List;

@Data
public class Carro {

    private String placa;
    private String marca;
    private Integer llantas;
    private List<Persona> pasajeros;
    private Integer modelo;

    public Carro(String placa, String marca, Integer llantas, List<Persona> pasajeros, Integer modelo) {
        this.placa = placa;
        this.marca = marca;
        this.llantas = llantas;
        this.pasajeros = pasajeros;
        this.modelo = modelo;
    }

    public int cobrarImpuestos() {
        if (modelo > 2011 && pasajeros.size() > 4) {
            return 1;
        }

        return 0;
    }
}
