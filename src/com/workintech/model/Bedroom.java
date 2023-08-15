package com.workintech.model;

public class Bedroom extends Room {

    private Wardrobe wardrobe;
    private Carpet carpet;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Wardrobe wardrobe, Carpet carpet, Bed bed) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp);
        this.wardrobe = wardrobe;
        this.carpet = carpet;
        this.bed = bed;
    }

    // Boilerplate code: Min amount of skeleton codes to run app (Burden)

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Name: " + getName() + "\n");
        builder.append("Wall 1: " + getWall1() + "\n");
        builder.append("Wall 2: " + getWall2() + "\n");
        builder.append("Wall 3: " + getWall3() + "\n");
        builder.append("Wall 4: " + getWall4() + "\n");
        builder.append("Ceiling: " + getCeiling() + "\n");
        builder.append("Lamp: " + getLamp() + "\n");
        builder.append("Wardrobe: " + wardrobe + "\n");
        builder.append("Carpet: " + carpet + "\n");
        builder.append("Bed: " + bed + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
