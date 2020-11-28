package com.wsb.devices;

public class Phone extends Device {
    String model;
    Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }
}
