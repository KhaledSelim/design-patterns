package com.example.designpatterns.behavioral.templatemethod;

public class Espresso extends CoffeeTemplate {
    protected void addCoffee() {
        System.out.println("Adding espresso shot...");
    }

    protected void addExtras() {
        System.out.println("No extras added.");
    }
}