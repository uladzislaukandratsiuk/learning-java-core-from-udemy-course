package com.exercise.person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(21);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());

        person.setLastName("Gilbert");
        person.setAge(17);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("is teen = " + person.isTeen());

        person.setFirstName("Bob");

        System.out.println("Full name = " + person.getFullName());
    }
}
