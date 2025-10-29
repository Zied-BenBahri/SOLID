package com.directi.training.isp.exercise;

// ...existing code...
public class SensingDoor implements Lockable, Openable, ProximityNotifiable {
    private boolean locked;
    private boolean open;

    @Override
    public void lock() {
        locked = true;
        System.out.println("SensingDoor locked");
    }

    @Override
    public void unlock() {
        locked = false;
        System.out.println("SensingDoor unlocked");
    }

    @Override
    public void open() {
        if (!locked) {
            open = true;
            System.out.println("SensingDoor opened");
        } else {
            System.out.println("SensingDoor cannot open while locked");
        }
    }

    @Override
    public void close() {
        open = false;
        System.out.println("SensingDoor closed");
    }

    @Override
    public void proximityCallback() {
        // Example behavior: auto-open when someone is near
        System.out.println("Proximity detected -> auto opening");
        open();
    }
}
// ...existing code...