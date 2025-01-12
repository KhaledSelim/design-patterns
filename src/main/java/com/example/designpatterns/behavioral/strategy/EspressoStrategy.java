package com.example.designpatterns.behavioral.strategy;

public class EspressoStrategy implements BrewStrategy {
    public void brew() {
        System.out.println("Brewing Espresso...");
    }
}