package com.directi.training.isp.exercise;

// ...existing code...
public class TimedDoor implements Lockable, Openable, TimeOutNotifiable {
    private boolean locked;
    private boolean open;

    @Override
    public void lock() {
        locked = true;
        System.out.println("TimedDoor locked");
    }

    @Override
    public void unlock() {
        locked = false;
        System.out.println("TimedDoor unlocked");
    }

    @Override
    public void open() {
        if (!locked) {
            open = true;
            System.out.println("TimedDoor opened");
        } else {
            System.out.println("TimedDoor cannot open while locked");
        }
    }

    @Override
    public void close() {
        open = false;
        System.out.println("TimedDoor closed");
    }

    @Override
    public void timeOutCallback() {
        // Example behavior: on timeout, close and lock
        System.out.println("Timeout -> closing and locking");
        close();
        lock();
    }
}