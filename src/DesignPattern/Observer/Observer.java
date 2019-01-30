package DesignPattern.Observer;

public interface Observer {

    // variable to hold Subject
    // update method to be called from Subject class
    public void registerSubject(Subject subject);
    public void update();

}
