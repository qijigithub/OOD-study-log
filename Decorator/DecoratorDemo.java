package edu.depaul.cdm.se450.Qi.Decorator;

public class DecoratorDemo {
    public static void main(String args[]) {
        Character wmcws = new Woman();
        wmcws = new CustomDec(wmcws);
        wmcws = new WeaponDec(wmcws);
        wmcws = new SkillDec(wmcws);
        System.out.println("Character is :"+wmcws.getDescription());
        System.out.println("Value of power is :"+wmcws.valueOfPower());
    }
}
