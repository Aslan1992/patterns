package com.epam.patterns.decorator.example;

public abstract class IronManArmor {
    protected String design;
    protected String weapons;
    protected String battery;

    public String getCharacteristics() {
        return  "Характеристики: \n" +
                "Внешний вид: " + design + "\n" +
                "Оружие: " + weapons + "\n" +
                "Источник питания: " + battery;
    }

    public abstract void shoot();
    public abstract void fly();
}
