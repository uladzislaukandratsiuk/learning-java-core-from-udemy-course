package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> theatreSeats = Arrays.asList(
                "A41", "A42", "A12", "A26", "A29",
                "B12", "b61", "B35", "B26", "B29", "b56", "B42",
                "C45", "C62", "C52", "C16", "C21", "C76");

        List<String> bSeats = new ArrayList<>();

        theatreSeats.forEach(seat -> {
           if (seat.toUpperCase().startsWith("B")) {
                bSeats.add(seat);
           }
        });

        bSeats.sort((String s1, String s2) -> s1.compareTo(s2));
        bSeats.forEach((String s) -> System.out.println(s));
    }
}
