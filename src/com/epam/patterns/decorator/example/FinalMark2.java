package com.epam.patterns.decorator.example;

public class FinalMark2 extends ArmorDecorator {

    public FinalMark2(IronManArmor armor) {
        super(armor);
        design = ironManArmor.design + ", и золотисто-красная окраска";
        weapons = ironManArmor.weapons + ", противотанковые ракеты";
        battery = ironManArmor.battery;
    }

    @Override
    public void shoot() {
        System.out.println("Стреляет, ипользуя " + weapons);
    }

    @Override
    public void fly() {
        System.out.println("Летит со скоростью 2400 км/час");
    }
}
