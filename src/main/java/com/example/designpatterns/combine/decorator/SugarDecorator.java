package com.example.designpatterns.combine.decorator;

public class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String prepare() {
        return coffee.prepare() + ", Sugar";
    }

    public double cost() {
        return coffee.cost() + 0.2;
    }
}