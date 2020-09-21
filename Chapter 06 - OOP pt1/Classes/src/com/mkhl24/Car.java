package com.mkhl24;

public class Car {
    /*
    public - unrestricted acess to class
    private - no other classes has acess to class
    protected - acess given to classes in package ??
     */

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("supra")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
