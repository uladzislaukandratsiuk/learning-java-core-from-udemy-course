package com.challenge.full.oop;

public class HealthyBurger extends Hamburger {

    private boolean flaxSeeds;
    private boolean basil;
    private boolean parsley;


    public HealthyBurger(boolean cheese, boolean lettuce, boolean tomato, boolean carrot, boolean onion,
                        boolean flaxSeeds, boolean basil, boolean parsley) {
        super("Healthy burger","Brown rye bread roll", "Ground turkey + ground beef",
                2.87, cheese, lettuce, tomato, carrot, onion);
        this.flaxSeeds = flaxSeeds;
        this.basil = basil;
        this.parsley = parsley;
    }

    @Override
    public double calculateAdditionalPrice() {

        if (!this.flaxSeeds && !this.basil && !this.parsley) {
            return super.calculateAdditionalPrice();
        }

        double tempAdditionalPrice = 0;

        if (this.flaxSeeds) {
            tempAdditionalPrice += 0.53;
        }
        if (this.basil) {
            tempAdditionalPrice += 0.42;
        }
        if (this.parsley) {
            tempAdditionalPrice += 0.31;
        }

        tempAdditionalPrice += super.calculateAdditionalPrice();

        return tempAdditionalPrice;
    }

    @Override
    public double calculateTotalPrice() {
        return this.getBasePrice() + calculateAdditionalPrice();
    }
}
