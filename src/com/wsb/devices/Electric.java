package com.wsb.devices;

public class Electric extends Car {
    public Electric(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("ładuję ogniwa");
    }
}
