package DesignPattern.PublisherSubscriber.PubSubService;

import DesignPattern.PublisherSubscriber.Message.Message;
import DesignPattern.PublisherSubscriber.Subscriber.Subscriber;

import java.util.*;

public class PubSubService {
    //Keeps set of subscriber topic wise, using set to prevent duplicates
    Map<String, Set<Subscriber>> topicToSubscribersMap = new HashMap<String, Set<Subscriber>>();

    //Holds messages published by publishers
    Queue<Message> messagesQueue = new LinkedList<Message>();

    //Adds message sent by publisher to queue
    public void addMessageToQueue(Message message) {
        messagesQueue.add(message);
    }

    //Add a new Subscriber for a topic
    public void addSubscriber(String topic, Subscriber subscriber) {

        if (topicToSubscribersMap.containsKey(topic)) {
            Set<Subscriber> subscribers = topicToSubscribersMap.get(topic);
            subscribers.add(subscriber);
            topicToSubscribersMap.put(topic, subscribers);
        } else {
            Set<Subscriber> subscribers = new HashSet<Subscriber>();
            subscribers.add(subscriber);
            topicToSubscribersMap.put(topic, subscribers);
        }
    }

    //Remove an existing subscriber for a topic
    public void removeSubscriber(String topic, Subscriber subscriber) {

        if (topicToSubscribersMap.containsKey(topic)) {
            Set<Subscriber> subscribers = topicToSubscribersMap.get(topic);
            subscribers.remove(subscriber);
            topicToSubscribersMap.put(topic, subscribers);
        }
    }

    //Broadcast new messages added in queue to All subscribers of the topic. messagesQueue will be empty after broadcasting
    public void broadcast() {
        if (messagesQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!messagesQueue.isEmpty()) {
                Message message = messagesQueue.remove();
                String topic = message.getTopic();

                Set<Subscriber> subscribersOfTopic = topicToSubscribersMap.get(topic);

                for (Subscriber subscriber : subscribersOfTopic) {
                    //add broadcasted message to subscribers message queue
                    List<Message> subscriberMessages = subscriber.getSubscriberMessages();
                    subscriberMessages.add(message);
                    subscriber.setSubscriberMessages(subscriberMessages);
                }
            }
        }
    }

    //Sends messages about a topic for subscriber at any point
    public void getMessagesForSubscriberOfTopic(String topic, Subscriber subscriber) {
        if (messagesQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!messagesQueue.isEmpty()) {
                Message message = messagesQueue.remove();

                if (message.getTopic().equalsIgnoreCase(topic)) {

                    Set<Subscriber> subscribersOfTopic = topicToSubscribersMap.get(topic);

                    for (Subscriber _subscriber : subscribersOfTopic) {
                        if (_subscriber.equals(subscriber)) {
                            //add broadcasted message to subscriber message queue
                            List<Message> subscriberMessages = subscriber.getSubscriberMessages();
                            subscriberMessages.add(message);
                            subscriber.setSubscriberMessages(subscriberMessages);
                        }
                    }
                }
            }
        }
    }

}