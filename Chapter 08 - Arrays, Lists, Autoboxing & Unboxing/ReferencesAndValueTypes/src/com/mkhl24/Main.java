package com.mkhl24;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue + "\n");

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // another ref pointing to the sane array
//        int[] anotherArray = Arrays.copyOf(myIntArray, myIntArray.length); - not a ref

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray) + "\n");

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray) + "\n");

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray) + "\n");

    }

    private static void modifyArray (int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
