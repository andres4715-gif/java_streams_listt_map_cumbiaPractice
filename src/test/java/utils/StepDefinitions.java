package utils;

import java.util.*;
import java.util.stream.IntStream;

import models.Plans;

public class StepDefinitions {
    private static Map<String, Boolean> providerProductionMapping = new HashMap<>();

    public static void lamia() {
        System.out.println("esto es lo que imprime el metodo mia");
    }

    public static void cuadreno() {
        System.out.println("esto es lo que imprime el metodo cuaderno");
    }



    public static String colorAutifonos(String color) {
        System.out.println("Los aufifonos son: " + color);
        return color;
    }

    public static boolean tengoAudifonos(boolean check) {
        if (check) {
            System.out.println("El man si tiene audifonos");
        } else {
            System.out.println("El man no tiene audifonos");
        }
        return check;
    }

    public static boolean tieneMac(boolean tieneMac) {
        if (tieneMac) {
            return true;
        } else {
            return false;
        }
    }

    public static void checking() {
        boolean value = tieneMac(true);
        if (value) {
            System.out.println("si tiene mac");
        } else {
            System.out.println("No tiene mac");
        }
    }

    public static boolean checking2(boolean value) {
        if (value) {
            System.out.println("Esta en el estudio: " + value);
        } else {
            System.out.println("Esta en el estudio: " + value);
        }
        return value;
    }

    public static boolean estaEstudiando(int dia, int mes, int anio) {
        if (mes == 12) {
            System.out.println("Deberia estar descansando por que es fin de año!!");
            return false;
        }

        if (dia >= 1 && dia <= 5 && mes >= 1 && mes <= 11 && anio == 2021) {
            System.out.println("Deberia estar estudiando!!");
        } else if (dia >= 6) {
            System.out.println("Es fin de semana y debe estar descansando!!");
            return false;
        }
        return true;
    }

    public static boolean comproMouse(boolean compro, boolean amazon) {
        if (amazon == true && compro == true) {
            boolean hola = estaEstudiando(6, 10, 2021);
            System.out.println(hola);
        } else {
            System.out.println("No compro nada en Amazon");
        }
        return compro;
    }

    public static void myListAndres() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Andres");
        list.add("Liliana");
        list.add("Daniel");
        list.add("Katerine");
        int cantidadDatosList = list.size();
        System.out.println("La cantidad de datos es: " + cantidadDatosList);

        for (String b : list) {
            System.out.println(b);
        }
    }

    public static void addAlHashMap(HashMap<String, Integer> mio, String key, Integer value) {
        mio.put(key, value);
        System.out.println("La llave ingresada es: " + key);
    }

    public static String primera(String primera) {
        System.out.println(primera);
        return primera;
    }

    public static String segunda() {
        return primera("Desde el metodo con el return pero desde primera");
    }

    public static String textoLargo1(String texto1) {
        return texto1;
    }

    public static String settngCluster(String valor) {
        return valor;
    }

    public static String cluster(String setTexto1, String setCluster) {
        if (setTexto1 == "qa-") {
            System.out.println("el texto largo es:  qa-");
        } else {
            System.out.println("Ingresar un texto largo valido");
        }
        String todounido = setTexto1 + setCluster;
        System.out.println(todounido);
        return todounido;
    }

    public static void myFecha() {
        Date startDateTime = new Date();

        System.out.println(startDateTime.toString());
    }

    private static int firstNumber(int val1, int val2, int val3) {
        int suma = val1 + val2 + val3;
        System.out.println(suma);
        return suma;
    }

    private static int secondNumber(int val1, int val2, int val3) {
        int suma = val1 + val2 + val3;
        System.out.println(suma);
        return suma;
    }

    public static int sumaDeDosNumeros() {
        int primero = firstNumber(5, 5, 5);
        int segundo = secondNumber(3, 1, 1);
        int totalSuma = primero + segundo;
        System.out.println("La suma de los dos numeros es: " + totalSuma);
        return totalSuma;
    }

    public void stringArrays() {
        final String[] IMPORT_FILE_COLUMN_HEADERS = {
                "Plan Name",
                "Provider Plan ID",
                "Recordkeeper",
                "Shell Account (optional)",
                "Effective Date of Plan",
                "Cancel Date for Plan (optional)",
                "RPF Name",
                "RPF Email Address",
                "Advisor Name",
                "Advisor Email Address",
                "Date Funded in 3(38) Program"
        };

        for (String variable : IMPORT_FILE_COLUMN_HEADERS) {
            System.out.println(variable);
        }
    }

    public List<String> lista() {
        List<String> myList = new ArrayList<>();
        myList.add("Adelaida");
        myList.add("Liliana");
        myList.add("Katerine");
        myList.add("Andres");
        return myList;
    }

    public void myList(String letter) {
        List<String> yourlist = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        yourlist
                .stream()
                .filter(s -> s.startsWith(letter))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public static void replace() {
        IntStream.range(1, 2)
                .forEach(System.out::println);
    }

    public static List<String> importTestPlanData(String val1, String val2) {
        List<String> hollasss = new ArrayList<>();
        hollasss.add(val1);
        hollasss.add(val2);
        System.out.println(hollasss);
        return hollasss;
    }

    public static boolean checkDuplicatedLines(List<Plans> attachmentData) {
        Set<Plans> checkDuplicatesSet = new HashSet<>();
        checkDuplicatesSet.addAll(attachmentData);
        return checkDuplicatesSet.size() == attachmentData.size();
    }

    public static boolean checkingList(List<Plans> locoPorVos) {
        List<Plans> enLaCasa = new ArrayList<>();
        enLaCasa.addAll(locoPorVos);
        return enLaCasa.size() == locoPorVos.size();
    }

    public static int checkingCantidadDatos(List<Plans> locoPorVos) {
        List<Plans> enLaCasa = new ArrayList<>();
        enLaCasa.addAll(locoPorVos);
        return enLaCasa.size();
    }

    public static boolean checkingIfExist(List<Plans> plansList) {
        List<Plans> checkingPlanListNew = new ArrayList<>();
        checkingPlanListNew.addAll(plansList);
        return checkingPlanListNew.equals(plansList);
    }

    // This is to check whether an element exists somewhere or not
    public static boolean chekingFiduciaries(String fiduciaryCode, String clientName) {
        String key = "UBS_method_" + fiduciaryCode + "_" + clientName;
        if (!providerProductionMapping.containsKey(key)) {
            providerProductionMapping.put(key, true);
        }
        System.out.println(providerProductionMapping.getOrDefault(key, false));
        return providerProductionMapping.getOrDefault(key, false);
    }

    public static int checkIfIsAddedOnDb(boolean checkIt) {
        if (checkIt) {
            System.out.println("This is true");
            return 0;
        } else {
            System.out.println("This is false");
            return 1;
        }
    }

    public static boolean myLittleList() {
        String text = "la casa de la dos palmas";
        boolean checkIfExist = true;

        if (text.contains("casa")) {
            System.out.println("Si tiene la palabra que estas buscando.");
            return checkIfExist;
        }
        return false;
    }

    public static boolean checkingAfterNumeros(List<Integer> reduciendo2, boolean check, int add3) {
        List<Integer> adding = new ArrayList<>();
        for (Integer hola : reduciendo2) {
            if (reduciendo2.size() < 10) {
                adding.add(add3);
                System.out.println(hola);
            }
        }

        return adding.size() > 2;
    }
}




