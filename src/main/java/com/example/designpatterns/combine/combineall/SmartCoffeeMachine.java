package com.example.designpatterns.combine.combineall;

import com.example.designpatterns.combine.decorator.BasicCoffee;
import com.example.designpatterns.combine.decorator.Coffee;
import com.example.designpatterns.combine.decorator.MilkDecorator;
import com.example.designpatterns.combine.decorator.SugarDecorator;
import com.example.designpatterns.combine.facadestrategy.CoffeeMachineFacade;
import com.example.designpatterns.combine.facadestrategy.EspressoBrewStrategy;
import com.example.designpatterns.combine.observer.CoffeeNotifier;
import com.example.designpatterns.combine.observer.Customer;

public class SmartCoffeeMachine {

    public static void main(String[] args) {
        // Create facade and strategy
        CoffeeMachineFacade coffeeMachine = new CoffeeMachineFacade();
        coffeeMachine.setBrewStrategy(new EspressoBrewStrategy());

        // Decorate coffee
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        // Observer for notification
        CoffeeNotifier notifier = new CoffeeNotifier();
        notifier.addObserver(new Customer("Alice"));
        notifier.addObserver(new Customer("Bob"));

        // Make coffee
        System.out.println("Preparing: " + coffee.prepare());
        System.out.println("Cost: $" + coffee.cost());
        coffeeMachine.makeCoffee();

        // Notify customers
        notifier.notifyObservers("Your coffee is ready!");
    }
}
