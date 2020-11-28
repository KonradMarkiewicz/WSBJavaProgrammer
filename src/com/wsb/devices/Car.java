package com.wsb.devices;

public class Car extends Device {
    public final String color;
    public Double value;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double value) {
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.value = value;
    }

    public Double getCarValue() {
        return value;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }
}
