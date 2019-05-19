package edu.depaul.cdm.se450.Qi.Facade;

public class Xbox {
    String description;
    public Xbox (String description){
        this.description=description;
    }
    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void connectCtrl(){
        System.out.println(description + " controller connected ");
    }

    public void disconnectCtrl(){
        System.out.println(description + " controller disconnected ");
    }

    public void loadGame(){
        System.out.println(description + " start loading game ");
    }


    public void quitGame(){
        System.out.println(description + " start quit game ");
    }

}
