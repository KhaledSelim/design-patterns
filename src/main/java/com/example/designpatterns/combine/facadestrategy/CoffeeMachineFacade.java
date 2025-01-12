package com.example.designpatterns.combine.facadestrategy;

public class CoffeeMachineFacade {

    private Grinder grinder = new Grinder();
    private Heater heater = new Heater();
    private BrewStrategy brewStrategy;

    public void setBrewStrategy(BrewStrategy strategy) {
        this.brewStrategy = strategy;
    }

    public void makeCoffee() {
        grinder.grindBeans();
        heater.heatWater();
        if (brewStrategy != null) {
            brewStrategy.brew();
        } else {
            System.out.println("No brewing strategy selected.");
        }
    }
}
