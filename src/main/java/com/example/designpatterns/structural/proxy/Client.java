package com.example.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine proxyWithAccess = new CoffeeMachineProxy(true);
        proxyWithAccess.brewCoffee(); // Brewing coffee...

        CoffeeMachine proxyWithoutAccess = new CoffeeMachineProxy(false);
        proxyWithoutAccess.brewCoffee(); // Access denied! You cannot use the coffee machine.
    }
}
