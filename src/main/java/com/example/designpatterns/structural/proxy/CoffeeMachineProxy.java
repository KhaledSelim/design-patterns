package com.example.designpatterns.structural.proxy;

public class CoffeeMachineProxy implements CoffeeMachine {
    private RealCoffeeMachine coffeeMachine;
    private boolean hasAccess;

    public CoffeeMachineProxy(boolean hasAccess) {
        this.hasAccess = hasAccess;
        this.coffeeMachine = new RealCoffeeMachine();
    }

    public void brewCoffee() {
        if (hasAccess) {
            coffeeMachine.brewCoffee();
        } else {
            System.out.println("Access denied! You cannot use the coffee machine.");
        }
    }
}
