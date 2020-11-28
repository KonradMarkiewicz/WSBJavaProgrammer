package com.wsb.devices;

public abstract class Device {
    public Integer yearOfProduction;
    public String producer;
    public String model;

    public Device(Integer yearOfProduction, String producer, String model) {
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


