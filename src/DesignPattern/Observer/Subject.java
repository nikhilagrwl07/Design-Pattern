package DesignPattern.Observer;

public interface Subject {

    // String variable to hold a state
    // boolean value to denote any changes
    // List of Observers to be register or de-register

    // method to register and de-register observers
    void registerObserver(Observer observer);
    void deRegisterObserver(Observer observer);

    void updateState(String newValue);
    String getUpdatedMessage();
    void notifyAllObservers();


}
