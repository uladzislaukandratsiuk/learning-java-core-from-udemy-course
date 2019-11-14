package com.challenge.encapsulation;

public class Printer {

    private static final int FULL_TONER = 100;
    private static final int LOW_TONER = 2;
    private static final int NO_TONER = 0;
    private static final int NO_PAGES = 0;
    private static final double TONER_CONSUME_FOR_PAGE = 0.01;

    private double tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public Printer(double tonerLevel, int printedPages, boolean isDuplex) {
        if (tonerLevel >= NO_TONER && tonerLevel <= FULL_TONER) {
            this.tonerLevel = tonerLevel;
        }
        if (printedPages > NO_TONER) {
            this.printedPages += printedPages;
        }
        this.isDuplex = isDuplex;
    }

    public void fillUpTonerAsAPercentage(double toner) {

        double tonerToFillUpLeft;

        if (toner > NO_TONER && this.tonerLevel + toner >= FULL_TONER) {
            tonerToFillUpLeft = (this.tonerLevel + toner) - FULL_TONER;
            this.tonerLevel = FULL_TONER;
            System.out.println("Toner To Fill Up Left = " + tonerToFillUpLeft + "%");
        } else if (this.tonerLevel + toner < FULL_TONER) {
            this.tonerLevel += toner;
        } else {
            System.out.println("No need to fill up toner");
        }

        System.out.println("Current toner level = " + this.tonerLevel + "%");
    }

    public void printPages(int pages) {

        if (this.tonerLevel > NO_TONER && pages > NO_PAGES) {
            useToner(pages);
            this.printedPages += pages;
            System.out.println("Printed pages = " + this.printedPages);

        } else {
            System.out.println("Check toner level! Valid pages must be greater then zero!");
        }
    }

    private void useToner(int pages) {

        while (pages > NO_PAGES) {
            if (this.tonerLevel > LOW_TONER) {
                if (this.isDuplex) {
                    this.tonerLevel -= 2 * (TONER_CONSUME_FOR_PAGE);
                } else {
                    this.tonerLevel -= TONER_CONSUME_FOR_PAGE;
                }
                pages--;
            } else {
                this.printedPages -= pages;
                System.out.println("Need to fill up toner!");
                System.out.println("Current toner level = " + this.tonerLevel + "%");
                break;
            }
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
