package com.mkhl24;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car toyota = new Car();

//        porsche.model = "Carrera"; // will do with public acces

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
