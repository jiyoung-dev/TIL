package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.dao.TodoMapper;
import com.todo.dto.Todo;

@Service
public class TodoService {
	
	@Autowired
	private TodoMapper todoMapper;

	public List<Todo> getTodos(){
		return todoMapper.getTodos();
	}
	
	public Todo getTodo(int id) {
		return todoMapper.getTodo(id);
	}
		
	public int addTodo(Todo todo) {
		return todoMapper.addTodo(todo);
	}
	
	public int updateTodo(Todo todo) {
		return todoMapper.updateTodo(todo);
	}
	
	public int deleteTodo(int id) {
		return todoMapper.deleteTodo(id);
	}
	
}
