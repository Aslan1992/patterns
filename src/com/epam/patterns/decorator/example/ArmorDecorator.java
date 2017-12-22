package com.epam.patterns.decorator.example;

public abstract class ArmorDecorator extends IronManArmor {

    protected IronManArmor ironManArmor;

    public ArmorDecorator(IronManArmor ironManArmor) {
        this.ironManArmor = ironManArmor;
    }
}
