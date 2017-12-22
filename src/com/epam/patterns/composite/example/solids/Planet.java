package com.epam.patterns.composite.example.solids;


public class Planet extends SolidObject {

    public Planet(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Type: Planet, Name: " + name);
    }
}
