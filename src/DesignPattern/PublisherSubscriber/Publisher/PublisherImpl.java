package DesignPattern.PublisherSubscriber.Publisher;

import DesignPattern.PublisherSubscriber.Message.Message;
import DesignPattern.PublisherSubscriber.PubSubService.PubSubService;

public class PublisherImpl implements Publisher {
    //Publishes new message to PubSubService
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}