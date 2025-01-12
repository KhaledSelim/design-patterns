package com.example.designpatterns.structural.bridge;

public class EspressoSystem implements BrewingSystem {
    public void brew() {
        System.out.println("Brewing Espresso...");
    }
}