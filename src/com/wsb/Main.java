package com.wsb;

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
        System.out.println("\n" + fiat.producer + " " + fiat.model + " " + fiat.yearOfProduction + "\n" + fiat.color + " " + fiat.value + " PLN");
        human.car = fiat;
    }
}
