package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    private final List<Car> carsDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault"));

    public Car getById(String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAll() {
        return carsDb;
    }
}