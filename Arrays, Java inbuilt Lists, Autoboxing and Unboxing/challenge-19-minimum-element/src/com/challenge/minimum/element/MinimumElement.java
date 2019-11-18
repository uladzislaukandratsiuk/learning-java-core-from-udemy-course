package com.challenge.minimum.element;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter array capacity:\r");

        int capacity = scanner.nextInt();

        int[] integersArray = readIntegers(capacity);

        System.out.println("Integers Array = " + Arrays.toString(integersArray));
        System.out.println("Minimum Element = " + findMinimumElement(integersArray));

    }

    private static int[] readIntegers(int capacity) {

        int[] tempArray = new int[capacity];

        System.out.println("Enter " + capacity + " integer numbers:\r");

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = scanner.nextInt();
        }

        return tempArray;
    }

    private static int findMinimumElement(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

}
