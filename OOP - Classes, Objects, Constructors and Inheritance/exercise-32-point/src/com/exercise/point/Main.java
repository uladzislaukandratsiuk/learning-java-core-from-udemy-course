package com.exercise.point;

public class Main {

    public static void main(String[] args) {

        Point firstPoint = new Point(6, 5);
        Point secondPoint = new Point(3, 1);

        System.out.println("distance(0,0) = " + firstPoint.distance());
        System.out.println("distance(second) = " + firstPoint.distance(secondPoint));
        System.out.println("distance(2,2) = " + firstPoint.distance(2,2));

        Point thirdPoint = new Point();

        System.out.println("distance() = " + thirdPoint.distance());
    }
}
