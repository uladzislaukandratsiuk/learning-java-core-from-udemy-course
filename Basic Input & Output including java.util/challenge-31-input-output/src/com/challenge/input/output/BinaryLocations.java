package com.challenge.input.output;

import java.io.*;
import java.util.*;

public class BinaryLocations implements Map<Integer, Location> {

    public static Map<Integer, Location> locations = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locationsFile =
                     new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (Location location : locations.values()) {
                locationsFile.writeInt(location.getLocationID());
                locationsFile.writeUTF(location.getDescription());
                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
                locationsFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
                        locationsFile.writeUTF(direction);
                        locationsFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
    }

    static {
        try (DataInputStream locationsFile =
                     new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    Map<String, Integer> exits = new LinkedHashMap<>();
                    int locID = locationsFile.readInt();
                    String description = locationsFile.readUTF();
                    int numExits = locationsFile.readInt();
                    System.out.println("Read location " + locID + " : " + description);
                    System.out.println("Found " + numExits + " exits");
                    for (int i = 0; i < numExits; i++) {
                        String direction = locationsFile.readUTF();
                        int destination = locationsFile.readInt();
                        exits.put(direction, destination);
                        System.out.println("\t\t" + direction + "," + destination);
                    }
                    locations.put(locID, new Location(locID, description, exits));

                } catch (EOFException e) {
                    eof = true;
                }

            }
        } catch (IOException io) {
            System.out.println("IO Exception");
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
    public Set<Map.Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}

