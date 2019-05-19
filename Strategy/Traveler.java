package edu.depaul.cdm.se450.Qi.Strategy;

import edu.depaul.cdm.se450.Qi.Strategy.Destination;
import edu.depaul.cdm.se450.Qi.Strategy.Partner;
import edu.depaul.cdm.se450.Qi.Strategy.Transportation;

public abstract class Traveler {
    protected Transportation trans;
    protected Partner par;
    protected Destination des;

    public void setTrans(Transportation trans){
        this.trans = trans;
    }
    public void setPartner(Partner par){
        this.par = par;
    }

    public void setDest(Destination des){
        this.des = des;
    }

    public void executeTravel(){
        this.display();
        trans.chooseTrans();
        par.choosePartner();
        des.chooseDes();
    };
    public abstract void display();
}
