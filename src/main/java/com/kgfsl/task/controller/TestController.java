package com.kgfsl.task.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class TestController {

	@RequestMapping("home")
	public String GoHome() {
		return "I came home early";
	}

}
