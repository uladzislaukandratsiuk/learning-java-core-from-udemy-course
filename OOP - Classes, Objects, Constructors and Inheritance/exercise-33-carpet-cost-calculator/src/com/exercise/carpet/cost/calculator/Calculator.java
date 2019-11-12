package com.exercise.carpet.cost.calculator;

public class Calculator {

    private Carpet carpet;
    private Floor floor;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}
