package com.example.designpatterns.structural.bridge;

public class FrenchPressSystem implements BrewingSystem {
    public void brew() {
        System.out.println("Brewing French Press...");
    }
}