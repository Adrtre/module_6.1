package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import com.kodilla.hibernate.task.dao.TaskListRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@SpringBootTest(classes = com.kodilla.hibernate.task.KodillaHibernateApplication.class)
class TaskListDaoTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Test list", "Test description");
        taskListRepository.save(taskList);

        //When
        List<TaskList> foundLists = taskListRepository.findByListName("Test list");

        //Then
        assertEquals(1, foundLists.size());
        assertTrue(foundLists.stream().allMatch(list -> list.getListName().equals("Test list")));

        //
        taskListRepository.deleteAll();
    }
}
