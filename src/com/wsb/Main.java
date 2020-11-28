package com.wsb;

import com.wsb.creatures.Animal;
import com.wsb.creatures.Human;
import com.wsb.devices.Car;
import com.wsb.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();

        Animal pet = new Animal("cat");
        human.pet = pet;
        while (pet.isAlive) {
            pet.takeForAWalk();
            pet.feed(0.5);
        }

        Car fiat = new Car(2003, "Fiat", "Bravo", "gray", 10000.0);
        System.out.println("\n" + fiat.producer + " " + fiat.model + " " + fiat.yearOfProduction + "\n" + fiat.color + " " + fiat.value + " PLN" + "\n");

        Phone phone = new Phone(1999, "Nokia", "3310", 2.0);

//        human.getSalary();
//        human.setSalary(10000.0);
//        human.getSalary();
//
//        human.setCar(fiat);
//
//        System.out.println(human.getCar());
//
//        System.out.println(fiat);
//        System.out.println(pet);
//        System.out.println(phone);
//
//        System.out.println(human instanceof Human);
//        System.out.println(human instanceof Animal);

        System.out.println(phone);
        System.out.println(fiat);
    }
}
