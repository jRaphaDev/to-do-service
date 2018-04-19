package com.freitas.todoservice.model;

import javax.validation.constraints.NotBlank;

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
	
	@NotBlank
	private String title;
	
	private boolean completed = false;
	
	
}
