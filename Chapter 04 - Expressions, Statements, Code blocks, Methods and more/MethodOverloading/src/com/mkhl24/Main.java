package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("mkhl24", 500);  // overloading
        System.out.println("New score is " + newScore);
        calculateScore(75);
        //calculateScore(100, 100, 23);
        calculateScore();


        calcFeetAndInchesToCentimeters(6,-12);
        double cent = calcFeetAndInchesToCentimeters(6,14);
        if (cent < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);


        }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


    // chalange

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        double cent = (feet * 12)*2.54;
        cent += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cent + " cm");
        return cent;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches =(int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and "
                + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}
