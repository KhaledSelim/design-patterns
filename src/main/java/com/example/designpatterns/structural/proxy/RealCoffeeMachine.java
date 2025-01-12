package com.example.designpatterns.structural.proxy;

public class RealCoffeeMachine implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("Brewing coffee...");
    }
}