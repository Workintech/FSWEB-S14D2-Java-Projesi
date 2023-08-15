package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Ceiling {

    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void createCeiling() {
        System.out.println("Ceiling with " + height + " and with color " + color + " has been created");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Height: " + height + "\n");
        builder.append("Color: " + color + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
