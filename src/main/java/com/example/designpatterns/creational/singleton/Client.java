package com.example.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine machine = CoffeeMachine.getInstance();
        machine.brewCoffee(); // Brewing coffee...
    }
}
