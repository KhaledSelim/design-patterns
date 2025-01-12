package com.example.designpatterns.behavioral.templatemethod;

public class Latte extends CoffeeTemplate {
    protected void addCoffee() {
        System.out.println("Adding espresso shot...");
    }

    protected void addExtras() {
        System.out.println("Adding steamed milk...");
    }
}