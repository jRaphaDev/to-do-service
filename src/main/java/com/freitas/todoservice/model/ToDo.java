package com.freitas.todoservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "todo")
public class ToDo {

	@Id
	private String id;
	private String title;
	private boolean completed = false;
	
}
