package com.example.designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new CoffeeMachineAdapter(new NewCoffeeMachine());

        oldMachine.selectA(); // Espresso selected.
        oldMachine.selectB(); // Cappuccino selected.
    }
}
