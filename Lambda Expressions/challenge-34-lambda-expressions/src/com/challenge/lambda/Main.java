package com.challenge.lambda;

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

        System.out.println(everySecondChar("e0v1e2r3y4s5e6c7o8n9d"));
    }

    public static String everySecondChar(String source) {
        StringBuilder returnValue = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 0) {
                returnValue.append(source.charAt(i));
            }
        }
        return returnValue.toString();
    }
}
