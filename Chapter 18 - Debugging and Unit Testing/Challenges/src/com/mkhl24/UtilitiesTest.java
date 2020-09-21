package com.mkhl24;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] output1 = utilities.everyNthChar(new char[] {'h','e','l','l','o'},2);
        assertArrayEquals(new char[] {'e','l'},output1);
        char[] output2 = utilities.everyNthChar(new char[] {'h','e','l','l','o'},7);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDEEF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCCABDEEF"));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
    }

    @Test
    public void converter() {
        assertEquals(300,utilities.converter(10,5));
    }
    @Test(expected = ArithmeticException.class)
    public void converter_divideByZero() {
        Utilities utilities = new Utilities();
        assertEquals(300,utilities.converter(10,0));
    }

    @Test
    public void nullIfOddLength() {
        assertEquals("abcdef",utilities.nullIfOddLength("abcdef"));
        assertNull("Did not get null returned when argument passed was odd length", utilities.nullIfOddLength("bcdef"));
    }
}