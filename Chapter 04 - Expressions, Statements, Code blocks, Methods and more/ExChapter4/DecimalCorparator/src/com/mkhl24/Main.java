package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.1756, 3.1765);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        // areEqualByThreeDecimalPlaces(-3.1756, -3.175);

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        boolean reBoolaen;
//        if ((Math.abs(firstNumber) - Math.abs(secondNumber)) <= 0.0001) {
//            System.out.println("is equal cause the dif was " + (firstNumber - secondNumber));
//            reBoolaen = true;
//        } else {
//            reBoolaen = false;
//            System.out.println("is false");
//        }

        double fiNo =  firstNumber * 1000;
        double seNo =  secondNumber * 1000;
        int fN = (int) fiNo;
        int sN = (int) seNo;

        System.out.println("fN is " + fN + "and the value was " + firstNumber);
        System.out.println("sN is " + sN + "and the value was " + secondNumber);

        if (fiNo == seNo) {
            reBoolaen = true;
            System.out.println("is true");
        } else {
            reBoolaen = false;
            System.out.println("is false");
        }
        return reBoolaen;
    }
}
