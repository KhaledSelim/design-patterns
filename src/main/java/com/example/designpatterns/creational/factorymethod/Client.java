package com.example.designpatterns.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new EspressoFactory();
        Coffee espresso = factory.createCoffee();
        espresso.prepare(); // Preparing Espresso...

        factory = new LatteFactory();
        Coffee latte = factory.createCoffee();
        latte.prepare(); // Preparing Latte...
    }
}
