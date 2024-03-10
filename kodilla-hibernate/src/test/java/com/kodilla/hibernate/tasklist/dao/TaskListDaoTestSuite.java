package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        // Clean up
        taskListDao.deleteAll();
        // Given
        TaskList xboxList = new TaskList("Xbox", "List for Xbox ");
        TaskList pcList = new TaskList("PC", "List for PC tasks");
        TaskList playstationList = new TaskList("Playstation", "List for Playstation ");
        TaskList nintendoList = new TaskList("Nintendo", "List for Nintendo ");
        TaskList mobileList = new TaskList("Mobile", "List for Mobile ");

        taskListDao.saveAll(Arrays.asList(xboxList,pcList,playstationList,nintendoList,mobileList));

        // When
        List<TaskList> retrievedXbox = taskListDao.findByListName("Xbox");
        List<TaskList> retrievedPC = taskListDao.findByListName("Xbox");
        List<TaskList> retrievedPlaystation = taskListDao.findByListName("Xbox");
        List<TaskList> retrievedNintendo = taskListDao.findByListName("Xbox");
        List<TaskList> retrievedMobile= taskListDao.findByListName("Xbox");


        // Then
        assertEquals(1,retrievedMobile.size());
        assertEquals(1,retrievedXbox.size());
        assertEquals(1,retrievedPC.size());
        assertEquals(1,retrievedPlaystation.size());
        assertEquals(1,retrievedNintendo.size());



    }
}