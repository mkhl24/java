package com.mkhl24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> location = new HashMap<Integer, Location>();

    // Change the program to allow players to type full words, or phrases, then move to the
    // correct location based upon their input.
    // The player should be able to type commands such as "Go West", "run South", or just "East"
    // and the program will move to the appropriate location if there is one.  As at present, an
    // attempt to move in an invalid direction should print a message and remain in the same place.
    //
    // Single letter commands (N, W, S, E, Q) should still be available.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        location.put(0, new Location(0, "You are sitting in front of a compuret learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        location.put(1, new Location(1,"You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",5);
        location.put(2, new Location(2,"You are at the top of a Hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        location.put(3, new Location(3,"You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        location.put(4, new Location(4,"You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        location.put(5, new Location(5,"You are in the forest",tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("SOUTH","S");

        int loc = 1;
        while (true) {
            System.out.println(location.get(loc).getDescription());
            tempExit.remove("S");
            if(loc == 0) {
                break;
            }

            Map<String,Integer> exits = location.get(loc).getExits();
            System.out.print("Available exits are: ");
            for(String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word : words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }


            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that location");
            }
        }
    }

    public static String navigate(String direction) {
        String[] road = direction.split("");
        for(String i : road) {
            if(i.equals("W") || i.equals("E") || i.equals("S") || i.equals("N") || i.equals("Q") ) {
                return i;
            }
        }
        return null;
    }
}
