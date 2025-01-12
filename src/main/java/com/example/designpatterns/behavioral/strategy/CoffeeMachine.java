package com.example.designpatterns.behavioral.strategy;

public class CoffeeMachine {

    private BrewStrategy strategy;

    public void setBrewStrategy(BrewStrategy strategy) {
        this.strategy = strategy;
    }

    public void brewCoffee() {
        strategy.brew();
    }
}
