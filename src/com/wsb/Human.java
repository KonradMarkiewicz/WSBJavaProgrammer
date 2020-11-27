package com.wsb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Double salary;
    private Car car;

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
            System.out.println("Nowe wynagrodzenie to: " + newSalary);
            this.salary = newSalary;
        }
    }

    public Car getCar() {
        System.out.println("Pobrałem dane samochodu");
        return car;
    }

    public void setCar(Car car) {
        if (salary > car.getCarValue()) {
            System.out.println("Udało się kupić za gotówkę");
            this.car = car;
        } else if (salary > car.getCarValue() / 12) {
            System.out.println("Udało się kupić na kredyt ");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

}
