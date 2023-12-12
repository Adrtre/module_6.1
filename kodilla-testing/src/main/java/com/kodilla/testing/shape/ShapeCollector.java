package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShapeCollector {
    //przechowuje figury z Shape
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int n){
        if(n >= 0 && n < shapes.size()){
            return shapes.get(n);
        }
        else {
            return null;
        }
    }
    public String showFigures(){
         StringBuilder stringBuilder = new StringBuilder();

         for (Shape shape : shapes){
            stringBuilder.append(shape.getShapeName());
         }
        return stringBuilder.toString();

    }

    public List<Shape> getShapes() {
        return shapes;
    }

}
