package com.example.designpatterns.creational.abstractfactory;

public class Latte implements Coffee {
    public void prepare() {
        System.out.println("Preparing Latte...");
    }
}