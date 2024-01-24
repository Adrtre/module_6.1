package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Producer{
    @Override
    public void process(String product, int quantity) {
        System.out.println("zamownienie od GlutenFreeShop : "+ quantity + " " + product);
    }
}
