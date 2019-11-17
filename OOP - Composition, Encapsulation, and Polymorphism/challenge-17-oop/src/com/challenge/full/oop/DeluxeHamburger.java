package com.challenge.full.oop;

public class DeluxeHamburger extends Hamburger {

    private boolean chips;
    private boolean drinks;

    public DeluxeHamburger(boolean cheese, boolean lettuce, boolean tomato, boolean carrot, boolean onion,
                           boolean chips, boolean drinks) {
        super("Deluxe hamburger","Sesame Seed Bun", "Ground beef + egg", 4.87,
                cheese, lettuce, tomato, carrot, onion );
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public double calculateAdditionalPrice() {

        double tempAdditionalPrice = 0;

        if (this.chips) {
            tempAdditionalPrice += 1.57;
        }
        if (this.drinks) {
            tempAdditionalPrice += 1.89;
        }

        return tempAdditionalPrice;
    }

    @Override
    public double calculateTotalPrice() {
        return  this.getBasePrice() + calculateAdditionalPrice();
    }
}
