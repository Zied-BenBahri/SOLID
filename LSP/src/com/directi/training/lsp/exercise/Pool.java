package com.directi.training.lsp.exercise;

// ...existing code...
public class Pool {
    public static void main(String[] args) {
        new Pool().run();
    }

    public void run() {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck(); // off by default, still safe

        IDuck[] ducks = new IDuck[] { donaldDuck, electricDuck };

        quack(ducks);
        swim(ducks);

        // Optional: show powered-on behavior still works
        ((ElectronicDuck) electricDuck).turnOn();
        quack(ducks);
        swim(ducks);
    }

    private void quack(IDuck[] ducks) {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(IDuck[] ducks) {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }
}