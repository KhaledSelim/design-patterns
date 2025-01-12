package com.example.designpatterns.behavioral.command;

public class BrewLatteCommand implements Command {
    public void execute() {
        System.out.println("Brewing Latte...");
    }
}