package com.example.designpatterns.behavioral.observer;

public class Customer implements Observer {
    public void update(String message) {
        System.out.println("Customer notified: " + message);
    }
}