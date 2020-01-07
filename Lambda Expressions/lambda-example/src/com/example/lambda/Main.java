package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Runnable() -> Runnable example")).start();

        Student bob = new Student("Bob");
        Student phil = new Student("Phil");
        Student greg = new Student("Greg");
        Student alex = new Student("Alex");

        List<Student> students = new ArrayList<>();
        students.add(bob);
        students.add(phil);
        students.add(greg);
        students.add(alex);

        students.sort(Comparator.comparing(Student::getName));

        for (Student student : students) {
            System.out.println(student.getName());
        }

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() +  s2.toUpperCase();
        String sillyString = doStringStuff(uc, students.get(0).getName(), students.get(1).getName());
        System.out.println("UpperConcat() -> " + sillyString);
    }

    public static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}
