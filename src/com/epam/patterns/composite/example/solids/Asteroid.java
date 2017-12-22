package com.epam.patterns.composite.example.solids;

public class Asteroid extends SolidObject {

    public Asteroid(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Type: Asteroid, Name: " + name);
    }
}
