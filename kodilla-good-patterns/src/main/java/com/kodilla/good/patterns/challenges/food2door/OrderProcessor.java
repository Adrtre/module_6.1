package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    public ProducerFactory producerFactory ;

    public OrderProcessor (ProducerFactory producerFactory){
        this.producerFactory = producerFactory;
    }

    public void processOrder(String producerName, String product, int quantity){
        Producer producer = producerFactory.createProducer(producerName);
        producer.process(product,quantity);
    }
}
