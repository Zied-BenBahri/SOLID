package com.directi.training.lsp.exercise;

// ...existing code...
public class ElectronicDuck implements IDuck {
    private boolean _on;

    public ElectronicDuck() {
        this(false);
    }

    public ElectronicDuck(boolean on) {
        _on = on;
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic quack...");
        } else {
            // LSP-safe behavior when off (no exception, benign output)
            System.out.println("(silent electronic duck)");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic swim...");
        } else {
            // LSP-safe behavior when off (no exception, benign output)
            System.out.println("(floating, powered off)");
        }
    }
}