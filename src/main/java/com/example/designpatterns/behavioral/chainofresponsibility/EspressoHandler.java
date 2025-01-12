package com.example.designpatterns.behavioral.chainofresponsibility;

public class EspressoHandler extends CoffeeHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Espresso")) {
            System.out.println("Preparing Espresso...");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}