package com.challenge.full.oop;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;

    private double basePrice;

    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;

    public Hamburger() {
        this("Hamburger", "White bread","Ground beef", 2.45,
                false,false,false,false,false);
    }

    public Hamburger(String name, String breadRollType, String meat, double basePrice,
                     boolean cheese, boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
    }

    public double calculateAdditionalPrice() {

        if (!this.cheese && !this.lettuce && !this.tomato && !this.carrot && !this.onion) {
            return 0;
        }

        double tempPrice = 0;

        if (this.cheese) {
            tempPrice += 0.86;
        }
        if (this.lettuce) {
            tempPrice += 0.22;
        }
        if (this.tomato) {
            tempPrice += 0.27;
        }
        if (this.carrot) {
            tempPrice  += 0.31;
        }
        if (this.onion) {
            tempPrice  += 0.25;
        }

        return tempPrice;
    }

    public double calculateTotalPrice() {
        return this.basePrice + calculateAdditionalPrice();
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
