package com.challenge.array;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(6);

        int[] sortedArray = sortArray(array);

        printArray(sortedArray);
    }

    private static int[] sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current > array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        return array;
    }

    private static int[] getIntegers(int numberOfElements) {

        int [] tempArray = new int[numberOfElements];

        System.out.println("Enter " + numberOfElements + " numbers:\r");

        for (int i = 0; i < numberOfElements; i++) {
            tempArray[i] = scanner.nextInt();
        }

        return tempArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array element #" + i + " = " + array[i]);
        }
    }
}
