package com.example.designpatterns.behavioral.state;

public class BrewingState implements CoffeeMachineState {
    public void handle() {
        System.out.println("Coffee Machine is brewing coffee...");
    }
}