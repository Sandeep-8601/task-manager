package com.task.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.task.taskmanager.model.Task;
import com.task.taskmanager.enums.Status;
import com.task.taskmanager.enums.Priority;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatus(Status status);

    List<Task> findByPriority(Priority priority);
}