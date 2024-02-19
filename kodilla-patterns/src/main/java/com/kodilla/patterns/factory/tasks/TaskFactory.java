package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DRIVING_TASK = "DrivingTask";

    public Task createTask(String taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Grocery shopping", "Milk", 2);
            case PAINTING_TASK:
                return new PaintingTask("House painting", "Blue", "Living room");
            case DRIVING_TASK:
                return new DrivingTask("Road trip", "Mountains", "Car");
            default:
                return null;
        }
    }
}