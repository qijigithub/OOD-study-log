package edu.depaul.cdm.se450.Qi.Facade;

public class Light {
    String description;

    public Light(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }


}
