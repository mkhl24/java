package com.example.game;

/* Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
 with Players and Monsters, but you can create any type of classes that you want).
 Override the toString() method for each of your classes so that they can be easily printed to enable
 the program to be tested easier. */

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int health;
    private int strength;
    private String weapon;

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.health = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1,"" + this.health); // casting int to String
        values.add(2,"" + this.strength);
        values.add(3,this.weapon);
        return values;
    }

    public Player(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
