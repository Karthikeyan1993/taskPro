package com.kgfsl.task;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.kgfsl.task.bean.TaskManager;
import com.kgfsl.task.repository.TaskManagerRepository;

@SpringBootApplication
public class TaskApplication {
	private static final Logger logger = LoggerFactory.getLogger(TaskApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskManagerRepository taskManagerRepository) {
		return args -> {
			Arrays.asList("Todo App issue,COB repost issue,COB view change".split(","))
					.forEach(t -> taskManagerRepository.save(new TaskManager(t)));
			logger.info("Data saved to memory databse");
			taskManagerRepository.findAll().forEach(System.out::println);
		};
	}
}
