package com.example.designpatterns.behavioral.state;

public class CoffeeMachine {
    private CoffeeMachineState state;

    public void setState(CoffeeMachineState state) {
        this.state = state;
    }

    public void pressButton() {
        state.handle();
    }
}
