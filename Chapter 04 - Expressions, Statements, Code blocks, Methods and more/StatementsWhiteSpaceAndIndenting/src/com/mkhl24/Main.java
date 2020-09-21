package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // whole line is a statement
        if (myVariable == 50) {
            System.out.println("printed");
        }

        myVariable++;
        myVariable--; // both statement
        System.out.println("This sis a test");  //state to

        System.out.println("This is " +
                "another " +
                "still more"); // statement too

        int anotherVariable = 50;
        myVariable--;
        System.out.println("this is another one");  // not recomended

        //whitespece
    }
}
