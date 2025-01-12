package com.example.designpatterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        Command espressoCommand = new BrewEspressoCommand();
        Command latteCommand = new BrewLatteCommand();

        machine.setCommand(espressoCommand);
        machine.pressButton(); // Brewing Espresso...

        machine.setCommand(latteCommand);
        machine.pressButton(); // Brewing Latte...
    }
}
