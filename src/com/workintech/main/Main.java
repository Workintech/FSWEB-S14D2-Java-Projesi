package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Şamil",
                new Wall(Direction.NORTH),
                new Wall(Direction.SOUTH),
                new Wall(Direction.EAST),
                new Wall(Direction.WEST),
                new Ceiling(280, PaintColor.WHITE),
                new Lamp(LampType.LAVA, true, 4),
                new Wardrobe(250, 210, 80),
                new Carpet(250, 400, PaintColor.RED),
                new Bed("King Size", 2, 45, 2, 2));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().createCeiling();

        System.out.println(bedroom);

        // Strings are immutable (unchangeable value)
    }
}