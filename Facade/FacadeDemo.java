package edu.depaul.cdm.se450.Qi.Facade;

public class FacadeDemo {
    public static void main (String args[]) {
        TV tv = new TV("Sharp TV");
        Xbox xbox = new Xbox("MicroSoft Xbox 360");
        projector pro = new projector("Sony Project ds");
        Light light = new Light("Basement Ceiling Light");
        GameFacade fcd = new GameFacade(tv, xbox, pro, light);
        fcd.myGameMode();
        fcd.closeGameMode();
    }
}
