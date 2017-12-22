package com.epam.patterns.composite.formal;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
        children.forEach(Component::display);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.add(component);
    }
}
