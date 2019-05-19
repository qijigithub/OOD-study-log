package edu.depaul.cdm.se450.Qi.Decorator;

public class Man extends Character{
    public Man(){
        description="Man";
    }

    @Override
    public int valueOfPower() {
        power=100;
        return power;
    }
}
