package com.mkhl24;

public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth (int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out.");
            // reducing number of health remaining for the player
        }
    }

    public int healthRemaining () {
        return this.health;
    }
}
