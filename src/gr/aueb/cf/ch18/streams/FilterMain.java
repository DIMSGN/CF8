package gr.aueb.cf.ch18.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Berlin", "London", "Paris", "Rome", "Tokyo");
        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .toList(); // immutable list

        var filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("A"))
                .collect(Collectors.toList());  // mutable list

        filteredCities2.forEach(System.out::println);
        filteredCities.forEach(System.out::println);
    }
}
