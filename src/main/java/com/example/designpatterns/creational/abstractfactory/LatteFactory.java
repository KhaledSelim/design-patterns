package com.example.designpatterns.creational.abstractfactory;

public class LatteFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
    public Cup createCup() {
        return new LargeCup();
    }
}