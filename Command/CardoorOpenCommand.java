package edu.depaul.cdm.se450.Qi.Command;

public class CardoorOpenCommand implements Command {
    private Cardoor cardoor;
    public CardoorOpenCommand(Cardoor cardoor){
        this.cardoor=cardoor;
    }

    @Override
    public void execute() {
        cardoor.doorOpen();
    }
}
