package com.directi.training.isp.exercise;

public class Timer {
    private final TimeOutNotifiable notifiable;

    public Timer(TimeOutNotifiable notifiable) {
        this.notifiable = notifiable;
    }

    public void trigger() {
        notifiable.timeOutCallback();
    }
}