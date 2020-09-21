package com.mkhl24;

/*
-Write a method called reverse() with an int array as a parameter.
-The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] testArray = {5,4,3,2,1,0};
        System.out.println("Test array is " + Arrays.toString(testArray));
        reverse(testArray);
        System.out.println("Array after modification is " + Arrays.toString(testArray));

    }

    public static void reverse (int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;
        for (int i=0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
//  my solution
//    public static void reverse (int[] array) {
//        int[] reversedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            reversedArray[(array.length - 1) - i] = array[i]; // array.length - 1 - max index
//        }
//        for (int i=0; i < array.length; i++) {
//            array[i] = reversedArray[i];
//        }
//    }
}
