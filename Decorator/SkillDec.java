package edu.depaul.cdm.se450.Qi.Decorator;

public class SkillDec extends Decorator {
    Character cha;
    public SkillDec(Character cha){
        this.cha=cha;
    }

    @Override
    public String getDescription() {
        return cha.getDescription()+" with Skill ";
    }

    @Override
    public int valueOfPower() {
        return cha.valueOfPower()+300;
    }
}
