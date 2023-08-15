package com.workintech.model;

import com.workintech.enums.Direction;

public class Wall {

    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void create() {
        System.out.println("Wall has been created on: " + getDirection() + " direction");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n*******************************\n");
        builder.append("Direction: " + direction + "\n");
        builder.append("*******************************\n");
        return builder.toString();
    }
}
