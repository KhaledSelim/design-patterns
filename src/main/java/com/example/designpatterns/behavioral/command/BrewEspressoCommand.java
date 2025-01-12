package com.example.designpatterns.behavioral.command;

public class BrewEspressoCommand implements Command {
    public void execute() {
        System.out.println("Brewing Espresso...");
    }
}
