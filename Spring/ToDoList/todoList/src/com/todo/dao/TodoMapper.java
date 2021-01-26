package com.todo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.dto.Todo;


@Mapper
public interface TodoMapper {
	public List<Todo> getTodos(); //리스트 전체 출력
	public Todo getTodo(int id); //id별로 선택
	public int addTodo(Todo todo); //할일 등록	
	public int updateTodo(Todo todo); //수정 
	public int deleteTodo(int id); //삭제
}