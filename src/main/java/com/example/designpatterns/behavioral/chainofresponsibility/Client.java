package com.example.designpatterns.behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        CoffeeHandler espressoHandler = new EspressoHandler();
        CoffeeHandler latteHandler = new LatteHandler();

        espressoHandler.setNext(latteHandler);

        espressoHandler.handleRequest("Latte");     // Preparing Latte...
        espressoHandler.handleRequest("Espresso"); // Preparing Espresso...
        espressoHandler.handleRequest("Cappuccino"); // Request cannot be handled.
    }
}
