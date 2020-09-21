package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isCatPlaying(true, 48);
        isCatPlaying(true, 34);
        isCatPlaying(true, 21);
        isCatPlaying(false,38);
        isCatPlaying(false,33);
        isCatPlaying(false,21);
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if ((summer) && ((temperature >= 25) && (temperature <= 45))
                || ((temperature >= 25) && (temperature <= 35)) ) {
            System.out.println("Is true");
            return true;
        }
        else {
            System.out.println("Is false");
            return false;
        }
    }


}
