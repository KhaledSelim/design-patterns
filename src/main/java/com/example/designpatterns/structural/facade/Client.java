package com.example.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        CoffeeFacade facade = new CoffeeFacade();
        facade.makeCoffee();
        /*
         * Grinding beans...
         * Heating water...
         * Brewing coffee...
         */
    }
}
