package com.wsb.devices;

public class Phone extends Device {

    public final Double screenSize;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("you should push the button");
        System.out.println("black screen");
        System.out.println("starting");
        System.out.println("hello");
        System.out.println("producer logo");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


}
