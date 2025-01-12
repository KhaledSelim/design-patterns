package com.example.designpatterns.creational.prototype;

public class CoffeeOrder implements Cloneable {
    private String coffeeType;

    public CoffeeOrder(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public void serve() {
        System.out.println("Serving " + coffeeType);
    }

    public CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }
}