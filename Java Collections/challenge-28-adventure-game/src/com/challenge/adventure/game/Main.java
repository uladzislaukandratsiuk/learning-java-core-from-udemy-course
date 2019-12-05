package com.challenge.adventure.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,
                "You are sitting in front of a computer learning Java", null));

        Map<String, Integer> tempExits = new HashMap<>();
        tempExits.put("W", 2);
        tempExits.put("E", 3);
        tempExits.put("S", 4);
        tempExits.put("N", 5);
        locations.put(1, new Location(1,
                "You are standing at the end of a road before a small brick building", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 5);
        locations.put(2, new Location(2,
                "You are at the top of a hill", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("W", 1);
        locations.put(3, new Location(3,
                "You are inside a building, a well house for a small spring", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("N", 1);
        tempExits.put("W", 2);
        locations.put(4, new Location(4,
                "You are in a valley beside a stream", tempExits));

        tempExits = new HashMap<>();
        tempExits.put("S", 1);
        tempExits.put("W", 2);
        locations.put(5, new Location(5,
                "You are in the forest", tempExits));

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] waysToGo = direction.split(" ");
                for (String way : waysToGo) {
                    if (way.contains("WEST")) {
                        loc = exits.get("W");
                    } else if (way.contains("SOUTH")) {
                        loc = exits.get("S");
                    } else if (way.contains("NORTH")) {
                        loc = exits.get("N");
                    } else if (way.contains("EAST")) {
                        loc = exits.get("E");
                    } else if (way.contains("QUIT")) {
                        loc = exits.get("Q");
                    }
                }
            } else if (exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}