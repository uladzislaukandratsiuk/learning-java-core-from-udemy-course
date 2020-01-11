package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        Stream<String> acSeats = Stream.of("A41", "A42", "A12", "A26", "C45", "C21");
        Stream<String> bcSeats = Stream.of("B26", "B29", "B42", "C45", "C21", "C52", "C16");
        Stream<String> concatStream = Stream.concat(acSeats, bcSeats);

        System.out.println("=====================");

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
    }
}
