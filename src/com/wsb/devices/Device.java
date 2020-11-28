package com.wsb.devices;

public class Device {
    public Integer yearOfProduction;
    public String producer;
    public String model;

    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }
}


