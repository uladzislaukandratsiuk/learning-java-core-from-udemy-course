package com.challenge.regular.expressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String fistChallenge = "I want a bike.";

        System.out.println(fistChallenge.matches("I want a bike."));

        String secondChallenge = "I want a ball.";
        String regExp = "I want a b\\w+.";

        System.out.println(fistChallenge.matches(regExp));
        System.out.println(secondChallenge.matches(regExp));

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(fistChallenge);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(secondChallenge);
        System.out.println(matcher.matches());

        String thirdChallenge = "Replace all blanks with underscores.";
        System.out.println(thirdChallenge.replaceAll("\\s", "_"));

        String fourthChallenge = "aaaaabccccccccccccddddefffg";
        System.out.println(fourthChallenge.matches("(a+bc+d+ef+g)"));
        System.out.println(fourthChallenge.matches("[a-g]+"));
        System.out.println(fourthChallenge.matches("(a{5}bc{12}d{4}ef{3}g)"));

        String fifthChallenge = "nvsdj.643";
        System.out.println(fifthChallenge.matches("^\\w+\\.\\d+$"));
        System.out.println(fifthChallenge.matches("([A-z][a-z]+\\.[0-9]+)"));
    }
}
