package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products =new ArrayList<>( List.of(
                new Product("Apples", 12.5, 10),
                new Product("Oranges", 8.2, 35),
                new Product("Oranges", 8.2, 35)));

//        products.sort(Comparator.naturalOrder()); //interface comparable ascending
//        products.sort(Comparator.reverseOrder()); //interface comparable descending
//
        products.sort(Comparator.comparing(Product::getPrice)); // παιρνει lambdas kai κανουμε ευκολα sorting

        products.sort(Comparator.comparing(Product::getDescription)
                                .thenComparing(Product::getQuantity));

        products.forEach(System.out::println);
    }
}
