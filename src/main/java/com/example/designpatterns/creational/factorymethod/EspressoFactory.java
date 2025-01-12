package com.example.designpatterns.creational.factorymethod;

public class EspressoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}