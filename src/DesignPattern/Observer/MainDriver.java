package DesignPattern.Observer;

public class MainDriver {
    public static void main(String[] args) {

        // create a subject
        Subject subject = new MyTopic("Initial Message");

        // create multiple observers
        Observer topicSubscriber1 = new MyTopicSubscriber("subscriber 1");
        Observer topicSubscriber2 = new MyTopicSubscriber("subscriber 2");
        Observer topicSubscriber3 = new MyTopicSubscriber("subscriber 3");

        // attached subject to each Observers
        topicSubscriber1.registerSubject(subject);
        topicSubscriber2.registerSubject(subject);
        topicSubscriber3.registerSubject(subject);

        // attach all observers to single subject
        subject.registerObserver(topicSubscriber1);
        subject.registerObserver(topicSubscriber2);
        subject.registerObserver(topicSubscriber3);

        subject.updateState("Message version 2");

        subject.updateState("Message version 3");

    }
}
