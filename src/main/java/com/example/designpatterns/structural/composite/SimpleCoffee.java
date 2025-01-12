package com.example.designpatterns.structural.composite;

public class SimpleCoffee implements CoffeeComponent {
    public void prepare() {
        System.out.println("Preparing a single coffee.");
    }
}