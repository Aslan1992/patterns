package com.epam.patterns.decorator.example;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Mark1 extends IronManArmor {

    public Mark1() {
        design = "Большой и громоздкий";
        weapons = "Огнемёт";
        battery = "Обычный аккумулятор от автомобиля";
    }

    @Override
    public void shoot() {
        System.out.println("Стреляет, изпользуя: " + weapons);
    }

    @Override
    public void fly() {
        throw new NotImplementedException();
    }
}
