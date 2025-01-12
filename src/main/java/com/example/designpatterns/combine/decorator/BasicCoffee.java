package com.example.designpatterns.combine.decorator;

public class BasicCoffee implements Coffee {
    public String prepare() {
        return "Basic Coffee";
    }

    public double cost() {
        return 2.0;
    }
}