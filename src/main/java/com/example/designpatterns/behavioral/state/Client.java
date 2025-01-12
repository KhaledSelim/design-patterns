package com.example.designpatterns.behavioral.state;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        CoffeeMachineState readyState = new ReadyState();
        CoffeeMachineState brewingState = new BrewingState();

        machine.setState(readyState);
        machine.pressButton(); // Coffee Machine is ready to brew.

        machine.setState(brewingState);
        machine.pressButton(); // Coffee Machine is brewing coffee...
    }
}
