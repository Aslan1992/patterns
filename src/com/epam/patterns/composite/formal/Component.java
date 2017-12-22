package com.epam.patterns.composite.formal;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void display();
    public abstract void add(Component component);
    public abstract void remove(Component component);
}
