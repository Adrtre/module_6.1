package com.kodilla.good.patterns.challenges.food2door;

public class MainTest {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new ProducerFactory());

        String productName = "ExtraFoodShop";
        String prodcut = "Food";
        int quantity = 10;

        String productName1 = "GlutenFreeShop";
        String prodcut1 = "Gluten";
        int quantity1= 10;


        orderProcessor.processOrder(productName, prodcut, quantity);
        orderProcessor.processOrder(productName1, prodcut1 , quantity1);

    }
}