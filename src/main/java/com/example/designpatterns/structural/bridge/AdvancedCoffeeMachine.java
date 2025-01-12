package com.example.designpatterns.structural.bridge;

public class AdvancedCoffeeMachine extends CoffeeMachine {
    public AdvancedCoffeeMachine(BrewingSystem brewingSystem) {
        super(brewingSystem);
    }

    public void makeCoffee() {
        System.out.print("Advanced Coffee Machine: ");
        brewingSystem.brew();
    }
}