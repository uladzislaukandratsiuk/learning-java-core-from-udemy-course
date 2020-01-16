package com.challenge.regular.expressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String fistChallenge = "I want a bike.";

        System.out.println(fistChallenge.matches("I want a bike\\."));

        String secondChallenge = "I want a ball.";
        String regExp = "I want a b\\w+\\.";

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

        String sixthChallenge = "nvsdj.643sf.41fng.dsf52dsv.142";
        System.out.println(sixthChallenge.replaceAll("\\D"," ")
                .replaceAll("^\\s+", "")
                .replaceAll("\\s+", " "));

        Pattern sixthPattern = Pattern.compile("(\\d+)");
        Matcher sixthMatcher = sixthPattern.matcher(sixthChallenge);

        while (sixthMatcher.find()) {
            System.out.print(sixthMatcher.group() + " ");
        }

        System.out.println();

        String seventhChallenge = "nvsdj.643\tsf.41\tfng.ds52dsv.142\n";

        Pattern seventhPattern = Pattern.compile("[\\w]+\\.([?\\w]*\\d+[?\\w]*\\.)\\s");
        Matcher seventhMatcher = seventhPattern.matcher(seventhChallenge);

        while (seventhMatcher.find()) {
            System.out.print(seventhMatcher.group(1) + " ");
        }

        String eighthChallenge = "nvsdj.643\tsf.41\tfng.ds52dsv.142\n";

        Pattern eighthPattern = Pattern.compile("\\d+");
        Matcher eighthMatcher = eighthPattern.matcher(eighthChallenge);

        int count = 0;
        while (eighthMatcher.find()) {
            count++;
            System.out.print("count = " + count + " number = " + eighthMatcher.group()
                    + " start = " + eighthMatcher.start()
                    + " end = " + eighthMatcher.end() + "\n");
        }

        String ninthChallenge = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y], {z, c}, {13, 2}";

        Pattern ninthPattern = Pattern.compile("\\{(\\d+, \\d+)}");
        Matcher ninthMatcher = ninthPattern.matcher(ninthChallenge);

        while (ninthMatcher.find()) {
            System.out.print(ninthMatcher.group(1) + "\n");
        }
    }
}
