package com.kodilla.testing.shape;

public class Circle implements Shape{
    double radius;
    public Circle(String circle , double radius) {

        this.radius = radius;
    }


    @Override
    public String getShapeName() {
        return "Circle";
    }
    @Override
    public double getField() {
        return Math.PI * radius * radius;
    }
}
