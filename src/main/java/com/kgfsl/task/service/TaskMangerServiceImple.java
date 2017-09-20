package com.kgfsl.task.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kgfsl.task.bean.TaskManager;
import com.kgfsl.task.repository.TaskManagerRepository;

public class TaskMangerServiceImple implements TaskMangerService {

	private static final Logger logger = LoggerFactory.getLogger(TaskMangerServiceImple.class);

	@Autowired
	private TaskManagerRepository taskManagerRepository;

	@Override
	public List<TaskManager> TaskList() {
		// TODO Auto-generated method stub
		logger.info("List methoad invoked in Repo");
		return taskManagerRepository.findAll();

	}

	@Override
	public TaskManager TaskSave(TaskManager taskManager) {
		// TODO Auto-generated method stub
		logger.info("Save method invoked in Repo");
		return taskManagerRepository.save(taskManager);
	}

}
