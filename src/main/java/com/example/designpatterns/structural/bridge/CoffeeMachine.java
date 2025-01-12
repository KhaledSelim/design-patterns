package com.example.designpatterns.structural.bridge;

public abstract class CoffeeMachine {

    protected BrewingSystem brewingSystem;

    public CoffeeMachine(BrewingSystem brewingSystem) {
        this.brewingSystem = brewingSystem;
    }

    public abstract void makeCoffee();
}
