package com.challenge.input.output;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static final String LOCATIONS_PATH = "Basic Input & Output including java.util/locations.txt";
    private static final String DIRECTIONS_PATH = "Basic Input & Output including java.util/directions.txt";
    private static final String BIG_LOCATIONS_PATH = "Basic Input & Output including java.util/locations_big.txt";
    private static final String BIG_DIRECTIONS_PATH = "Basic Input & Output including java.util/directions_big.txt";

    public static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        try (BufferedWriter locationsFile = new BufferedWriter(new FileWriter(LOCATIONS_PATH));
             BufferedWriter directionsFile = new BufferedWriter(new FileWriter(DIRECTIONS_PATH))) {
            for (Location location : locations.values()) {
                locationsFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    if (direction.equalsIgnoreCase("Q")) {
                        directionsFile.write(location.getLocationID() + "," + direction + ","
                                + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }
    }

    static {
        try (BufferedReader locationsFile = new BufferedReader(new FileReader(BIG_LOCATIONS_PATH))) {
            String input;
            while ((input = locationsFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String description = data[1];
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader directionsFile = new BufferedReader(new FileReader(BIG_DIRECTIONS_PATH))) {
            String input;
            while ((input = directionsFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
