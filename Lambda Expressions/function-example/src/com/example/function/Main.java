package com.example.function;

import com.example.predicate.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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

        Function<Student, String> getFirstName = (student ->
                student.getName().substring(0, student.getName().indexOf(' ')));

        Function<Student, String> getLastName = (student ->
                student.getName().substring(student.getName().indexOf(' ') + 1));

        for (Student student : students) {
            System.out.format("First name: %s, Last Name: %s.\n",
                    getStudentName(getFirstName, student), getStudentName(getLastName, student));
        }
    }

    public static String getStudentName(Function<Student, String> getName, Student student) {
        return getName.apply(student);
    }
}
