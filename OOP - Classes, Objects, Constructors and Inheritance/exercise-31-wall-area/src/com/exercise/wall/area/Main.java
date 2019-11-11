package com.exercise.wall.area;

public class Main {

    public static void main(String[] args) {

        Wall wall = new Wall(3,4);

        System.out.println("Wall area = " + wall.getArea());

        wall.setHeight(-2);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("Wall area = " + wall.getArea());
    }
}
