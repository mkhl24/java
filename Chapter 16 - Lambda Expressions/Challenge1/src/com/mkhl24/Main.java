package com.mkhl24;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//        @Override
//        public void run() {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for(String part : parts) {
//                System.out.println(part);
//            }
//        }
//    };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for(int i=0; i<source.length(); i++) {
//            if(i%2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }

        Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i<source.length(); i++) {
                if(i%2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        String s = "1234567890";
        System.out.println(lambdaFunction.apply("1234567890"));


        System.out.println(everySecondChar(lambdaFunction, "1234567890"));

//        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava = () -> {return "I love Java!";} ;
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    public static String everySecondChar(Function<String, String> func, String src) {
        return func.apply(src);
    }







}
