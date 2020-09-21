package com.mkhl24;

public class Radio {
    private String model;
    private String manufacturer;
    private double vaveRate;

    public Radio(String model, String manufacturer, double vaveRate) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.vaveRate = vaveRate;
    }

    public void activateRadio () {
        System.out.println("Radio is now online");
    }

    public void changeRadioVave (double rate) {
        System.out.println("Vave has been changed to " + rate + " FM.");
    }

    private String getModel() {
        return model;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    private double getVaveRate() {
        return vaveRate;
    }

}
