package com.challenge.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

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

        Function<String, String> everySecondChar = s -> {
            StringBuilder returnValue = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    returnValue.append(s.charAt(i));
                }
            }
            return returnValue.toString();
        };

        System.out.println(everySecondCharacter(everySecondChar, "e0v1e2r3y4s5e6c7o8n9d"));

        Supplier<String> iLoveJava = () -> "I love java";
        System.out.println(iLoveJava.get());

        List<String> topNames2015 = Arrays.asList(
                "A==============",
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob",
                "W=============="
        );

        topNames2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase().concat(name.substring(1)))
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }

    public static String everySecondCharacter(Function<String, String> function, String source){
        return function.apply(source);
    }
}
