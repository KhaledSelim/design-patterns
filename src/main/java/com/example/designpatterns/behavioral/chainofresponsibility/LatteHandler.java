package com.example.designpatterns.behavioral.chainofresponsibility;

public class LatteHandler extends CoffeeHandler {
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("Latte")) {
            System.out.println("Preparing Latte...");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}
