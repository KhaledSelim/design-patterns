package com.example.designpatterns.creational.singleton;

public class CoffeeMachine {
    private static CoffeeMachine instance;

    private CoffeeMachine() {}

    public static synchronized CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }

    public void brewCoffee() {
        System.out.println("Brewing coffee...");
    }
}