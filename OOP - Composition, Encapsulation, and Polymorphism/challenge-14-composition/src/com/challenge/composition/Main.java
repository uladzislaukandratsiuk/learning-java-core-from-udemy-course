package com.challenge.composition;

public class Main {

    public static void main(String[] args) {

        Bed theBed = new Bed("Wood", 0.95, 2, 2, 1, true);

        Lamp theLamp = new Lamp(true, 240);

        Room theRoom = new Room(12, theLamp, theBed);

        theRoom.getLightStatus().turnOnTurnOffLight();

        System.out.println("Free room space is " + theRoom.getFreeRoomSpace() + " square meters");
    }
}
