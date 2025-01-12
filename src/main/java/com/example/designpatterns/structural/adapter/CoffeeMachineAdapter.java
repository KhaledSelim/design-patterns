package com.example.designpatterns.structural.adapter;

public class CoffeeMachineAdapter implements OldCoffeeMachine {
    private NewCoffeeMachine newMachine;

    public CoffeeMachineAdapter(NewCoffeeMachine newMachine) {
        this.newMachine = newMachine;
    }

    public void selectA() {
        newMachine.selectEspresso();
    }

    public void selectB() {
        newMachine.selectCappuccino();
    }
}