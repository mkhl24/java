package com.mkhl24;

public class RoomBlock {

    private String model;
    private int width;
    private int length;
    private int height;

    public RoomBlock(String model, int width, int length, int height) {
        this.model = model;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    private String getModel() {
        return model;
    }

    private int getWidth() {
        return width;
    }

    private int getLength() {
        return length;
    }

    private int getHeight() {
        return height;
    }
}
