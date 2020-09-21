package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        //widths of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; // 5f
        //widths of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;  //  5.25

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // test - convert pounds to kilos
        double poundAmm = 200d;
        double kiloAmm = poundAmm * 0.45359237d;
        System.out.println("kiloAmm = " + kiloAmm);
        //90.7185
        double pi = 3_000_000.1415927d;


    }
}
