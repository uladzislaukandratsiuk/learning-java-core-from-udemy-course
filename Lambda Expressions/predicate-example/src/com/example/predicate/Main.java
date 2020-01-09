package com.example.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Student ann = new Student("Ann", 1);
        Student eryn = new Student("Eryn", 2);
        Student bob = new Student("Bob", 2);
        Student phil = new Student("Phil", 4);
        Student greg = new Student("Greg", 3);
        Student alex = new Student("Alex", 5);

        List<Student> students = new ArrayList<>();
        students.add(ann);
        students.add(eryn);
        students.add(bob);
        students.add(phil);
        students.add(greg);
        students.add(alex);

        printStudentByCourse(students, "Last courses students:", student -> student.getCourse() > 3);
        printStudentByCourse(students, "\nFirst courses students:", student -> student.getCourse() <= 3);
    }

    public static void printStudentByCourse(List<Student> students, String courseText,
                                            Predicate<Student> courseCondition) {
        System.out.println(courseText);
        for (Student student : students) {
            if (courseCondition.test(student)) {
                System.out.println(student.getName());
            }
        }
    }
}
