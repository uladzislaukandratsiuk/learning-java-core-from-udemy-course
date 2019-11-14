package com.challenge.encapsulation;

public class Main {

    public static void main(String[] args) {

        Printer printerHP = new Printer(50, 0,true);

        System.out.println("Toner level = " + printerHP.getTonerLevel() + "%");

        printerHP.fillUpTonerAsAPercentage(30);

        printerHP.printPages(5321);

    }
}
