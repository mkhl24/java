package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue = -2_147_483_647;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValuse = 32767;
        short myNewShortValue = (short) (myShortValuse / 2);

        // long has a width of 64
        long myLongValue = 100L;



        // issue
        byte testByte = 4;
        short testShort = 30924;
        int testInt = 50_432_421;
        long testLong = 50000L + 10L *(testByte + testShort + testInt);
        System.out.println("testLong = " + testLong);
        short testValShort = (short) (1000 + 10 * (testByte + testShort + testInt));
        System.out.println("testValShort = " + testValShort);


    }
}
