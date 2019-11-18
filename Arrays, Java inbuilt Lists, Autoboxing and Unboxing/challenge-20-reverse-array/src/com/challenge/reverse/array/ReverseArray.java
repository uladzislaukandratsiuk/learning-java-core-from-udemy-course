package com.challenge.reverse.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {12, 31, 41, 2, 5, 15};

        System.out.println("Array " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Reverse Array " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {

        int temp;
        int length = array.length;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}
