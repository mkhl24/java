package com.mkhl24;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printSquareStar(int number) {
        if( number < 5) {
            System.out.println("Invalid Value");
        }else {

            for (int i = 1; i <= number; i++) { // i is row number
                for (int j = 1; j <= number; j++) { // j is column number
                    if (i == 1 || i == number || j == 1 || j == number || i == j || (j == (number - i + 1))) {
                        System.out.print("*");
                        if (j == number) {
                            System.out.println();
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }


}
