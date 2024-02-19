package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTaskCreation() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);

        // Then
        assertNotNull(shoppingTask);
        assertEquals("Grocery shopping", shoppingTask.getTaskName());
    }

    @Test
    void testPaintingTaskCreation() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);

        // Then
        assertNotNull(paintingTask);
        assertEquals("House painting", paintingTask.getTaskName());
    }

    @Test
    void testDrivingTaskCreation() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);

        // Then
        assertNotNull(drivingTask);
        assertEquals("Road trip", drivingTask.getTaskName());
    }
}