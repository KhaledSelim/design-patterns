package com.example.designpatterns.creational.factorymethod;

public class LatteFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
}