package com.challenge.sets;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (this.name.equals(theObject.getName())) {
                return this.bodyType.equals(theObject.getBodyType());
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }
}