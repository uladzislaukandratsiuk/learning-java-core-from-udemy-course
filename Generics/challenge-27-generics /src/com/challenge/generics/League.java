package com.challenge.generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (this.teams.contains(team)) {
            return false;
        } else {
            this.teams.add(team);
            return true;
        }
    }

    private int numberOfTeams() {
        return this.teams.size();
    }

    public void printLeagueTable() {
        System.out.println(this.name + ", teams:" + numberOfTeams()
                + "\n=============================================================");
        Collections.sort(this.teams);
        for (T team : this.teams) {
            System.out.println(team);
        }
        System.out.println("=============================================================");
    }


}
