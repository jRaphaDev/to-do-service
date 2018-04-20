package com.freitas.todoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freitas.todoservice.service.ToDoService;
import com.freitas.todoservice.model.ToDo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService todoService;
	
	@PostMapping
	public Mono<ToDo> create(@RequestBody ToDo todo) {
		return todoService.create(todo);
	}
	
	@GetMapping("to-do")
	public Flux<ToDo> findAll() {
		Flux<ToDo> listTodo = todoService.findAll();
		return listTodo;
	}
	
	@GetMapping("/to-do/{id}")
	public Mono<ToDo> findOne(@PathVariable String id) {
		return todoService.findById(id);
		
	}
	
	@DeleteMapping("/to-do/{id}")
	public Mono<Void> delete(@PathVariable String id) {
		return todoService.delete(id);
	}
	

}
