package com.example.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);

        System.out.println(basicCoffee.prepare());       // Basic Coffee
        System.out.println(milkCoffee.prepare());        // Basic Coffee, Milk
        System.out.println(milkSugarCoffee.prepare());   // Basic Coffee, Milk, Sugar
    }
}
