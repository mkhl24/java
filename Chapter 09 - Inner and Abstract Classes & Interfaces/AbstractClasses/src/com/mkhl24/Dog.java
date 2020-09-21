package com.mkhl24;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating");
    }

    @Override
    public void breathe() {
        System.out.println(" Breathe in/out");
    }
}
