package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.dto.Todo;
import com.todo.service.TodoService;

@Controller
@RequestMapping(path = "/todos")
public class TodoController {
	@Autowired
	private TodoService todoService;
	
	@GetMapping
	public String getTodos(ModelMap model) {
		model.addAttribute("list", todoService.getTodos());
		return "list";
	}
	@GetMapping("/{id}")
	public String getTodo(@PathVariable("id")int id, ModelMap model) {
		Todo todo = todoService.getTodo(id);
		model.addAttribute("todo", todo);
		return "redirect:/todos";
	}
	@PostMapping
	public String addTodo(Todo todo) {
		System.out.println(todo);
		todoService.addTodo(todo);
		return "redirect:/todos";
	}
	@PutMapping
	public String updateTodo(@RequestBody Todo todo) {
		todoService.updateTodo(todo);
		return "redirect:/todos";
	}
	@DeleteMapping("/{id}")
	public String deleteTodo(@PathVariable("id")int id) {
		todoService.deleteTodo(id);
		return "redirect:/todos";
	}
}
