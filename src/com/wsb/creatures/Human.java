package com.wsb.creatures;

import com.wsb.devices.Car;
import com.wsb.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human extends Animal {
    public Animal pet;
    public String firstName;
    public String lastName;
    public Double salary;
    public Phone phone;
    private Car car;
    public Double cash;

    public Human(String firstName, String lastName) {
        super("homo sapiens");
        this.cash = 0.0;
        this.salary = 0.0;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        if (cash != null) {
            this.cash = cash;
            System.out.println(this.firstName + " - Ustalam nowy stan konta na " + cash);
        } else {
            System.out.println("nie można mieć nieznaną liczbę gotówki");
        }

    }

    public Double getSalary() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Pobieram dane o wynagraodzeniu " + dtf.format(LocalDateTime.now()));
        return salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Podano: " + newSalary);
            System.out.println("Podana wartość jest nie poprawna!");
        } else {
            System.out.println("Zmiana wynagrodzenia");
            System.out.println("Aneks do odebrania w kadrach");
            System.out.println("Dane zostały wysłane do ZUS i US");
            System.out.println(this.firstName + " - Nowe wynagrodzenie to: " + newSalary);
            this.salary = newSalary;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        System.out.println(this.firstName + " - Próbuję kupić samochód");
        if (car == null) {
            this.car = null;
        } else {
            if (this.salary > car.getCarValue()) {
                System.out.println(this.firstName + " - Udało się kupić za gotówkę");
                this.car = car;
            } else if (this.salary > car.getCarValue() / 12) {
                System.out.println(this.firstName + " - Udało się kupić na kredyt ");
                this.car = car;
            } else {
                System.out.println(this.firstName + " - Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void feed() {

    }
}
