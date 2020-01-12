package com.challenge.lambda;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            String myString = "Let's split this string into an array";
            String[] words = myString.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        };

        new Thread(runnable).start();

        Function<String, String > everySecondChar = s -> {
            StringBuilder returnValue = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    returnValue.append(s.charAt(i));
                }
            }
            return returnValue.toString();
        };

        System.out.println(everySecondChar.apply("e0v1e2r3y4s5e6c7o8n9d"));
    }
}
