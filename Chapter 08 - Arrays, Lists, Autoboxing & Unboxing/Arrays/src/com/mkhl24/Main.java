package com.mkhl24;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] typedArray = getIntegers(5);
        for (int i = 0; i < typedArray.length; i++) {
//            getIntegers(i);
            System.out.println("Element " + i + ", typed value was " + typedArray[i]);
        }
        System.out.println("The average is " + getAverage(typedArray));

        int[] myIntArray = new int[15];
//	    int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // just as ... = new int[10]

//	    myIntAttay[5] = 50; // 6th el-t = 50
//        myIntAttay[0] = 1; // first (1) el-t
//        myIntAttay[9] = 99; // last (10) el-t

//        myIntAttay = {1,2,3,4,5,6,7,8,9,10}

        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[7]);

        for (int i = 0; i < myIntArray.length; i++) { // hardcode like || for (int i = 0; i < 10; i++) {
            myIntArray[i] = i*10;
        }

//        printArray(myIntArray);

    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " integers values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array [" + i + "] element = " + array[i]);
        }
    }
    public static double getAverage (int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
