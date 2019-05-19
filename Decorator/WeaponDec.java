package edu.depaul.cdm.se450.Qi.Decorator;

public class WeaponDec extends Decorator {
    Character cha;
    public WeaponDec(Character cha){
        this.cha=cha;
    }

    @Override
    public int valueOfPower() {
        return cha.valueOfPower()+200;
    }

    @Override
    public String getDescription() {
        return cha.getDescription()+" with Weapon";
    }
}
