package com.wsb.devices;

import com.wsb.creatures.Human;

public interface Saleable {
    public void sell(Human seller, Human buyer, Double price) throws Exception;

}
