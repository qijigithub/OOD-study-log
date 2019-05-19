package edu.depaul.cdm.se450.Qi.Observer;

public class Observer2  implements Observer{
    private Subject1 sub1;
    public Observer2(Subject1 sub1){
        this.sub1=sub1;
        sub1.AddObs(this);
    }

    @Override
    public void update(int info1, String info2) {
        System.out.println("Binary observer 2 receive :");
        System.out.println(sub1.getInfo1());
        System.out.println(sub1.getInfo2());
    }
}
