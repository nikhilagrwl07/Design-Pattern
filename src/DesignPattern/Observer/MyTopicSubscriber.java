package DesignPattern.Observer;

public class MyTopicSubscriber implements Observer {

    private Subject subject;
    private String subscriberName;

    public MyTopicSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    @Override
    public void registerSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        String updatedMessage = subject.getUpdatedMessage();
        System.out.println(subscriberName + " got updated with new message " + updatedMessage);
    }

}
