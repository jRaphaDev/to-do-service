package com.freitas.todoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
     	
import com.freitas.todoservice.model.ToDo;
import com.freitas.todoservice.repository.ToDoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository todoRepository;
	
	public Mono<ToDo> create(ToDo todo) {
		return todoRepository.save(todo);
	}	
	
	public Flux<ToDo> findAll() {
		return todoRepository.findAll();
	}
	
	public Mono<ToDo> findById(String id) {
		return todoRepository.findById(id);
	}
	
	public Mono<Void> delete(String id) {
		return todoRepository.deleteById(id);
	}
}
