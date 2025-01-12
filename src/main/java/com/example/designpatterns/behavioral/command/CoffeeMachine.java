package com.example.designpatterns.behavioral.command;

public class CoffeeMachine {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
