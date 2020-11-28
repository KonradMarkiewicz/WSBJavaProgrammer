package com.wsb.creatures;

import java.io.File;

import static java.util.Locale.LanguageRange.MIN_WEIGHT;

public class Animal {
    final String species;
    public Boolean isAlive = true;
    String name;
    Double weight;
    File pic;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                weight = 5.0;
                break;
            case "cat":
                weight = 2.0;
                break;
            default:
//                System.out.println("No spiecies with that name in database!");
                break;
        }
    }

    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("\nIt's feeding time!");
            System.out.println("Your animal weight is = " + this.weight);
        } else {
            System.out.println("It's too late for feeding. Your animal is dead ;/");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("\nIt's time for a walk!");
            System.out.println("Your animal weight is = " + this.weight);
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
                System.out.println("Your animal died x.x");
            }
        }
    }

    public String toString() {
        return this.species + " " + this.weight;
    }
}
