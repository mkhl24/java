package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2019.125"; // ex if concatenate A, not ex if con D
        System.out.println("numberAsString = " + numberAsString);

//        int number = Integer.parseInt(numberAsString);
        double number = Double.parseDouble(numberAsString);
        System.out.println("numer = " + number);

        numberAsString += 1.241;
        number += 1.241;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
