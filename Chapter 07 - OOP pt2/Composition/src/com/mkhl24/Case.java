package com.mkhl24;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public void pressPowerButton() {
        System.out.println("Power is up");
    }

    public String getModel() {
        return model;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private String getPowerSupply() {
        return powerSupply;
    }

    private Dimensions getDimensions() {
        return dimensions;
    }

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
}
