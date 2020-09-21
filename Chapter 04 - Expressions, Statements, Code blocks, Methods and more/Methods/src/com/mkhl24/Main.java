package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final score was " + highScore);

        /*
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        */

        displayHighScorePosition("Tim",calculateHighScorePosition(1500));
        displayHighScorePosition("mkhl24",calculateHighScorePosition(900));
        displayHighScorePosition("Percy",calculateHighScorePosition(400));
        displayHighScorePosition("Bob",calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // assuming pos 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >=100) {
            position = 3;
        }
        return position;
    }
}
