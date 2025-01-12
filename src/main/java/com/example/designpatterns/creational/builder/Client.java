package com.example.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder.Builder()
                .coffeeType("Latte")
                .milkType("Steamed Milk")
                .sugar(true)
                .build();

        order.serve(); // Serving Latte with Steamed Milk and sugar.
    }
}
