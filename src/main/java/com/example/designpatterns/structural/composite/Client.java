package com.example.designpatterns.structural.composite;

public class Client {
    public static void main(String[] args) {
        CoffeeComponent coffee1 = new SimpleCoffee();
        CoffeeComponent coffee2 = new SimpleCoffee();

        CoffeeGroup group = new CoffeeGroup();
        group.add(coffee1);
        group.add(coffee2);

        group.prepare();
        /*
         * Preparing a single coffee.
         * Preparing a single coffee.
         */
    }
}
