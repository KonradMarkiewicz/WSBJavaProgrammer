package com.wsb.creatures;

public class FarmAnimal extends Animal implements Eatable {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public boolean beEaten() {
        return false;
    }

    @Override
    public void feed() {

    }
}
