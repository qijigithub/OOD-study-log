package edu.depaul.cdm.se450.Qi.Observer;



public interface Subject {
    public void AddObs(Observer obs);
    public void DeleteObs(Observer obs);
    public void NotifyObs();

}
