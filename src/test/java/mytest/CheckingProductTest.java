package mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import models.Product;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckingProductTest {

    List<Product> myList = new ArrayList<>();

    @BeforeClass
    public void before() {
        myList.add(new Product(35, "Aguacates", "vegetales", 120.0));
        myList.add(new Product(35, "maiz", "grano", 120.0));
        myList.add(new Product(35, "Azucar", "grano", 120.0));
        myList.add(new Product(35, "Aleli", "pepas", 120.0));
        myList.add(new Product(35, "Arroz", "grano", 120.0));
        myList.add(new Product(34, "Almendras", "grano", 78.8));
        myList.add(new Product(34, "Lulo", "fruta", 60.8));
        myList.add(new Product(34, "Manzanas", "fruta", 60.8));
    }

    @Test
    public void checkinList() {
        List<Product> products = getProductsList(119.0);
        List<String> resultFilter = new ArrayList<>();
        // foreach filter
        for (Product p : products) {
            if ("Azucar".equals(p.getName())) {
                resultFilter.add(p.getName());
            }
        }

        // print the new list
        for (String p : resultFilter) {
            System.out.println(p);
        }
    }

    private List<Product> getProductsList(double price) {
        List<Product> hollass = myList
                .stream()
                .filter(p -> p.getPrice() > price && p.getType().equals("grano"))
                .collect(Collectors.toList());
        return hollass;
    }
}
