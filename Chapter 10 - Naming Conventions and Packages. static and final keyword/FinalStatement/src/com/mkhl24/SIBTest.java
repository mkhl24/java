package com.mkhl24;

public class SIBTest {
    public static final String owner;

    static {
        owner = "mkhl";
        System.out.println("SIBTest initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("Some method called");
    }
}
