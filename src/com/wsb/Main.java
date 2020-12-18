package com.wsb;

import com.wsb.creatures.Animal;
import com.wsb.creatures.Human;
import com.wsb.devices.Car;
import com.wsb.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("John", "Doe");

//        Animal pet = new Animal("cat");
//        me.pet = pet;
//        while (pet.isAlive) {
//            pet.takeForAWalk();
//            pet.feed(0.5);
//        }

        Car fiat = new Car(2003, "Fiat", "Bravo", "gray", 5000.0);
//        System.out.println("\n" + fiat.producer + " " + fiat.model + " " + fiat.yearOfProduction + "\n" + fiat.color + " " + fiat.value + " PLN" + "\n");

        Phone nokia = new Phone(1999, "Nokia", "3310", 2.0);

//        me.getSalary();
//        me.setSalary(10000.0);
//        me.getSalary();
//        me.setCar(fiat);
//
//        System.out.println(me.getCar());
//
//        System.out.println(fiat);
//        System.out.println(pet);
//        System.out.println(phone);
//
//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Animal);
//
//        System.out.println(phone);
//        System.out.println(fiat);

        me.phone = nokia;
        me.setSalary(10000.0);
        me.setCash(10000.0);
        me.setCar(fiat);

        Human brotherInLaw = new Human("Tom", "Jones");
        brotherInLaw.setCash(3000.0);

        try {
            nokia.sell(me, brotherInLaw, 50.0);
        } catch (Exception e) {
            System.out.println("Sorry, nie udało się sprzedać");
            System.out.println(e.getMessage());
        }

        try {
            fiat.sell(me, brotherInLaw, 1000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
