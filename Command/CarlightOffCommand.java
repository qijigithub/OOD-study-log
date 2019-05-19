package edu.depaul.cdm.se450.Qi.Command;

public class CarlightOffCommand implements Command {
    private Carlight carlight;
    public CarlightOffCommand(Carlight carlight){
        this.carlight=carlight;
    }
    public void execute(){
        carlight.lightOff();
    }
}
