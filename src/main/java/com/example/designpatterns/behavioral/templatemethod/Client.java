package com.example.designpatterns.behavioral.templatemethod;

public class Client {
    public static void main(String[] args) {
        CoffeeTemplate espresso = new Espresso();
        espresso.makeCoffee();
        /*
         * Boiling water...
         * Adding espresso shot...
         * No extras added.
         * Serving coffee!
         */

        CoffeeTemplate latte = new Latte();
        latte.makeCoffee();
        /*
         * Boiling water...
         * Adding espresso shot...
         * Adding steamed milk...
         * Serving coffee!
         */
    }
}
