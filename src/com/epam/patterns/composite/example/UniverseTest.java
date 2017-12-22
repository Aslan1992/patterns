package com.epam.patterns.composite.example;

import com.epam.patterns.composite.example.solids.Asteroid;
import com.epam.patterns.composite.example.solids.Planet;
import com.epam.patterns.composite.example.solids.Star;
import com.epam.patterns.composite.example.systems.Galaxy;
import com.epam.patterns.composite.example.systems.SunSystem;

public class UniverseTest {
    public static void main(String[] args) {
        Galaxy milky = new Galaxy("Milk way");
        SunSystem sunSystem = new SunSystem("Our sun system");

        sunSystem.add(new Star("Our sun"));
        sunSystem.add(new Planet("Earth"));
        sunSystem.add(new Planet("Mars"));
        sunSystem.add(new Planet("Jupiter"));

        milky.add(sunSystem);
        milky.add(new Planet("Kepler 99"));
        milky.add(new Asteroid("Apokalipsis"));


        milky.add(new Galaxy("XXX"));

        milky.info();
    }
}
