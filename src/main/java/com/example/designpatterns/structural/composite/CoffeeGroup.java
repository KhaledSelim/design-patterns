package com.example.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeGroup implements CoffeeComponent {
    private List<CoffeeComponent> coffeeComponents = new ArrayList<>();

    public void add(CoffeeComponent component) {
        coffeeComponents.add(component);
    }

    public void prepare() {
        for (CoffeeComponent component : coffeeComponents) {
            component.prepare();
        }
    }
}
