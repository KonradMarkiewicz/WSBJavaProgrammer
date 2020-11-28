package com.wsb.devices;

import com.wsb.creatures.Human;

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
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.cash == null || buyer.cash == null) {
            throw new Exception("Musisz zdefiniować stan konta");
        }
        if (seller.getCar() == null) {
            System.out.println("Sorry nie masz samochodu");
            throw new Exception("Brak samochodu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sorry nie masz tyle kasy");
            throw new Exception("Brak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);

        buyer.setCar(seller.getCar());
        seller.setCar(null);
        System.out.println("samochód sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
