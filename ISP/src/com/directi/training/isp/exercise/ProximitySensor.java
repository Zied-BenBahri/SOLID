package com.directi.training.isp.exercise;

public class ProximitySensor {
    private final ProximityNotifiable notifiable;

    public ProximitySensor(ProximityNotifiable notifiable) {
        this.notifiable = notifiable;
    }

    public void detect() {
        notifiable.proximityCallback();
    }
}