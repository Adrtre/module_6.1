package com.kodilla.good.patterns.challenges.food2door;

class ProducerFactory {
    public static Producer createProducer(String producerName) {
        switch (producerName) {
            case "ExtraFoodShop":
                return new ExtraFoodShop();
            case "HealthyShop":
                return new HealthyShop();
            case "GlutenFreeShop":
                return new GlutenFreeShop();
            default:
                throw new IllegalArgumentException("Unknown producer");
        }
    }
}