package com.example.kodillahibernate;


import com.TaskList;
import com.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test list", "Test description");
        taskListDao.save(taskList);

        // When
        List<TaskList> foundLists = taskListDao.findByListName("Test list");

        // Then
        assertEquals(1, foundLists.size());
        assertTrue(foundLists.stream().allMatch(list -> list.getListName().equals("Test list")));

        // Clean up
        taskListDao.deleteAll();
    }
}
