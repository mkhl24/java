package org.myexample;

public class ClassicalMusic implements Music{

    // restriction for using factoryMethod only
    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarrian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Doing my initialization for ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction for ClassicalMusic");
    }
}
