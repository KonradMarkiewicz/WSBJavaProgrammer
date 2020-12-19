package com.wsb.devices;

public class LPG extends Car {
    public LPG(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("tankuję LPG");
    }
}
