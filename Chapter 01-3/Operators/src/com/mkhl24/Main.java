package com.mkhl24;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        //remainder
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; // increment
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        //
        boolean isAlien = false; // set
        if (isAlien == true)  // test
            System.out.println("It is not an Alian");


        int topScore = 80;
        if (topScore < 100)
            System.out.println("Got the top score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) // AND
            System.out.println("Greater than top score and less then 100");

        if((topScore > 90) || (secondTopScore <= 90))  // OR
            System.out.println("One of this tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("Tis is true");

        boolean isCar = false;
        if (isCar)  // runs with 1 = or
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;  // returns value of isCar
        if (wasCar)
            System.out.println("wasCar is true");

        // chalenge
        /*
        1. Create double = 20
        2. Create double = 80
        3 (20+80*25)
        4. remainder SUM % 40

         */
        double firstDouble = 20;
        double secondDouble = 80;
        double doubleOperation = (firstDouble + secondDouble)*25;
        System.out.println("doubleOperation = " + doubleOperation);
        double doubleResult = (doubleOperation % 40);
        System.out.println("the Remainred is - " + doubleResult);
        if (doubleResult <= 20)
            System.out.println("Total was over the limit");
        }
    }
