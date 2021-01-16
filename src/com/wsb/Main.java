package com.wsb;

import com.wsb.creatures.FarmAnimal;
import com.wsb.creatures.Pet;
import com.wsb.devices.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Phone nokia = new Phone(1999, "Nokia", "3310", 2.0);

        nokia.installAnApp("messenger");
        nokia.installAnApp("messenger", "2.3.1");
        nokia.installAnApp("messenger", "2.5.0", "appserver1.me.com");

        List<String> appNames = new ArrayList<>();
        appNames.add("messenger");
        appNames.add("facebook");
        appNames.add("cyberbug 2077");

        nokia.installAnApp(appNames);

        Car fiat = new LPG(2003, "Fiat", "Bravo", "gray", 5000.0);
        Car bmw = new Diesel(2003, "Fiat", "Bravo", "gray", 5000.0);
        Car tesla = new Electric(2003, "Fiat", "Bravo", "gray", 5000.0);

        fiat.refuel();
        bmw.refuel();
        tesla.refuel();

        try {
            URL urlAddress = new URL("https",
                    "defaultServer",
                    8080,
                    "gógl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
