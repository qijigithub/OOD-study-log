package edu.depaul.cdm.se450.Qi.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Traveler Peter= new Peter();
        Peter.setPartner(new Alone());
        Peter.setTrans(new Plane());
        Peter.setDest(new Japan());

        Peter.executeTravel();

        System.out.println("\n");
        Traveler Mary= new Mary();
        Mary.setPartner(new WithFamily());
        Mary.setTrans(new Car());
        Mary.setDest(new NewYork());

        Mary.executeTravel();
        System.out.println("\n");

        Traveler Peter2= new Peter();
        Peter2.setPartner(new WithFamily());
        Peter2.setTrans(new Train());
        Peter2.setDest(new NewYork());
        Peter2.executeTravel();
    }
}