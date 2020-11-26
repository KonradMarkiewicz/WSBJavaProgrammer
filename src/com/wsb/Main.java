package com.wsb;

public class Main {

    public static void main(String[] args) {

        Animal pet = new Animal("cat");

        while (pet.isAlive) {
            pet.takeForAWalk();
            pet.feed(0.5);
        }

    }
}
