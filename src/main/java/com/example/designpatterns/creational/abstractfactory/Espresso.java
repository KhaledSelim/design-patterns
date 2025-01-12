package com.example.designpatterns.creational.abstractfactory;

public class Espresso implements Coffee {
    public void prepare() {
        System.out.println("Preparing Espresso...");
    }
}