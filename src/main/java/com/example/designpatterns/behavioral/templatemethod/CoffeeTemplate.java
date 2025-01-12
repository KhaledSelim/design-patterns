package com.example.designpatterns.behavioral.templatemethod;

public abstract class CoffeeTemplate {
    public final void makeCoffee() {
        boilWater();
        addCoffee();
        addExtras();
        serve();
    }

    protected void boilWater() {
        System.out.println("Boiling water...");
    }

    protected abstract void addCoffee();

    protected abstract void addExtras();

    protected void serve() {
        System.out.println("Serving coffee!");
    }
}
