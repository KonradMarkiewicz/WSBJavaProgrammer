package com.wsb.devices;

import com.wsb.creatures.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable {

    public static final String DEFAULT_APP_VERSION = "latest";
    public static final String DEFAULT_PROTOCOL = "app.protocol";
    public static final String DEFAULT_SERVER_NAME = "appserver.me.com";
    public final Double screenSize;

    public Phone(Integer yearOfProduction, String producer, String model, Double screenSize) {
        super(yearOfProduction, producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("you should push the button");
        System.out.println("black screen");
        System.out.println("starting");
        System.out.println("hello");
        System.out.println("producer logo");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
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
        if (seller.phone == null) {
            System.out.println("Sorry nie masz telefonu");
            throw new Exception("Brak telfonou");
        }
        if (buyer.getCash() < price) {
            System.out.println("Sorry nie masz tyle kasy");
            throw new Exception("Brak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("Telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);
    }

    public boolean installAnApp(String appName) {
        return installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public boolean installAnApp(String appName, String version) {
        return installAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public boolean installAnApp(String appName, String version, String server) {
        System.out.println("Zainstalowano " + appName + " w wersji " + version + " z serwera " + server);
        return true;
    }

    public boolean installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
        return true;
    }

    public boolean installAnApp(URL url) {
        return true;
    }
}
