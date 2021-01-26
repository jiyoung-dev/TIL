package com.todo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.dto.Todo;
import com.todo.service.TodoService;

@RestController
@RequestMapping(path = "/api/todos")
public class TodoAPIController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public List<Todo> getTodos(){
		return todoService.getTodos();
	}
	@GetMapping("/{id}")
	public Todo getTodo(@PathVariable(name="id")int id) {
		return todoService.getTodo(id);
	}
	@PostMapping
	public int addTodo(@RequestBody Todo todo) {
		return todoService.addTodo(todo);
	}
	@PutMapping 
	public int updateTodo(@RequestBody Todo todo) {
		return todoService.updateTodo(todo);
	}
	@DeleteMapping
	public void deleteTodo(@PathVariable(name="id")int id) {
		todoService.deleteTodo(id);
	}
	

}
