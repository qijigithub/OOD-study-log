package edu.depaul.cdm.se450.Qi.Command;

public class CarlightOnCommand implements Command {
    private Carlight carlight;
    public CarlightOnCommand(Carlight carlight){
        this.carlight=carlight;
    }

    @Override
    public void execute() {
        carlight.lightOn();
    }
}
