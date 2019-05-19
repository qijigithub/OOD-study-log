package edu.depaul.cdm.se450.Qi.Decorator;

public abstract class Character {
    String description="unknown Character";
    int power;
    public String getDescription(){
        return description;
    }

    public abstract int valueOfPower();
}
