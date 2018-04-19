package com.freitas.todoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ToDoController {
	
	@GetMapping("to-do")
	void findAll() {
		System.out.println("testtinf");
	}

}
