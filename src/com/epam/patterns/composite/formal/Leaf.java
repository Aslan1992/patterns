package com.epam.patterns.composite.formal;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void add(Component component) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(Component component) {
        throw new NotImplementedException();
    }
}
