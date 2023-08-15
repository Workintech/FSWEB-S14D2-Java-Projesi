package com.workintech.model;

public class Wardrobe {

    private int width;
    private int height;
    private int weight;

    public Wardrobe(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Width: " + width + "\n");
        builder.append("Height: " + height + "\n");
        builder.append("Weight: " + weight + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
