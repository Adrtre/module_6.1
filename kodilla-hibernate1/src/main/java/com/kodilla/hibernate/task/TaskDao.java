package com.kodilla.hibernate.task;

import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task, Integer> {

}
