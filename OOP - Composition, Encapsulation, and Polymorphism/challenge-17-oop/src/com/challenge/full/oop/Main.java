package com.challenge.full.oop;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat formatter = new DecimalFormat("#0.00");

        for (int hamburgerNumber = 1; hamburgerNumber <= 4; hamburgerNumber++) {
            Hamburger hamburger = testHamburger(hamburgerNumber);
            System.out.println("Test hamburger #" + hamburgerNumber + ": \n" + hamburger.getName() + "\n"
                    + hamburger.getMeat() + "\n" + hamburger.getBreadRollType() + "\n"
                    + "Base price: " + formatter.format(hamburger.getBasePrice()) + "\n"
                    + "Additional price: " + formatter.format(hamburger.calculateAdditionalPrice()) + "\n"
                    + "Total price: " + formatter.format(hamburger.calculateTotalPrice())+ "\n");
        }
    }

    public static Hamburger testHamburger(int hamburgerNumber) {

        switch (hamburgerNumber) {
            case 1:
                return new Hamburger();

            case 2:
                return new Hamburger("Hamburger with additions","Sesame Seed Bun",
                        "Ground beef", 2.57, true, false, true, false,
                        true);

            case 3:
                return new HealthyBurger(true,false,true,false,true,
                        true, false, true);

            case 4:
                return new DeluxeHamburger(false,true,true,false,true,
                        true, true);
        }

        return null;
    }
}
