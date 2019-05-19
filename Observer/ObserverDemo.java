package edu.depaul.cdm.se450.Qi.Observer;

public class ObserverDemo {
    public static void main(String args[]){
            Subject1 sub1=new Subject1();
            Observer1 obs1=new Observer1(sub1);
            Observer2 obs2=new Observer2(sub1);
            Observer3 obs3=new Observer3(sub1);
            sub1.setInfo(15,"Ji Qi");

    }
}
