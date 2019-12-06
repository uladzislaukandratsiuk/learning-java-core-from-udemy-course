package com.challenge.sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        //test
        temp = new Planet("Uranus", 9999);
        solarSystem.put(temp.getName(), temp);

        if (planets.add(temp)) {
            System.out.println(temp.getBodyType() + " " + temp.getName() + " has been added");
        } else {
            System.out.println(temp.getBodyType() + " " + temp.getName() + " already exists");
        }

        System.out.println("========================================================");

        temp = new Planet("Europa",9999);
        solarSystem.put(temp.getName(), temp);

        if (planets.add(temp)) {
            System.out.println(temp.getBodyType() + " " + temp.getName() + " has been added");
        } else {
            System.out.println(temp.getBodyType() + " " + temp.getName() + " already exists");
        }

        System.out.println("========================================================");

        tempMoon = new Moon("Europa", 9999);
        solarSystem.put(tempMoon.getName(), tempMoon);

        if (temp.addMoon(tempMoon)) {
            System.out.println(tempMoon.getBodyType() + " " + tempMoon.getName() + " has been changed");
        } else {
            System.out.println(tempMoon.getBodyType() + " " + tempMoon.getName() + " already exists");
        }

        System.out.println("========================================================");

        HeavenlyBody pluto = new Planet("Pluto", 9999);
        if (planets.add(pluto)) {
            System.out.println(pluto.getBodyType() + " " + pluto.getName() + " has been added");
        } else {
            System.out.println(pluto.getBodyType() + " " + pluto.getName() + " already exists");
        }

        System.out.println("========================================================");

        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        System.out.println("========================================================");

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName() + ": " + moon.getOrbitalPeriod());
        }

        System.out.println("========================================================");

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        System.out.println("========================================================");

        HeavenlyBody planetEarth = solarSystem.get("Earth");
        HeavenlyBody planetMars = solarSystem.get("Mars");

        if (planetEarth.equals(planetMars) == planetMars.equals(planetEarth)) {
            System.out.println("Method equals is symmetric");
        } else {
            System.out.println("Method equals is not symmetric");
        }

        System.out.println("========================================================");
    }
}
