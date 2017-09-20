package com.kgfsl.task.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgfsl.task.bean.TaskManager;

@RestController
@RequestMapping("api/v2/")
public class Taskcontroller {


	List<TaskManager> TaskList() {
		return null;
	}

}
