package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testAddTaskToDoList() {
        // Given
        String taskToDo = "Task to do";

        // When
        board.getToDoList().addTask(taskToDo);

        // Then
        assertEquals(taskToDo, board.getToDoList().getTask().get(0));
    }

    @Test
    void testAddTaskInProgressList() {
        // Given
        String taskInProgress = "Task in progress";

        // When
        board.getInProgressList().addTask(taskInProgress);

        // Then
        assertEquals(taskInProgress, board.getInProgressList().getTask().get(0));
    }

    @Test
    void testAddTaskDoneList() {
        // Given
        String taskDone = "Task done";

        // When
        board.getDoneList().addTask(taskDone);

        // Then
        assertEquals(taskDone, board.getDoneList().getTask().get(0));
    }
}