package edu.depaul.cdm.se450.Qi.Facade;

public class TV {
    String description;
    public TV (String description){
        this.description=description;
    }
    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void toHDMI(){
        System.out.println(description + " change to HDMI mode");
    }

}
