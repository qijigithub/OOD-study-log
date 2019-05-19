package edu.depaul.cdm.se450.Qi.Observer;

import java.util.ArrayList;

public class Subject1 implements Subject{
    private ArrayList <Observer> obs= new ArrayList();
    private int info1;
    private String info2;

    @Override
    public void AddObs(Observer o) {
        obs.add(o);
    }

    @Override
    public void DeleteObs(Observer o) {
        int i= obs.indexOf(o);
        if (i>0) {
            obs.remove(i);
        }
    }

    @Override
    public void NotifyObs() {
        for(Observer o: obs){
            o.update(info1,info2);
        }
    }

    public void setInfo(int info1,String info2){
        this.info1= info1;
        this.info2= info2;
        System.out .println("information 1 and 2 have send");
        NotifyObs();
    }


    public int getInfo1(){
        return info1;
    }

    public String getInfo2(){
        return info2;
    }
}
