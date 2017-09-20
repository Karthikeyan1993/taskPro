package com.kgfsl.task.service;

import java.util.List;

import com.kgfsl.task.bean.TaskManager;

public interface TaskMangerService {

	List<TaskManager> TaskList();

	TaskManager TaskSave(TaskManager taskManager);

}
