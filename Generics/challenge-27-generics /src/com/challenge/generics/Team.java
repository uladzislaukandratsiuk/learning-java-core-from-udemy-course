package com.challenge.generics;

public abstract class Team implements Comparable<Team> {

    private String name;
    private int win;
    private int tie;
    private int lose;
    private int score;

    public Team(String name, int win, int tie, int lose) {
        this.name = name;
        this.win = win;
        this.tie = tie;
        this.lose = lose;
        this.score = calculateScore();
    }

    public String getName() {
        return name;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getTie() {
        return tie;
    }

    public int getScore() {
        return score;
    }

    private int calculateScore() {
        return (this.score + this.getWin() * 3) + this.getTie() ;
    }

    @Override
    public int compareTo(Team team) {
        return Integer.compare(team.score, this.score);
    }

    @Override
    public String toString() {
        return "Team, score=" + score +
                ", name=" + name +
                ", win=" + win +
                ", tie=" + tie +
                ", lose=" + lose;
    }
}
