package com.example.designpatterns.creational.abstractfactory;

public class SmallCup implements Cup {
    public void getSize() {
        System.out.println("Small cup selected.");
    }
}