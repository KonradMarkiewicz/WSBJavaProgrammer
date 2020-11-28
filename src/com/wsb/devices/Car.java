package com.wsb.devices;

import java.io.Serializable;

public class Car extends Device implements Saleable, Serializable, Comparable {
    public String color;
    public Double value;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double value) {
        super(yearOfProduction, producer, model);
        this.color = color;
        this.value = value;
    }

    public Double getCarValue() {
        return value;
    }

    @Override
    public void turnOn() {
        System.out.println("key turned on");
        System.out.println("not working");
        System.out.println("key turned on");
        System.out.println("its working");
        System.out.println("engine started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


    @Override
    public void sell() {
        System.out.println("Sold!");
    }

    @Override
    public void sellOnCredit() {
        System.out.println("Sold on bank credit!");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
