package com.mkhl24;

/*
A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
 and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number.
 For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers,
 just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i.
 For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
 */

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
