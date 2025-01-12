package com.example.designpatterns.creational.builder;

public class CoffeeOrder {
    private String coffeeType;
    private String milkType;
    private boolean sugar;

    private CoffeeOrder(Builder builder) {
        this.coffeeType = builder.coffeeType;
        this.milkType = builder.milkType;
        this.sugar = builder.sugar;
    }

    public static class Builder {
        private String coffeeType;
        private String milkType;
        private boolean sugar;

        public Builder coffeeType(String coffeeType) {
            this.coffeeType = coffeeType;
            return this;
        }

        public Builder milkType(String milkType) {
            this.milkType = milkType;
            return this;
        }

        public Builder sugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public CoffeeOrder build() {
            return new CoffeeOrder(this);
        }
    }

    public void serve() {
        System.out.println("Serving " + coffeeType + " with " + milkType + (sugar ? " and sugar." : "."));
    }
}
