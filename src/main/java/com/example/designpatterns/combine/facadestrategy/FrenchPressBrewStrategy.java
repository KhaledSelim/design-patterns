package com.example.designpatterns.combine.facadestrategy;

public class FrenchPressBrewStrategy implements BrewStrategy {
    public void brew() {
        System.out.println("Brewing French Press...");
    }
}