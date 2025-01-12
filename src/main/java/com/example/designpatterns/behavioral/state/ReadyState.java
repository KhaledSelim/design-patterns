package com.example.designpatterns.behavioral.state;

public class ReadyState implements CoffeeMachineState {
    public void handle() {
        System.out.println("Coffee Machine is ready to brew.");
    }
}