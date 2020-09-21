package com.mkhl24;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesParameterizedTest {

    private Utilities utilities;
    private String input;
    private String expected;

    public UtilitiesParameterizedTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCDEFF", "ABCDEF"},
                {"ABEFFG","ABEFG"},
                {"112233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}
        });
    }

    @Test
    public void removePairs() {
        assertEquals(expected, utilities.removePairs(input));
    }
}
