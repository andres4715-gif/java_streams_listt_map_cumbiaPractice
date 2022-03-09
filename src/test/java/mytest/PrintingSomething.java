package mytest;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import utils.StepDefinitions;
import models.CarrosCompradosList;

import java.util.ArrayList;
import java.util.HashMap;

@Slf4j
public class PrintingSomething {

    boolean audifonos = true;
    private String texto1 = "qa-";
    private String cluster = "aws.com.co.lapruebadelcluster";

    private StepDefinitions stepsefinitions;

    @Test(priority = 1, enabled = true, description = "Checking some data info")
    public void oneMoreTest() throws InterruptedException {
        System.out.println("solo imprimiendo otra cosa");
        HashMap<String, Integer> talla = new HashMap<>();
        StepDefinitions.cuadreno();
        StepDefinitions.lamia();
        StepDefinitions.tengoAudifonos(audifonos);
        boolean do_checking = StepDefinitions.checking2(false);
        System.out.println("El man compro audifonos: " + do_checking);
        StepDefinitions.checking();
        StepDefinitions.estaEstudiando(4, 10, 2021);
        StepDefinitions.comproMouse(true, false);
        StepDefinitions.myListAndres();
        StepDefinitions.addAlHashMap(talla, "Julian", 20);
        CarrosCompradosList carro1 = new CarrosCompradosList("chevrolet", "Blanco", "tela", "KIX500", "118000", true);
        CarrosCompradosList carro2 = new CarrosCompradosList("Mazda", "Negro", "cuero", "ooo908", "1000", false);
        carro1.setPlaca("UYT567");
        System.out.println("La marca del carro2 es " + carro2.getMarca());
        System.out.println(carro1.getPlaca());
        CarrosCompradosList.suma(60, 5);
        Thread.sleep(1000);
        CarrosCompradosList.retornar(56);
        CarrosCompradosList.checkinNumber();
        StepDefinitions.primera("Lo que le mando en la primera:");
        StepDefinitions.primera(StepDefinitions.segunda());
        StepDefinitions.textoLargo1(texto1);
        StepDefinitions.cluster(StepDefinitions.textoLargo1(texto1), StepDefinitions.settngCluster(cluster));
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        nombreArrayList.add("Medellin");
        System.out.println(nombreArrayList);
        StepDefinitions.sumaDeDosNumeros();
    }
}
