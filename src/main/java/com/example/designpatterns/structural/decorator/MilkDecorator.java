package com.example.designpatterns.structural.decorator;

public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String prepare() {
        return coffee.prepare() + ", Milk";
    }
}