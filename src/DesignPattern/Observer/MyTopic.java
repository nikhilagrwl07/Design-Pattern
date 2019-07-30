package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    private String message;
    private List<Observer> observers;


    public MyTopic(String message) {
        this.message = message;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {

        if(observer ==null)
            return;

        observers.add(observer);

    }

    @Override
    public void deRegisterObserver(Observer observer) {

        if(observer == null)
            return;

        observers.remove(observer);
    }

    @Override
    public void updateState(String newMessage) {
        if(!newMessage.equals(message))
        {
            System.out.println("New message is posted to topic");
            message = newMessage;
            notifyAllObservers();
        }

    }

    @Override
    public String getUpdatedMessage() {
        return this.message;
    }


    @Override
    public void notifyAllObservers() {

        for(Observer observer : observers){
            observer.update();
        }
    }

}
