package gr.aueb.cf.ch19.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Υλοποιεί τη λογική ενός parking με λογική LIFO.
 */
public class LifoParking {

private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {

    }

    public List<String> getParking() {
        return List.copyOf(parking);
    }

    public void addCar(String carId) {
        parking.push(carId);
        System.out.println(LocalDateTime.now() + "Αριθμός πινακίδας" + carId );
    }

    public String removeCar() {
        return parking.pop();
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}
