package com.challenge.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Adam", "1278923");

        System.out.println(customer);
        saveObjectValues(customer);

        customer.setNumberPhone("4211212");
        System.out.println(customer);
        customer.setName("Phil");
        saveObjectValues(customer);

        Employee employee = new Employee("Greg", 12, 124.00);

        saveObjectValues(employee);

        showObjectValues(customer);

    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string of object value: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObjectValues(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.saveValues().size(); i++) {
            System.out.println("Saving " + objectToSave.saveValues().get(i) + " to storage device");
        }
    }

    public static void showObjectValues(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        System.out.println("Show values for an object that you write in the console");
        System.out.println(values);
        objectToLoad.showValues(values);
    }
}
