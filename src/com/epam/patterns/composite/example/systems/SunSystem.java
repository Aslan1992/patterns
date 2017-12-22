package com.epam.patterns.composite.example.systems;

import com.epam.patterns.composite.example.SpaceObject;
import com.epam.patterns.composite.example.solids.SolidObject;

import java.util.ArrayList;
import java.util.List;

public class SunSystem extends SpaceObject {
    private List<SolidObject> solidObjects = new ArrayList<>();

    public SunSystem(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Type: Sun system, Name: " + name);
        solidObjects.forEach(solidObject -> {
            System.out.print("   * ");
            solidObject.info();
        });
    }

    @Override
    public void add(SpaceObject component) {
        if (component instanceof SolidObject) {
            solidObjects.add((SolidObject) component);
        } else {
            System.err.println("INFO: Cannot add space object '" + component.getName() + "' to the SunSystem '" + name + "'");
        }
    }

    @Override
    public void remove(SpaceObject component) {

    }
}
