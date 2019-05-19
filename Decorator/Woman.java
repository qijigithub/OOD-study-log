package edu.depaul.cdm.se450.Qi.Decorator;

public class Woman extends Character{

    public Woman (){
        description="Woman";
    }
    @Override
    public int valueOfPower() {
        power=100;
        return power;
    }

}
