package com.example.designpatterns.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        CoffeeOrder originalOrder = new CoffeeOrder("Espresso");
        originalOrder.serve(); // Serving Espresso

        CoffeeOrder clonedOrder = originalOrder.clone();
        clonedOrder.setCoffeeType("Latte");
        clonedOrder.serve(); // Serving Latte
    }
}
