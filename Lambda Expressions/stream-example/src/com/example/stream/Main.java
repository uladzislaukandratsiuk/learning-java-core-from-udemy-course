package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> theatreSeats = Arrays.asList(
                "A41", "A42", "A12", "A26", "A29",
                "B12", "b61", "B35", "B26", "B29", "b56", "B42",
                "C45", "C62", "C52", "C16", "C21", "C76");

       theatreSeats
               .stream()
               .map(String::toUpperCase)
               .filter(s -> s.startsWith("B"))
               .sorted()
               .forEach(System.out::println);
    }
}
