package com.example.function;

import com.example.predicate.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student ann = new Student("Ann Smith", 1);
        Student eryn = new Student("Eryn Martin", 2);
        Student bob = new Student("Bob Johnson", 2);
        Student phil = new Student("Phil Williams", 4);
        Student greg = new Student("Greg Jones", 3);
        Student alex = new Student("Alex Davis", 5);

        List<Student> students = new ArrayList<>();
        students.add(ann);
        students.add(eryn);
        students.add(bob);
        students.add(phil);
        students.add(greg);
        students.add(alex);

        students.forEach(student -> {
            String firstName = student.getName().substring(0, student.getName().indexOf(' '));
            System.out.println("First name: " + firstName);
        });

        students.forEach(student -> {
            String lastName = student.getName().substring(student.getName().indexOf(' ') + 1);
            System.out.println("Last name: " + lastName);
        });
    }
}
