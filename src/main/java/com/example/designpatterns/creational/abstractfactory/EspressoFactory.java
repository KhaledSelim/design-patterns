package com.example.designpatterns.creational.abstractfactory;

public class EspressoFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
    public Cup createCup() {
        return new SmallCup();
    }
}