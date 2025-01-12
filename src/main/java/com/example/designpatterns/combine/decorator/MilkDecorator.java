package com.example.designpatterns.combine.decorator;

public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String prepare() {
        return coffee.prepare() + ", Milk";
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }
}
