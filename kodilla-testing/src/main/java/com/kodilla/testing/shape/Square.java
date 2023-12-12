package com.kodilla.testing.shape;

public class Square implements Shape {
    double side ;
    public Square(String square, double side) {
        this.side = side;
    }
    public String getShapeName() {
        return "Square" ;
    }
    public double getField(){
        return  side * side;
    }


}
