package com.example.designpatterns.structural.facade;

public class CoffeeMaker {

    public void grindBeans() {
        System.out.println("Grinding beans...");
    }
    public void heatWater() {
        System.out.println("Heating water...");
    }
    public void brew() {
        System.out.println("Brewing coffee...");
    }
}
