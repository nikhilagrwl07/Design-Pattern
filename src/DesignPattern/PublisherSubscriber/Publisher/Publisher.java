package DesignPattern.PublisherSubscriber.Publisher;

import DesignPattern.PublisherSubscriber.Message.Message;
import DesignPattern.PublisherSubscriber.PubSubService.PubSubService;

public interface Publisher {
    //Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}
