package com.example.designpatterns.behavioral.chainofresponsibility;

public abstract class CoffeeHandler {
    protected CoffeeHandler next;

    public void setNext(CoffeeHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
