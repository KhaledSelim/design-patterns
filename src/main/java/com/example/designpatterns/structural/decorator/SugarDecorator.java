package com.example.designpatterns.structural.decorator;

public class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String prepare() {
        return coffee.prepare() + ", Sugar";
    }
}