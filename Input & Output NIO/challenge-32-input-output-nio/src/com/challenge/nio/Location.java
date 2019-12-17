package com.challenge.nio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location implements Serializable {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;
    private static long serialVersionUID = 1L;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits != null ? new LinkedHashMap<>(exits) : new LinkedHashMap<>();
        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(this.exits);
    }

    protected void addExit(String direction, int location) {
        exits.put(direction, location);
    }
}
