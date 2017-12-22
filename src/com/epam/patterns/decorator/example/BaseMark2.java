package com.epam.patterns.decorator.example;

public class BaseMark2 extends IronManArmor {

    public BaseMark2() {
        design = "Aртикулированный и гладкий дизайн";
        weapons = "Руковицы-репульсоры";
        battery = "Дуговой мини-реактор";
    }

    @Override
    public void shoot() {
        System.out.println("Стреляет, изпользуя: " + weapons);
    }

    @Override
    public void fly() {
        System.out.println("Летит на скорости 1500 км/час");
    }
}
