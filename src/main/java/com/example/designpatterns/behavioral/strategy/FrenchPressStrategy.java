package com.example.designpatterns.behavioral.strategy;

public class FrenchPressStrategy implements BrewStrategy {
    public void brew() {
        System.out.println("Brewing French Press...");
    }
}