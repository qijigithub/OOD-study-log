package edu.depaul.cdm.se450.Qi.Adapter;

public class CWallOutlet implements ChinaVolt {
    @Override
    public void volt220v() {
        System.out.println("Voltage :220V");
    }
}
