package com.example.designpatterns.creational.abstractfactory;

public class Client {

    public static void main(String[] args) {
        // Create an Espresso Factory
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        Cup smallCup = espressoFactory.createCup();

        espresso.prepare();
        smallCup.getSize();

        // Create a Latte Factory
        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        Cup largeCup = latteFactory.createCup();

        latte.prepare();
        largeCup.getSize();
    }
}
