package com.example.designpatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        BrewingSystem espressoSystem = new EspressoSystem();
        CoffeeMachine advancedMachine = new AdvancedCoffeeMachine(espressoSystem);

        advancedMachine.makeCoffee(); // Advanced Coffee Machine: Brewing Espresso...

        BrewingSystem frenchPressSystem = new FrenchPressSystem();
        advancedMachine = new AdvancedCoffeeMachine(frenchPressSystem);

        advancedMachine.makeCoffee(); // Advanced Coffee Machine: Brewing French Press...
    }
}
