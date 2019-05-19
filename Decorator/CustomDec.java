package edu.depaul.cdm.se450.Qi.Decorator;

public class CustomDec extends Decorator{
    Character cha;
    public CustomDec(Character cha){
        this.cha= cha;
    }
    @Override
    public String getDescription() {
        return cha.getDescription()+" with Custom";
    }

    @Override
    public int valueOfPower() {
        return 50+cha.valueOfPower();
    }
}
