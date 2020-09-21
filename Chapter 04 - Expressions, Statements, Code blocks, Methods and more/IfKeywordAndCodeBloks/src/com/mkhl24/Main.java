package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if(score < 5000 && score >1000) {
//            System.out.println("Yor score was less than 5000 but greater than 1000");
//            System.out.println("this was executed");
//        } else if(score <1000) {
//            System.out.println("your score was lesser than 1000");
//        } else {
//            System.out.println("got here");
//        }
//

        if (gameOver == true) {  // && if(gaveOver)
            int finalScore = score +(levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

       //  int savedFinalScore = finalScore; // delete var outside codeblock


        // print out a second score on the screen with the folowing
        // score set to 10000
        // level completed set to 8
        // bonus set to 200
        // first printout above still displays


//        score = 10000;   // redefining var
//        levelCompleted = 8;
//        bonus = 200;

        if (gameOver) {
            score = 10000; // redefining too
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("second score is = " + finalScore);
        }

        System.out.println(score);


    }
}
