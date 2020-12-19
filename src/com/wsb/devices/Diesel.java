package com.wsb.devices;

public class Diesel extends Car {
    public Diesel(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("tankuję diesla");
    }
}
