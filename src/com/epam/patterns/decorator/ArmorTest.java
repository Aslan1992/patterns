package com.epam.patterns.decorator;

import com.epam.patterns.decorator.example.*;

public class ArmorTest {
    public static void main(String[] args) {
        IronManArmor mark1 = new Mark1();
        System.out.println(mark1.getCharacteristics());
        mark1.shoot();

        System.out.println("------------------------");
        IronManArmor mark2 = new BaseMark2();
        System.out.println(mark2.getCharacteristics());
        mark2.shoot();
        mark2.fly();

        System.out.println("------------------------");
        ArmorDecorator modifiedMark2 = new FinalMark2(mark2);
        System.out.println(modifiedMark2.getCharacteristics());
        modifiedMark2.shoot();
        modifiedMark2.fly();
    }
}
