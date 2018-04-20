package com.freitas.todoservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.freitas.todoservice.model.ToDo;

@Repository
public interface ToDoRepository extends ReactiveMongoRepository<ToDo, String> {

}
