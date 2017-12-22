package com.epam.patterns.composite.example;

public abstract class SpaceObject {
    protected String name;
    public SpaceObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void info();
    public abstract void add(SpaceObject component);
    public abstract void remove(SpaceObject component);
}
