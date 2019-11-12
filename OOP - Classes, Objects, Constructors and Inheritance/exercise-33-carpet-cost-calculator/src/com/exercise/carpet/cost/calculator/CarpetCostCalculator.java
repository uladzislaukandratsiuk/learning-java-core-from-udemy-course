package com.exercise.carpet.cost.calculator;

public class CarpetCostCalculator {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(13.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total cost = " + calculator.getTotalCost());

        carpet = new Carpet(5.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("Total cost = " + calculator.getTotalCost());
    }
}
