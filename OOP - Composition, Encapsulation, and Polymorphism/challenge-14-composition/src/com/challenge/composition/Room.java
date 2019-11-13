package com.challenge.composition;

public class Room {

    private double Area;
    private Lamp lamp;
    private Bed bed;

    public Room(double area, Lamp lamp, Bed bed) {
        Area = area;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Lamp getLightStatus() {
        return lamp;
    }

    public double getFreeRoomSpace() {
        return Area - (bed.getArea());
    }

    public double getArea() {
        return Area;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }
}
