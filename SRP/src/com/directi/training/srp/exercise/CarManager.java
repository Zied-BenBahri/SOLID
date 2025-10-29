package com.directi.training.srp.exercise;

//import java.util.Arrays;
//import java.util.List;

public class CarManager {
    // ...existing code...
    // Replaced in favor of repository + services
    // private List<Car> _carsDb = Arrays
    // .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla",
    // "Fiat"),
    // new Car("3", "Megane", "Renault"));
    // ...existing code...

    private final CarRepository repository;
    private final CarNameFormatter formatter;
    private final CarSelector selector;

    public CarManager() {
        this.repository = new CarRepository();
        this.formatter = new CarNameFormatter();
        this.selector = new CarSelector();
    }

    // Useful for tests/injection if needed
    public CarManager(CarRepository repository, CarNameFormatter formatter, CarSelector selector) {
        this.repository = repository;
        this.formatter = formatter;
        this.selector = selector;
    }

    public Car getFromDb(final String carId) {
        return repository.getById(carId);
    }

    public String getCarsNames() {
        return formatter.formatNames(repository.getAll());
    }

    public Car getBestCar() {
        return selector.selectBest(repository.getAll());
    }
}