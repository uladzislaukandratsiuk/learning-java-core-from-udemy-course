package com.challenge.generics;

public class Main {

    public static void main(String[] args) {

        League<PremierLeagueTeam> premierLeagueLeague = new League<>("Prime League");

        PremierLeagueTeam shakhtyor = new PremierLeagueTeam("Shakhtyor Soligorsk", 19, 5, 5);
        PremierLeagueTeam bate = new PremierLeagueTeam("BATE", 21, 4, 4);
        PremierLeagueTeam dynamoBrest = new PremierLeagueTeam("Dynamo Brest", 22, 6, 1);
        PremierLeagueTeam dynamoMinsk = new PremierLeagueTeam("Dynamo Minsk", 15, 5, 9);

        premierLeagueLeague.addTeam(dynamoMinsk);
        premierLeagueLeague.addTeam(shakhtyor);
        premierLeagueLeague.addTeam(bate);
        premierLeagueLeague.addTeam(dynamoBrest);

        premierLeagueLeague.printLeagueTable();

        League<FirstLeagueTeam> firstLeagueLeague = new League<>("Fist League");

        FirstLeagueTeam naftan = new FirstLeagueTeam("Naftan", 13, 8, 7);
        FirstLeagueTeam belshina = new FirstLeagueTeam("Belshina", 21, 5, 2);
        FirstLeagueTeam ruhBrest = new FirstLeagueTeam("Ruh Brest", 15, 11, 2);

        firstLeagueLeague.addTeam(naftan);
        firstLeagueLeague.addTeam(belshina);
        firstLeagueLeague.addTeam(ruhBrest);

        firstLeagueLeague.printLeagueTable();
    }
}
