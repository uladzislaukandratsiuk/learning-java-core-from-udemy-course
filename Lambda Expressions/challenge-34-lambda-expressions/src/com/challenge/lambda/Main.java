package com.challenge.lambda;

public class Main {

    public static void main(String[] args) {

       Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this string into an array";
                String[] words = myString.split(" ");
                for (String word: words) {
                    System.out.println(word);
                }
            }
        };
    }
}
