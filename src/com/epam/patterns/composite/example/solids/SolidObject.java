package com.epam.patterns.composite.example.solids;

import com.epam.patterns.composite.example.SpaceObject;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class SolidObject extends SpaceObject {

    public SolidObject(String name) {
        super(name);
    }

    @Override
    public void add(SpaceObject component) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(SpaceObject component) {
        throw new NotImplementedException();
    }
}
