package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        int int2 = 5;
        // false, true, null - - can't use
        // a mile is equal to 1.609344 kilos
        double kilometres = (100 * 1.609344); // expression -  var = value1 * valuse2
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression - method");
        }


        // write down what of the code are expressions
        int score = 100;  // exp  "score = 100"
        if (score > 99) {  // "score > 99" is exp too
            System.out.println("Yoy got the high score!"); // exp "You .. score!"
            score = 0;  //exp "score = 0"
        }

    }
}
