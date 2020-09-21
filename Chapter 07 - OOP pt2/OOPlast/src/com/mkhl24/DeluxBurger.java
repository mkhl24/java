package com.mkhl24;

public class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Deluxe", "pork & beef", 14.30, "white");
        super.addHamburgerAddition1("Chips",2.10);
        super.addHamburgerAddition2("Drink", 1.70);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additions to delux burger allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additions to delux burger allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additions to delux burger allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additions to delux burger allowed");
    }
}
