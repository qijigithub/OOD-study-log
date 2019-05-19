package edu.depaul.cdm.se450.Qi.Adapter;

public class Voltadpter implements ChinaVolt {
    private AmericaVolt av;
    public Voltadpter (AmericaVolt av){
        this.av=av;

    }

    @Override
    public void volt220v() {
        av.volt110v();
        System.out.println("Transform to 220 V, match now");
    }
}
