package com.kgfsl.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgfsl.task.bean.TaskManager;

@Repository("taskManagerRepository")
public interface TaskManagerRepository extends JpaRepository<TaskManager, Long> {

}
