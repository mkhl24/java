package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        // byte - primitive datatypes
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("myString is equal to - " + myString);
        myString = myString + ", and this is more!";
        System.out.println("So now it is - " + myString);
        myString = myString + " \u00A9";
        System.out.println("So now it is - " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to - " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString - " + lastString);
    }
}
