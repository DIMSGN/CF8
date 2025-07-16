package gr.aueb.cf.ch19.lists;

import gr.aueb.cf.ch4.CharInput1;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {

    public static void main(String[] args) {

        //Declare
        List<String> cities = new ArrayList<>();

        //Add
        cities.add("Athens"); //index 0
        cities.add("New Yor"); //index 1
        cities.add("London"); //index 2

        //Get
        String city = cities.get(0); // Athens
        System.out.println("City: " + city);

        //Set
        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1) {
            cities.set(nyPosition, "NY");
        } else  {
            System.out.println("New York does not exist.");

        }

        //Remove
        if (cities.contains("Athens")) {
            cities.remove("Athens");
        }  else {
            System.out.println("Athens does not exist.");
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String el : cities) {
            System.out.println(el);
        }

        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


//        Iterator<String> it = cities.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals("London")) {
//                it.remove();
//            }
//        }

        cities.removeIf(c -> c.startsWith("A"));

        cities.forEach(System.out::println);
    }
}
