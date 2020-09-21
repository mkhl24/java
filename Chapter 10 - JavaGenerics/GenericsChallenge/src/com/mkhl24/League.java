package com.mkhl24;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> involvedTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add (T team) {
        if (involvedTeams.contains(team)) {
            System.out.println(team.getName() + "already in the league");
            return false;
        } else if (team != null){
            involvedTeams.add(team);
            System.out.println(team.getName() + " join the league");
            return true;
        } else {
            return false;
        }
    }

    public void printInOrder() {
        Collections.sort(involvedTeams);
        for(T t : involvedTeams) {
            System.out.println(t.getName()+ ": " + t.ranking());
        }
    }


}


// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.