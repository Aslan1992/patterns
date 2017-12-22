package com.epam.patterns.composite.example.systems;

import com.epam.patterns.composite.example.SpaceObject;
import com.epam.patterns.composite.example.solids.SolidObject;

import java.util.ArrayList;
import java.util.List;

public class Galaxy extends SpaceObject {
    private List<SpaceObject> spaceObjects = new ArrayList<>();

    public Galaxy(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Type: Galaxy, Name: " + name);
        spaceObjects.forEach(spaceObject -> {
            System.out.print(" * ");
            spaceObject.info();
        });
    }

    @Override
    public void add(SpaceObject component) {
        if (component instanceof SunSystem || component instanceof SolidObject) {
            spaceObjects.add(component);
        } else {
            System.err.println("INFO: Cannot add space object '" + component.getName() + "' to a galaxy '" + name + "'");
        }
    }

    @Override
    public void remove(SpaceObject component) {
    }
}
