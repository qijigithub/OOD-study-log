package edu.depaul.cdm.se450.Qi.Command;

public class RemoteController {
    Command slot;

    public RemoteController(){};

    public void setCommand(Command slot){
        this.slot=slot;
    }
    public void buttonPressed(){
        slot.execute();
    }
}
