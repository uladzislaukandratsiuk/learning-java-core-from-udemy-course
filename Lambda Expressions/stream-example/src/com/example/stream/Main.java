package com.example.stream;

import com.example.predicate.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

        Student ann = new Student("Ann", 1);
        Student eryn = new Student("Eryn", 2);
        Student bob = new Student("Bob", 2);
        Student phil = new Student("Phil", 4);
        Student greg = new Student("Greg", 3);
        Student alex = new Student("Alex", 5);

        Faculty computerScience = new Faculty("Computer science");
        computerScience.addStudent(ann);
        computerScience.addStudent(bob);
        computerScience.addStudent(phil);
        computerScience.addStudent(greg);

        Faculty informationSystems = new Faculty("Information systems");
        informationSystems.addStudent(eryn);
        informationSystems.addStudent(alex);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(computerScience);
        faculties.add(informationSystems);

        System.out.println("===Student from two faculties====");

        faculties.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .forEach(System.out::println);

        List<String> sortedBSeats = theatreSeats
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("B"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println("=====sortedBSeats====");

        for(String s : sortedBSeats) {
            System.out.println(s);
        }

        Map<Integer, List<Student>> groupedByCourse = faculties.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .collect(Collectors.groupingBy(Student::getCourse));

        System.out.println("==students groupedByCourse====");

        for(List<Student> student : groupedByCourse.values()) {
            System.out.println(student);
        }

        System.out.println("==student with lower number course====");

        faculties.stream()
                .flatMap(faculty -> faculty.getStudents().stream())
                .reduce((e1, e2) -> e1.getCourse() < e2.getCourse() ? e1 : e2)
                .ifPresent(System.out::println);
    }
}
