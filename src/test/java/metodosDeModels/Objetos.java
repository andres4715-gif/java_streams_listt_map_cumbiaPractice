package metodosDeModels;

import models.CarrosCompradosList;

public class Objetos {

    public static void main(String[] args) {
        CarrosCompradosList carro1 = new CarrosCompradosList("chevrolet", "Blanco", "tela", "KIX500", "118000", true);
        System.out.println(carro1.getPlaca());
    }
}
