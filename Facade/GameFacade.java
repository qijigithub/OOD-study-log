package edu.depaul.cdm.se450.Qi.Facade;

public class GameFacade {
    private TV tv;
    private Xbox xbox;
    private projector pro;
    private Light light;

    public GameFacade(TV tv,Xbox xbox,projector pro,Light light){
        this.tv=tv;
        this.xbox=xbox;
        this.pro=pro;
        this.light=light;
    }

    public void myGameMode(){
        System.out.println("Get ready to play game !");
        tv.on();
        tv.toHDMI();
        xbox.on();
        xbox.connectCtrl();
        light.dim(30);
        pro.on();
        xbox.loadGame();

    }

    public void closeGameMode(){
        System.out.println("Shot down game...");
        xbox.quitGame();
        xbox.disconnectCtrl();
        xbox.off();
        pro.off();
        light.on();
        tv.off();
    }
}
