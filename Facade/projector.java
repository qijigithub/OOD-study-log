package edu.depaul.cdm.se450.Qi.Facade;

public class projector {
    String description;
    public projector (String description){
        this.description=description;
    }
    public void on(){
        System.out.println(description+" On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

}
