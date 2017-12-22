package com.epam.patterns.composite.example.solids;

public class Star extends SolidObject {

    public Star(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println("Type: Star, Name: " + name);
    }
}
