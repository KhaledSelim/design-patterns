package com.example.designpatterns.combine.facadestrategy;

public class EspressoBrewStrategy implements BrewStrategy {
    public void brew() {
        System.out.println("Brewing Espresso...");
    }
}