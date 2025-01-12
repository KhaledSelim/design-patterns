package com.example.designpatterns.structural.facade;

public class CoffeeFacade {

    private CoffeeMaker coffeeMaker = new CoffeeMaker();

    public void makeCoffee() {
        coffeeMaker.grindBeans();
        coffeeMaker.heatWater();
        coffeeMaker.brew();
    }
}
