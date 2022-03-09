package main;

import java.util.ArrayList;
import java.util.List;

public class list_all {

    public static void main(String[] args) {

        // Initializing a list of type arraylist
        List<String> l = new ArrayList<String>();
        l.add("10");
        l.add("67");
        l.add("98");
        System.out.println(l);

        // Initializing a collection to be appended to list
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("100");
        arr.add("200");
        arr.add("300");
        System.out.println(arr);

        arr.addAll(l);

        List<String> newCompleteList = new ArrayList<String>(arr);

        System.out.println(newCompleteList);
    }
}
