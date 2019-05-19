package edu.depaul.cdm.se450.Qi.Command;

public class CommandDemo {
    public static void main(String args[]) {


    RemoteController controller = new RemoteController();
    Cardoor door = new Cardoor();
    CardoorOpenCommand com = new CardoorOpenCommand(door);
    controller.setCommand(com);
    controller.buttonPressed();
    Carlight light=new Carlight();
    CarlightOnCommand comlon=new CarlightOnCommand(light);
    controller.setCommand(comlon);
    controller.buttonPressed();
    CarlightOffCommand comloff=new CarlightOffCommand(light);
    controller.setCommand(comloff);
    controller.buttonPressed();


}
}
